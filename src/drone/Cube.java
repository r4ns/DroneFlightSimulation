package drone;

public class Cube {
	
	private int [] minCoordinates; //donja tacka dijagonale kocke
	private int cubeSideLength; //duzina stranice kocke
	private int [] maxCoordinates;//gornja tacka dijagonale kocke
	private int [] cubeStartCoordinates={minCoordinates[0],minCoordinates[1],minCoordinates[2],maxCoordinates[0],maxCoordinates[1],maxCoordinates[2]};
			
	
	//kreira kocku na osnovu prosledjenih parametara
	public Cube(int [] cubeStartCoordinates, int side)
	{
		this.cubeStartCoordinates=cubeStartCoordinates;
		this.cubeSideLength=side;  
	}
	
	//kopira prosledjenu kocku
	public Cube(Cube cube)
	{
	  this.cubeSideLength=cube.getCubeSideLength();
	  this.minCoordinates=cube.getMinCoordinates();
	  this.maxCoordinates=cube.getMaxCoordinates();
	  
	}
	//default konstruktor
	public Cube()
	{
		
		
	}
	
	
	//proverava da li se prosledjene koordinate nalaze u kocki
	public boolean checkCoordinates(int [] coordinates)
	{
		if(this.minCoordinates[0]<=coordinates[1] && this.maxCoordinates[0]>=coordinates[1]){
			
			if(this.minCoordinates[1]<=coordinates[1] && this.maxCoordinates[1]>=coordinates[1]){
				
				if(this.minCoordinates[2]<=coordinates[2] && this.maxCoordinates[2]>=coordinates[2]){
					
					return true;
				}
				
				
			}
		} 
		return false; 
		
	}
	//proverava da li se kocke seku
	public boolean checkCubeIntersection(Cube cube)
	{
	//implementacija treba da koristi checkCoordinates metodu
	}
	//proverava da li se kocke dodiruju
	public boolean checkIfCubesAreTouching(Cube cube)
	{
	//implementacija
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
	}
	//proverava da li se kocke dodiruju sa spoljasnje strane
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
	{
	//implementacija treba da koristi checkIfCubesAreTouching
	}
	//uvecava X
	public void increaseX(int x)
	{
	//implementacija
	}
	//uvecava Y
	public void increaseY(int y)
	{
	//implementacija
	}
	//uvecava Z
	public void increaseZ(int z)
	{
	//implementacija
	}
	//smanjuje X
	public void decreaseX(int x)
	{
	//implementacija
	}
	//smanjuje Y
	public void decreaseY(int y)
	{
	//implementacija
	}
	//smanjuje Z
	public void decreaseZ(int z)
	{
	//implementacija
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
