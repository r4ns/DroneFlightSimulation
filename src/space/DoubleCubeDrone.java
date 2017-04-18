package space;
import drone.*;

public class DoubleCubeDrone implements StandardDrone{
	private Cube cubeOne;
	private Cube cubeTwo;
	private int[] dimension = {1,1,1};
	private int[] coordinates = {0,0,0};
	private FlySpace fs;
	
	public DoubleCubeDrone(int[] start, FlySpace space)
	{
		
		if(start!=null&&space!=null)
		{
		this.cubeOne= new Cube(start, dimension);
		this.cubeTwo=new Cube(new int[] {start[0]+dimension[0],start[1]+dimension[1],start[0]}, dimension);
		this.coordinates = start;
		this.fs = space;
		}
		
		else
		{
			this.cubeOne = new Cube();
			this.cubeTwo = new Cube();
			this.fs=new FlySpace();
		}
	}

	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		if(fs.cubeWithinFlySpace(cubeOne)&&fs.cubeWithinFlySpace(cubeTwo)) 
			{
			this.cubeOne.getStartPoint()[1]+=1;
			this.cubeTwo.getStartPoint()[1]+=1;
			}
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if(fs.cubeWithinFlySpace(cubeOne)&&fs.cubeWithinFlySpace(cubeTwo)) 
		{
		this.cubeOne.getStartPoint()[1]-=1;
		this.cubeTwo.getStartPoint()[1]-=1;
		}
	return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(fs.cubeWithinFlySpace(cubeOne)&&fs.cubeWithinFlySpace(cubeTwo)) 
		{
		this.cubeOne.getStartPoint()[0]-=1;
		this.cubeTwo.getStartPoint()[0]-=1;
		}
	return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if(fs.cubeWithinFlySpace(cubeOne)&&fs.cubeWithinFlySpace(cubeTwo)) 
		{
			this.cubeOne.getStartPoint()[0]+=1;
			this.cubeTwo.getStartPoint()[0]+=1;
		}
	return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if(fs.cubeWithinFlySpace(cubeOne)&&fs.cubeWithinFlySpace(cubeTwo)) 
		{
		this.cubeOne.getStartPoint()[2]+=1;
		this.cubeTwo.getStartPoint()[2]+=1;
		}
	return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(fs.cubeWithinFlySpace(cubeOne)&&fs.cubeWithinFlySpace(cubeTwo)) 
		{
		this.cubeOne.getStartPoint()[2]-=1;
		this.cubeTwo.getStartPoint()[2]-=1;
		}
		
	return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() 
	{
		this.coordinates = this.cubeOne.getStartPoint();
		
		System.out.println("Position: (" + Integer.toString(coordinates[0]) +
				", " + Integer.toString(coordinates[1])  + 
				", " + Integer.toString(coordinates[2]) + ")");
		
		return "Position: ( " + Integer.toString(coordinates[0]) +
				", " + Integer.toString(coordinates[1])  + 
				", " + Integer.toString(coordinates[2]) + " )";
	}

}
