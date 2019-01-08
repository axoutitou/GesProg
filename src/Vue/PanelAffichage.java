/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.DataTransac;
import Modele.Programmeur;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Axel Carnez
 */
public class PanelAffichage extends JPanel{
	 private JTextArea affichage;
	 private JScrollPane scroll;
	 
	 public PanelAffichage(){
		  affichage = new JTextArea(15, 60);
		  scroll = new JScrollPane(affichage);
		  this.add(scroll);
	 }
	 
	 public void afficheProgrammeur(){
		  DataTransac dt = new DataTransac();
		  ArrayList<Programmeur> list = dt.getProgrammeur();
		  
		  affichage.setText("");
		  for(int i=0; i<list.size(); i++){
			   affichage.append(list.get(i).toString());
			   affichage.append("\n");
		  }
		  
	 }
}
