package drone;

public class Drone {
	private int x,y,z;
	private int [] boundaries;
	public int[] getBoundaries() {
		return boundaries;
	}
	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}
	public Drone (int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Drone() {
		
	}
	public  String moveUp(){
		
		y++;
		return  "("+x+","+y+","+z+")";
		
	}
	public  String moveDown() {
		
		y--;
		return"("+x+","+y+","+z+")";
	}
	public  String moveLeft(){
		
		x--;
		return "("+x+","+y+","+z+")";
	}
	public  String moveRight(){
		
		x++;
		return "("+x+","+y+","+z+")";
	}
	public  String moveBack(){
		
		z++;
		return "("+x+","+y+","+z+")";
	}
	public String moveForth(){
		
		z--;
		return "("+x+","+y+","+z+")";
	}
	public  String getFormatedCoordinates(){
		return "Dron se nalazi na (x,y,z) = ("+x+","+y+","+z+")";
	} 
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

}