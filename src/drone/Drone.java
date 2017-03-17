package drone;

public class Drone implements StandardDrone {

	private int x;
	private int y;
	private int z;
	
	
	public Drone(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public String toString()
	{
		return "Trenutna pozicija: ("+x+","+y+","+z+")";
	}
	
	public String moveUp() {
		// TODO Auto-generated method stub
		y+=1;
		return null;
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		y=y-1;
		return null;
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		x=x-1;
		return null;
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		x+=1;
		return null;
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		z=z+1;
		return null;
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		z=z-1;
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
