/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import javax.swing.*;

/**
 *
 * @author Axel Carnez
 */
public class PanelAffichage extends JPanel{
	 private JTextArea affichage;
	 
	 public PanelAffichage(){
		  affichage = new JTextArea(20, 60);
		  this.add(affichage);
	 }
}
