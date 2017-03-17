package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
	private String yStr;
	private String xStr;
	
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public String toString() {
		return "Drone position: (" + this.x +", " + this.y + ", " +this.z + ")";
	}
	@Override
	public String moveUp() {
		y=y+1;
		yStr=String.valueOf(y);
		return yStr;
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveRight() {
		x =x+1;
		//xStr=String.valueOf(x);
		return null;
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveForth() {
		z=z-1;
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		
		return null;
	}
	
	

}
