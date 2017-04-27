package space;

public class Cube {
	private int [] minCoordinates; 
	private int cubeSideLength; 
	private int [] maxCoordinates; 
	
	public Cube(int [] cubeStartCoordinates, int side)
	{
		minCoordinates = cubeStartCoordinates;
		cubeSideLength = side;
		maxCoordinates = new int[] {minCoordinates[0]+cubeSideLength, minCoordinates[1]+cubeSideLength, minCoordinates[2]+cubeSideLength};
	}
	
	public Cube(Cube cube)
	{
		this.minCoordinates = cube.getMinCoordinates();
		this.cubeSideLength = cube.getCubeSideLength();
		this.maxCoordinates = cube.getMaxCoordinates();
	}
	
	public Cube()
	{

	}
	
	public boolean checkCoordinates(int [] coordinates)
	{
		for (int i = 0 ; i < coordinates.length ; i++) {
			if (!(coordinates[i] >= minCoordinates[i] && coordinates[i] <= maxCoordinates[i]))
				return false;
		}
		return true;
	}
	
	public boolean checkCubeIntersection(Cube cube)
	{
		if(checkCoordinates(cube.minCoordinates) || checkCoordinates(cube.maxCoordinates))
			return true;

		return false;
	}
	
	public boolean checkIfCubesAreTouching(Cube cube)
	{
		for (int i = 0; i < 3; i++) {
			if((cube.minCoordinates[i] == this.minCoordinates[i]) || (cube.maxCoordinates[i] == this.maxCoordinates[i]))
				return true;
		}

		return false;
	}

	@Override
	public String toString()
	{
		return "Drone position: ("
				+ Integer.toString(minCoordinates[0]) + ","
				+ Integer.toString(minCoordinates[1]) + ","
				+ Integer.toString(minCoordinates[2]) + "), ("
				+ Integer.toString(maxCoordinates[0]) + ","
				+ Integer.toString(maxCoordinates[1]) + ","
				+ Integer.toString(maxCoordinates[2]) + ")";
	}

	
	public boolean checkIfCubesAreTouchingFromInside(Cube cube)
	{
		
		if (checkIfCubesAreTouching(cube) && (checkCubeIntersection(cube) == false))
			return true;

		return false;
	}
	
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
	{
		if (checkIfCubesAreTouching(cube) && checkCubeIntersection(cube))
			return true;

		return false;
	}
	
	public void increaseX(int x)
	{
		minCoordinates[0] += x;
		maxCoordinates[0] += x;
	}
	
	public void increaseY(int y)
	{
		minCoordinates[1] += y;
		maxCoordinates[1] += y;
	}
	
	public void increaseZ(int z)
	{
		minCoordinates[1] += z;
		maxCoordinates[1] += z;
	}
	
	public void decreaseX(int x)
	{
		minCoordinates[0] -= x;
		maxCoordinates[0] -= x;
	}
	
	public void decreaseY(int y)
	{
		minCoordinates[0] -= y;
		maxCoordinates[0] -= y;
	}
	
	public void decreaseZ(int z)
	{
		minCoordinates[0] -= z;
		maxCoordinates[0] -= z;
	}

	public int[] getMinCoordinates() {
		return minCoordinates;
	}
	public void setMinCoordinates(int[] minCoordinates) {
		this.minCoordinates = minCoordinates;
	}

	public int getCubeSideLength() {
		return cubeSideLength;
	}
	public void setCubeSideLength(int cubeSideLength) {
		this.cubeSideLength = cubeSideLength;
	}
	public int[] getMaxCoordinates() {
		return maxCoordinates;
	}
	public void setMaxCoordinates(int[] maxCoordinates) {
		this.maxCoordinates = maxCoordinates;
	}
}


