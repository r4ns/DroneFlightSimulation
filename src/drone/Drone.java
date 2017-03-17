package drone;

public class Drone implements StandardDrone{
	private int x, y, z;
	//KONSTRUKTOR
	public Drone(){
		
	}
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;	
	}
	
	//METODE IZ INTERFEJSA
	public String moveUp(){
		this.y=y+1;
		return this.getFormatedCoordinates();
	};
	public String moveDown(){
		this.y=y-1;
		return this.getFormatedCoordinates();
	};
	public String moveLeft(){
		this.x=x-1;
		return this.getFormatedCoordinates();
	};
	public String moveRight(){
		this.x=x+1;
		return this.getFormatedCoordinates();
	};
	public String moveBack(){
		this.z=z-1;
		return this.getFormatedCoordinates();
	};
	public String moveForth(){
		this.z=z+1;
		return this.getFormatedCoordinates();
	};
	public String getFormatedCoordinates(){
		return "Drone position: ("+x+","+y+","+z+")";
	}
	//SIDES
	public String sides(){
		//DRON JE NAPRED
		if(x>=0 && x<50&& y>=0 && y<=50 && z>=0 && z<=10){
			if(x>=40 && x<50)
			{
				return "Drone is on the right side"; //DRON JE DESNO
			}
			else return "Drone is on the front side";
		}
		//DRON JE NAZAD
		if(x>=0 && x<=50 && y>=0 && y<=50 && z>=40 && z<=50){
			return "Drone is on the back side";
		}
		//DRON JE LEVO
		else if ( x>=0 && x<=10 && y>=0 && y<=50 && z>=0 && z<=50)
		{
			return "Drone is on the left side";
		}
		//DRON JE DOLE
		else if (x>=0 && x<=50 && y>=0 && y<=10 && z>=0 && z<=50){
			return "Drone is on the bottom side";
		}
		//DRON JE GORE
		else if (x>=0 && x<=50 && y>=40 && y<=50 && z>=0 && z<=50){
			return "Drone is on the up side";
		}
		else return "";
	}
	//GETTERI I SETTERI
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
	};
	

}
