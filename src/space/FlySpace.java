package space;

import utility.Cube;

public class FlySpace {
	
	Cube velika = new Cube(new int[] {0,0,0}, 50);
	Cube mala = new Cube(new int[] {10,10,10}, 30);
	Cube prepreka1 = new Cube(new int[] {28,12,1}, 1);
	Cube prepreka2 = new Cube(new int[] {6,7,15}, 1);
	
	public Cube getVelika() {
		return velika;
	}
	public Cube getMala() {
		return mala;
	}
	public void setVelika(Cube velika) {
		this.velika = velika;
	}
	public void setMala(Cube mala) {
		this.mala = mala;
	}
	public Cube getPrepreka1() {
		return prepreka1;
	}
	public Cube getPrepreka2() {
		return prepreka2;
	}
	public void setPrepreka1(Cube prepreka1) {
		this.prepreka1 = prepreka1;
	}
	public void setPrepreka2(Cube prepreka2) {
		this.prepreka2 = prepreka2;
	}
	
	
	

	
	
}
