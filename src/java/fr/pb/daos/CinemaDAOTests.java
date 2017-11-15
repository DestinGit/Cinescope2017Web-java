/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.daos;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author formation
 */
public class CinemaDAOTests {
    /**
     * Main pour le test
     * @param args 
     */
    public static void main(String[] args) {
//        JSONObject o = CinemaDAO.setLatLngInOneCinema("35I",48.22,2.44);
        JSONArray o = CinemaDAO.getAdressesFromCinema();
        System.out.println(o);
    }
}
