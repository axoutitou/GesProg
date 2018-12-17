/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

/**
 *
 * @author Axel Carnez
 */
public class PanelAdministration extends JPanel{
	 
	 //CHAMPS
	 private JLabel matriculeLab;
	 private JTextField matricule;
	 private JLabel nomLab;
	 private JTextField nom;
	 private JLabel prenomLab;
	 private JTextField prenom;
	 private JLabel adresseLab;
	 private JTextField adresse;
	 private JLabel pseudoLab;
	 private JTextField pseudo;
	 private JLabel responsableLab;
	 private JTextField responsable;
	 private JLabel dateNaissanceLab;
	 private JTextField dateNaissanceJ;
	 private JComboBox dateNaissanceM;
	 private JTextField dateNaissanceA;
	 private JLabel hobbyLab;
	 private JTextField hobby;
	 private JLabel dateEmbaucheLab;
	 private JTextField dateEmbaucheJ;
	 private JComboBox dateEmbaucheM;
	 private JTextField dateEmbaucheA;
	 
	 //BUTTONS
	 private JButton rechercher;
	 private JButton reinitialiser;
	 private JButton valider;
	 private JButton annuler;
	 
	 //LAYOUT MANAGER
	 private GridBagLayout layout;
	 private GridBagConstraints gbc;
	 
	 public PanelAdministration(){
		  layout = new GridBagLayout();
		  gbc = new GridBagConstraints();
		  this.setLayout(layout);
		  
		  //---------------------------------------------
		  gbc.gridx = gbc.gridy = 0;
		  matriculeLab = new JLabel("Matricule");
		  this.add(matriculeLab, gbc);
		  gbc.gridx = 1;
		  matricule = new JTextField(15);
		  this.add(matricule, gbc);
		  //---------------------------------------------
		  gbc.gridx = 0;
		  gbc.gridy = 1;
		  nomLab = new JLabel("Nom");
		  this.add(nomLab, gbc);
		  gbc.gridx = 1;
		  nom = new JTextField(15);
		  this.add(nom, gbc);
		  gbc.gridx = 2;
		  prenomLab = new JLabel("Prenom");
		  this.add(prenomLab, gbc);
		  gbc.gridx = 3;
		  prenom = new JTextField(15);
		  this.add(prenom, gbc);
		  //---------------------------------------------
		  gbc.gridx = 0;
		  gbc.gridy = 2;
		  adresseLab = new JLabel("Adresse");
		  this.add(adresseLab, gbc);
		  gbc.gridx = 1;
		  adresse = new JTextField(15);
		  this.add(adresse, gbc);
		  gbc.gridx = 2;
		  pseudoLab = new JLabel("Pseudo");
		  this.add(pseudoLab, gbc);
		  gbc.gridx = 3;
		  pseudo = new JTextField(15);
		  this.add(pseudo, gbc);
		   //---------------------------------------------
		  gbc.gridx = 0;
		  gbc.gridy = 3;
		  responsableLab = new JLabel("Responsable");
		  this.add(responsableLab, gbc);
		  gbc.gridx = 1;
		  responsable = new JTextField(15);
		  this.add(responsable, gbc);
		  gbc.gridx = 2;
		  dateNaissanceLab = new JLabel("Date de Naissance");
		  this.add(dateNaissanceLab, gbc);
		  gbc.gridx = 3;
		  dateNaissanceJ = new JTextField(4);
		  dateNaissanceJ.setText("jour");
		  this.add(dateNaissanceJ, gbc);
		  gbc.gridx = 4;
		  dateNaissanceM = new JComboBox();
		  this.initComboBox(dateNaissanceM);
		  this.add(dateNaissanceM, gbc);
		  gbc.gridx =  5;
		  dateNaissanceA = new JTextField(5);
		  dateNaissanceA.setText("année");
		  this.add(dateNaissanceA, gbc);
		  //---------------------------------------------
		  gbc.gridx = 0;
		  gbc.gridy = 4;
		  hobbyLab = new JLabel("Hobby");
		  this.add(hobbyLab, gbc);
		  gbc.gridx = 1;
		  hobby = new JTextField(15);
		  this.add(hobby, gbc);
		  gbc.gridx = 2;
		  dateEmbaucheLab = new JLabel("Date Embauche");
		  this.add(dateEmbaucheLab, gbc);
		  gbc.gridx = 3;
		  dateEmbaucheJ = new JTextField(4);
		  dateEmbaucheJ.setText("jour");
		  this.add(dateEmbaucheJ, gbc);
		  gbc.gridx = 4;
		  dateEmbaucheM = new JComboBox();
		  this.initComboBox(dateEmbaucheM);
		  this.add(dateEmbaucheM, gbc);
		  gbc.gridx =  5;
		  dateEmbaucheA = new JTextField(5);
		  dateEmbaucheA.setText("année");
		  this.add(dateEmbaucheA, gbc);
		  //---------------------------------------------
		  gbc.gridx = 0;
		  gbc.gridy = 5;
		  rechercher = new JButton("Rechercher");
		  this.add(rechercher, gbc);
		  gbc.gridx = 1;
		  reinitialiser = new JButton("Réinitialiser");
		  this.add(reinitialiser, gbc);
		  gbc.gridx = 2;
		  valider = new JButton("Valider");
		  this.add(valider, gbc);
		  gbc.gridx = 3;
		  annuler = new JButton("Annuler");
		  this.add(annuler, gbc);
	 }
	 
	 private void initComboBox(JComboBox box){
		  for(int i=1; i<=12; i++){
			   box.addItem(Integer.toString(i));
		  }
	 }
	 
}
