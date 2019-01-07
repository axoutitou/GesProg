/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Programmeur;
import java.sql.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Axel Carnez
 */
public class DataTransac implements ActionsBD{
	 private Connection connect;
	 private Statement stmt;
	 private ResultSet rs;
	 
	 public DataTransac(){
		  try {
			   connect = DriverManager.getConnection(Constantes.URL, Constantes.MDP, Constantes.USER);
			   
		  } catch (SQLException ex) {
			   Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, ex);
		  }
	 }
	 
	 public ArrayList<Programmeur> getProgrammeur(){
		  ArrayList<Programmeur> list = new ArrayList<Programmeur>();
		   try {
			   stmt = connect.createStatement();
			   rs = stmt.executeQuery(Constantes.REQUETE_ALL_PROG);
			   while(rs.next()){
					int matricule = rs.getInt("MATRICULE");
					String nom = rs.getString("NOM");
					String prenom = rs.getString("PRENOM");
					String adresse = rs.getString("ADRESSE");
					String pseudo = rs.getString("PSEUDO");
					String responsable = rs.getString("RESPONSABLE");
					String hobby = rs.getString("HOBBY");
					Date naissance = rs.getDate("DATE_NAISS");
					Date embauche = rs.getDate("DATE_EMB");
					
					list.add(new Programmeur(matricule, nom, prenom, adresse, pseudo, responsable, hobby, naissance, embauche));
			   }
			   
		  } catch (SQLException ex) {
			   Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, ex);
		  }
		   
		   return list;
	 }
	 
	 public void ajouteProgrammeur(Programmeur prog){
		  try {
			   PreparedStatement preparedStmt = connect.prepareStatement(Constantes.REQUETE_AJOUT_PROG);
			   
			   preparedStmt.setInt (1, prog.getMatricule());
			   preparedStmt.setString (2, prog.getNom());
			   preparedStmt.setString (3, prog.getPrenom());
			   preparedStmt.setString (4, prog.getAdresse());
			   preparedStmt.setString (5, prog.getPseudo());	   
			   preparedStmt.setString (6, prog.getResponsable());
			   preparedStmt.setString (7,prog.getHobby());
			   preparedStmt.setDate (8, new java.sql.Date(prog.getNaissance().getTime()));
			   preparedStmt.setDate (9, new java.sql.Date(prog.getEmbauche().getTime()));
			   
			   preparedStmt.execute();
		  } catch (SQLException ex) {
			   Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, ex);
		  }
	 }
	 
	 public void supprimeProgrammeur(int matricule){
		  try{   
			   String Matricule = Integer.toString(matricule);
			   PreparedStatement preparedStmt = connect.prepareStatement(Constantes.REQUETE_DELETE_PROG);
			   preparedStmt.setString (1, Matricule);
			   preparedStmt.execute();  
		   }  
		  catch(SQLException ex) {
			  Logger.getLogger(DataTransac.class.getName()).log(Level.SEVERE, null, ex);
		  }
         }
         
         public void updateProgrammeur(Programmeur Prog, int matricule){
             supprimeProgrammeur(matricule);
             ajouteProgrammeur(Prog);
         }
}
