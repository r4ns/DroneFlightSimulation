package drone;

public class Drone implements StandardDrone {

	public int x;
	public int y;
	public int z;
	
	public Drone(int x,int y,int z){
		this.x =x;
		this.y =y;
		this.z =z;
	}
	
	
	
	@Override
	public String moveUp() {
		
		this.y++;
		return "("+ this.x + "," + this.y + "," + this.z + ")";

	}

	@Override
	public String moveDown() {
		this.y--;
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

	@Override
	public String moveLeft() {
		this.x--;
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

	@Override
	public String moveRight() {
		this.x++;
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

	@Override
	public String moveBack() {
		
		this.z++;
		return "("+ this.x + "," + this.y + "," + this.z + ")";
		
	}

	@Override
	public String moveForth() {
		
		this.z--;
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

	@Override
	public String getFormatedCoordinates() {
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

}
