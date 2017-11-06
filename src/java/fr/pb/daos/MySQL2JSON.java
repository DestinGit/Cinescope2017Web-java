/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.daos;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author formation
 */
public class MySQL2JSON {
    public static String getAll(String psTable) {
        String chaineJSON = "";
        JSONArray jsonTab = new JSONArray();
        JSONObject objetJSON;
        
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        
        try{
            Statement lst = lcn.createStatement();
            ResultSet lrs = lst.executeQuery("SELECT * FROM " + psTable);
            ResultSetMetaData lrsmd = lrs.getMetaData();
            
            int liCols = lrsmd.getColumnCount();
            
            while(lrs.next()) {
                objetJSON = new JSONObject();
                for(int i = 1; i < liCols; i++) {
                    objetJSON.put(lrsmd.getColumnName(i), lrs.getString(i));
                }
                jsonTab.put(objetJSON);
            }
            lcn.close();
        }catch(SQLException e) {
            objetJSON = new JSONObject();
            objetJSON.put("Erreur", e.getMessage());
            jsonTab.put(objetJSON);
        }
        chaineJSON = jsonTab.toString();
        return chaineJSON;
    }
}
