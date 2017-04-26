package space;

public class FlySpace {

	protected int[] outerBoundaries={50,50,50};
	protected int space=10;
	
	public FlySpace(){
		
	}
	
	public FlySpace(int[] outerBoundaries, int space){
		this.outerBoundaries=outerBoundaries;
		this.space=space;
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

	
}
