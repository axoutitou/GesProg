/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

/**
 * Classe comportant des constantes divers (Paramètres de conexion à la base de données, requêtes)
 * @author Axel Odran
 */
public class Constantes {
	 public static final String URL ="jdbc:derby://localhost:1527/LSI _ L3 _ JAVA" ;
	 public static final  String USER= "adm";
	 public static final  String MDP = "adm";
	 public static final  String REQUETE_ALL_PROG = "SELECT * FROM Programmeur";
	 public static final  String REQUETE_AJOUT_PROG = "INSERT INTO PROGRAMMEUR (matricule, nom, prenom, adresse, pseudo, responsable, hobby, date_naiss, date_emb) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	 public static final  String REQUETE_DELETE_PROG = "DELETE FROM PROGRAMMEUR WHERE matricule = ?";
}