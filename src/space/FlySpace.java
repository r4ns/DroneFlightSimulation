package space;

public class FlySpace {
	
	private int[] boundaries=new int[3];
	private int[] defaultBoundaries={50,50,50};
	private int[] coordinatesAtStart=new int[3];
	private int[] defaultCoordinates={0,0,0};
	private Cube outsideCube, insideCube;
	private int space=10;
	
	public FlySpace()
	{
		
	}
	
	public FlySpace(int[] boundaries, int[] coodrinatesAtStart)
	{
		if(boundaries==null)
		{
			this.boundaries=defaultBoundaries;
		}
		if(coordinatesAtStart==null)
		{
			this.coordinatesAtStart=defaultCoordinates;
		}
		this.boundaries=boundaries;
		this.coordinatesAtStart=coordinatesAtStart;
		
		this.outsideCube=new Cube(coordinatesAtStart, boundaries[0]-coordinatesAtStart[0]);
		//UNUTRASNJA????
	}
	
	

	public int[] getBoundaries() {
		return boundaries;
	}

	public int[] getDefaultBoundaries() {
		return defaultBoundaries;
	}

	public int[] getCoordinatesAtStart() {
		return coordinatesAtStart;
	}

	public int[] getDefaultCoordinates() {
		return defaultCoordinates;
	}

	public Cube getOutsideCube() {
		return outsideCube;
	}

	public Cube getInsideCube() {
		return insideCube;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

	public void setDefaultBoundaries(int[] defaultBoundaries) {
		this.defaultBoundaries = defaultBoundaries;
	}

	public void setCoordinatesAtStart(int[] coordinatesAtStart) {
		this.coordinatesAtStart = coordinatesAtStart;
	}

	public void setDefaultCoordinates(int[] defaultCoordinates) {
		this.defaultCoordinates = defaultCoordinates;
	}

	public void setOutsideCube(Cube outsideCube) {
		this.outsideCube = outsideCube;
	}

	public void setInsideCube(Cube insideCube) {
		this.insideCube = insideCube;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}
	
	

}
