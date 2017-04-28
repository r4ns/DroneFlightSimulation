package drone;
 
public class Cube {
	private int [] minCoordinates; //donja tacka dijagonale kocke
	private int cubeSideLength; //duzina stranice kocke
	private int [] maxCoordinates; //gornja tacka dijagonale kocke
	//kreira kocku na osnovu prosledjenih parametara
	
	Cube cube;
	
	public Cube(int [] cubeStartCoordinates, int side)
	{
	//implementacija
		this.minCoordinates=cubeStartCoordinates;
		this.cubeSideLength=side;
		this.maxCoordinates[0]=this.minCoordinates[0]+side;
		this.maxCoordinates[1]=this.minCoordinates[1]+side;
		this.maxCoordinates[2]=this.minCoordinates[2]+side;
		
	}
	
	//kopira prosledjenu kocku
	public Cube(Cube cube)
	{
		this.cubeSideLength=cube.getCubeSideLength();
		this.minCoordinates=cube.getMinCoordinates();
		this.maxCoordinates= cube.getMaxCoordinates();
	}
	
	//default konstruktor
	public Cube()
	{
		
	}
	
	//proverava da li se prosledjene koordinate nalaze u kocki
	public boolean checkCoordinates(int [] coordinates)
	{
	//implementacija
		
		if((coordinates[0]>=this.minCoordinates[0] && coordinates[1]>=this.minCoordinates[1] && coordinates[2]>=this.minCoordinates[2])
		&& (coordinates[0]<=this.maxCoordinates[0] && coordinates[1]<=this.maxCoordinates[1] && coordinates[2]<=this.maxCoordinates[2])){
			return true;
		}
		else 
			return false;
		
	}
	//proverava da li se kocke seku
	public boolean checkCubeIntersection(Cube cube)
	{
	//implementacija treba da koristi checkCoordinates metodu
		if(this.checkCoordinates(cube.getMinCoordinates()) || this.checkCoordinates(cube.getMaxCoordinates()))
			return true;
		else 
			return false;
	}
	//proverava da li se kocke dodiruju
	public boolean checkIfCubesAreTouching(Cube cube)
	{
	//implementacija
		int [] startCoordinates = {cube.minCoordinates[0],cube.minCoordinates[1],cube.minCoordinates[2]-cube.cubeSideLength};
		Cube pom = new Cube(startCoordinates, cube.cubeSideLength+1);
		System.out.println(startCoordinates);
		System.out.println(pom);
		if(this.checkCubeIntersection(pom)==true)
			return true;
		else
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
	
		//proverava da li se kocke dodiruju iznutra
	public boolean checkIfCubesAreTouchingFromInside(Cube cube)
	{
		//implementacija treba da koristi checkIfCubesAreTouching
		if (this.checkCubeIntersection(cube) == true && this.checkIfCubesAreTouching(cube) == true)
			return true;
		else
	return false;
	}
		//proverava da li se kocke dodiruju sa spoljasnje strane
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
	{
		//implementacija treba da koristi checkIfCubesAreTouching
		if (this.checkCubeIntersection(cube) == false && this.checkIfCubesAreTouching(cube) == true)
			return true;
		else
			return false;
	}
		//uvecava X
	public void increaseX()
	{
		//implementacija
		this.minCoordinates[0]++;
		this.maxCoordinates[0]++;
	}
		//uvecava Y 
	public void increaseY()
	{
		//implementacija
		this.minCoordinates[1]++;
		this.maxCoordinates[1]++;
	}
		//uvecava Z
	public void increaseZ()
	{
		//implementacija
		this.minCoordinates[2]++;
		this.maxCoordinates[2]++;
	}
		//smanjuje X
	public void decreaseX()
	{
		//implementacija
		this.minCoordinates[0]--;
		this.maxCoordinates[0]--;
	}
		//smanjuje Y
	public void decreaseY()
	{
		//implementacija
		this.minCoordinates[1]--;
		this.maxCoordinates[1]--;
	}
		//smanjuje Z
	public void decreaseZ()
	{
		//implementacija
		this.minCoordinates[2]--;
		this.maxCoordinates[2]--;
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