package space;

public class FlySpace {

	/*Order : inside upper, 
			  inside lower, 
			  outside upper, 
			  outside lower */
	int[] boundaries = new int[4];
	int[] defaultBoundaries = {50,50,40,40};
	

	public FlySpace(int[] boundaries) {
		try{
			this.boundaries = boundaries;
		} catch(NullPointerException ex){
			System.out.println("Invalid values, setting default values");
			setBoundaries(boundaries);
		}
	}
	
	public int[] getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}
	
	public int getInsideUpperBoundary() {
		return boundaries[0];
	}
	
	public void setInsideUpperBoundary(int boundary) {
		boundaries[0] = boundary;
	}
	
	public int getInsideLowerBoundary() {
		return boundaries[1];
	}
	
	public void setInsideLowerBoundary(int boundary) {
		boundaries[1] = boundary;
	}

	public int getOutsideUpperBoundary() {
		return boundaries[2];
	}
	
	public void setOutsideUpperBoundary(int boundary) {
		boundaries[2] = boundary;
	}
	
	public int getOutsideLowerBoundary() {
		return boundaries[3];
	}
	
	public void setOutsideLowerBoundary(int boundary) {
		boundaries[3] = boundary;
	}

	@Override
	public String toString() {
		return "Inside Upper boundary: " + getInsideUpperBoundary() + 
				"\nInside Lower boundary: " + getInsideLowerBoundary() + 
				"\nOutside Upper boundary: " + getOutsideUpperBoundary() + 
				"\nOutside Lower boundary: " + getOutsideLowerBoundary();
	}
	
	
	
}
