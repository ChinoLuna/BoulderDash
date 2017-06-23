package controller;



public class Score {
	
	int score =  0;
		Time tp = new Time();
		
			
	public int getdiamond() {
		this.score = score + 100;
		System.out.println("score : " + this.score);
		
		return this.score;
		}
	
	public int getmonster() {
		this.score = score + 150;
		System.out.println("score : " + this.score);
		return this.score;
	}
	
	public int getFinalTime() {
		this.score = score + ((tp.tpf)*10);
		System.out.println("score : " + this.score);
		return this.score;
	}
	
	public int getFinal() {
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

	public int getScore() {
		return score;
	}

	}

	


