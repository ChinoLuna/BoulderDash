package test;

public class score {
	
	// Monster; == 1
	//int Diamond; == 2
	//int Final; == 3
	//int TPSfinal; == 4
	int S = 3;
	int score =  0;

	
	
	public score() {
		for(int w = 0; w<=130;w++){
			
			if (S == 1){
					this.score = score + 5;
					System.out.println(this.score);

					}
			if (S == 2){
					this.score = score + 2;
					System.out.println(this.score);

					}
			if (S == 3){
					this.score = score + 10;
					System.out.println(this.score);

					System.exit(0);
					}
			if (S == 4){
				System.out.println(this.score);

				
					}	
			
	        try {
	            Thread.sleep(1000);                 //1000 milliseconds is one second.
	        } catch(InterruptedException ex) {
	            Thread.currentThread().interrupt();
	        }
	        if(w==130){
				System.out.println(this.score);

	    		System.exit(0);
	        }
		}		
	}


	public long getScore() {
		return this.score;
	}



	
}
