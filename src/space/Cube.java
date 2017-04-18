package space;

public class Cube {
	
	private int[] startPoint = {0,0,0};
	private int[] dimension = {1,1,1};
	
	public Cube(int[] startPoint, int[] size)
	{
	  for (int i = 0; i < 3; i++) 
	  {
		this.startPoint[i]=startPoint[i];
		this.dimension[i]=size[i];
	  }
	}
	public boolean pointWithinCube(int[] point)
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
	
	
}
