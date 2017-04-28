package space;
import utility.*;

public class FlySpace {
	int[] p1={0,0,0};
	int[] p2={10,10,10};
	private Cube velika=new Cube(p1,50);
	private Cube mala=new Cube(p2,30);
	
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

