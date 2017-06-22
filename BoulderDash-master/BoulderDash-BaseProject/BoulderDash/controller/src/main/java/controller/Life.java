package controller;

public class Life{
	private int life = 3;
	int v = 1 ;
	
public Life(){

	
		if (this.v  == 0){
			this.life = life-1;


			if (life==0){
				System.exit(0);
			}
			
		}
		System.out.println("life : " + this.life);
			
	return;
	
}

	public int getLife() {
		return this.life;
	}

	public void setLife(int life) {
		this.life = life;
	}
}
