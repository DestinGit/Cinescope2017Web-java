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

/**
 *
 * @author formation
 */
public class VilleDAO {
  public static String getAll() {
      JSONArray objArray = new JSONArray();
      
      Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
      try{
          PreparedStatement lpst = lcn.prepareStatement("SELECT * FROM ville");
          ResultSet lrs = lpst.executeQuery();
          
      }catch (SQLException e){
          System.out.println("ERROOOR : " + e.getMessage());
      }
      return objArray.toString();
  }
}
