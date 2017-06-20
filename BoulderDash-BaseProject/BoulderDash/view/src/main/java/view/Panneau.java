package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.ControllerFacade;
import model.ModelFacade;

public class Panneau extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JPanel boutonPane = new JPanel();
	JButton boutonMap1 = new JButton("Map1");
	JButton boutonMap2 = new JButton("Map2");
	JButton boutonMap3 = new JButton("Map3");
	JButton boutonMap4 = new JButton("Map4");
	JButton boutonMap5 = new JButton("Map5");
	JButton boutonEXIT = new JButton("EXIT");
	
	
	ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
	
	public void paintComponent(Graphics g){
		try {
		      Image img = ImageIO.read(new File("Boulder.jpg"));
		      g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }                
		      
	Font font = new Font("showcard gothic", Font.BOLD, 90);
  	g.setFont(font);
  	g.setColor(Color.LIGHT_GRAY);
  	g.drawString("Boulder Dash", 350, 195);
	
	this.setLayout(null);

  	Font font1 = new Font("TimesRoman", Font.ITALIC, 100);
  	
  	
	boutonMap1.setBounds(600, 300, 350, 200);
	this.add(boutonMap1);
	boutonMap1.setVisible(true);
	boutonMap1.addActionListener(new ActionListener(){
		int map;
		public void actionPerformed(ActionEvent arg0){
			map = 1;
			try {
				controller.start(map);
	        } catch (final SQLException exception) {exception.printStackTrace();}
		}
	});
  	boutonMap1.setFont(font1);
  	boutonMap1.setForeground(Color.LIGHT_GRAY);
  	boutonMap1.setOpaque(false);
  	boutonMap1.setContentAreaFilled(false);
  	boutonMap1.setBorderPainted(false);
  	

    boutonMap2.setBounds(600, 400, 350, 200);
	this.add(boutonMap2);
	boutonMap2.setVisible(true);
	boutonMap2.addActionListener(new ActionListener(){
		int map;
		public void actionPerformed(ActionEvent arg0){
			
			map = 2;
			
			try {
				controller.start(map);
	        }catch (final SQLException exception) {exception.printStackTrace();}
		}
	});
  	boutonMap2.setFont(font1);
  	boutonMap2.setForeground(Color.LIGHT_GRAY);
  	boutonMap2.setOpaque(false);
  	boutonMap2.setContentAreaFilled(false);
  	boutonMap2.setBorderPainted(false);
  	
  	boutonMap3.setBounds(600, 500, 350, 200);
	this.add(boutonMap3);
	boutonMap3.setVisible(true);
	boutonMap3.addActionListener(new ActionListener(){
		int map;
		public void actionPerformed(ActionEvent arg0){
			
			map = 3;
			
			try {
	            controller.start(map);
	        }catch (final SQLException exception) {exception.printStackTrace();}
			
		}
	});
  	boutonMap3.setFont(font1);
  	boutonMap3.setForeground(Color.LIGHT_GRAY);
  	boutonMap3.setOpaque(false);
  	boutonMap3.setContentAreaFilled(false);
  	boutonMap3.setBorderPainted(false);
  	
  	boutonMap4.setBounds(600, 600, 350, 200);
	this.add(boutonMap4);
	boutonMap4.setVisible(true);
	boutonMap4.addActionListener(new ActionListener(){
		int map;
		public void actionPerformed(ActionEvent arg0){
			
			map = 4;
			
			try {
				controller.start(map);
	        } catch (final SQLException exception) {exception.printStackTrace();}
		}
	});
  	boutonMap4.setFont(font1);
  	boutonMap4.setForeground(Color.LIGHT_GRAY);
  	boutonMap4.setOpaque(false);
  	boutonMap4.setContentAreaFilled(false);
  	boutonMap4.setBorderPainted(false);
  	
  	boutonMap5.setBounds(600, 700, 350, 200);
	this.add(boutonMap5);
	boutonMap5.setVisible(true);
	boutonMap5.addActionListener(new ActionListener(){
		int map;

		public void actionPerformed(ActionEvent arg0){
			
			this.map = 5;
			
			try{
				controller.start(map);
	        }catch (final SQLException exception) {exception.printStackTrace();}
		}
	});
  	boutonMap5.setFont(font1);
  	boutonMap5.setForeground(Color.LIGHT_GRAY);
  	boutonMap5.setOpaque(false);
  	boutonMap5.setContentAreaFilled(false);
  	boutonMap5.setBorderPainted(false);
  	
  	boutonEXIT.setBounds(20, 750, 350, 200);
	this.add(boutonEXIT);
	boutonEXIT.setVisible(true);
	boutonEXIT.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){
			System.exit(0);
		}
	});
  	boutonEXIT.setFont(font1);
  	boutonEXIT.setForeground(Color.LIGHT_GRAY);
  	boutonEXIT.setOpaque(false);
  	boutonEXIT.setContentAreaFilled(false);
  	boutonEXIT.setBorderPainted(false);
}
	
  public Panneau(Fenetre fen) {
		super();
	}

}
