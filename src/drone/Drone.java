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
	
	public String toString() {
		return String.format("Pozicija ("+x+","+y+","+z+")");
	}
	
	public String moveUp() {
		if (x < 40 && x > 10 && z < 40 && z > 10 && y < 10){
			y += 1;
			return getFormatedCoordinates();		
		} else if (x < 40 && x > 10 && z < 40 && z > 10 && y >= 40 && y < 50){
			y += 1;
			return getFormatedCoordinates();	
		} else if ((x >= 40 || x <= 10) || (z >= 40 || z <= 10) && y < 50){
			y += 1;
			return getFormatedCoordinates();
		} else 
			return getFormatedCoordinates();
	}
	public String moveDown() {
		if(y > 40 && x < 40 && x > 10 && z < 40 && z > 10) {
			y -= 1;
			return getFormatedCoordinates();		
		} else if (y > 0 && (x >= 40 || x <= 10) || (z >= 10 || x <= 40)) {
			y -= 1;
			return getFormatedCoordinates();			
		} else if (y > 0 && x < 40 && x > 10 && z < 40 && z > 10) {
			y -= 1;
			return getFormatedCoordinates();	
		} else {
			return getFormatedCoordinates();
		}
	}
	public String moveLeft() {
		if (x > 40 && y > 10 && y < 40 && z > 10 && z < 40) {
			x -= 1;
			return getFormatedCoordinates();
		} else if (x > 0 && (y >= 40 || y <= 10) || (z >= 40 || z <= 10)) {
			x -= 1;
			return getFormatedCoordinates();		
		} else if (x > 0 && y > 10 && y < 40 && z > 10 && z < 40) {
			x -= 1;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
	public String moveRight() {
		if(x < 10 && y > 10 && y < 40 && z > 10 && z < 40 ) {
			x += 1;
			return getFormatedCoordinates();				
		} else if (x < 50 && (y >= 40 || y <= 10) || (z >= 40 || z <= 10)) {
			x += 1;
			return getFormatedCoordinates();		
		} else if (x < 50 && x >= 40 && y > 10 && y < 40 && z > 10 && z < 40) {
			x += 1;
			return getFormatedCoordinates();		
		} else {
			return getFormatedCoordinates();
		}
		
		/*if (x < 10 && z < 40 && z > 10 && y > 10 && y < 40){
			x += 1;
			return getFormatedCoordinates();
		}*/
	}
	public String moveBack() {
		if (z < 10 && x > 10 && x < 40 && y > 10 && y < 40) {
			z += 1;
			return getFormatedCoordinates();
		} else if (z < 50 && (x >= 10 || x <= 40) || (y >= 10 || y <= 40)) {
			z += 1;
			return getFormatedCoordinates();
		} else if (z > 40 && x > 10 && x < 40 && y > 10 && y < 40) {
			z += 1;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
	public String moveForth() {
		if (z > 40 && x > 10 && x < 40 && y > 10 && y < 40) {
			z -= 1;
			return getFormatedCoordinates();
		} else if (z < 50 && (x >= 10 || x <= 40) || (y >= 10 || y <= 40)) {
			z -= 1;
			return getFormatedCoordinates();
		} else if (z < 10 && x > 10 && x < 40 && y > 10 && y < 40) {
			z -= 1;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
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
