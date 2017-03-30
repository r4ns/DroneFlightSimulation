package drone;



public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
	public Drone() {
		this.x = 30;
		this.z = 30;
		this.y = 0;
	}
	
	public String moveUp() {
		if(y < 10 || y > 40){
			if(y == 50)
				return getFormatedCoordinates() + " Dron je na spoljnoj strani kvadrata!";
			y += 1;
			return getFormatedCoordinates();
		} else if(((x <= 10 || x >= 40) || (z <= 10 || z >= 40)) && (y >= 10 || y <= 40)){
			y += 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String moveDown() {
		if(y < 10 || y > 40){
			if(y == 0)
				return getFormatedCoordinates() + " Dron je na spoljnoj strani kvadrata!";
			y -= 1;
			return getFormatedCoordinates();
		} else if(((x <= 10 || x >= 40) || (z <= 10 || z >= 40)) && (y >= 10 || y <= 40)){
			y -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String moveLeft() {
		if(x < 10 || x > 40){
			if(x == 0)
				return getFormatedCoordinates() + " Dron je na spoljnoj strani kvadrata!";
			x -= 1;
			return getFormatedCoordinates();
		} else if((x >= 10 || x <= 40) && ((y <= 10 || y >= 40) || (z <= 10 || z >= 40))){
			x -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String moveRight() {
		if(x < 10 || x > 40){
			if(x == 50)
				return getFormatedCoordinates() + " Dron je na spoljnoj strani kvadrata!";
			x += 1;
			return getFormatedCoordinates();
		} else if((x >= 10 || x <= 40) && ((y <= 10 || y >= 40) || (z <= 10 || z >= 40))){
			x += 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	

	public String moveBack() {
		if(z < 10 || z > 40){
			if(z == 0)
				return getFormatedCoordinates() + " Dron je na spoljnoj strani kvadrata!";
			z -= 1;
			return getFormatedCoordinates();
		} else if((z >= 10 || z <= 40) && ((x <= 10 || x >= 40) || (y <= 10 || y >= 40))){
			z -= 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String moveForth() {
		if(z < 10 || z > 40){
			if(z == 50)
				return getFormatedCoordinates() + " Dron je na spoljnoj strani kvadrata!";
			z += 1;
			return getFormatedCoordinates();
		} else if((z >= 10 || z <= 40) && ((x <= 10 || x >= 40) || (y <= 10 || y >= 40))){
			z += 1;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String getFormatedCoordinates() {
		return "Kordinate drona su: " + 
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
