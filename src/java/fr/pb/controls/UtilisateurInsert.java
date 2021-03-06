/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import connexion.Connexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author formation
 */
@WebServlet(name = "UtilisateurInsert", urlPatterns = {"/UtilisateurInsert"})
public class UtilisateurInsert extends HttpServlet {
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try{
            PreparedStatement lpst = lcn.prepareStatement("INSERT INTO utilisateur(nom,mdp,email) VALUES(?,?,?)");
            
            lpst.setString(1, request.getParameter("nom"));
            lpst.setString(2, request.getParameter("mdp"));
            lpst.setString(3, request.getParameter("email"));
  
            int lrs = lpst.executeUpdate();
            
            out.print(lrs);
            lcn.commit();
            
        } catch(SQLException e) {
            out.print(e.getMessage());
        }
        Connexion.disconnection(lcn);
    } /// doGet

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        try{
            PreparedStatement lpst = lcn.prepareStatement("INSERT INTO utilisateur(nom,mdp,email) VALUES(?,?,?)");
            
            lpst.setString(1, request.getParameter("nom"));
            lpst.setString(2, request.getParameter("mdp"));
            lpst.setString(3, request.getParameter("email"));
  
            int lrs = lpst.executeUpdate();
            
            out.print(lrs);
            
            lcn.commit();
            
        } catch(SQLException e) {
            out.print(e.getMessage());
        }
        Connexion.disconnection(lcn);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
