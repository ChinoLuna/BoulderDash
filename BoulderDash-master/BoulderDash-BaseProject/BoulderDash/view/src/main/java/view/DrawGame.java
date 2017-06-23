package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import controller.Score;

public class DrawGame {


	public void Gamefinish(Graphics g){
		Font font = new Font("Restart", Font.BOLD, 36);
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString("RESTART", 750 , 450);
		g.setPaintMode();
	}
	
	public void GameOver(Graphics g){
		g.setColor(Color.green);
		g.drawString("GAME OVER", 750 , 350);
	}
	
	public void RetMenu(Graphics g){
		Score scr = new Score();
		g.setColor(Color.black);
	    g.drawString("GOOD JOB", 550, 350);
		g.drawString("Score : " + scr.getScore() , 450, 350);
	}
	
	
	

}
