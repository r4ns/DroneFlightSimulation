package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
	public Drone(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	@Override
	public String moveUp() {
		if ((y >= 0 && y < 10) && (x >= 0 && x < 50) && (z >= 0 && z < 50))
			y++;
		else if ((y >= 40 && y < 50) && (x >= 0 && x <= 50) && (z >= 0 && z <= 50))
			y++;
		else if ((y >= 0 && y < 50) && (x >= 40 && x <= 50) && (z >= 0 && z <= 50))
			y++;
		else if ((y >= 0 && y < 50) && (x >= 0 && x <= 10) && (z >= 0 && z <= 50))
			y++;
		else if ((y >= 0 && y < 50) && (x >= 0 && x <= 50) && (z >= 40 && z <= 50))
			y++;
		else if ((y >= 0 && y < 50) && (x >= 0 && x <= 50) && (z >= 0 && z <= 10))
			y++;

		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if ((y > 0 && y <= 10) && (x >= 0 && x <= 50) && (z >= 0 && z <= 50))
			y--;
		else if ((y > 40 && y <= 50) && (x >= 0 && x <= 50) && (z >= 0 && z <= 50))
			y--;
		else if ((y > 0 && y <= 50) && (x >= 40 && x <= 50) && (z >= 0 && z <= 50))
			y--;
		else if ((y > 0 && y <= 50) && (x >= 0 && x <= 10) && (z >= 0 && z <= 50))
			y--;
		else if ((y > 0 && y <= 50) && (x >= 0 && x <= 50) && (z >= 40 && z <= 50))
			y--;
		else if ((y > 0 && y <= 50) && (x >= 0 && x <= 50) && (z >= 0 && z <= 10))
			y--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if ((y >= 0 && y <= 10) && (x > 0 && x <= 50) && (z >= 0 && z <= 50))
			x--;
		else if ((y >= 40 && y <= 50) && (x > 0 && x <= 50) && (z >= 0 && z <= 50))
			x--;
		else if ((y >= 0 && y <= 50) && (x > 40 && x <= 50) && (z >= 0 && z <= 50))
			x--;
		else if ((y >= 0 && y <= 50) && (x > 0 && x <= 10) && (z >= 0 && z <= 50))
			x--;
		else if ((y >= 0 && y <= 50) && (x > 0 && x <= 50) && (z >= 40 && z <= 50))
			x--;
		else if ((y >= 0 && y <= 50) && (x > 0 && x <= 50) && (z >= 0 && z <= 10))
			x--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if ((y >= 0 && y <= 10) && (x >= 0 && x < 50) && (z >= 0 && z <= 50))
			x++;
		else if ((y >= 40 && y <= 50) && (x >= 0 && x < 50) && (z >= 0 && z <= 50))
			x++;
		else if ((y >= 0 && y <= 50) && (x >= 40 && x < 50) && (z >= 0 && z <= 50))
			x++;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x < 10) && (z >= 0 && z <= 50))
			x++;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x < 50) && (z >= 40 && z <= 50))
			x++;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x < 50) && (z >= 0 && z <= 10))
			x++;

		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if ((y >= 0 && y <= 10) && (x >= 0 && x <= 50) && (z >= 0 && z < 50))
			z++;
		else if ((y >= 40 && y <= 50) && (x >= 0 && x <= 50) && (z >= 0 && z < 50))
			z++;
		else if ((y >= 0 && y <= 50) && (x >= 40 && x <= 50) && (z >= 0 && z < 50))
			z++;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x <= 10) && (z >= 0 && z < 50))
			z++;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x <= 50) && (z >= 40 && z < 50))
			z++;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x <= 50) && (z >= 0 && z < 10))
			z++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if ((y >= 0 && y <= 10) && (x >= 0 && x <= 50) && (z > 0 && z <= 50))
			z--;
		else if ((y >= 40 && y <= 50) && (x >= 0 && x <= 50) && (z > 0 && z <= 50))
			z--;
		else if ((y >= 0 && y <= 50) && (x >= 40 && x <= 50) && (z > 0 && z <= 50))
			z--;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x <= 10) && (z > 0 && z <= 50))
			z--;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x <= 50) && (z > 40 && z <= 50))
			z--;
		else if ((y >= 0 && y <= 50) && (x >= 0 && x <= 50) && (z > 0 && z <= 10))
			z--;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		
		return "Drone position: (" + this.x +", " + this.y + ", " +this.z + ")";
	}
	
	

}
