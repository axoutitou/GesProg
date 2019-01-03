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
public class FenetreMere extends JFrame{
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
	  
	  //Gestion des différents panels
	  private CardLayout layout;
	  JPanel content;
	  PanelAdministration administration;
	  PanelAffichage affichage;

	 public FenetreMere(){
		  menuBar = new JMenuBar();
		  //Premier menu Programmeur		  
		  prog = new JMenu("Programmeur");
		  afficher = new JMenu("Afficher");
		  tous = new JMenuItem("Tous");
		  tous.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					layout.show(content, "affichage");
					affichage.afficheProgrammeur();
			   }
		  });
		  modifier = new JMenuItem("Modifier");
		  supprimer = new JMenuItem("Supprimer");
		  ajouter = new JMenuItem("Ajouter");
		  
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
				 
		  //Gestion des différents panel
		  content = new JPanel();
		  administration = new PanelAdministration();
		  affichage = new PanelAffichage();
		  layout = new CardLayout();
		  content.setLayout(layout);
		  content.add("administration", administration);
		  content.add("affichage", affichage);
		  
		  
		   //Paramètre de la JFrame
		   this.setJMenuBar(menuBar);
		   this.add(content);
		   this.setVisible(true);
		   this.setSize(500, 300);
		   this.setLocation(300, 300);
		   this.pack();
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
}

   


	 
