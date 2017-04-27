package space;

import util.Cube;

public class FlySpace {

	/*Order : inside upper, 
			  inside lower, 
			  outside upper, 
			  outside lower */
	private int[] boundaries = new int[4];
	private int[] defaultBoundaries = {50,50,40,40}, coordinatesAtStart;
	private Cube outsideCube,insideCube; 
	

	public FlySpace(int[] coordinatesAtStart, int[] boundaries, int offset) {
		try{
			if(boundaries == null)
				throw new NullPointerException("Invalid boundaries, setting default values");
			
			this.boundaries = boundaries;
			
		} catch(NullPointerException ex){
			System.out.println(ex.getMessage());
			setBoundaries(defaultBoundaries);
		}
		
		this.coordinatesAtStart = coordinatesAtStart;
		outsideCube = new Cube(coordinatesAtStart, boundaries[0]-coordinatesAtStart[0]);
		int[] insideCubeCoordinates = new int[] {
				coordinatesAtStart[0]+offset,
				coordinatesAtStart[1]+offset,
				coordinatesAtStart[2]+offset
		};
		int insideCubeSideLength = boundaries[0]-offset-(coordinatesAtStart[0]+offset);
		insideCube = new Cube(insideCubeCoordinates, insideCubeSideLength);
		
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
