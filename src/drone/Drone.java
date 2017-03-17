package drone;

public class Drone implements StandardDrone{
	
	private int currentX;
	private int currentY;
	private int currentZ;
	
	public Drone() {
		currentX = 30;
		currentY = 0;
		currentZ = 30;
		System.out.println(getFormatedCoordinates());
	}
	
	@Override
	public String moveUp() {
		if(currentY<10 && (currentX>=0 && currentX<=30))
			currentY++;
		if(currentY<50 && (currentX >=40 && currentX<=50))
			currentY++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if(currentY>0)
			currentY--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(currentX > 0)
			currentX--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if(currentX>=30 && currentX<50)
			currentX++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position : (" +currentX+","+ currentY+","+currentZ + ")";
	}

}
