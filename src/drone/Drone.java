package drone;

public class Drone implements StandardDrone{
	
	int x;
	int y;
	int z;
	
	Drone(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
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

}
