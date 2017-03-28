package drone;

public class Drone implements StandardDrone {

	private int currentX, currentY, currentZ;

	public Drone() {
		currentX = 30;
		currentY = 0;
		currentZ = 30;
		System.out.println("Drone spawned at - " + getFormatedCoordinates());
	}

	@Override
	public String moveUp() {

		if ((currentY >= 0 && currentY < 10) && (currentX >= 0 && currentX < 50) && (currentZ >= 0 && currentZ < 50))
			currentY++;
		else if ((currentY >= 40 && currentY < 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 50))
			currentY++;
		else if ((currentY >= 0 && currentY < 50) && (currentX >= 40 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 50))
			currentY++;
		else if ((currentY >= 0 && currentY < 50) && (currentX >= 0 && currentX <= 10)
				&& (currentZ >= 0 && currentZ <= 50))
			currentY++;
		else if ((currentY >= 0 && currentY < 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 40 && currentZ <= 50))
			currentY++;
		else if ((currentY >= 0 && currentY < 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 10))
			currentY++;

		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if ((currentY > 0 && currentY <= 10) && (currentX >= 0 && currentX <= 50) && (currentZ >= 0 && currentZ <= 50))
			currentY--;
		else if ((currentY > 40 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 50))
			currentY--;
		else if ((currentY > 0 && currentY <= 50) && (currentX >= 40 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 50))
			currentY--;
		else if ((currentY > 0 && currentY <= 50) && (currentX >= 0 && currentX <= 10)
				&& (currentZ >= 0 && currentZ <= 50))
			currentY--;
		else if ((currentY > 0 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 40 && currentZ <= 50))
			currentY--;
		else if ((currentY > 0 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 10))
			currentY--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if ((currentY >= 0 && currentY <= 10) && (currentX > 0 && currentX <= 50) && (currentZ >= 0 && currentZ <= 50))
			currentX--;
		else if ((currentY >= 40 && currentY <= 50) && (currentX > 0 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 50))
			currentX--;
		else if ((currentY >= 0 && currentY <= 50) && (currentX > 40 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 50))
			currentX--;
		else if ((currentY >= 0 && currentY <= 50) && (currentX > 0 && currentX <= 10)
				&& (currentZ >= 0 && currentZ <= 50))
			currentX--;
		else if ((currentY >= 0 && currentY <= 50) && (currentX > 0 && currentX <= 50)
				&& (currentZ >= 40 && currentZ <= 50))
			currentX--;
		else if ((currentY >= 0 && currentY <= 50) && (currentX > 0 && currentX <= 50)
				&& (currentZ >= 0 && currentZ <= 10))
			currentX--;

		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if ((currentY >= 0 && currentY <= 10) && (currentX >= 0 && currentX < 50) && (currentZ >= 0 && currentZ <= 50))
			currentX++;
		else if ((currentY >= 40 && currentY <= 50) && (currentX >= 0 && currentX < 50)
				&& (currentZ >= 0 && currentZ <= 50))
			currentX++;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 40 && currentX < 50)
				&& (currentZ >= 0 && currentZ <= 50))
			currentX++;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX < 10)
				&& (currentZ >= 0 && currentZ <= 50))
			currentX++;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX < 50)
				&& (currentZ >= 40 && currentZ <= 50))
			currentX++;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX < 50)
				&& (currentZ >= 0 && currentZ <= 10))
			currentX++;

		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if ((currentY >= 0 && currentY <= 10) && (currentX >= 0 && currentX <= 50) && (currentZ >= 0 && currentZ < 50))
			currentZ++;
		else if ((currentY >= 40 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 0 && currentZ < 50))
			currentZ++;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 40 && currentX <= 50)
				&& (currentZ >= 0 && currentZ < 50))
			currentZ++;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX <= 10)
				&& (currentZ >= 0 && currentZ < 50))
			currentZ++;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 40 && currentZ < 50))
			currentZ++;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ >= 0 && currentZ < 10))
			currentZ++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if ((currentY >= 0 && currentY <= 10) && (currentX >= 0 && currentX <= 50) && (currentZ > 0 && currentZ <= 50))
			currentZ--;
		else if ((currentY >= 40 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ > 0 && currentZ <= 50))
			currentZ--;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 40 && currentX <= 50)
				&& (currentZ > 0 && currentZ <= 50))
			currentZ--;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX <= 10)
				&& (currentZ > 0 && currentZ <= 50))
			currentZ--;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ > 40 && currentZ <= 50))
			currentZ--;
		else if ((currentY >= 0 && currentY <= 50) && (currentX >= 0 && currentX <= 50)
				&& (currentZ > 0 && currentZ <= 10))
			currentZ--;

		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		if (currentX == 0 && currentY == 30 && currentZ == 30)
			return "Destination reached! Coordinates : (" + currentX + "," + currentY + "," + currentZ + ")";
		else
			return "Drone position : (" + currentX + "," + currentY + "," + currentZ + ")";
	}

}
