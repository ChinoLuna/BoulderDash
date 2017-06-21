package test;

public class score implements Runnable {
	
	// Monster; == 1
	//int Diamond; == 2
	//int Final; == 3
	//int TPSfinal; == 4
	
	//class scoring  {
		
		time tp = new time();
		
		private score scr;
		
		public score(){
			this.scr = scr;
		}
		
		int S = 4;
		int score =  0;
		int a=1;
		int b=2;
		
		@Override
		public void run() {
			while(a<b){
				
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
			this.score = score + (tp.tpf*10);
			System.out.println("score : " + this.score);
			
			
				}	
		
        try {
            Thread.sleep(500);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
	}
}
				
	public long getScore() {
		return this.score;
		}
	//}
}
	


