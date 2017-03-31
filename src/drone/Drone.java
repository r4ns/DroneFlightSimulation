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
	public Drone (int x, int y, int z, int[] boundaries) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.boundaries = boundaries;
	}
	public Drone() {
		
	}
	public  String moveUp(){
		
	    
		y++;
		if(!check())
			y--;
		
	    
		return  "("+x+","+y+","+z+")";
	    
	}
	public  String moveDown() {
		
		
		y--;
		if(!check())
			y++;
		
		
		return"("+x+","+y+","+z+")";
	}
	public  String moveLeft(){
		
		
		x--;
		if(!check())
			x++;
		
		
		return "("+x+","+y+","+z+")";
	}
	public  String moveRight(){
		
		
		x++;
		if(!check())
			x--;
		
		
		return "("+x+","+y+","+z+")";
	}
	public  String moveBack(){
		
		
		z++;
		if(!check())
			z--;
		
		
		return "("+x+","+y+","+z+")";
	}
	public String moveForth(){
		
		
		z--;
		if(!check())
			z++;
		
		
		
		return "("+x+","+y+","+z+")";
	}
	public  String getFormatedCoordinates(){
		return "("+x+","+y+","+z+")";
	} 
	public boolean check() {
		
		if((10<x&&x<boundaries[0]-10)&&(10<y&&y<boundaries[1]-10)&&(10<z&&z<boundaries[2]-10))
		{
			return false;
		}
		else if (0>x||x>boundaries[0]||0>y||y>boundaries[1]||0>z||z>boundaries[2])
		{
			return false;
		}
		else
		{
		return true;
		}
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