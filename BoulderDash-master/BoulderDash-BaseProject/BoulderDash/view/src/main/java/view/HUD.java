package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.*;;


public class HUD extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//JPanel utilBar = new JPanel();
	Time tps = new Time();
    Score src = new Score();    
    Diamonds dia = new Diamonds();
    Life lf = new Life();
    
  
    
    JLabel time = new JLabel("Time : " + this.tps.getTimes());//cree les different information du HUD
    JLabel Diamond = new JLabel("Diamond : " + dia.getD() );
    JLabel Score = new JLabel("Score : " + this.src.getScore());
    JLabel Vie = new JLabel("Vie : " + lf.getLife() );
 
    HUD(JPanel pan) //parametre de l'interface
    {   
    	
    	pan.setLayout(new BorderLayout());
        pan.add(this, BorderLayout.NORTH);
        this.setLayout(new GridLayout(1, 4));
        
        this.add(time);
        this.add(Diamond);
        this.add(Score);
        this.add(Vie);

           
        this.setVisible(true);
        
    }
    public void paintComponent(Graphics g1){
    	super.paintComponent(g1);


    
    		//g1.drawString("Time : " + tps.getTimes(), 1, 12);
        	
    
    	
    	
    }
    
    
    public void updatelabel(){
    	
    	time.repaint();
    }

     
}

