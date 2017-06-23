package main;


import java.io.IOException;
import controller.Time;
import view.FenetreJeu;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
	
    public static void main(final String[] args) throws IOException, InterruptedException{
        	//Fenetre fenetreMenu = new Fenetre();
    	
 	
    		FenetreJeu leJeu = new FenetreJeu();
        	Time tps = new Time();
        	
            Thread t =  new Thread(tps);

            t.start();
            
            
    }

}
