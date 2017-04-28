package space;

import utility.*;

public class FlySpace {
	int[] p1={0,0,0};
	int[] p2={10,10,10};
	private Cube velika;
	private Cube mala;
	
	public FlySpace(){
		velika=new Cube(p1,50);
		mala=new Cube(p2,30);
	}
	
	public FlySpace(int[] k1,int[] k2,int k1d,int k2d){
		velika=new Cube(k1,k1d);
		mala=new Cube(k2,k2d);
	}
	
	public Cube getVelika() {
		return velika;
	}
	public void setVelika(Cube velika) {
		this.velika = velika;
	}
	public Cube getMala() {
		return mala;
	}
	public void setMala(Cube mala) {
		this.mala = mala;
	}
	
	
}
