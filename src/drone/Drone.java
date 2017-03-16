package drone;

public class Drone implements StandardDrone {
	
	int x = 30;
	int y = 0;
	int z = 30;

	@Override
	public String moveUp() {
		this.y = this.y+1;
		return "Nove koordinate su: x - "+x+", y - "+y+", z - "+z;
	}

	@Override
	public String moveDown() {
		this.y = this.y-1;
		return "Nove koordinate su: x - "+x+", y - "+y+", z - "+z;
	}

	@Override
	public String moveLeft() {
		this.x = this.x-1;
		return "Nove koordinate su: x - "+x+", y - "+y+", z - "+z;
	}

	@Override
	public String moveRight() {
		this.x = this.x+1;
		return "Nove koordinate su: x - "+x+", y - "+y+", z - "+z;

	}

	@Override
	public String moveBack() {
		this.z = this.z-1;
		return "Nove koordinate su: x - "+x+", y - "+y+", z - "+z;
	}

	@Override
	public String moveForth() {
		this.z = this.z+1;
		return "Nove koordinate su: x - "+x+", y - "+y+", z - "+z;
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Nove koordinate su: x - "+x+", y - "+y+", z - "+z;
	}

}
