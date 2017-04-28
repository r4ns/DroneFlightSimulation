package space;

public class Cube {
	private int [] minCoordinates; //donja tacka dijagonale kocke
	private int cubeSideLength; //duzina stranice kocke
	private int [] maxCoordinates; //gornja tacka dijagonale kocke
	
	public Cube(int [] cubeStartCoordinates, int side)
	{
		minCoordinates = cubeStartCoordinates;
		maxCoordinates = new int[] {minCoordinates[0] + side, minCoordinates[1] + side, minCoordinates[2] + side};
		cubeSideLength = side;
	}
	
	public Cube(Cube cube)
	{
		minCoordinates = new int[] {cube.minCoordinates[0], cube.minCoordinates[1], cube.minCoordinates[2]};
		maxCoordinates = new int[] {cube.maxCoordinates[0], cube.maxCoordinates[1], cube.maxCoordinates[2]};
		cubeSideLength = cube.cubeSideLength;
	}
	
	public Cube()
	{	
	}
	
	public boolean checkCoordinates(int [] coordinates)
	{
		 return  (coordinates[0] >= minCoordinates[0] && coordinates[0] <= maxCoordinates[0]) &&
		         (coordinates[1] >= minCoordinates[1] && coordinates[1] <= maxCoordinates[1]) &&
		         (coordinates[2] >= minCoordinates[2] && coordinates[2] <= maxCoordinates[2]);	
	}
	
	public boolean checkCubeIntersection(Cube cube)
	{
		if(checkCoordinates (new int[] {cube.minCoordinates[0], cube.minCoordinates[1], cube.minCoordinates[2]}))
		{
			return true;
		}
		
		if(checkCoordinates (new int[] {cube.minCoordinates[0], cube.minCoordinates[1], cube.maxCoordinates[2]}))
		{
			return true;
		}
		
		if(checkCoordinates (new int[] {cube.minCoordinates[0], cube.maxCoordinates[1], cube.maxCoordinates[2]}))
		{
			return true;
		}
		
		if(checkCoordinates (new int[] {cube.minCoordinates[0], cube.maxCoordinates[1], cube.minCoordinates[2]}))
		{
			return true;
		}
		
		if(checkCoordinates (new int[] {cube.maxCoordinates[0], cube.minCoordinates[1], cube.minCoordinates[2]}))
		{
			return true;
		}
		
		if(checkCoordinates (new int[] {cube.maxCoordinates[0], cube.maxCoordinates[1], cube.minCoordinates[2]}))
		{
			return true;
		}
		
		if(checkCoordinates (new int[] {cube.maxCoordinates[0], cube.minCoordinates[1], cube.maxCoordinates[2]}))
		{
			return true;
		}
		
		if(checkCoordinates (new int[] {cube.maxCoordinates[0], cube.maxCoordinates[1], cube.maxCoordinates[2]}))
		{
			return true;
		}
		
		return false;
	}
	
	public boolean checkIfCubesAreTouching(Cube cube)
	{
		int size = cube.cubeSideLength;
		boolean x_Ok = false;
		boolean y_Ok = false;
		boolean z_Ok = false;
		
		if((minCoordinates[0] - size <= cube.minCoordinates[0]) && (maxCoordinates[0] + size >= cube.maxCoordinates[0]))
		{
			x_Ok = true;
		}
		
		if((minCoordinates[1] - size <= cube.minCoordinates[1]) && (maxCoordinates[1] + size >= cube.maxCoordinates[1]))
		{
			y_Ok = true;
		}
		
		if((minCoordinates[2] - size <= cube.minCoordinates[2]) && (maxCoordinates[2] + size >= cube.maxCoordinates[2]))
		{
			z_Ok = true;
		}
		
		if(x_Ok && y_Ok && z_Ok) 
		{
			
			boolean x_Ok2 = false;
			boolean y_Ok2 = false;
			boolean z_Ok2 = false;
			
			if((minCoordinates[0] + size <= cube.minCoordinates[0]) && (maxCoordinates[0] - size >= cube.maxCoordinates[0]))
			{
				x_Ok2 = true;
			}
			
			if((minCoordinates[1] + size <= cube.minCoordinates[1]) && (maxCoordinates[1] - size >= cube.maxCoordinates[1]))
			{
				y_Ok2 = true;
			}
			
			if((minCoordinates[2] + size <= cube.minCoordinates[2]) && (maxCoordinates[2] - size >= cube.maxCoordinates[2]))
			{
				z_Ok2 = true;
			}
			
			return !(x_Ok2 && y_Ok2 && z_Ok2);
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
		if(!checkIfCubesAreTouching(cube))
		{
			return false;
		}
		
		boolean x_Ok = false;
		boolean y_Ok = false;
		boolean z_Ok = false;
		
		if(minCoordinates[0] <= cube.minCoordinates[0] && maxCoordinates[0] >= cube.maxCoordinates[0]){
			x_Ok = true;
		}
		
		if(minCoordinates[1] <= cube.minCoordinates[1] && maxCoordinates[1] >= cube.maxCoordinates[1]){
			y_Ok = true;
		}
		
		if(minCoordinates[2] <= cube.minCoordinates[2] && maxCoordinates[2] >= cube.maxCoordinates[2]){
			z_Ok = true;
		}
		
		return x_Ok && y_Ok && z_Ok;
	}
	
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
	{	
		if(!checkIfCubesAreTouching (cube))
		{
			return false;
		}

		boolean x_Ok = false;
		boolean y_Ok = false;
		boolean z_Ok = false;
		
		if(minCoordinates[0] >= cube.maxCoordinates[0] || maxCoordinates[0] <= cube.minCoordinates[0]) {
			x_Ok = true;
		}
		
		if(minCoordinates[1] >= cube.maxCoordinates[1] || maxCoordinates[1] <= cube.minCoordinates[1]){
			y_Ok = true;
		}
		
		if(minCoordinates[2] >= cube.maxCoordinates[2] || maxCoordinates[2] <= cube.minCoordinates[2]){
			z_Ok = true;
		}
		
		return x_Ok || y_Ok || z_Ok;
	}
	
	public void increaseX(int x)
	{
		minCoordinates[0]+=x;
		maxCoordinates[0]+=x;
	}
	
	public void increaseY(int y)
	{
		minCoordinates[1]+=y;
		maxCoordinates[1]+=y;	
	}
	
	public void increaseZ(int z)
	{
		minCoordinates[2]+=z;
		maxCoordinates[2]+=z;
	}
	
	public void decreaseX(int x)
	{
		minCoordinates[0]-=x;
		maxCoordinates[0]-=x;
	}
	
	public void decreaseY(int y)
	{
		minCoordinates[1]-=y;
		maxCoordinates[1]-=y;
	}
	
	public void decreaseZ(int z)
	{
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