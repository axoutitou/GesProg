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
 *
 * @author Axel Carnez
 */
public interface ActionsBD {
	 public ArrayList<Programmeur> getProgrammeur();
	 public void ajouteProgrammeur(int matricule, String nom, String prenom, String adresse, String pseudo, String responsable, String hobby, Date naissance, Date embauche);
}
