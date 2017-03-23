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
		
		return "Drone position: (" + this.x +", " + this.y + ", " +this.z + ")";
	}
	
	

}
