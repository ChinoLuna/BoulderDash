package test;


public class time extends Thread{
    int temps = 130;
    private int tpsfin = 0;
     
    public time(){
      
         
        for (int i = 0; i < 130; i++) {
        this.temps = temps-1;
        System.out.println(temps);
        try {
            Thread.sleep(1000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        if (temps==00){
            System.exit(0);
        }
        }
         
    }
 
 



	public int getTemps() {
        return this.temps;
    }
 
 
    public void setTemps(int temps) {
        this.temps = temps;
    }
     
 
}