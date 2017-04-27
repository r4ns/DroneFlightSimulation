package space;

public class Cube {
	
	private int[] minCoordinates;
	private int cubeSideLength;
	private int[] maxCoordinates;
	
	//kreira kocku na osnovu prosljedjenih parametara
	public Cube(int[] cubeStartCoordinates, int side){
		
	}
	
	//kopira proslednjenu kocku
	public Cube(Cube cube){
		setMinCoordinates(cube.getMinCoordinates());
		setMaxCoordinates(cube.getMaxCoordinates());
		setCubeSideLength(cube.getCubeSideLength());
	}
	
	//default konstruktor
	public Cube(){
		
	}
	
	//proverava da li se prosledjene koordinate nalaze u kocki
	public boolean checkCoordinates(int[] coordinates){
		if (coordinates[0] >= minCoordinates[0] && coordinates[0] <= maxCoordinates[0] && coordinates[1] >= minCoordinates[1] && coordinates[1] <= maxCoordinates[1] && coordinates[2] >= minCoordinates[2] && coordinates[2] <= maxCoordinates[2])
			return true;
		else 
			return false;
	}
	
	//proverava da li se kocke seku
	public boolean checkIfCubesIntersection(Cube cube){
		
	}
	
	//proverava da li se kocke dodiruju
	public boolean checkIfCubesAreTouching(Cube cube){
		
	}
	
	public String toString(){
		return "Drone position: (" + Integer.toString(minCoordinates[0]) + ", "
				+ Integer.toString(minCoordinates[1]) + ", "
				+ Integer.toString(minCoordinates[2]) + "), ("
				+ Integer.toString(maxCoordinates[0]) + ", "
				+ Integer.toString(maxCoordinates[1]) + ", "
				+ Integer.toString(maxCoordinates[2]) + ")";
	}
	
	//proverava da li se kocke dodiruju iznutra
	public boolean checkIfCubesAreTouchingFromInside(Cube cube){
		
	}
	
	//proverava da li se kocke dodiruju sa spoljasnje strane
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube){
		
	}
	
	//uvecava x
	public void increaseX(int x){
		
	}
	
	//uvecava y
	public void increaseY(int y){
		
	}
	
	//uvecava z
	public void increaseZ(int z){
			
	}
	
	//smanjuje x
	public void decreaseX(int x){
			
	}
		
	//smanjuje y
	public void decreaseY(int y){
			
	}
		
	//smanjuje z
	public void decreaseZ(int z){
				
	}
	
	public int[] getMinCoordinates(){
		return minCoordinates;
	}
	
	public void setMinCoordinates(int[] minCoordinates){
		this.minCoordinates = minCoordinates;
	}
	
	public int getCubeSideLength(){
		return cubeSideLength;
	}
	
	public void setCubeSideLength(int cubeSideLength){
		this.cubeSideLength = cubeSideLength;
	}
	
	public int[] getMaxCoordinates(){
		return getMaxCoordinates();
	}
	
	public void setMaxCoordinates(int[] maxCoordinates){
		this.maxCoordinates = maxCoordinates;
	}
}
