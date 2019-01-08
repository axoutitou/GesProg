/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;
import Modele.Programmeur;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *Interface qui regroupent l'enssemble des méthodes à implémentées pour le bon fonctionnement de l'application avec la base de données
 * @author Axel Odran
 */
public interface ActionsBD {
	 /**
         * Retourne la liste des programmeurs 
         * @return Une ArrayList composée de Programmeur , qui correspond à la des programmeurs en enregistrer en base.
         */
	 public ArrayList<Programmeur> getProgrammeur();
	 /**
          * Ajoute un nouveau programmeur à la base de donnée
          * @param prog 
          */
	 public void ajouteProgrammeur(Programmeur prog);
	 /**
          * Supprime un programmeur de la base de données
          * @param matricule 
          */
	 public void supprimeProgrammeur(int matricule);
	  /**
	  * Mets à jour les informations d'un programmeur en base de données
	  * @param Prog
	  * @param matricule 
	  */
	 public void updateProgrammeur(Programmeur Prog, int matricule);
}
