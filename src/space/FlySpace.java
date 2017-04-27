package space;

import java.util.ArrayList;

import util.Cube;

public class FlySpace {

	/*Order : inside upper, 
			  inside lower, 
			  outside upper, 
			  outside lower */
	private int[] boundaries = new int[4];
	private int[] defaultBoundaries = {50,50,40,40}, coordinatesAtStart;
	private int[] defaultCoordinates = {0,0,0,0};
	private Cube outsideCube,insideCube;
	private ArrayList<Cube> cubesCollection = new ArrayList<Cube>();
	

	public FlySpace(int[] coordinatesAtStart, int[] boundaries, int offset) {
		try{
			if(boundaries == null)
				throw new NullPointerException("Invalid flySpace boundaries, setting default values");
			if(coordinatesAtStart == null)
				throw new NullPointerException("Invalid flySpace coordinates, setting default values");
			
			this.boundaries = boundaries;
			this.coordinatesAtStart = coordinatesAtStart;
			
		} catch(NullPointerException ex){
			System.out.println(ex.getMessage());
			boundaries = defaultBoundaries;
			coordinatesAtStart = defaultCoordinates;
		}
		
		outsideCube = new Cube(coordinatesAtStart, boundaries[0]-coordinatesAtStart[0]);
		int[] insideCubeCoordinates = new int[] {
				coordinatesAtStart[0]+offset,
				coordinatesAtStart[1]+offset,
				coordinatesAtStart[2]+offset
		};
		int insideCubeSideLength = boundaries[0]-offset-(coordinatesAtStart[0]+offset);
		insideCube = new Cube(insideCubeCoordinates, insideCubeSideLength);
		
	}
	
	@Override
	public String toString() {
		return "Inside Upper boundary: " + getInsideUpperBoundary() + 
				"\nInside Lower boundary: " + getInsideLowerBoundary() + 
				"\nOutside Upper boundary: " + getOutsideUpperBoundary() + 
				"\nOutside Lower boundary: " + getOutsideLowerBoundary();
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

	

	public int[] getCoordinatesAtStart() {
		return coordinatesAtStart;
	}

	public void setCoordinatesAtStart(int[] coordinatesAtStart) {
		this.coordinatesAtStart = coordinatesAtStart;
	}

	public Cube getOutsideCube() {
		return outsideCube;
	}

	public void setOutsideCube(Cube outsideCube) {
		this.outsideCube = outsideCube;
	}

	public Cube getInsideCube() {
		return insideCube;
	}

	public void setInsideCube(Cube insideCube) {
		this.insideCube = insideCube;
	}

	public ArrayList<Cube> getCubesCollection() {
		return cubesCollection;
	}

	public void setCubesCollection(ArrayList<Cube> cubesCollection) {
		this.cubesCollection = cubesCollection;
	}
	
	
	
	
}
