package drone;

public class Drone implements StandardDrone {
	
	private int x,y,z;
	
	public Drone()
	{
		x=30;
		y=0;
		z=30;
		
	}

	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		this.y++;
		return this.getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		this.y--;
		return this.getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		this.x--;
		return this.getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		this.x++;
		return this.getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		z--;
		return this.getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		z++;
		return this.getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		System.out.println("( "+this.x+", "+this.y+", "+this.z+") ");
		return "( "+this.x+", "+this.y+", "+this.z+") " ;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

}
