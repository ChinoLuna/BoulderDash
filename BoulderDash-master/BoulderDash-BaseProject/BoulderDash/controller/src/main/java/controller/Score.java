package controller;



public class Score implements Runnable {
	
	// Monster; == 1
	//int Diamond; == 2
	//int Final; == 3
	//int TPSfinal; == 4
	
	//class scoring  {
		
		Time tp = new Time();
		
		private Score scr;
		
		public Score(){
			this.scr = scr;
		}
		
		int S = 0;
		int score =  0;

		
		@Override
		public void run() {

				
		if (S == 1){
				this.score = score + 100;
				System.out.println("score : " + this.score);

				}
		if (S == 2){
				this.score = score + 10;
				System.out.println("score : " + this.score);

				}
		if (S == 3){
				this.score = score + 150;
				System.out.println("score : " + this.score);

				System.exit(0);
				}
		if (S == 4){
			this.score = score + ((tp.tpf)*10);
			System.out.println("score : " + this.score);
			
			
				}	
	}

				
	public long getScore() {
		return this.score;
		}
	//}
}
	


