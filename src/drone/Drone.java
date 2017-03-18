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
		this.y++;
		return (getFormatedCoordinates());
		
	}

	@Override
	public String moveDown() {
		this.y--;
		return (getFormatedCoordinates());
	}

	@Override
	public String moveLeft() {
		this.x--;
		return (getFormatedCoordinates());
	}

	@Override
	public String moveRight() {
		this.x++;
		return (getFormatedCoordinates());
	}

	@Override
	public String moveBack() {
		this.z++;
		return (getFormatedCoordinates());
	}

	@Override
	public String moveForth() {
		this.z--;
		return (getFormatedCoordinates());
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return ("Drone position ("+x+","+y+","+z+")");
	}
	
}
