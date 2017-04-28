package utility;

public class Cube {
	private int[] minCoordinates;
	private int cubeSideLength;
	private int[] maxCoordinates;
	
	public Cube(int[] cubeStartCoordinates,int side)
	{
		minCoordinates = new int[cubeStartCoordinates.length];
		maxCoordinates = new int[cubeStartCoordinates.length];
		
		cubeSideLength=side;
		for(int i=0;i<cubeStartCoordinates.length;i++)
		{	
			minCoordinates[i]=cubeStartCoordinates[i];
			maxCoordinates[i]=minCoordinates[i]+cubeSideLength;
		}
	}
	public Cube(Cube cube){
		
		minCoordinates = new int[cube.minCoordinates.length];
		maxCoordinates = new int[cube.maxCoordinates.length];
		for(int i = 0; i<minCoordinates.length;i++)
		{
			minCoordinates[i]=cube.maxCoordinates[i];
		}
		this.minCoordinates[2]--;
		this.cubeSideLength=cube.cubeSideLength;
		for(int i =0; i<this.minCoordinates.length;i++){
			this.maxCoordinates[i] = this.minCoordinates[i]+this.cubeSideLength;
		}
	}
	public Cube(){
		
	}
	public boolean checkCoordinates(int[] coordinates){
		for(int i = 0; i < coordinates.length; i++){
			if(coordinates[i]<this.minCoordinates[i]){
				return false;
			}
			else if (coordinates[i] - minCoordinates[i] > cubeSideLength){
				return false;
			}
		}
		return true;
	}
	public boolean checkCubeIntersection(Cube cube){
		for(int x=0; x<this.cubeSideLength; x++){
			for(int y = 0; y< this.cubeSideLength; y++){
				for(int z = 0; z< this.cubeSideLength; z++){
					int[] coordinates = new int[]{minCoordinates[0] + x, minCoordinates[1] + y, minCoordinates[2]+z};
					boolean areIntersected = cube.checkCoordinates(coordinates);
					if(areIntersected)
						return true;
					
				}
			}
		}
		return false;
	}
	public boolean checkIfCubesAreTouching(Cube cube){
		if (cube.getMaxCoordinates()[0] < minCoordinates[0] || cube.getMaxCoordinates()[1] < minCoordinates[1] || cube.getMaxCoordinates()[2] < minCoordinates[2])
			return false;
		
		if (this.maxCoordinates[0] < cube.getMinCoordinates()[0] ||  this.maxCoordinates[1] < cube.getMinCoordinates()[1] || this.maxCoordinates[2] < cube.getMinCoordinates()[2])
			return false;
		
		return true;
	}
	
	@Override
	public String toString(){
		return "Drone position: ("
				+ Integer.toString(minCoordinates[0])+","
				+ Integer.toString(minCoordinates[1])+","
				+ Integer.toString(minCoordinates[2])+"), ("
				+ Integer.toString(maxCoordinates[0])+","
				+ Integer.toString(maxCoordinates[1])+","
				+ Integer.toString(maxCoordinates[2])+")";
	}
	public boolean checkIfCubesAreTouchingFromInside(Cube cube){
		if (!checkIfCubesAreTouching(cube))
			return false;
		else {
			for (int i = 0; i < 3; i++){
				if (minCoordinates[i] == cube.getMinCoordinates()[i]|| maxCoordinates[i] == cube.getMaxCoordinates()[i])
					return true;
			}
			return false;
		}
		
	}
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube){
		if (!checkIfCubesAreTouching(cube))
			return false;
		else {
			for (int i = 0; i < 3; i++){
				if (minCoordinates[i] == cube.getMaxCoordinates()[i] || maxCoordinates[i] == cube.getMinCoordinates()[i])
					return true;
			}
			return false;
		}
	}
	public void increaseX(int x){
		minCoordinates[0]+=x;
		maxCoordinates[0]+=x;
	}
	public void increaseY(int y){
		minCoordinates[1]+=y;
		maxCoordinates[1]+=y;
	}
	public void increaseZ(int z){
		minCoordinates[2]+=z;
		maxCoordinates[2]+=z;
	}
	public void decreaseX(int x){
		minCoordinates[0]-=x;
		maxCoordinates[0]-=x;
	}
	public void decreaseY(int y){
		minCoordinates[1]-=y;
		maxCoordinates[1]-=y;
	}
	public void decreaseZ(int z){
		minCoordinates[2]-=z;
		maxCoordinates[2]-=z;
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