package controller;



public class Score {
	
	// Monster; == 1
	//int Diamond; == 2
	//int Final; == 3
	//int TPSfinal; == 4
	
	//class scoring  {
		
		Time tp = new Time();
		
		
		public Score(){
			   if (S==0){
				   this.score=score+10;
			     }
			   }
		
		int S=1;
		int score =  0;
		
		int D  = 15 ; 



				
	public long getdiamond() {
		this.score = score + 100;
		this.D=D-1;
		System.out.println("score : " + this.score);
		return this.score;
		}
	
	public long getmonster() {
		this.score = score + 150;
		System.out.println("score : " + this.score);
		return this.score;
	}
	
	public long getFinalTime() {
		this.score = score + ((tp.tpf)*10);
		System.out.println("score : " + this.score);
		return this.score;
	}
	
	public long getFinal() {
		this.score = score + 250;
		System.out.println("score : " + this.score);
		try {
			Thread.sleep(10000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		
		
		System.exit(0);
		return this.score;
	}


	public long getScore() {
		return this.score;
		}
	//}

	public int getD() {
		return this.D;
	}

	}

	


