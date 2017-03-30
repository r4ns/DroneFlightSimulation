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
	
	public Drone(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Drone(int[] array)
	{
		this.x = array[0];
		this.y = array[1];
		this.z = array[2];
	}

	@Override
	public String moveUp() {
		if(((x >= 0 && x <= 10) || (x >= 40 && x <= 50)) && (y < 50))
			y++;
		else if((y >= 0 && y < 10) || (y >= 40 && y < 50))
			y++;
		else if((z >= 0 && z <= 10) || (z >= 40 && z <= 50))
			y++;
		return getFormatedCoordinates();
	}



	@Override
	public String moveDown() {
		if(((x >= 0 && x <= 10) || (x >= 40 && x <= 50)) && (y > 0))
			y--;
		else if((y > 0 && y <= 10) || (y > 40 && y <= 50))
			y--;
		else if(((z >= 0 && z <= 10) || (z >= 40 && z <= 50)) && (y > 0))
			y--;
		return getFormatedCoordinates();
	}



	@Override
	public String moveLeft() {
		if(((y >= 40 && y <= 50) || (y >= 0 && y<= 10)) && (x > 0))
			x--;
		else if(((z >= 0 && z <= 10) || (z >= 40 && z <= 50)) && (x > 0))
			x--;
		else if((x > 0 && x <= 10) || (x > 40 && x <= 50))
			x--;
		return getFormatedCoordinates();
	}



	@Override
	public String moveRight() {
		if(((y >= 40 && y <= 50) || (y >= 0 && y<= 10)) && (x < 50))
			x++;
		else if(((z >= 0 && z <= 10) || (z >= 40 && z <= 50)) && (x < 50))
			x++;
		else if((x >= 0 && x < 10) || (x >= 40 && x < 50))
			x++;
		return getFormatedCoordinates();
	}



	@Override
	public String moveBack() {
		if(((x >=0 && x <= 10) || (x >= 40 && x <= 50)) && (z < 50))
			z++;
		else if(((y >= 0 && y <= 10) || (y >= 40 && y <= 50)) && (z < 50))
			z++;
		else if((z >= 0 && z < 10) || (z >= 40 && z < 50))
			z++;
		return getFormatedCoordinates();
	}



	@Override
	public String moveForth() {
		if(((x >=0 && x <= 10) || (x >= 40 && x <= 50)) && (z > 0))
			z--;
		else if(((y >= 0 && y <= 10) || (y >= 40 && y <= 50)) && (z > 0))
			z--;
		else if((z > 0 && z <= 10) || (z > 40 && z <= 50))
			z--;
		return getFormatedCoordinates();
	}


	@Override
	public String getFormatedCoordinates() {
		System.out.println("Trenutna pozicija je (" + x + "," + y + "," + z + ").");
		return "Trenutna pozicija je (" + x + "," + y + "," + z + ").";
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
