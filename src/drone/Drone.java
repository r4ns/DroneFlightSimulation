package drone;

public class Drone implements StandardDrone {
	private int x = 30;
	private int y = 0;
	private int z = 30;
	
	
	
	public Drone(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;				
	}
	
	public String moveUp() {
		if(y < 10){
			y += 1;
		}
		return this.toString();
	}
	public String moveDown() {
		if(y < 0){
			y -= 1;
		}
		return this.toString();
	}
	public String moveLeft() {
		if(x > 40){
			x -= 1;
		}
		return this.toString();
	}
	public String moveRight() {
		if(x < 50){
		x += 1;
		}
		return this.toString();
	}
	public String moveBack() {
		if(z < 50){
		z += 1;
		}
		return this.toString();
	}
	public String moveForth() {
		if(z > 0){
		z -= 1;
		}
		return this.toString();
	}
	
	
	public String toString() {
		return String.format("Pozicija ("+x+","+y+","+z+")");
	}
	
	public String getFormatedCoordinates() {
		return this.toString();
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
