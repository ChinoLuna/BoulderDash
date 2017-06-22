package view;

import java.awt.Color;
import java.awt.Graphics2D;

import controller.Score;

public class DrawGame {
	
	
	public void Gamefinish(Graphics2D p_g){
		p_g.setColor(Color.black);
		p_g.drawString("RESTART", 750 , 450);
	}
	
	public void GameOver(Graphics2D p_g){
		p_g.setColor(Color.red);
		p_g.drawString("GAME OVER", 750 , 350);
	}
	
	public void RetMenu(Graphics2D p_g){
		Score scr = new Score();
		p_g.setColor(Color.black);
		p_g.drawString("GOOD JOB", 550, 350);
		p_g.drawString("Score : " + scr.getScore() , 450, 350);
	}
	
	
	

}
