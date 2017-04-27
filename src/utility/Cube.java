package utility;

public class Cube {
	private int [] minCoordinates; //donja tacka dijagonale kocke
	private int cubeSideLength; //duzina stranice kocke
	private int [] maxCoordinates; //gornja tacka dijagonale kocke
	//kreira kocku na osnovu prosledjenih parametara
	public Cube(int [] cubeStartCoordinates, int side)
	{
	
		minCoordinates = cubeStartCoordinates;
		cubeSideLength = side;
		maxCoordinates = new int[] {minCoordinates[0] + cubeSideLength, minCoordinates[1] + cubeSideLength, minCoordinates[2] + cubeSideLength};
	}
	//kopira prosledjenu kocku
	public Cube(Cube cube)
	{
		this.minCoordinates = cube.getMinCoordinates();
		this.cubeSideLength = cube.getCubeSideLength();
		this.maxCoordinates = cube.getMaxCoordinates();
	}
	//default konstruktor
	public Cube()
	{
		
	}
	//proverava da li se prosledjene koordinate nalaze u kocki
	public boolean checkCoordinates(int [] coordinates)
	{
		for (int i = 0 ; i < coordinates.length ; i++) {
			if (!(coordinates[i] >= minCoordinates[i] && coordinates[i] <= maxCoordinates[i]))
				return false;
		}
		return true;
	}
	//proverava da li se kocke seku
	public boolean checkCubeIntersection(Cube cube)
	{
		if(checkCoordinates(cube.minCoordinates) || checkCoordinates(cube.maxCoordinates))
			return true;
		
		return false;
	}
	//proverava da li se kocke dodiruju
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
		return "Cube position: ("
				+ Integer.toString(minCoordinates[0]) + ","
				+ Integer.toString(minCoordinates[1]) + ","
				+ Integer.toString(minCoordinates[2]) + "), ("
				+ Integer.toString(maxCoordinates[0]) + ","
				+ Integer.toString(maxCoordinates[1]) + ","
				+ Integer.toString(maxCoordinates[2]) + ")";
	}
	//proverava da li se kocke dodiruju iznutra
	public boolean checkIfCubesAreTouchingFromInside(Cube cube)
	{
		//implementacija treba da koristi checkIfCubesAreTouching
		if (checkIfCubesAreTouching(cube) && (checkCubeIntersection(cube) == false))
			return true;
		
		return false;
	}
	//proverava da li se kocke dodiruju sa spoljasnje strane
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
	{
		//implementacija treba da koristi checkIfCubesAreTouching
		if (checkIfCubesAreTouching(cube) && checkCubeIntersection(cube))
			return true;
		
		return false;
	}
	//uvecava X
	public void increaseX(int x)
	{
		minCoordinates[0] += x;
		maxCoordinates[0] += x;
	}
	//uvecava Y
	public void increaseY(int y)
	{
		minCoordinates[1] += y;
		maxCoordinates[1] += y;
	}
	//uvecava Z
	public void increaseZ(int z)
	{
		minCoordinates[2] += z;
		maxCoordinates[2] += z;
	}
	//smanjuje X
	public void decreaseX(int x)
	{
		minCoordinates[0] -= x;
		maxCoordinates[0] -= x;
	}
	//smanjuje Y
	public void decreaseY(int y)
	{
		minCoordinates[1] -= y;
		maxCoordinates[1] -= y;
	}
	//smanjuje Z
	public void decreaseZ(int z)
	{
		minCoordinates[2] -= z;
		maxCoordinates[2] -= z;
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
