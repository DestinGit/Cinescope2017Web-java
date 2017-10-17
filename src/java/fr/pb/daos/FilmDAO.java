/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.daos;

import fr.pb.entities.Film;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author formation
 */
public class FilmDAO {

    private final Connection icn;

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
}
