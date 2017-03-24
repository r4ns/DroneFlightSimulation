package drone;

public class Drone implements StandardDrone{
	
	int currentX;
	int currentY;
	int currentZ;
	
	public Drone(int x, int y, int z)
	{
		setCurrentX(x);
		setCurrentY(y);
		setCurrentZ(z);		
	}
	
	
	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		setCurrentY(getCurrentY() + 1);
		return "Moving Up";
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		setCurrentY(getCurrentY() - 1);
		return "Moving Down";
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		setCurrentX(getCurrentX() - 1);
		return "Moving Left";
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		setCurrentX(getCurrentX() + 1);
		return "Moving Right";
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		setCurrentZ(getCurrentZ() + 1);
		return "Moving Back";
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		setCurrentZ(getCurrentZ() - 1);
		return "Moving Forth";
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getCurrentX() + "," + getCurrentY() + "," + getCurrentZ() + ")";
	}

	//////////////////////////GETTERS AND SETTERS////////////////////////////////
	
	
	public int getCurrentX() {
		return currentX;
	}


	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}


	public int getCurrentY() {
		return currentY;
	}


	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}


	public int getCurrentZ() {
		return currentZ;
	}


	public void setCurrentZ(int currentZ) {
		this.currentZ = currentZ;
	}

	
}
