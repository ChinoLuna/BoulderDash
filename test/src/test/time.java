package test;


public class time implements Runnable {
    
    /*class timer{
    	//int temps = 130;
        private int tpsfin = 0;
         
		public void run() {}
	}*/

	private time tps;

	public time() {
		this.tps = tps ;
	}
	int temps = 130;
	int S = 1;
	int tpf = 0;

	@Override
	public void run() {

		for (int i = 0; i < 130; i++) {
			this.temps = temps-1;
			System.out.println("temps : " + this.temps);
			try {
				Thread.sleep(1000);                 //1000 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			if (temps==00){
				System.exit(0);
				}
			if (S==3){
				System.out.println(temps);
				tpf = temps;
				System.exit(tpf);
				
			}
			}
				
	}
	
	
	public int getTpf() {
		return tpf;
	}


	public void setTpf(int tpf) {
		this.tpf = tpf;
	}


	public int getTemps() {
        return this.temps;
    }
 
 
    public void setTemps(int temps) {
        this.temps = temps;
    }

    }