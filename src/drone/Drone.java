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
		if(y < 10 || y > 40){
			if(y == 50)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			y += 1;
			return getFormatedCoordinates();
		} else if((y >= 10 || y <= 40) && ((x <= 10 || x >= 40) || (z <= 10 || z >= 40))){
			y += 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveDown() {
		if(y < 10 || y > 40){
			if(y == 0)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			y -= 1;
			return getFormatedCoordinates();
		} else if((y >= 10 || y <= 40) && ((x <= 10 || x >= 40) || (z <= 10 || z >= 40))){
			y -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveRight() {
		if(x < 10 || x > 40){
			if(x == 50)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			x += 1;
			return getFormatedCoordinates();
		} else if((x >= 10 || x <= 40) && ((y <= 10 || y >= 40) || (z <= 10 || z >= 40))){
			x += 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveLeft() {
		if(x < 10 || x > 40){
			if(x == 0)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			x -= 1;
			return getFormatedCoordinates();
		} else if((x >= 10 || x <= 40) && ((y <= 10 || y >= 40) || (z <= 10 || z >= 40))){
			x -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveBack() {
		if(z < 10 || z > 40){
			if(z == 0)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			z -= 1;
			return getFormatedCoordinates();
		} else if((z >= 10 || z <= 40) && ((x <= 10 || x >= 40) || (y <= 10 || y >= 40))){
			z -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveForth() {
		if(z < 10 || z > 40){
			if(z == 50)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			z -= 1;
			return getFormatedCoordinates();
		} else if((z >= 10 || z <= 40) && ((x <= 10 || x >= 40) || (y <= 10 || y >= 40))){
			z -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
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
