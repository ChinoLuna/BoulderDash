package view;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Score;
import controller.Time;

import java.awt.BorderLayout;
import java.awt.Color;

public class FenetreJeu extends JFrame{

	private static final long serialVersionUID = 1L;
	//MenuWindow menuwindow;
	//MenuWindow2 menuwindow2;s
	
	public FenetreJeu(){
		
	    

	    this.setTitle("Boulder Dash");
	    this.setSize(1500, 1025);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    	    
	    this.setContentPane(new Jeu(null));
	    this.setVisible(true);
	    

	    
	    
	}

	
}
