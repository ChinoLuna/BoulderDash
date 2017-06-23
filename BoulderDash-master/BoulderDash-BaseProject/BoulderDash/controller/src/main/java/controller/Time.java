package controller;


public class Time implements Runnable {
   
	int Times = 130;
	int S = 1;
	int tpf = 0;

	@Override
	public void run() {

		for (int i = 0; i < 130; i++) {
			this.Times = Times-1;
			System.out.println("Times : " + this.Times);
			try {
				Thread.sleep(1000);                 //1000 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			
			if (Times==00){
				System.exit(0);
				}
			if (S==3){
				System.out.println(Times);
				tpf = Times;
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


	public int getTimes() {
        return Times;
    }
 
 
    public void setTimes(int Times) {
        this.Times = Times;
    }

    }