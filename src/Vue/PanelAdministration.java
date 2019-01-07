/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.DataTransac;
import Modele.Programmeur;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Axel Carnez
 */
public class PanelAdministration extends JPanel{
	 //JPANEL
	 private JPanel matriculePan;
	 private JPanel boutonPan;
	 
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
	 private String filtre;
	 private GestionVueAbstraite content;
	 
	 //DONNEES
	 private DataTransac dt;
	 private ArrayList<Programmeur> listProg;
	 
	 public PanelAdministration(GestionVueAbstraite content){
		  layout = new GridBagLayout();
		  gbc = new GridBagConstraints();
		  this.setLayout(layout);
		  this.content=content;
		  
		  //---------------------------------------------
		  gbc.gridx = gbc.gridy = 0;
		  gbc.gridwidth= 6;
		  matriculePan = new JPanel();
		  matriculeLab = new JLabel("Matricule");
		  matriculePan.add(matriculeLab);
		  matricule = new JTextField(15);
		  matriculePan.add(matricule);
		  matriculePan.setBackground(Color.gray);
		  this.add(matriculePan, gbc);
		  //---------------------------------------------
		  gbc.gridx = 0;
		  gbc.gridwidth = gbc.gridy = 1;
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
		  gbc.gridwidth = 6;
		  boutonPan = new JPanel();
		  rechercher = new JButton("Rechercher");
		  rechercher.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					rechercheProg(Integer.parseInt(matricule.getText()));
					valider.setEnabled(true);
			   }
		  });
		  boutonPan.add(rechercher);
		  reinitialiser = new JButton("Réinitialiser");
		  boutonPan.add(reinitialiser);
		  valider = new JButton("Valider");
		  valider.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					if(filtre ==  "ajouter") ajouteProg();
					if(filtre ==  "supprimer") supprimeProg(Integer.parseInt(matricule.getText()));
					if(filtre ==  "modifier") modifieProg(Integer.parseInt(matricule.getText()));
			   }
		  });
		  boutonPan.add(valider);
		  annuler = new JButton("Annuler");
		  annuler.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent arg0) {
					content.show("accueil");
			   }
		  });
		  boutonPan.add(annuler);
		  this.add(boutonPan, gbc);
		  
		  dt = new DataTransac();
		  listProg = dt.getProgrammeur();
	 }
	 
	 private void initComboBox(JComboBox box){
		  for(int i=1; i<=12; i++){
			   box.addItem(Integer.toString(i));
		  }
	 }
	 
	 private void rechercheProg(int matricule){
		  boolean erreur = true;
		  for(int i=0; i<listProg.size(); i++){
			   Programmeur prog = listProg.get(i);
			   if(prog.getMatricule() == matricule){
					erreur = false;
					this.remplirInformations(prog.getMatricule(), prog.getNom(), prog.getPrenom(), prog.getAdresse(), prog.getPseudo(), prog.getResponsable(), prog.getNaissance(), prog.getHobby(), prog.getEmbauche());
			   }
		  }
		  if(erreur){
			   JOptionPane.showMessageDialog(new JFrame(),"Programmeur introuvable", "Echec", JOptionPane.ERROR_MESSAGE);  
		  }
	 }
	 
	 private void ajouteProg(){
		  try {
			   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
			   Date naissance = dateFormat.parse(dateNaissanceA.getText()+"-"+dateNaissanceM.getSelectedItem().toString()+"-"+dateNaissanceJ.getText());
			   Date embauche = dateFormat.parse(dateEmbaucheA.getText()+"-"+dateEmbaucheM.getSelectedItem().toString()+"-"+dateEmbaucheJ.getText());
			   Programmeur prog = new Programmeur(Integer.parseInt(matricule.getText()), nom.getText(), prenom.getText(), adresse.getText(), pseudo.getText(), responsable.getText(), hobby.getText(), naissance, embauche);
			   dt.ajouteProgrammeur(prog);
			   listProg.add(prog);
			   if(filtre == "ajouter"){
					JOptionPane.showMessageDialog(new JFrame(),"Ajout réussie", "Succès", JOptionPane.INFORMATION_MESSAGE);
					reinitialiser();
			   } 
		  } catch (ParseException ex) {
			   Logger.getLogger(PanelAdministration.class.getName()).log(Level.SEVERE, null, ex);
		  }
	 }
	 
	 private void supprimeProg(int matricule){
		 boolean erreur = true;
		  for(int i=0; i<listProg.size(); i++){
			   Programmeur prog = listProg.get(i);
			   if(prog.getMatricule() == matricule){
					erreur = false;
					dt.supprimeProgrammeur(matricule);
					if(filtre == "supprimer"){
						 JOptionPane.showMessageDialog(new JFrame(),"Suppression réussie", "Succès", JOptionPane.INFORMATION_MESSAGE);
						 reinitialiser();
					}
					listProg.remove(i);
			   }
		  }
		  if(erreur){
			   JOptionPane.showMessageDialog(new JFrame(),"Programmeur introuvable", "Echec", JOptionPane.ERROR_MESSAGE);  
		  }
	 }
	 
	 private void modifieProg(int matricule){
		  supprimeProg(matricule);
		  ajouteProg();
		  reinitialiser();
		  JOptionPane.showMessageDialog(new JFrame(),"Modification réussie", "Succès", JOptionPane.INFORMATION_MESSAGE);
	 }
	 
	 private void remplirInformations(int matricule, String nom, String prenom, String adresse, String pseudo, String responsable, Date dateNaiss, String hobby, Date dateEmb){
		  this.matricule.setText(Integer.toString(matricule));
		  this.nom.setText(nom.toString());
		  this.prenom.setText(prenom.toString());
		  this.adresse.setText(adresse.toString());
		  this.pseudo.setText(pseudo.toString());
		  Calendar calendar = new GregorianCalendar();
		  calendar.setTime(dateNaiss);
		  dateNaissanceJ.setText(Integer.toString(calendar.get(Calendar.DAY_OF_MONTH)));
		  dateNaissanceM.setSelectedIndex(calendar.get(Calendar.MONTH));
		   dateNaissanceA.setText(Integer.toString(calendar.get(Calendar.YEAR)));
		  this.responsable.setText(responsable.toString());
		  calendar.setTime(dateEmb);
		  dateEmbaucheJ.setText(Integer.toString(calendar.get(Calendar.DAY_OF_MONTH)));
		  dateEmbaucheM.setSelectedIndex(calendar.get(Calendar.MONTH));
		   dateEmbaucheA.setText(Integer.toString(calendar.get(Calendar.YEAR)));
		  this.hobby.setText(hobby.toString());
	 }
	 
	 public void setFiltre(String monFiltre){
		  filtre = monFiltre;
		  if(filtre == "modifier"){
			   nomLab.setEnabled(true);
			   nom.setEnabled(true);
			   prenomLab.setEnabled(true);
			   prenom.setEnabled(true);
			   adresseLab.setEnabled(true);
			   adresse.setEnabled(true);
			   pseudoLab.setEnabled(true);
			   pseudo.setEnabled(true);
			   responsableLab.setEnabled(true);
			   responsable.setEnabled(true);
			   dateNaissanceLab.setEnabled(true);
			   dateNaissanceJ.setEnabled(true);
			   dateNaissanceM.setEnabled(true);
			   dateNaissanceA.setEnabled(true);
			   hobbyLab.setEnabled(true);
			   hobby.setEnabled(true);
			   dateEmbaucheLab.setEnabled(true);
			   dateEmbaucheJ.setEnabled(true);
			   dateEmbaucheM.setEnabled(true);
			   dateEmbaucheA.setEnabled(true);
			   rechercher.setEnabled(true);
			   reinitialiser.setEnabled(true);
			   annuler.setEnabled(true); 
			   reinitialiser.setEnabled(false);
			   valider.setEnabled(false);
		  }
		  
		  if(filtre == "supprimer"){
			   nomLab.setEnabled(false);
			   nom.setEnabled(false);
			   prenomLab.setEnabled(false);
			   prenom.setEnabled(false);
			   adresseLab.setEnabled(false);
			   adresse.setEnabled(false);
			   pseudoLab.setEnabled(false);
			   pseudo.setEnabled(false);
			   responsableLab.setEnabled(false);
			   responsable.setEnabled(false);
			   dateNaissanceLab.setEnabled(false);
			   dateNaissanceJ.setEnabled(false);
			   dateNaissanceM.setEnabled(false);
			   dateNaissanceA.setEnabled(false);
			   hobbyLab.setEnabled(false);
			   hobby.setEnabled(false);
			   dateEmbaucheLab.setEnabled(false);
			   dateEmbaucheJ.setEnabled(false);
			   dateEmbaucheM.setEnabled(false);
			   dateEmbaucheA.setEnabled(false);
			   rechercher.setEnabled(false);
			   reinitialiser.setEnabled(false);
			   annuler.setEnabled(true);  
			   valider.setEnabled(true);  
		  }
		  
		  if(filtre == "ajouter"){
			   nomLab.setEnabled(true);
			   nom.setEnabled(true);
			   prenomLab.setEnabled(true);
			   prenom.setEnabled(true);
			   adresseLab.setEnabled(true);
			   adresse.setEnabled(true);
			   pseudoLab.setEnabled(true);
			   pseudo.setEnabled(true);
			   responsableLab.setEnabled(true);
			   responsable.setEnabled(true);
			   dateNaissanceLab.setEnabled(true);
			   dateNaissanceJ.setEnabled(true);
			   dateNaissanceM.setEnabled(true);
			   dateNaissanceA.setEnabled(true);
			   hobbyLab.setEnabled(true);
			   hobby.setEnabled(true);
			   dateEmbaucheLab.setEnabled(true);
			   dateEmbaucheJ.setEnabled(true);
			   dateEmbaucheM.setEnabled(true);
			   dateEmbaucheA.setEnabled(true);
			   rechercher.setEnabled(true);
			   reinitialiser.setEnabled(true);
			   annuler.setEnabled(true); 
			   rechercher.setEnabled(false);
			   valider.setEnabled(true);
		  }
	 }
	 
	 private void reinitialiser(){
		  matricule.setText("");
		  nom.setText("");
		  prenom.setText("");
		  adresse.setText("");
		  pseudo.setText("");
		  responsable.setText("");
		  hobby.setText("");
		  dateNaissanceJ.setText("jour");
		  dateEmbaucheJ.setText("jour");
		  dateNaissanceM.setSelectedItem(0);
		  dateEmbaucheM.setSelectedItem(0);
		  dateNaissanceA.setText("année");
		  dateEmbaucheA.setText("année");
	 }
}
