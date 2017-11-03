/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.daos;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author formation
 */
public class UsersDAO {

    private final Connection icn;

    public UsersDAO(Connection icn) {
        this.icn = icn;
    }

    /**
     *
     * @param nom
     * @param mdp
     * @return
     */
    public static String getJSONUser(String nom, String mdp) {
        JSONArray objArray = new JSONArray();
        JSONObject objJson;

        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try {
            PreparedStatement lpst = lcn.prepareStatement("SELECT * FROM utilisateur WHERE nom=? AND mdp=?");
            lpst.setString(1, nom);
            lpst.setString(2, mdp);
            ResultSet lrs = lpst.executeQuery();

            if (lrs.next()) {
                objJson = new JSONObject();
                objJson.put("idUser", lrs.getInt(1));
                objJson.put("nom", lrs.getString(2));
                objJson.put("email", lrs.getString(4));
                objArray.put(objJson);
            }

            lcn.commit();

        } catch (SQLException e) {
        }
        Connexion.disconnection(lcn);

        return objArray.toString();
    }

    /**
     *
     * @param id
     * @param email
     * @param mdp
     * @return
     */
    public static int UpdateUser(int id, String email, String mdp) {
        int nbLine = -1;
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try {
            PreparedStatement lpst = lcn.prepareStatement("UPDATE utilisateur SET email=?, mdp=? WHERE id=?");
            lpst.setString(1, email);
            lpst.setString(2, mdp);
            lpst.setInt(3, id);
            nbLine = lpst.executeUpdate();

            lcn.commit();

        } catch (SQLException e) {
        }
        Connexion.disconnection(lcn);
        return nbLine;
    }

    /**
     *
     * @param id
     * @return
     */
    public static int DeleteUser(int id) {
        int nbLine = -1;
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try {
            PreparedStatement lpst = lcn.prepareStatement("DELETE * FROM utilisateur WHERE id=?");
            lpst.setInt(1, id);
            nbLine = lpst.executeUpdate();

            lcn.commit();

        } catch (SQLException e) {
        }
        Connexion.disconnection(lcn);
        return nbLine;
    }
}
