package drone;

public class Drone implements StandardDrone {
    //levo desno po x
	//gore dole po y
	//napred oduzimamo od z nazad dodajemo vrednosti na z
	
	public int x;
	public int y;
	public int z;
	
	public Drone(){
		
	}
	
	public Drone(int x, int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	@Override
	public String moveUp() {
		setY(y+1);
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		setY(y-1);
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		setX(x-1);
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		setX(x+1);
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		setZ(z+1);
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		setZ(z-1);
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		//System.out.println(x+ ", "+y+", "+z);
		return "("+x + ", "+ y +", "+z+")";
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
