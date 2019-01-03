/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;
import Modele.Programmeur;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Axel Carnez
 */
public interface ActionsBD {
	 public ArrayList<Programmeur> getProgrammeur();
}
