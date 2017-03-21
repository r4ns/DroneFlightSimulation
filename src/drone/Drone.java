package drone;

public class Drone implements StandardDrone {

	private int x;
	private int y;
	private int z;

	public Drone(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
		
	
	public String moveUp() {
		y++;	
		return "(" + x + ", " + y + ", " + z + ")";		
	}

	public String moveDown() {
		y--;		
		return "(" + x + ", " + y + ", " + z + ")";
	}
	

	
	public String moveLeft() {
		x--;		
		return "(" + x + ", " + y + ", " + z + ")";
	}

	public String moveRight() {
		x++;		
		return "(" + x + ", " + y + ", " + z + ")";
	}

	
	
	public String moveBack() {
		z++;		
		return "(" + x + ", " + y + ", " + z + ")";
	}

	public String moveForth() {
		z--;		
		return "(" + x + ", " + y + ", " + z + ")";
	}

	
	
	public String getFormatedCoordinates() {
		return "(" + x + ", " + y + ", " + z + ")";
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

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	

}
