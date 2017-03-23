package drone;

public class Drone implements StandardDrone {

	private int currentX, currentY, currentZ;

	public Drone() {
		currentX = 30;
		currentY = 0;
		currentZ = 30;
		System.out.println(getFormatedCoordinates());
	}

	@Override
	public String moveUp() {

		if (currentY < 10 && (currentX >= 0 && currentX <= 30))
			currentY++;
		else if (currentY < 50 && (currentX >= 40 && currentX <= 50))
			currentY++;
		else if (currentX >= 22 && currentZ == 9 && currentY < 50)
			currentY++;

		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if (currentY > 30 && currentX == 0)
			currentY--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if (currentX > 40 && currentY == 33 && currentZ == 14)
			currentX--;
		else if (currentX <= 40 && currentY == 33 && currentZ == 9 && currentX > 22)
			currentX--;
		else if (currentZ <= 30 && currentY <= 50 && (currentX > 0 && currentX < 40))
			currentX--;

		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if (currentX >= 30 && currentX < 50)
			currentX++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if (currentZ < 30 && currentX == 22 && currentY <= 50)
			currentZ++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if ((currentX >= 40 && currentX <= 50) && currentY == 33)
			if (currentZ > 9)
				currentZ--;

		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		if (currentX == 0 && currentY == 30 && currentZ == 30)
			return "Destination reached! Coordinates : (" + currentX + "," + currentY + "," + currentZ + ")";
		else if (currentX == 30 && currentY == 0 && currentZ == 30)
			return "Drone spawned! Coordinates : (" + currentX + "," + currentY + "," + currentZ + ")";
		else
			return "Drone position : (" + currentX + "," + currentY + "," + currentZ + ")";
	}

}
