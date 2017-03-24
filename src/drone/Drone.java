package drone;

public class Drone implements StandardDrone{
	
	int x;
	int y;
	int z;
	
	public Drone(){
		
	}
	
	public Drone(int x,int y,int z){
		this.x=30;
		this.y=0;
		this.z=30;
	}
	
	public String moveUp(){
		x=this.x;
		y=this.y+1;
		z=this.z;
		System.out.println("Drone position(x:"+this.x+" y:"+this.y+" z:"+this.z+")");
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveDown(){
		x=this.x;
		y=this.y-1;
		z=this.z;
		System.out.println("Drone position(x:"+this.x+" y:"+this.y+" z:"+this.z+")");
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveLeft(){
		x=this.x-1;
		y=this.y;
		z=this.z;
		System.out.println("Drone position(x:"+this.x+" y:"+this.y+" z:"+this.z+")");
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveRight(){
		x=this.x+1;
		y=this.y;
		z=this.z;
		System.out.println("Drone position(x:"+this.x+" y:"+this.y+" z:"+this.z+")");
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveBack(){
		x=this.x;
		y=this.y;
		z=this.z+1;
		System.out.println("Drone position(x:"+this.x+" y:"+this.y+" z:"+this.z+")");
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveForth(){
		x=this.x;
		y=this.y;
		z=this.z-1;
		System.out.println("Drone position(x:"+this.x+" y:"+this.y+" z:"+this.z+")");
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String getFormatedCoordinates(){
		return "Drone position(x:"+this.x+" y:"+this.y+" z:"+this.z+")";
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
