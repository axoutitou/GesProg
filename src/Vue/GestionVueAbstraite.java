/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Axel Odran
 */
public abstract class GestionVueAbstraite extends JFrame{
	 //Gestion des différents panels
	  protected CardLayout layout;
	  protected JPanel content;
	  protected JPanel accueil;
	  protected PanelAdministration administration;
	  protected PanelAffichage affichage;
	  
	  public GestionVueAbstraite(){
		    try {
			   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		  } catch (ClassNotFoundException ex) {
			   Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
		  } catch (InstantiationException ex) {
			   Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
		  } catch (IllegalAccessException ex) {
			   Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
		  } catch (UnsupportedLookAndFeelException ex) {
			   Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
		  }
			
		   //Gestion des vues
		   layout = new CardLayout();
		   content = new JPanel();
		   accueil = new JPanel();
		   accueil.setBackground(Color.gray);
		   administration = new PanelAdministration(this);
		   affichage = new PanelAffichage();
		   content.setLayout(layout);
		   content.add("accueil", accueil);
		   content.add("administration", administration);
		   content.add("affichage", affichage);
		   
		    //Paramètre de la JFrame
		   this.setContentPane(content);
		   this.setVisible(true);
		   this.setLocation(300, 100);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
	  
	  //GEstion de l'affichage
	  public abstract void show(String panel);
}
