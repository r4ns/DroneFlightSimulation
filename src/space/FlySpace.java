package space;

public class FlySpace {

	protected int[] outerBoundaries={50,50,50};
	protected int space=10;
	Cube velika = new Cube(new int[] {0,0,0}, 50);
	Cube mala = new Cube(new int[] {10,10,10}, 30);
	Cube prepreka1 = new Cube(new int[] {28,12,1}, 1);
	Cube prepreka2 = new Cube(new int[] {6,7,15}, 1);

	public FlySpace(){

	}

	public FlySpace(int[] outerBoundaries, int space){
		this.outerBoundaries=outerBoundaries;
		this.space=space;
	}

	public FlySpace(Cube velika, Cube mala, Cube prepreka1, Cube prepreka2){
		setVelika(velika);
		setMala(mala);
		setPrepreka1(prepreka1);
		setPrepreka2(prepreka2);
	}

	public int[] getOuterBoundaries() {
		return outerBoundaries;
	}

	public int getSpace() {
		return space;
	}

	public void setOuterBoundaries(int[] outerBoundaries) {
		this.outerBoundaries = outerBoundaries;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public Cube getVelika() {
		return velika;
	}

	public Cube getMala() {
		return mala;
	}

	public Cube getPrepreka1() {
		return prepreka1;
	}

	public Cube getPrepreka2() {
		return prepreka2;
	}

	public void setVelika(Cube velika) {
		this.velika = velika;
	}

	public void setMala(Cube mala) {
		this.mala = mala;
	}

	public void setPrepreka1(Cube prepreka1) {
		this.prepreka1 = prepreka1;
	}

	public void setPrepreka2(Cube prepreka2) {
		this.prepreka2 = prepreka2;
	}


}