package controller;

public class Life{
	private int life = 3;
	int v = 1 ;
	
public int Life(){
	
			this.life = life-1;

			if (life==0){
				System.exit(0);
			
		}
		System.out.println("life : " + this.life);
			
	return life;
	
}

	public int getLife() {
		return this.life;
	}

}
