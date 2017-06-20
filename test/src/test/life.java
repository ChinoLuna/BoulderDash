package test;

public class life {
	private int life = 1;
	int v = 1 ;
	
	
	public int life(){
		for(life = 3; life >=  0; life--){
			if (this.v  == 0){
				this.life = life-1;


				if (life==00){
					System.exit(0);
				}
			}
			return life;
		}
		return life;

		

		
		
	}

	public int getLife() {
		return life();
	}

	public void setLife(int life) {
		this.life = life;
	}

}
