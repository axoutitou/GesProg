/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import java.util.Date;

/**
 *
 * @author Axel Carnez
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

	 @Override
	 public String toString() {
		  return  matricule + " " + nom + " " +prenom + " " + adresse + " " + pseudo + " " + responsable + " " + hobby + " " + naissance + " " + embauche;
	 }

	 public int getMatricule() {
		  return matricule;
	 }

	 public void setMatricule(int matricule) {
		  this.matricule = matricule;
	 }

	 public String getNom() {
		  return nom;
	 }

	 public void setNom(String nom) {
		  this.nom = nom;
	 }

	 public String getPrenom() {
		  return prenom;
	 }

	 public void setPrenom(String prenom) {
		  this.prenom = prenom;
	 }

	 public String getAdresse() {
		  return adresse;
	 }

	 public void setAdresse(String adresse) {
		  this.adresse = adresse;
	 }

	 public String getPseudo() {
		  return pseudo;
	 }

	 public void setPseudo(String pseudo) {
		  this.pseudo = pseudo;
	 }

	 public String getResponsable() {
		  return responsable;
	 }

	 public void setResponsable(String responsable) {
		  this.responsable = responsable;
	 }

	 public String getHobby() {
		  return hobby;
	 }
	 
	 public void setHobby(String hobby) {
		  this.hobby = hobby;
	 }

	 public Date getNaissance() {
		  return naissance;
	 }

	 public void setNaissance(Date naissance) {
		  this.naissance = naissance;
	 }

	 public Date getEmbauche() {
		  return embauche;
	 }

	 public void setEmbauche(Date embauche) {
		  this.embauche = embauche;
	 }
}
