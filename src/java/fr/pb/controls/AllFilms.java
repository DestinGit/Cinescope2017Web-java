/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.pb.controls;

import fr.pb.daos.FilmDAO;
import fr.pb.entities.Film;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
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
@WebServlet(name = "AllFilms", urlPatterns = {"/AllFilms"})
public class AllFilms extends HttpServlet {

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

        // Récupération de la session courante
        HttpSession session = request.getSession();

        Connection lcn = (Connection) session.getAttribute("gcnx");
        FilmDAO dao = new FilmDAO(lcn);
        List<Film> f;

        f = dao.selectAll();
//        for (Film rs : f) {
//            System.out.println(rs.getTitreFilm());
//        }
        request.setAttribute("allfilms", "active");
        request.setAttribute("datas", f);
        // redirection vers la page "AllFilms.jsp"
        String lsURL = "AllFilms.jsp";
        getServletContext().getRequestDispatcher("/jsp/" + lsURL).forward(request, response);

    }
}
