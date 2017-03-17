package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
	public Drone() {
		this.x = 30;
		this.y = 0;
		this.z = 30;
	}
	
	public String moveUp() {
		if(y == 10 && (x > 40 || x < 10) && (z > 40 || z < 10)) {
			if(y == 50)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			y += 1;
		}
		else if((x < 10 || x > 40) && (z < 10 || z > 40)){
			if(y == 50)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			y += 1;
		}
		else
			return getFormatedCoordinates() + " // Drone hit inside square border";
		
		return getFormatedCoordinates();
	}
	
	public String moveDown() {
		if(y > 0){
			y -= 1;
		} else if(y == 40 && y == 10) {
			return getFormatedCoordinates() + " // Drone hit inside square border";
		} else
			return getFormatedCoordinates() + " // Drone hit outside square border";
		
		return getFormatedCoordinates();
	}
	
	public String moveRight() {
		if(y < 50){
			y += 1;
		} else if(y == 40 && y == 10) {
			return getFormatedCoordinates() + " // Drone hit inside square border";
		} else
			return getFormatedCoordinates() + " // Drone hit outside square border";
		
		return getFormatedCoordinates();
	}
	
	public String moveLeft() {
		if(y < 50){
			y += 1;
		} else if(y == 40 && y == 10) {
			return getFormatedCoordinates() + " // Drone hit inside square border";
		} else
			return getFormatedCoordinates() + " // Drone hit outside square border";
		
		return getFormatedCoordinates();
	}
	
	public String moveBack() {
		if(y < 50){
			y += 1;
		} else if(y == 40 && y == 10) {
			return getFormatedCoordinates() + " // Drone hit inside square border";
		} else
			return getFormatedCoordinates() + " // Drone hit outside square border";
		
		return getFormatedCoordinates();
	}
	
	public String moveForth() {
		if(y < 50){
			y += 1;
		} else if(y == 40 && y == 10) {
			return getFormatedCoordinates() + " // Drone hit inside square border";
		} else
			return getFormatedCoordinates() + " // Drone hit outside square border";
		
		return getFormatedCoordinates();
	}
	
	public String getFormatedCoordinates() {
		return "Drone position is: " + 
				Integer.toString(x) + " " +
				Integer.toString(y) + " " +
				Integer.toString(z);
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
