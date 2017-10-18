/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.daos;

import java.sql.*;
import java.util.*;

/**
 *
 * @author formation
 */
public class GenericDAO {

    private final Connection icn;

    public GenericDAO(Connection icn) {
        this.icn = icn;
    }

    /**
     * 
     * @return List<Map<String, String>>
     */
    public List<Map<String, String>> selectFilmRubrique() {
        List<Map<String, String>> resultList = new ArrayList();
        Map<String, String> mapFilmRubrique;

        String lsSQL = "SELECT * FROM   filmandrubrique_vue";

        try {
            // Préparation de la requete
            PreparedStatement lpst = icn.prepareStatement(lsSQL);
            // Exécution de la requete
            ResultSet lrs = lpst.executeQuery();

            while (lrs.next()) {
                mapFilmRubrique = new HashMap();

                mapFilmRubrique.put("titreFilm", lrs.getString(3));
                mapFilmRubrique.put("titreFilmOriginal", lrs.getString(4));
                mapFilmRubrique.put("codeRubrique", lrs.getString(16));
                mapFilmRubrique.put("intituleRubrique", lrs.getString(17));

                resultList.add(mapFilmRubrique);
            }
        } catch (SQLException e) {
            System.out.println("SELECT ALL : " + e.getMessage());
        }

        return resultList;
    }
}
