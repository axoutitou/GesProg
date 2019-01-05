/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Axel Carnez
 */
public abstract class GestionVueAbstraite extends JFrame{
	 //Gestion des différents panels
	  protected CardLayout layout;
	  protected JPanel content;
	  protected JPanel accueil;
	  protected PanelAdministration administration;
	  protected PanelAffichage affichage;
	  
	  public GestionVueAbstraite(){
		   //Gestion des vues
		   layout = new CardLayout();
		   content = new JPanel();
		   accueil = new JPanel();
		   accueil.setBackground(Color.gray);
		   administration = new PanelAdministration();
		   affichage = new PanelAffichage();
		   content.setLayout(layout);
		   content.add("accueil", accueil);
		   content.add("administration", administration);
		   content.add("affichage", affichage);
		   
		    //Paramètre de la JFrame
		   this.setContentPane(content);
		   this.setVisible(true);
		   this.setSize(500, 300);
		   this.setLocation(300, 300);
		   this.pack();
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
	  
	  public abstract void show(String panel);
}
