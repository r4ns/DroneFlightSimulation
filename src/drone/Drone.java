package drone;

public class Drone implements StandardDrone {
	 private int x;
	 private int y;
	 private int z;
	public Drone(){
		
	}
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public String moveUp() {
		setY(y+1);
		getFormatedCoordinates();
		return x + ","+ y + "," + z;
		
	}

	@Override
	public String moveDown() {
		setY(y-1);
		getFormatedCoordinates();
		return x + ","+ y + "," + z;
	}

	@Override
	public String moveLeft() {
		setX(x - 1);
		getFormatedCoordinates();
		return x + ","+ y + "," + z;
	}

	@Override
	public String moveRight() {
		setX(x + 1);
		getFormatedCoordinates();
		return x + ","+ y + "," + z;
	}

	@Override
	public String moveBack() {
		setZ(z+1);
		getFormatedCoordinates();
		return x + ","+ y + "," + z;
	}

	@Override
	public String moveForth() {
		setZ(z-1);
		getFormatedCoordinates();
		return x + ","+ y + "," + z;
	}

	@Override
	public String getFormatedCoordinates() {
		System.out.println(x + ","+ y + "," + z);
		return x + ","+ y + "," + z;
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
