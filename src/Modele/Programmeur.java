/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Date;

/**
 *
 * @author Axel Odran
 */
public class Programmeur {
	 private int matricule;
	 private String nom;
	 private String prenom;
	 private String adresse;
	 private String pseudo;
	 private String responsable;
	 private String hobby;
	 private Date naissance;
	 private Date embauche;

	 public Programmeur(int matricule, String nom, String prenom, String adresse, String pseudo, String responsable, String hobby, Date naissance, Date embauche) {
		  this.matricule = matricule;
		  this.nom = nom;
		  this.prenom = prenom;
		  this.adresse = adresse;
		  this.pseudo = pseudo;
		  this.responsable = responsable;
		  this.hobby = hobby;
		  this.naissance = naissance;
		  this.embauche = embauche;
	 }

	 /**
	  * Informations sur le programmeur pour l'affichage
	  * @return une chaine de caractère composé de toutes les informations du programmeur
	  */
	 @Override
	 public String toString() {
		  return  matricule + " " + nom + " " +prenom + " " + adresse + " " + pseudo + " " + responsable + " " + hobby + " " + naissance + " " + embauche;
	 }

	 /**
	  * Retourne le matricule du programmeur
	  * @return un int , correspondant au matricule du programmeur
	  */
	 public int getMatricule() {
		  return matricule;
	 }
	 
         /**
         * Met à jour le matricule du programmeur.
         * 
         * @param matricule
         * Le nouveau matricule du programmeur.
         */
	 public void setMatricule(int matricule) {
		  this.matricule = matricule;
	 }
         /**
         * Retourne le nom du programmeur
         * 
         * @return Un string , qui correspond au nom du programmeur.
         */
	 public String getNom() {
		  return nom;
	 }
         /**
         * Met à jour le nom du programmeur.
         * 
         * @param nom
         * Le nouveau Nom du programmeur.
         */
	 public void setNom(String nom) {
		  this.nom = nom;
	 }
         /**
         * Retourne le prenom du programmeur
         * 
         * @return Un string , qui correspond au prenom du programmeur.
         */
	 public String getPrenom() {
		  return prenom;
	 }
         /**
         * Met à jour le prenom du programmeur.
         * 
         * @param prenom
         * Le nouveau Prenom du programmeur.
         */
	 public void setPrenom(String prenom) {
		  this.prenom = prenom;
	 }
         /**
         * Retourne l'adresse du programmeur
         * 
         * @return Un string , qui correspond à l'adresse du programmeur.
         */
	 public String getAdresse() {
		  return adresse;
	 }
         /**
         * Met à jour le adresse du programmeur.
         * 
         * @param adresse
         * La nouvelle Adresse du programmeur.
         */
	 public void setAdresse(String adresse) {
		  this.adresse = adresse;
	 }
         /**
         * Retourne le pseudo du programmeur
         * 
         * @return Un string , qui correspond au pseudo du programmeur.
         */
	 public String getPseudo() {
		  return pseudo;
	 }
         /**
         * Met à jour le pseudo du programmeur.
         * 
         * @param pseudo
         * Le nouveau Pseudo du programmeur.
         */
	 public void setPseudo(String pseudo) {
		  this.pseudo = pseudo;
	 }
         /**
         * Retourne le responsable du programmeur
         * 
         * @return Un string , qui correspond au responsable du programmeur.
         */
	 public String getResponsable() {
		  return responsable;
	 }
        /**
         * Met à jour le responsable du programmeur.
         * 
         * @param responsable
         * Le nouveau Responsable du programmeur.
         */
	 public void setResponsable(String responsable) {
		  this.responsable = responsable;
	 }
         /**
         * Retourne le hobby du programmeur
         * 
         * @return Un string , qui correspond au hobby du programmeur.
         */
	 public String getHobby() {
		  return hobby;
	 }

         /**
         * Met à jour le hobby du programmeur.
         * 
         * @param hobby
         * Le nouveau Hobby du programmeur.
         */

	 public void setHobby(String hobby) {
		  this.hobby = hobby;
	 }
         /**
         * Retourne la date de naissance du programmeur
         * 
         * @return Un string , qui correspond à la date de naissance du programmeur.
         */
	 public Date getNaissance() {
		  return naissance;
	 }
         /**
         * Met à jour la date de naissance du programmeur.
         * 
         * @param naissance
         * La nouvelle date de naissance du programmeur.
         */
	 public void setNaissance(Date naissance) {
		  this.naissance = naissance;
	 }
         /**
         * Retourne le pseudo du programmeur
         * 
         * @return Un string , qui correspond au pseudo du programmeur.
         */
	 public Date getEmbauche() {
		  return embauche;
	 }
         /**
         * Met à jour la date d'embauche du programmeur.
         * 
         * @param embauche
         * La nouvelle date d'embauche du programmeur.
         */
	 public void setEmbauche(Date embauche) {
		  this.embauche = embauche;
	 }
}
