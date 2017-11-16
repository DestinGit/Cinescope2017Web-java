/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.daos;

import connexion.Connexion;
import fr.pb.entities.Film;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author formation
 */
public class FilmDAO {

    private final Connection icn;
    
    public static String getBOInJSON(){
        JSONArray objArray = new JSONArray();
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try{
            Map<String, String> mapBO;
            JSONObject objJson;
            
            PreparedStatement lpst = lcn.prepareStatement("CALL xxx_box_office()");
            ResultSet lrs = lpst.executeQuery(); 
            while(lrs.next()) {
//                mapBO = new LinkedHashMap();
                objJson = new JSONObject();
                objJson.put("titre", lrs.getString(1));
                objJson.put("entree", lrs.getString(2));
                objArray.put(objJson);
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return objArray.toString();
    }
    
    public static String getHPP() {

        String lsEnr;

        StringBuilder lsb = new StringBuilder();

        //Connection lcn = getConnexionMySQL(String asServeur, String asBD, String asPort, String asUT, String asMDP);
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");

        try {
            PreparedStatement lpst = lcn.prepareStatement("CALL xxx_hit_parade_du_public()");
            ResultSet lrs = lpst.executeQuery();
            
            lsb.append("Entrees semaine # Nombre semaines # Total entrées\n");
            
            while (lrs.next()) {

                lsb.append(lrs.getString(1));
                lsb.append("#");
                lsb.append(lrs.getString(2));
                lsb.append("#");
                lsb.append(lrs.getString(3));
                lsb.append("#");
                lsb.append(lrs.getString(4));
                lsb.append("\n");

            }
        } catch (SQLException e) {
            lsb.append(e.getMessage());
        }

        Connexion.disconnection(lcn);

        return lsb.toString();
    } /// getHPP

    public FilmDAO(Connection icn) {
        this.icn = icn;
    }
 
    /**
     * 
     * @return List
     */
    public List<Film> selectAll() {
        List<Film> resultList = new ArrayList();
        String lsSQL = "SELECT * FROM Film";
        try{
            // Préparation de la requete
            PreparedStatement lpst = icn.prepareStatement(lsSQL);
            // Exécution de la requete
            ResultSet lrs = lpst.executeQuery();
            while (lrs.next()) {
                Film f = new Film(lrs.getInt("ID_film"), lrs.getInt("ID_genre"),
                        lrs.getString("TITRE_film"), lrs.getString("TITRE_ORIGINAL"),
                        lrs.getInt("TOTAL_ENTREES"), lrs.getString("DATE_SORTIE"), 
                        lrs.getInt("ENTREES_SEMAINE"), lrs.getInt("NOMBRE_SEMAINES"),
                        lrs.getInt("ANNEE"), lrs.getString("DUREE"), lrs.getString("CONDENSE"),
                        lrs.getString("COULEURS"),lrs.getInt("INTERDICTION_film"), lrs.getInt("PUBLIC_film"));
                resultList.add(f);
            }
        } catch (SQLException e) {
          System.out.println("SELECT ALL : " + e.getMessage());  
                Film f = new Film(-1, -1,
                        null, null,
                        -1, null, 
                        -1, -1,
                        -1, null, null,
                        null,-1, -1); 
                resultList.add(f);
        }
        // renvoi de la liste des résultats (une list d'objets)
        return resultList;        
    }
    
    public static JSONArray selectByBeginningOfTitle(String chaine) {
        // mes variables
        JSONArray tableauJSON = new JSONArray();
        JSONObject ObjectJSON;

        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");

        try {
            PreparedStatement lpst = lcn.prepareStatement("select ID_film, TITRE_film from film WHERE titre_film LIKE ?");
            lpst.setString(1, chaine + "%");
            ResultSet lrs = lpst.executeQuery();

            // à chaque enregistrement de mon curseur, j'instancie un objet json que je put à un tableau de json
            int i = 1;
            while (lrs.next()) {
                ObjectJSON = new JSONObject();
                ObjectJSON.put("id", lrs.getString(1));
                ObjectJSON.put("titre", lrs.getString(2));
                i++;
                tableauJSON.put(ObjectJSON);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FilmDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        Connexion.disconnection(lcn);

        return tableauJSON;
    }
}
