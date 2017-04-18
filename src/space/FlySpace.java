package space;

public class FlySpace {

	private Cube innerCube;
	private Cube outerCube;
	
	public FlySpace(int[] innerCubeStartPoint, int[] innerCubeDim, int[] outerCubeStartPoint, int[] outerCubeDim)
	{
		this.innerCube = new Cube(innerCubeStartPoint,innerCubeDim);
		this.outerCube = new Cube(outerCubeStartPoint,outerCubeDim);
	}
	
	public FlySpace(int[] outerBoundaries, int[] innerBoundaries)
	{
		int[] point0 = {0,0,0};
		int[] point1 ={0,0,0};
		if(outerBoundaries!=null&&innerBoundaries!=null)
		{
		for (int i = 0; i < 3; i++) point1[i]=(outerBoundaries[i]-innerBoundaries[i])/2;
		this.innerCube = new Cube(point1, innerBoundaries);
		this.outerCube = new Cube(point0, outerBoundaries);
		}
		else 
		{
			this.innerCube = new Cube();
			this.outerCube = new Cube();
		}
		
	
	}
	
	public FlySpace()
	{
		this(new int[] {0,0,0},new int[] {0,0,0});
	}
	
	public boolean pointWithinFlySpace(int[] point)
	{
		if(this.getOuterCube().pointWithinCube(point) && !(this.getInnerCube().pointWithinCube(point)))
			return true;
		else return false;
	}
	
	public boolean cubeWithinFlySpace(Cube c)
	{
		int[] a = c.getStartPoint();
		int[][] pts = {a,
				{a[0]+c.getDimension()[0],a[1], a[2]},
				{a[0],a[1]+c.getDimension()[1], a[2]},
				{a[0],a[1], a[2]+c.getDimension()[2]},
				{a[0]+c.getDimension()[0],a[1]+c.getDimension()[1], a[2]},
				{a[0]+c.getDimension()[0],a[1], a[2]+c.getDimension()[2]},
				{a[0]+c.getDimension()[0],a[1]+c.getDimension()[1], a[2]+c.getDimension()[2]},
				{a[0],a[1]+c.getDimension()[1], a[2]+c.getDimension()[2]}
						};
		int y = 0;
		
		for (int i = 0; i < pts.length; i++)
					if(this.pointWithinFlySpace(pts[i])) y++;
		
		if(y==8) return true;
		else return false;
		
	}
	
	public String getInnerDim()
	{
		return this.innerCube.getDimensionString();
	}
	
	public String getOuterDim()
	{
		return this.outerCube.getDimensionString();
	}
	
	public void setInnerDim(int[] d)
	{
		this.innerCube.setDimension(d);
	}
	
	public void setOuterDim(int[] d)
	{
		this.outerCube.setDimension(d);
	}

	public Cube getInnerCube() {
		return innerCube;
	}

	public Cube getOuterCube() {
		return outerCube;
	}
	
	
	
}
