package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Fenetre extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//MenuWindow menuwindow;
	//MenuWindow2 menuwindow2;s

	
	public Fenetre(){

	    this.setTitle("Boulder Dash");
	    this.setSize(1500, 1000);
	    this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    


	    
	    this.setContentPane(new Panneau(null));
	    this.setVisible(true);
	    
	}
	
}
