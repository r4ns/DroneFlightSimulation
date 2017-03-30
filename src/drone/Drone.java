package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
	public Drone(){
		this.x = 30;
		this.y = 0;
		this.z = 30;
	}

	public String moveUp() {
		if (((x >= 0 && x <= 10) || (x >= 40 && x <= 50)) && (z >= 0 && z <= 50) && (y >= 0 && y < 50)) {
			y++;
			return getFormatedCoordinates();
		} else if (((y >= 0 && y < 10) || (y >= 40 && y < 50)) && ((z >= 0 && z <= 50) && (x >= 0 && x <= 50))) {
			y++;
			return getFormatedCoordinates();
		} else if ((x >= 0 && x <= 50) && ((z >= 0 && z <= 10) || (z >= 40 && z <= 50)) && (y >= 0 && y < 50)) {
			y++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates() + "//dron hits edge !!!";
		}
	}

	public String moveDown() {
		if (((x >= 0 && x <= 10) || (x >= 40 && x <= 50)) && (z >= 0 && z <= 50) && (y > 0 && y <= 50)) {
			y--;
			return getFormatedCoordinates();
		} else if (((y > 0 && y <= 10) || (y > 40 && y <= 50)) && ((z >= 0 && z <= 50) && (x >= 0 && x <= 50))) {
			y--;
			return getFormatedCoordinates();
		} else if ((x >= 0 && x <= 50) && ((z >= 0 && z <= 10) || (z >= 40 && z <= 50)) && (y > 0 && y <= 50)) {
			y--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates() + "//dron hits edge !!!";
		}
	}

	public String moveLeft() {
		if (((y >= 0 && y <= 10) || (y >= 40 && y <= 50)) && (x > 0 && x <= 50) && ((z >= 0 && z <= 50))) {
			x--;
			return getFormatedCoordinates();
		} else if ((y >= 10 && y <= 40) && ((x > 0 && x <= 10) || (x > 40 && x <= 50)) && z >= 0 && z <= 50) {
			x--;
			return getFormatedCoordinates();
		} else if (((z >= 0 && z <= 10) || (z >= 40 && z <= 50)) && (y >= 10 && y <= 40) && (x > 10 && x <= 40)) {
			x--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates() + "//dron hits edge !!!";
		}
	}

	public String moveRight() {
		if (((y >= 0 && y <= 10) || (y >= 40 && y <= 50)) && (x >= 0 && x < 50) && ((z >= 0 && z <= 50))) {
			x++;
			return getFormatedCoordinates();
		} else if ((y >= 10 && y <= 40) && ((x >= 0 && x < 10) || (x >= 40 && x < 50)) && (z >= 0 && z <= 50)) {
			x++;
			return getFormatedCoordinates();
		} else if (((z >= 0 && z <= 10) || (z >= 40 && z <= 50)) && (y >= 10 && y <= 40) && (x >= 10 && x < 40)) {
			x++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates() + "//dron hits edge !!!";
		}
	}

	public String moveForth() {
		if (((z >= 0 && z < 10) || (z > 40 && y <= 50)) && (x >= 0 && x <= 50) && ((y >= 0 && y <= 50))) {
			z++;
			return getFormatedCoordinates();
		} else if ((z >= 10 && z < 40) && ((x >= 0 && x <= 10) || (x >= 40 && x <= 50)) && (y >= 0 && y <= 50)) {
			z++;
			return getFormatedCoordinates();
		} else if (((y >= 0 && y <= 10) || (y >= 40 && y <= 50)) && (z > 10 && z <= 40) && (x >= 10 && x <= 40)) {
			z++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates() + "//dron hits edge !!!";
		}
	}

	public String moveBack() {
		if (((z > 0 && z <= 10) || (z >= 40 && y < 50)) && (x >= 0 && x <= 50) && ((y >= 0 && y <= 50))) {
			z--;
			return getFormatedCoordinates();
		} else if ((z > 10 && z <= 40) && ((x >= 0 && x <= 10) || (x >= 40 && x <= 50)) && (y >= 0 && y < 50)) {
			z--;
			return getFormatedCoordinates();
		} else if (((y >= 0 && y <= 10) || (y >= 40 && y <= 50)) && (z >= 10 && z < 40) && (x >= 10 && x <= 40)) {
			z--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates() + "//dron hits edge !!!";
		}
	}

	public String getFormatedCoordinates() {
		return String.format("Drone position: (" + x + "," + y + "," + z + ")");
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