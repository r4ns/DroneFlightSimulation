package drone;

public class Drone implements StandardDrone {
	
	
	public  int x;
	public  int y;
	public  int z;


	Drone(int x,int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public  String moveUp() {
		this.y++;
		return "Drone position: ("+this.x+","+this.y+","+this.z+")";
	}

	@Override
	public String moveDown() {
		this.y--;
		return "Drone position: ("+this.x+","+this.y+","+this.z+")";
	}

	@Override
	public String moveLeft() {
		this.x--;
		return "Drone position: ("+this.x+","+this.y+","+this.z+")";
	}

	@Override
	public String moveRight() {
		this.x++;
		return "Drone position: ("+this.x+","+this.y+","+this.z+")";
	}

	@Override
	public String moveBack() {
		this.z++;
		return "Drone position: ("+this.x+","+this.y+","+this.z+")";
	}

	@Override
	public String moveForth() {
		this.z--;
		return "Drone position: ("+this.x+","+this.y+","+this.z+")";
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: ("+this.x+","+this.y+","+this.z+")";
	}

}
