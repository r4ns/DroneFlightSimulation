package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	private int[] boundaries = {50, 50, 50};
	
	public Drone() {
		this.x = 30;
		this.y = 0;
		this.z = 30;
	}
	
	public Drone (int x, int y, int z, int[] boundaries) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.boundaries = boundaries;
	}
	
	public String moveUp() {
		if(y < 10 || y > (boundaries[1] - 10)){
			if(y == boundaries[1])
				return getFormatedCoordinates() + " // Drone hit outside square border";
			y += 1;
			return getFormatedCoordinates();
		} else if((y >= 10 || y <= (boundaries[1] - 10)) && ((x <= 10 || x >= (boundaries[1] - 10)) || (z <= 10 || z >= (boundaries[1] - 10)))){
			y += 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveDown() {
		if(y < 10 || y > (boundaries[1] - 10)){
			if(y == 0)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			y -= 1;
			return getFormatedCoordinates();
		} else if((y >= 10 || y <= (boundaries[1] - 10)) && ((x <= 10 || x >= (boundaries[1] - 10)) || (z <= 10 || z >= (boundaries[1] - 10)))){
			y -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveRight() {
		if(x < 10 || x > (boundaries[0] - 10)){
			if(x == boundaries[0])
				return getFormatedCoordinates() + " // Drone hit outside square border";
			x += 1;
			return getFormatedCoordinates();
		} else if((x >= 10 || x <= (boundaries[0] - 10)) && ((y <= 10 || y >= (boundaries[0] - 10)) || (z <= 10 || z >= (boundaries[0] - 10)))){
			x += 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveLeft() {
		if(x < 10 || x > (boundaries[0] - 10)){
			if(x == 0)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			x -= 1;
			return getFormatedCoordinates();
		} else if((x >= 10 || x <= (boundaries[0] - 10)) && ((y <= 10 || y >= (boundaries[0] - 10)) || (z <= 10 || z >= (boundaries[0] - 10)))){
			x -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveBack() {
		if(z < 10 || z > (boundaries[2] - 10)){
			if(z == boundaries[2])
				return getFormatedCoordinates() + " // Drone hit outside square border";
			z += 1;
			return getFormatedCoordinates();
		} else if((z >= 10 || z <= (boundaries[2] - 10)) && ((x <= 10 || x >= (boundaries[2] - 10)) || (y <= 10 || y >= (boundaries[2] - 10)))){
			z += 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String moveForth() {
		if(z < 10 || z > (boundaries[2] - 10)){
			if(z == 0)
				return getFormatedCoordinates() + " // Drone hit outside square border";
			z -= 1;
			return getFormatedCoordinates();
		} else if((z >= 10 || z <= (boundaries[2] - 10)) && ((x <= 10 || x >= (boundaries[2] - 10)) || (y <= 10 || y >= (boundaries[2] - 10)))){
			z -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " // Drone hit inside square border";
	}
	
	public String getFormatedCoordinates() {
		return "("+x+","+y+","+z+")";
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