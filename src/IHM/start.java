/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import javax.swing.JFrame;

/**
 *
 * @author Axel Carnez
 */
public class start {

	 /**
	  * @param args the command line arguments
	  */
	 public static void main(String[] args) {
		  // TODO code application logic here
		  JFrame windows = new JFrame();
		  //PanelAdministration panel = new PanelAdministration();
		  PanelAffichage panel = new PanelAffichage();
		  windows.add(panel);
		  windows.setVisible(true);
		  windows.setSize(300, 300);
		  windows.setLocation(500, 300);
		  windows.pack();
	 }
	 
}
