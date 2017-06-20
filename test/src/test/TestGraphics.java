package test;

import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class TestGraphics extends JFrame implements ActionListener
{
   
	protected static final TestGraphics TestGraphics = null;
	JPanel utilBar = new JPanel();
	//time tps = new time();
    //life life = new life();
    score scr = new score();
    int temps = 130;
    int score = 0;
    
    
    
    
   // JButton button = new JButton("Temps : "  + this.temps);
    //JLabel time = new JLabel("Time : " + this.temps);//cree les different information du HUD
    JLabel Diamond = new JLabel("Diamond : ");
    JLabel Score = new JLabel("Score : " + this.score);
   // JLabel Vie = new JLabel("Vie : " + life.getLife());

    GraphicsPanel drawingArea = new GraphicsPanel();// creer l'ariere plan
 

    TestGraphics() //parametre de l'interface
    {   
    	this.setTitle("BoulderDash");
        this.setSize(600, 600);
        this.setLayout(new BorderLayout());

        add(utilBar, BorderLayout.NORTH);
        utilBar.setLayout(new GridLayout(1, 4));
        
       // JLabel label2 = new JLabel(String.);
        //utilBar.add(button);
        //utilBar.add(time);
        utilBar.add(Diamond);
        utilBar.add(Score);
        //utilBar.add(Vie);
        
       // button.setEnabled(true);
        
       // TestGraphics selff = this;

       /* button.addActionListener(new ActionListener(){
        		public void actionPerformed(ActionEvent arg0){
        			selff.temps = 0;
        			
        			Thread t = new Thread(){
        				
        			};
        			t.start();
        		}
        	});*/
        
        add(drawingArea, BorderLayout.CENTER);
                
        
        this.setVisible(true);
        
    }
     
	public void actionPerformed(ActionEvent e)//si il ya une action sur l'ariere plan
    {
        //time.revalidate();
		//time.repaint();
    }

    public static void main(String[]agrs) 
    {
        new TestGraphics();
    }
}

@SuppressWarnings("serial")
class GraphicsPanel extends JPanel {

  

	

    @Override
    protected void paintComponent(Graphics g) {//parametre 
        super.paintComponent(g);

        // Clear the graphics
        g.setClip(null);
        g.setColor(Color.black);
        g.fillRect(0, 0, 2000, 1000);
        


        
    }
    
}

