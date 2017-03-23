package drone;

public class Drone implements StandardDrone {
	
	private int x = 30;
	private int y = 0;
	private int z = 30;
	
	private int [] outerBoundaries;
	private int distanceFromOuterBox=10;
	private int [] coordinates;
	private int step=1;
	
	
	public Drone(){
		
	}
	public Drone(int x, int y, int z){
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Drone(int [] boundaries, int [] coordinates)
	{
		this.outerBoundaries= boundaries;
		distanceFromOuterBox=10;
		this.coordinates = coordinates;
	}
	
	

	@Override
	public String moveUp() {
		if (y<11)
		{
			y++;
		}
		else
		{
			System.out.println("Greska");
		}
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		y--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		x--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		x++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		z--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		z++;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		
		System.out.println(("(" + this.x + "," + this.y + "," + this.z + ")"));
		
		return ("(" + this.x + "," + this.y + "," + this.z + ")") ;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}

}
