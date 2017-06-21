package view;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class FenetreJeu extends JFrame{

	private static final long serialVersionUID = 1L;
	//MenuWindow menuwindow;
	//MenuWindow2 menuwindow2;s
	
	public FenetreJeu(){

	    this.setTitle("Boulder Dash");
	    this.setSize(1550, 1050);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    
	    JPanel pan = new JPanel();
	    
	    this.setContentPane(new Jeu(null));
	    this.setVisible(true);
	}
	
}

