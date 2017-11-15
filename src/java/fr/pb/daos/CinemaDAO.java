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
public class CinemaDAO {

    public static JSONArray getAdressesFromCinema() {
        JSONObject objeJSON = null;
        JSONArray tabJSON = new JSONArray();

        String lsSQL = "SELECT c.code_cinema, c.adresse_cinema, v.nom_ville FROM cinema c"
                + " INNER JOIN ville v ON c.id_ville = v.id_ville";
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try {
            // Préparation de la requete
            PreparedStatement lpst = lcn.prepareStatement(lsSQL);
            // Exécution de la requete
            ResultSet lrs = lpst.executeQuery();

            while (lrs.next()) {
                objeJSON = new JSONObject();
                objeJSON.put("code", lrs.getString(1));
                objeJSON.put("adresse", lrs.getString(2));
                objeJSON.put("ville", lrs.getString(3));
                tabJSON.put(objeJSON);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : " + ex.getMessage());
        }
        return tabJSON;
    }

    public static JSONObject getAdressFromOneCinema(String psCodeCinema) {
        JSONObject objeJSON = null;

        String lsSQL = "SELECT c.adresse_cinema, v.nom_ville FROM cinema c"
                + " INNER JOIN ville v ON c.id_ville = v.id_ville WHERE code_cinema = ?";
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try {
            // Préparation de la requete
            PreparedStatement lpst = lcn.prepareStatement(lsSQL);
            lpst.setString(1, psCodeCinema);
            // Exécution de la requete
            ResultSet lrs = lpst.executeQuery();

            objeJSON = new JSONObject();
            if (lrs.next()) {
                objeJSON.put("adresse", lrs.getString(1));
                objeJSON.put("ville", lrs.getString(2));
            } else {
                objeJSON.put("adresse", "Introuvable");
                objeJSON.put("ville", "");
            }

        } catch (SQLException ex) {
            System.out.println("ERROR : " + ex.getMessage());
        }
        return objeJSON;
    }

    public static JSONObject setLatLngInOneCinema(String psCodeCinema, double pdLat, double pdLng) {
        JSONObject objeJSON = null;
        String lsSQL = "UPDATE cinema SET lat=?, lng=? WHERE code_cinema = ?";
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try {
            // Préparation de la requete
            PreparedStatement lpst = lcn.prepareStatement(lsSQL);
            lpst.setDouble(1, pdLat);
            lpst.setDouble(2, pdLng);
            lpst.setString(3, psCodeCinema);
            // Exécution de la requete
            int lrs = lpst.executeUpdate();
            objeJSON = new JSONObject();
            if (lrs > 0) {
                objeJSON.put("maj", lrs);
                lcn.commit();
            } else {
                objeJSON.put("maj", 0);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR : " + ex.getMessage());
        }

        return objeJSON;
    }
}
