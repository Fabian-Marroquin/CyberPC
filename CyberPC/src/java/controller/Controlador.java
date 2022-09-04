/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import modelDAO.*;


public class Controlador extends HttpServlet {
    
    Factura fac = new Factura();
    FacturaDAO facDAO = new FacturaDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);  
        }else if (menu.equals("Factura")) {
            try {
                if (accion.equals("Listar")) {
                    List listaFacturas = facDAO.listar();
                    request.setAttribute("facturas", listaFacturas);
                }else if (accion.equals("Agregar")) {
                    String fechaFactura = request.getParameter("dtFechaFactura");
                    int codigoCliente = Integer.parseInt(request.getParameter("txtCodigoCliente"));
                    int codigoFormaPago = Integer.parseInt(request.getParameter("txtCodigoFormaPago"));
                    fac.setFechaFactura(new SimpleDateFormat("yyyy-MM-dd").parse(fechaFactura));
                    fac.setCodigoCliente(codigoCliente);
                    fac.setCodigoFormaPago(codigoFormaPago);
                    facDAO.agregar(fac);
                    request.getRequestDispatcher("Controlador?menu=Factura&accion=Listar").forward(request, response);
                }
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            request.getRequestDispatcher("Factura.jsp").forward(request, response);
        }else if (menu.equals("Home")) {
            request.getRequestDispatcher("PrincipalCarousel.jsp").forward(request, response);
        }   
    }

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
        processRequest(request, response);
    }

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
        processRequest(request, response);
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
