/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import connexion.Connexion;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author formation
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

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
        /**
         * Connexion au serveur de BD
         */
//        Connection lcn = Connexion.getConnectionMySQL("localhost", "cours", "3306", "root", "");
//        Connection lcn = Connexion.getConnectionMySQL("172.26.10.166", "cinescope2017", "3306", "p", "b");
        Connection lcn = Connexion.getConnectionMySQL("172.26.55.55", "cinescope2014", "3306", "p", "b");
        
        // Récupération de la session courante
        HttpSession session = request.getSession();
        
        /*
        * Mise en session de la connexion BD
        */
        session.setAttribute("gcnx", lcn);
        
        request.setAttribute("accueil", "active");
        
        String lsURL = "Accueil.jsp";
        getServletContext().getRequestDispatcher("/jsp/" + lsURL).forward(request, response);        
    }
}
