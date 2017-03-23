package drone;

public class Drone implements StandardDrone {
	 private int x;
	 private int y;
	 private int z;
	 private int[] boundaries ;
	 private int[] coordinates ;
	//private int distanceFromOuterBox =10;
	public Drone(){
		
	}
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Drone(int[] boundaries, int[] coordinates){
		this.boundaries = boundaries;
		//distanceFromOuterBox=10;
		this.coordinates=coordinates;
	}
	
	public String moveUp() {
		if(y<10){
			setY(y+1);
			getFormatedCoordinates();
			return "Drone position: (" + Integer.toString(x) + ","+ Integer.toString(y) + "," + Integer.toString(z) + ")";
		}
		else
		{
			System.out.println("Ne moze gore!");
			return "Ne moze gore!";
		}
	}

	@Override
	public String moveDown() {
		setY(y-1);
		getFormatedCoordinates();
		return "Drone position: (" + x + ","+ y + "," + z + ")";
	}

	@Override
	public String moveLeft() {
		setX(x - 1);
		getFormatedCoordinates();
		return "Drone position: (" + x + ","+ y + "," + z + ")";
	}

	@Override
	public String moveRight() {
		setX(x + 1);
		getFormatedCoordinates();
		return "Drone position: (" + x + ","+ y + "," + z + ")";
	}

	@Override
	public String moveBack() {
		setZ(z+1);
		getFormatedCoordinates();
		return "Drone position: (" + x + ","+ y + "," + z + ")";
	}

	@Override
	public String moveForth() {
		setZ(z-1);
		getFormatedCoordinates();
		return "Drone position: (" + x + ","+ y + "," + z + ")";
	}

	@Override
	public String getFormatedCoordinates() {
		System.out.println("Drone position: (" + x + ","+ y + "," + z + ")");
		return "Drone position: (" + Integer.toString(x) + ","+ Integer.toString(y) + "," + Integer.toString(z) + ")";
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
