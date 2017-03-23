package drone;

public class Drone implements StandardDrone{
	private int x;
	private int y;
	private int z;
	
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public String moveUp() {
			y=y+1;
		return "Drone position: ("+x+","+y+","+z+")";
	}

	public String moveDown() {
		y=y-1;
		return "Drone position: ("+x+","+y+","+z+")";
	}

	public String moveLeft() {
		x=x-1;
		return "Drone position: ("+x+","+y+","+z+")";
	}

	public String moveRight() {
			x=x+1;
		return "Drone position: ("+x+","+y+","+z+")";
	}

	public String moveBack() {
			z=z-1;
		return "Drone position: ("+x+","+y+","+z+")";
	}
	
	public String moveForth() {
			z=z+1;
		return "Drone position: ("+x+","+y+","+z+")";
	}
	
	public String getFormatedCoordinates() {
		
		return "Start position : ("+x+","+y+","+z+")";
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
