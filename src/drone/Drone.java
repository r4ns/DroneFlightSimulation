package drone;

public class Drone implements StandardDrone {
	private int x = 30;
	private int y = 0;
	private int z = 30;
	

	public Drone() {

	}



	@Override
	public String moveUp() {
		y++;
		return getFormatedCoordinates();
	}



	@Override
	public String moveDown() {
		y--;
		return getFormatedCoordinates();
	}



	@Override
	public String moveLeft() {
		x--;
		return getFormatedCoordinates();
	}



	@Override
	public String moveRight() {
		x++;
		return getFormatedCoordinates();
	}



	@Override
	public String moveBack() {
		z++;
		return getFormatedCoordinates();
	}



	@Override
	public String moveForth() {
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
