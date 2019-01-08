/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.CardLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * JFrame qui regroupe tout les JPanels et gère l'affichage de ces derniers
 * @author Axel Odran
 */
public class FenetreMere extends GestionVueAbstraite{
            //Menu
	  private JMenuBar menuBar;	  
	  private JMenu prog;
	  private JMenu action;
	  private JMenu afficher;
	  private JMenuItem tous;
	  private JMenuItem modifier;
	  private JMenuItem supprimer;
	  private JMenuItem ajouter;
	  private JMenuItem quitter;

	 public FenetreMere(){
		  //Appel du constructeur de la classe mere
		  super();
		  
		  //Création du menu
		  menuBar = new JMenuBar();
		  //Premier menu Programmeur		  
		  prog = new JMenu("Programmeur");
		  afficher = new JMenu("Afficher");
		  tous = new JMenuItem("Tous");
		  tous.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					show("affichage");
					affichage.afficheProgrammeur();
			   }
		  });
		  modifier = new JMenuItem("Modifier");
		  modifier.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					show("administration");
					administration.setFiltre("modifier");
			   }
		  });
		  supprimer = new JMenuItem("Supprimer");
		  supprimer.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					show("administration");
					administration.setFiltre("supprimer");
			   }
		  });
		  ajouter = new JMenuItem("Ajouter");
		  ajouter.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					show("administration");
					administration.setFiltre("ajouter");
			   }
		  });
		  
		  //Deuxième menu Action
		  action = new JMenu("Action");
		  quitter = new JMenuItem("Quitter");
		  quitter.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					int input = JOptionPane.showConfirmDialog(null, "Vérification", "Voulez-vous vraiment quitter?", JOptionPane.YES_NO_OPTION); // 0=oui, 1=non
					if(input == 0) System.exit(0);
			   }
		  });
		  
		  afficher.add(tous);
		  prog.add(afficher);
		  prog.add(modifier);
		  prog.add(supprimer);
		  prog.add(ajouter);
		  action.add(quitter);
		  
		  menuBar.add(prog);
		  menuBar.add(action);		  
		  this.setJMenuBar(menuBar);
		  this.show("accueil");
		  this.pack();
	 }

	 /**
	  * Permet de modifier le panel qui est actuellement afficher à l'écran 
	  * @param panel Le nom du panel que l'on veut afficher
	  */
	 @Override
	 public void show(String panel) {
		  layout.show(content,panel);
	 }
}

   


	 
