package drone;

public class Drone {
	private int x,y,z;
	private int [] boundaries;
	private boolean signal;
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
		
		if((10<x&&x<40)&&(10<y&&y<40)&&(10<z&&z<40))
		{
			return false;
		}
		else if (0>x||x>50||0>y||y>50||0>z||z>50)
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