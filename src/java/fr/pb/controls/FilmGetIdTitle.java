/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import fr.pb.daos.FilmDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;

/**
 *
 * @author formation
 */
@WebServlet(name = "FilmGetIdTitle", urlPatterns = {"/FilmGetIdTitle"})
public class FilmGetIdTitle extends HttpServlet {

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
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();

        JSONArray arrayJSON = FilmDAO.selectByBeginningOfTitle(request.getParameter("chaine"));

        String resultat = "";
        try {
            resultat = arrayJSON.toString();

        } catch (Exception e) {
            resultat = e.getMessage();
        }
        out.print(resultat);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("application/json;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//
//        JSONArray arrayJSON = FilmDAO.selectByBeginningOfTitle(request.getParameter("chaine"));
//
//        String resultat = "";
//        try {
//            resultat = arrayJSON.toString();
//
//        } catch (Exception e) {
//            resultat = e.getMessage();
//        }
//        out.print(resultat);
//    }

}
