/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubber.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;
import ubber.entity.Client;
import ubber.entity.Commande;
import ubber.entity.Conducteur;
import ubber.service.ClientService;
import ubber.service.CommandeService;

/**
 *
 * @author pro
 */
@WebServlet(name = "EspacePersoServlet", urlPatterns = {"/espace_personnel_client"})
public class EspacePersoClientServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = (long) req.getSession().getAttribute("idClient");
        Client clt = new ClientService().RecupererUnClient(id);
        req.setAttribute("clt", clt);

        req.getRequestDispatcher("espce_perso_client.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long idConducteur = Long.parseLong(req.getParameter("id"));
        String origine = req.getParameter("origin");
        String destination = req.getParameter("destination");
        Conducteur cond = new Conducteur();
        cond.setId(idConducteur);

        long idClient = (long) req.getSession().getAttribute("idClient");
        Client client = new Client();
        client.setId(idClient);

        Commande cmd = new Commande();
        cmd.setConducteur(cond);
        cmd.setClient(client);
        cmd.setAdresse_destination(destination);
        cmd.setDate(new Date());

        new CommandeService().creerCommande(cmd);
    }

}
