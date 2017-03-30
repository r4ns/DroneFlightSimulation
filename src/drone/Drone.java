package drone;

public class Drone implements StandardDrone{
	private int x=30;
	private int y=0;
	private int z=30;

	public Drone (){

	}
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
//
	public String moveUp() {
		if(y<10 || (x<=10 && y>=10 && y<50 && z<=50) || (x<=50 && y>=10 && y<50 && z<=10) || (x>=40 && x<=50 && y>=10 && y<50 && z<=50) || (x<=50 && y>=10 && y<50 && z>=40 && z<=50) || (x<=50 && y>=40 && y<50 && z<=50 )){
			y=y+1;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();

	}

	public String moveDown() {
		if((x<=10 && y>0 && y<=50 && z<=50) || (x<=50 && y>0 && y<=50 && z<=10) || (x>=40 && x<=50 && y>0 && y<=50 && z<=50) || (x<=50 && y>0 && y<50 && z>=40 && z<=50) || (x<=50 && y>40 && y<=50 && z<=50) || (x<=50 && y>0 && y<=10 &&z<=50)){
			y=y-1;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();

	}

	public String moveLeft() {
		if((x>0 && y>0 &&y<=10 && z<=50) || (x>0 && y>=40 && y<=50  && z<=50) || (x>0 &&x<=10 && y<=50 && z<=50) || (x>0 && x<=50 && y<=50 && z<=10) || (x>0 && x<=50 && y<=50 && z>=40) || (x>40 && x<=50 && y>=10 && y<=40 && z>=10 && z<=40)){
			x=x-1;
			return getFormatedCoordinates();
		}
		else 
			return getFormatedCoordinates();
	}

	public String moveRight() {
		if((x<50 && y>0 &&y<=10 && z<=50) || (x<50 && y>=40 && y<=50  && z<=50) || (x>=40 &&x<50 && y<=50 && z<=50) || (x>=0 && x<50 && y<=50 && z<=10) || (x>=0 && x<50 && y<=50 && z>=40) || (x>=0 && x<10 && y>=10 && y<=40 && z>=10 && z<=40)){ 
			x=x+1;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();
	}

	public String moveBack() {
		if((x<=50 && y<=50 && z>=0 && z<10) || (x<=50 && y<=50 && z>=40 && z<50) || (x<=10 && y<=50 && z<50) || (x>=40 && x<=50 && y<=50 && z<50) || (x<=50 && y>=40 && y<=50 && z<50) || (x<=50 && y>0 && y<=10 && z<50)){
			z=z+1;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();
	}

	public String moveForth() {

		if((x<=50 && y<=50 && z>0 && z<=10) || (x<=50 && y<=50 && z>40 && z<=50) || (x<=10 && y<=50 && z>0) || (x>=40 && x<=50 && y<=50 && z>0) || (x<=50 && y>=40 && y<=50 && z>0) || (x<=50 && y>0 && y<=10 && z>0)){
			z=z-1;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();
	}

	public String getFormatedCoordinates() {

		return "Drone position: ("+x+","+y+","+z+")";
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
