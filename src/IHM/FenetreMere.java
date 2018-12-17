/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import javax.swing.*;

/**
 *
 * @author 20181591
 */
public class FenetreMere extends JFrame{
            //Where the GUI is created:
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;

    public FenetreMere(){
        
        //On crÃ©Ã© un menu : programmeur
        menuBar = new JMenuBar();
        menu = new JMenu("Programmeur");
        menu.getAccessibleContext().setAccessibleDescription("Programmeur");
        menuBar.add(menu);
        
        //Taille de la Jframe
        this.setVisible(true);
	this.setSize(300, 300);
        this.setLocation(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Menu en haut de la JFrame
        this.setJMenuBar(menuBar);
        
        //Un Sous-Menu
        menu.addSeparator();
        JMenu submenu = new JMenu("Afficher");
        menuItem = new JMenuItem("Tous");
        submenu.add(menuItem);
        menu.add(submenu);
        
        //a group of JMenuItems
        menuItem = new JMenuItem("Modifier");
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Supprimer");
        menu.add(menuItem);
        
        menuItem = new JMenuItem("Ajouter"/*,new ImageIcon("images/middle.gif")*/);
        menu.add(menuItem);

        /*menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
        menu.add(menuItem);*/
           //Build second menu in the menu bar.
           
        //On crÃ©Ã© un menu : action
        menu = new JMenu("Action");
        menu.getAccessibleContext().setAccessibleDescription("Action");
        menuBar.add(menu);
        
        menuItem = new JMenuItem("Quitter");
        menu.add(menuItem);
        
    }
    
}

   


	 
