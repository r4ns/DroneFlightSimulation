package drone;

public class Drone implements StandardDrone{
	
	int x=30;
	int y=0;
	int z=30;
	
	
	public Drone(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	@Override
	public String moveUp() {
		return ("Drone position ("+x+","+y+","+z+")");
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		return ("Drone position ("+x+","+y+","+z+")");
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		return ("Drone position ("+x+","+y+","+z+")");
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		return ("Drone position ("+x+","+y+","+z+")");
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return ("Drone position ("+x+","+y+","+z+")");
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return ("Drone position ("+x+","+y+","+z+")");
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
