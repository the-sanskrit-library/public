/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package org.sanskritlibrary.mavenproject3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author scharfp
 */
@WebServlet(name = "UnitConverterServlet", urlPatterns = {"/convert"})
public class UnitConverterServlet extends HttpServlet {

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
      float miles = Float.parseFloat(request.getParameter("miles"));
      float kilometers = miles * 1.61f;
      request.setAttribute("miles", miles);
      request.setAttribute("kilometers", kilometers);
      String resultPage = "result.jsp";
      request.getRequestDispatcher(resultPage).forward(request, response);
   }

}
