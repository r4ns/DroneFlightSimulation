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
		if(y==10){
			if(x>10&&x<40&&z>10&&z<40){
			return this.getFormatedCoordinates() + "<--- Drone can't move this way"; 
			}
			else {
				y++;
				return this.getFormatedCoordinates();
			}
		}
		else if(y!=50){
			y++;
			return this.getFormatedCoordinates();
		}
		else 
			return this.getFormatedCoordinates()+ "<--- Drone can't move this way";
	};
	public String moveDown(){
		if(y==40){
			if(x>10&&x<40&&z>10&&z<40){
			return this.getFormatedCoordinates()  + "<--- Drone can't move this way";
			}
			else {
				y--;
				return this.getFormatedCoordinates();
			}
		}
		else if(y!=0){
			y--;
			return this.getFormatedCoordinates();
		}
		else 
			return this.getFormatedCoordinates()  + "<--- Drone can't move this way";
		
	};
	public String moveLeft(){
		if(x==40){
			if(y>10&&y<40&&z>10&&z<40){
			return this.getFormatedCoordinates() + "<--- Drone can't move this way";
			}
			else {
				x--;
				return this.getFormatedCoordinates();
			}
		}
		else if(x!=0){
			x--;
			return this.getFormatedCoordinates();
		}
		else 
			return this.getFormatedCoordinates() + "<--- Drone can't move this way";
		
	};
	public String moveRight(){
		if(x==10){
			if(y>10&&y<40&&z>10&&z<40){
			return this.getFormatedCoordinates() + "<--- Drone can't move this way";
			}
			else {
				x++;
				return this.getFormatedCoordinates();
			}
		}
		else if(x!=50){
			x++;
			return this.getFormatedCoordinates();
		}
		else 
			return this.getFormatedCoordinates() + "<--- Drone can't move this way";
	};
	public String moveForth(){
		if(z==10){
			if(y>10&&y<40&&x>10&&x<40){
			return this.getFormatedCoordinates() + "<--- Drone can't move this way";
			}
			else {
				z++;
				return this.getFormatedCoordinates();
			}
		}
		else if(z!=50){
			z++;
			return this.getFormatedCoordinates();
		}
		else 
			return this.getFormatedCoordinates() + "<--- Drone can't move this way";
		
	};
	public String moveBack(){
		if(z==40){
			if(y>10&&y<40&&x>10&&x<40){
			return this.getFormatedCoordinates() + "<--- Drone can't move this way";
			}
			else {
				z--;
				return this.getFormatedCoordinates();
			}
		}
		else if(z!=0){
			z--;
			return this.getFormatedCoordinates();
		}
		else 
			return this.getFormatedCoordinates() + "<--- Drone can't move this way";
		
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
	
//KRAJJ
}
