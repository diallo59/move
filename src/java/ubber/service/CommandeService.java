/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubber.service;

import java.util.List;
import ubber.dao.CommandeDAO;
import ubber.entity.Commande;
import ubber.entity.Conducteur;

/**
 *
 * @author admin
 */
public class CommandeService {

   

    public void creerCommande(Commande cmd) {
        new CommandeDAO().creer(cmd);
    }

    public List<Commande> listerCommandesParConducteur(long id) {
      return  new CommandeDAO().listerCommande(id);
    }

    public List<Commande> listerCommandesParClient(long id) {
        return new CommandeDAO().listerCommandesParClient(id);
    }

//    public List<Commande> listerCommandes() {
//        return new CommandeDAO().listerCommandes();
//    }

    //reuperer une commande
//    public Commande recupererUneCommande(long id) {
//        return new CommandeDAO().recupererUneCommande();
//    }

    //Recuperer total gain conducteur
    public List<Commande> recupererPrixTotal(long id) {
        return new CommandeDAO().recupererPrixTotal(id);
    }
   
    
}
