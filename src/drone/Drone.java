package drone;

public class Drone implements StandardDrone {
	private int x = 30;
	private int y = 0;
	private int z = 30;
	public int[] spoljasnja_granica;

	public Drone() {

	}

	@Override
	public String moveUp() {
		if (y < 10) {
			if (y + 1 > 10)
				return getFormatedCoordinates();
			else
				setY(y + 1);
		} else {
			if (y + 1 > 50)
				return getFormatedCoordinates();
			else
				setY(y + 1);
			return getFormatedCoordinates();
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if (y > 40) {
			if (y - 1 < 40)
				return getFormatedCoordinates();
			else
				setY(y - 1);
		} else {
			if (y - 1 < 0)
				return getFormatedCoordinates();
			else
				setY(y - 1);
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if (x < 10) {
			if (x - 1 < 0)
				return getFormatedCoordinates();
			else
				setX(x - 1);
		} else {
				if(x - 1 < 40)
					return getFormatedCoordinates();
				else setX(x - 1);
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if(x < 10)
		{
			if(x + 1 > 10)
				return getFormatedCoordinates();
			else setX(x + 1);
		}
		else
		{
			if(x + 1 > 50)
				return getFormatedCoordinates();
			else setX(x + 1);
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if(z > 40)
		{
			if(z + 1 > 50)
				return getFormatedCoordinates();
			else setZ(z + 1);
		}
		else
		{
			if(z + 1 > 10)
				return getFormatedCoordinates();
			else setZ(z + 1);
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(z <= 10)
		{
			if(z - 1 < 0)
				return getFormatedCoordinates();
			else setZ(z - 1);
		}
		else
		{
			if(z - 1 < 40)
				return getFormatedCoordinates();
			else setZ(z - 1);
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
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
