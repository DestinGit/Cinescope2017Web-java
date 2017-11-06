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
                objJson.put("id", lrs.getInt(1));
                objJson.put("nom", lrs.getString(2));
                objJson.put("mdp", lrs.getString(3));
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
    public static String UpdateUser(int id, String email, String mdp) {
        int nbLine = -1;
        JSONArray objArray = new JSONArray();
        JSONObject objJson = new JSONObject();
        
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try {
            PreparedStatement lpst = lcn.prepareStatement("UPDATE utilisateur SET email=?, mdp=? WHERE idUtilisateur=?");
            lpst.setString(1, email);
            lpst.setString(2, mdp);
            lpst.setInt(3, id);
            nbLine = lpst.executeUpdate();

            lcn.commit();

            objJson.put("ligne", nbLine);
            objArray.put(objJson);            

        } catch (SQLException e) {
        }
        Connexion.disconnection(lcn);
        
        return objArray.toString();
    }

    /**
     *
     * @param id
     * @return
     */
    public static String DeleteUser(int id) {
        int nbLine = -1;
        JSONArray objArray = new JSONArray();
        JSONObject objJson = new JSONObject();
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        System.out.println(id);
        try {
            PreparedStatement lpst = lcn.prepareStatement("DELETE FROM utilisateur WHERE idUtilisateur=?");
            lpst.setInt(1, id);
            nbLine = lpst.executeUpdate();
            
            objJson.put("ligne", nbLine);
            objArray.put(objJson);
            
            lcn.commit();

        } catch (SQLException e) {
            System.out.println("ERRRRE : " + e.getMessage());
        }
        Connexion.disconnection(lcn);
        
        
        return objArray.toString();
    }
}
