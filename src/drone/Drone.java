package drone;

public class Drone implements StandardDrone{
	
	private int x = 30;
	private int y = 0;
	private int z = 30;
	
	public Drone(){
		
	}
	public Drone(int x, int y, int z){
		
		this.x = x;
		this.y = y;
		this.z = z;
	}
	@Override
	public String moveUp() {
		y++;
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
