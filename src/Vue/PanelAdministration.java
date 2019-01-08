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
	  private JTextField adresse;
	 private JLabel adresseLab;
	 private javax.swing.JButton annuler;
	 private javax.swing.JPanel boutonPan;
	 private javax.swing.JPanel champsPan;
	 private javax.swing.JTextField dateEmbaucheA;
	 private javax.swing.JTextField dateEmbaucheJ;
	 private javax.swing.JLabel dateEmbaucheLab;
	 private javax.swing.JComboBox dateEmbaucheM;
	 private javax.swing.JTextField dateNaissanceA;
	 private javax.swing.JTextField dateNaissanceJ;
	 private javax.swing.JLabel dateNaissanceLab;
	 private javax.swing.JComboBox dateNaissanceM;
	 private javax.swing.JPanel fenetre;
	 private javax.swing.JTextField hobby;
	 private javax.swing.JLabel hobbyLab;
	 private javax.swing.JTextField matricule;
	 private javax.swing.JLabel matriculeLab;
	 private javax.swing.JPanel matriculePan;
	 private javax.swing.JTextField nom;
	 private javax.swing.JLabel nomLab;
	 private javax.swing.JTextField prenom;
	 private javax.swing.JLabel prenomLab;
	 private javax.swing.JTextField pseudo;
	 private javax.swing.JLabel pseudoLab;
	 private javax.swing.JButton rechercher;
	 private javax.swing.JButton reinitialiser;
	 private javax.swing.JTextField responsable;
	 private javax.swing.JLabel responsableLab;
	 private javax.swing.JButton valider;
			 
	private DataTransac dt;
	private ArrayList<Programmeur> listProg;
	private String filtre;
	private GestionVueAbstraite content;
	 
	 public PanelAdministration(GestionVueAbstraite content){
	 
		  champsPan = new javax.swing.JPanel();
		  nomLab = new javax.swing.JLabel();
		  adresseLab = new javax.swing.JLabel();
		  responsableLab = new javax.swing.JLabel();
		  hobbyLab = new javax.swing.JLabel();
		  nom = new javax.swing.JTextField();
		  adresse = new javax.swing.JTextField();
		  responsable = new javax.swing.JTextField();
		  hobby = new javax.swing.JTextField();
		  prenomLab = new javax.swing.JLabel();
		  pseudoLab = new javax.swing.JLabel();
		  dateNaissanceLab = new javax.swing.JLabel();
		  dateEmbaucheLab = new javax.swing.JLabel();
		  prenom = new javax.swing.JTextField();
		  pseudo = new javax.swing.JTextField();
		  dateNaissanceJ = new javax.swing.JTextField();
		  dateEmbaucheJ = new javax.swing.JTextField();
		  dateNaissanceM = new javax.swing.JComboBox();
		  dateNaissanceA = new javax.swing.JTextField();
		  dateEmbaucheA = new javax.swing.JTextField();
		  dateEmbaucheM = new javax.swing.JComboBox();
		  matriculePan = new javax.swing.JPanel();
		  matriculeLab = new javax.swing.JLabel();
		  matricule = new javax.swing.JTextField();
		  boutonPan = new javax.swing.JPanel();
		  rechercher = new javax.swing.JButton();
		  reinitialiser = new javax.swing.JButton();
		  valider = new javax.swing.JButton();
		  annuler = new javax.swing.JButton();

		  nomLab.setText("Nom");
		  adresseLab.setText("Adresse");
		  responsableLab.setText("Responsable");
		  hobbyLab.setText("Hobby");
		  prenomLab.setText("Prénom");
		  pseudoLab.setText("Pseudo");
		  dateNaissanceLab.setText("Date de naissance");
		  dateEmbaucheLab.setText("Date d'embauche");
		  dateNaissanceJ.setText("jour");
		  dateEmbaucheJ.setText("jour");
		  initComboBox(dateNaissanceM);
		  dateNaissanceA.setText("année");
		  dateEmbaucheA.setText("année");
		  initComboBox(dateEmbaucheM);

		  javax.swing.GroupLayout champsPanLayout = new javax.swing.GroupLayout(champsPan);
		  champsPan.setLayout(champsPanLayout);
		  champsPanLayout.setHorizontalGroup(
			   champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, champsPanLayout.createSequentialGroup()
					.addGap(39, 39, 39)
					.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						 .addComponent(nomLab)
						 .addComponent(adresseLab)
						 .addComponent(responsableLab)
						 .addComponent(hobbyLab))
					.addGap(22, 22, 22)
					.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
						 .addComponent(adresse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
						 .addComponent(responsable, javax.swing.GroupLayout.Alignment.LEADING)
						 .addComponent(hobby, javax.swing.GroupLayout.Alignment.LEADING)
						 .addComponent(nom))
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						 .addComponent(prenomLab)
						 .addComponent(pseudoLab)
						 .addGroup(champsPanLayout.createSequentialGroup()
							  .addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								   .addComponent(dateEmbaucheLab)
								   .addComponent(dateNaissanceLab))
							  .addGap(13, 13, 13)
							  .addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								   .addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(pseudo, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
										.addComponent(prenom))
								   .addGroup(champsPanLayout.createSequentialGroup()
										.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
											 .addComponent(dateEmbaucheJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
											 .addComponent(dateNaissanceJ, javax.swing.GroupLayout.Alignment.LEADING))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
											 .addComponent(dateEmbaucheM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											 .addComponent(dateNaissanceM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						 .addComponent(dateNaissanceA, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
						 .addComponent(dateEmbaucheA))
					.addGap(40, 40, 40))
		  );
		  champsPanLayout.setVerticalGroup(
			   champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			   .addGroup(champsPanLayout.createSequentialGroup()
					.addGap(25, 25, 25)
					.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						 .addComponent(nomLab)
						 .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addComponent(prenomLab)
						 .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						 .addComponent(adresseLab)
						 .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addComponent(pseudoLab)
						 .addComponent(pseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						 .addComponent(responsableLab)
						 .addComponent(responsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addComponent(dateNaissanceLab)
						 .addComponent(dateNaissanceJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addComponent(dateNaissanceM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addComponent(dateNaissanceA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(champsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						 .addComponent(hobbyLab)
						 .addComponent(hobby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addComponent(dateEmbaucheLab)
						 .addComponent(dateEmbaucheJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addComponent(dateEmbaucheM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addComponent(dateEmbaucheA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(0, 30, Short.MAX_VALUE))
		  );

		  matriculePan.setBackground(new java.awt.Color(102, 102, 102));

		  matriculeLab.setForeground(new java.awt.Color(255, 255, 255));
		  matriculeLab.setText("Matricule");

		  javax.swing.GroupLayout matriculePanLayout = new javax.swing.GroupLayout(matriculePan);
		  matriculePan.setLayout(matriculePanLayout);
		  matriculePanLayout.setHorizontalGroup(
			   matriculePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			   .addGroup(matriculePanLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(matriculeLab)
					.addGap(18, 18, 18)
					.addComponent(matricule, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		  );
		  matriculePanLayout.setVerticalGroup(
			   matriculePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			   .addGroup(matriculePanLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(matriculePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						 .addComponent(matriculeLab)
						 .addComponent(matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
					.addContainerGap(20, Short.MAX_VALUE))
		  );

		  rechercher.setText("Rechercher");
		  rechercher.addActionListener(new java.awt.event.ActionListener() {
			   public void actionPerformed(java.awt.event.ActionEvent evt) {
					rechercherActionPerformed(evt);
			   }
		  });

		  reinitialiser.setText("Réinitialiser");
		  reinitialiser.addActionListener(new java.awt.event.ActionListener() {
			   public void actionPerformed(java.awt.event.ActionEvent evt) {
					reinitialiserActionPerformed(evt);
			   }
		  });

		  valider.setText("Valider");
		  valider.addActionListener(new java.awt.event.ActionListener() {
			   public void actionPerformed(java.awt.event.ActionEvent evt) {
					validerActionPerformed(evt);
			   }
		  });

		  annuler.setText("Annuler");
		  annuler.addActionListener(new java.awt.event.ActionListener() {
			   public void actionPerformed(java.awt.event.ActionEvent evt) {
					annulerActionPerformed(evt);
			   }
		  });

		  javax.swing.GroupLayout boutonPanLayout = new javax.swing.GroupLayout(boutonPan);
		  boutonPan.setLayout(boutonPanLayout);
		  boutonPanLayout.setHorizontalGroup(
			   boutonPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			   .addGroup(boutonPanLayout.createSequentialGroup()
					.addGap(88, 88, 88)
					.addComponent(rechercher)
					.addGap(18, 18, 18)
					.addComponent(reinitialiser)
					.addGap(18, 18, 18)
					.addComponent(valider)
					.addGap(18, 18, 18)
					.addComponent(annuler)
					.addContainerGap(90, Short.MAX_VALUE))
		  );
		  boutonPanLayout.setVerticalGroup(
			   boutonPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			   .addGroup(boutonPanLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(boutonPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						 .addComponent(rechercher)
						 .addComponent(reinitialiser)
						 .addComponent(valider)
						 .addComponent(annuler))
					.addContainerGap(16, Short.MAX_VALUE))
		  );

		  javax.swing.GroupLayout fenetreLayout = new javax.swing.GroupLayout(this);
		  this.setLayout(fenetreLayout);
		  fenetreLayout.setHorizontalGroup(
			   fenetreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			   .addComponent(matriculePan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fenetreLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(boutonPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
			   .addGroup(fenetreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(fenetreLayout.createSequentialGroup()
						 .addGap(0, 0, Short.MAX_VALUE)
						 .addComponent(champsPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addGap(0, 0, Short.MAX_VALUE)))
		  );
		  fenetreLayout.setVerticalGroup(
			   fenetreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			   .addGroup(fenetreLayout.createSequentialGroup()
					.addComponent(matriculePan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
					.addComponent(boutonPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			   .addGroup(fenetreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(fenetreLayout.createSequentialGroup()
						 .addGap(0, 0, Short.MAX_VALUE)
						 .addComponent(champsPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						 .addGap(0, 0, Short.MAX_VALUE)))
		  );
		  
		  dt = new DataTransac();
		  listProg = dt.getProgrammeur();  
		  this.content = content;
	 }
	 
	 private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {
		  if(!matricule.getText().toString().matches("\\p{Digit}+")){
			   JOptionPane.showMessageDialog(new JFrame(),"Veuillez saisir un entier pour le matricule", "Echec", JOptionPane.ERROR_MESSAGE); 
		  }
		  else{
			   rechercheProg(Integer.parseInt(matricule.getText()));
			   valider.setEnabled(true);
		  }
	 }                                          

	 private void reinitialiserActionPerformed(java.awt.event.ActionEvent evt) {                                              
		  reinitialiser();
	 }                                             

	 private void validerActionPerformed(java.awt.event.ActionEvent evt) {
		  if(!matricule.getText().toString().matches("\\p{Digit}+")){
			   JOptionPane.showMessageDialog(new JFrame(),"Veuillez saisir un entier pour le matricule", "Echec", JOptionPane.ERROR_MESSAGE); 
		  }
		  else{
			   if(filtre =="modifier") modifieProg(Integer.parseInt(matricule.getText()));
			   if(filtre =="supprimer") supprimeProg(Integer.parseInt(matricule.getText()));
		  }
		  if(filtre =="ajouter") ajouteProg();
	 }                                       

	 private void annulerActionPerformed(java.awt.event.ActionEvent evt) {                                        
		  content.show("accueil");
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
		  if(matricule.getText().length()== 0 || nom.getText().length()== 0 || prenom.getText().length() == 0 || adresse.getText().length() == 0 || hobby.getText().length() == 0 || responsable.getText().length() == 0 || pseudo.getText().length() == 0){
			   JOptionPane.showMessageDialog(new JFrame(),"Veuillez remplir tout les champs !", "Echec", JOptionPane.ERROR_MESSAGE);  
		  }
		  else if(!dateNaissanceJ.getText().toString().matches("\\p{Digit}+") || !dateEmbaucheJ.getText().toString().matches("\\p{Digit}+") || !dateNaissanceA.getText().toString().matches("\\p{Digit}+") || !dateEmbaucheJ.getText().toString().matches("\\p{Digit}+") ){
			   JOptionPane.showMessageDialog(new JFrame(),"Veuillez saisir des entiers pour les dates", "Echec", JOptionPane.ERROR_MESSAGE); 
		  }
		  else if(!matricule.getText().toString().matches("\\p{Digit}+")){
			   JOptionPane.showMessageDialog(new JFrame(),"Veuillez saisir un entier pour le matricule", "Echec", JOptionPane.ERROR_MESSAGE); 
		  }
		  else{
			   try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
					Date naissance = dateFormat.parse(dateNaissanceA.getText()+"-"+dateNaissanceM.getSelectedItem().toString()+"-"+dateNaissanceJ.getText());
					Date embauche = dateFormat.parse(dateEmbaucheA.getText()+"-"+dateEmbaucheM.getSelectedItem().toString()+"-"+dateEmbaucheJ.getText());
					Programmeur prog = new Programmeur(Integer.parseInt(matricule.getText()), nom.getText(), prenom.getText(), adresse.getText(), pseudo.getText(), responsable.getText(), hobby.getText(), naissance, embauche);
					dt.ajouteProgrammeur(prog);
					listProg.add(prog);
					if(filtre == "ajouter"){
						 JOptionPane.showMessageDialog(new JFrame(),"Ajout réussie", "Succès", JOptionPane.INFORMATION_MESSAGE);
					} 
					content.show("accueil");
			   } catch (ParseException ex) {
					Logger.getLogger(PanelAdministration.class.getName()).log(Level.SEVERE, null, ex);
			   }
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
					}
					listProg.remove(i);
			   }
		  }
		  if(erreur){
			   JOptionPane.showMessageDialog(new JFrame(),"Programmeur introuvable", "Echec", JOptionPane.ERROR_MESSAGE);  
		  }
		  else{
			   content.show("accueil");
		  }
	 }
	 
	 private void modifieProg(int matricule){
		  supprimeProg(matricule);
		  ajouteProg();
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
		  reinitialiser();
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
		  dateNaissanceM.setSelectedIndex(0);
		  dateEmbaucheM.setSelectedIndex(0);
		  dateNaissanceA.setText("année");
		  dateEmbaucheA.setText("année");
	 }
}
