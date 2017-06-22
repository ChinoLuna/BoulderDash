package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.*;;


public class HUD extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//JPanel utilBar = new JPanel();
    Life lf = new Life();
	Time tps = new Time();
    Score scr = new Score();
    int temps = 130;
    int score = 0;
    int life = 3;
    int diamond=  12 ;
    
    
    
    
   //JButton button = new JButton("Temps : "  + this.temps);
    JLabel time = new JLabel("Time : " + this.tps.getTimes());//cree les different information du HUD
    JLabel Diamond = new JLabel("Diamond : " +  diamond);
    JLabel Score = new JLabel("Score : " + this.scr.getScore());
    JLabel Vie = new JLabel("Vie : " + lf.getLife());
 
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
     
	public void actionPerformed(ActionEvent e)//si il ya une action sur l'ariere plan
    {
        this.Score.revalidate();
		this.Score.repaint();
    }

    /*public static void main(String[]agrs) 
    {

    	Time tps = new Time();
        Score scr = new Score();
       
        
        Thread t =  new Thread(tps);
        Thread s = new Thread(scr);

        t.start();
        s.start();

    }*/


}

