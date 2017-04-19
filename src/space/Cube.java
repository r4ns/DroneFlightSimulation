package space;

public class Cube {
	
	private int[] startPoint = {0,0,0}; //minCoordinates
	private int[] dimension = {1,1,1};
	
	private int cubeSideLength = 0;
	private int[] maxCoordinates = {0, 0, 0};
	
	
	public Cube(){}
	
	public Cube(int[] cubeStartCoordinates, int side)
	{
		this.startPoint = cubeStartCoordinates;
		this.cubeSideLength = side;
		for(int i=0;i<3;i++) 
			{
			this.maxCoordinates[i]=this.startPoint[i] + side;
			this.dimension[i] = side;
			}
	}
	
	public Cube(Cube cube)
	{
		this.startPoint = cube.getStartPoint();
		this.cubeSideLength = cube.cubeSideLength;
		this.maxCoordinates=cube.maxCoordinates;
	}
	
	public Cube(int[] startPoint, int[] size)
	{
	  for (int i = 0; i < 3; i++) 
	  {
		this.startPoint[i]=startPoint[i];
		this.dimension[i]=size[i];
	  }
	}
	
	@Override  
	public String toString()  
	{
		return "Drone position: ("  + Integer.toString(startPoint[0]) + ","   
	                                + Integer.toString(startPoint[1]) + ","      
			                        + Integer.toString(startPoint[2]) + "), ("    
	                                + Integer.toString(maxCoordinates[0]) + ","   
			                        + Integer.toString(maxCoordinates[1]) + ","     
	                                + Integer.toString(maxCoordinates[2]) + ")";  
	}   
	
	public boolean pointWithinCube(int[] point) //checkCoordinates()
	{
		if(point[0]>=this.startPoint[0] && point[0]<=(this.startPoint[0]+this.dimension[0]) &&
				point[1]>=this.startPoint[1] && point[1]<=(this.startPoint[1]+this.dimension[1]) &&
				point[2]>=this.startPoint[2] && point[2]<=(this.startPoint[2]+this.dimension[2])) return true;
		else return false;
	}

	public void setDimension(int[] d)
	{
		for (int i = 0; i < 3; i++) this.dimension[i] = d[i];
			
		
	}
	
	public String getDimensionString()
	{
		return "Cube dimensions: ( "+this.dimension[0]+", "+this.dimension[1]+", "+this.dimension[2]+" )";
	}
	public int[] getDimension()
	{
		return this.dimension;
	}
	
	public String getStartPointString() {
		return "Start point: ( "+this.startPoint[0]+", "+this.startPoint[1]+", "+this.startPoint[2]+" )";
	}
	
	public int[] getStartPoint()
	{
		return this.startPoint;
	}
	public void setStartPoint(int[] startPoint) {
		this.startPoint = startPoint;
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
	
	public void increaseX(int x) 
    {     
		this.startPoint[0]++;
		this.maxCoordinates[0]++;
    }   
	public void increaseY(int y)  
	{  
		this.startPoint[1]++;
		this.maxCoordinates[1]++;
	}   
    public void increaseZ(int z)  
    {   
    	this.startPoint[2]++;
		this.maxCoordinates[2]++;
    }    
	public void decreaseX(int x)  
	{ 
		this.startPoint[0]--;
		this.maxCoordinates[0]--;
	}    
	public void decreaseY(int y)  
	{
		this.startPoint[1]--;
		this.maxCoordinates[1]--;
	}    
	public void decreaseZ(int z)  
	{ 
		this.startPoint[2]--;
		this.maxCoordinates[2]--;
	}
	
}
