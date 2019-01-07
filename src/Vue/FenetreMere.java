/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.CardLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author 20181591
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
		  super();
		  
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
					System.exit(0);
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

	 @Override
	 public void show(String panel) {
		  layout.show(content,panel);
	 }
}

   


	 
