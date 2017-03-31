package drone;

import space.FlySpace;

public class Drone implements StandardDrone{
	private int x=30;
	private int y=0;
	private int z=30;

	FlySpace granice =new FlySpace();
	
	
	public Drone (){

	}
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
//
	public String moveUp() {
		if(y<10 || (x<=10 && y>=10 && y<50 && z<=50) || (x<=50 && y>=10 && y<50 && z<=10) || (x>=40 && x<=50 && y>=10 && y<50 && z<=50) || (x<=50 && y>=10 && y<50 && z>=40 && z<=50) || (x<=50 && y>=40 && y<50 && z<=50 ))
		//if(y<granice.getInnerStart() || (x<=granice.getInnerStart() && y>=granice.getInnerStart() && y<granice.getOuterFinish() && z<=granice.getOuterFinish()) || (x<=granice.getOuterFinish() && y>=granice.getInnerStart() && y<granice.getOuterFinish() && z<=granice.getInnerStart()) || (x>=granice.getInnerFinish() && x<=granice.getOuterFinish() && y>=granice.getInnerStart() && y<granice.getOuterFinish() && z<=granice.getOuterFinish()) || (x<=granice.getOuterFinish() && y>=granice.getInnerStart() && y<granice.getOuterFinish() && z>=granice.getInnerFinish() && z<=granice.getOuterFinish()) || (x<=granice.getOuterFinish() && y>=granice.getInnerFinish() && y<granice.getOuterFinish() && z<=granice.getOuterFinish()))
		{
			y=y+1;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();

	}

	public String moveDown() {
		//if((x<=10 && y>0 && y<=granice.getOuterFinish() && z<=granice.getOuterFinish()) || (x<=granice.getOuterFinish() && y>0 && y<=granice.getOuterFinish() && z<=10) || (x>=40 && x<=granice.getOuterFinish() && y>0 && y<=granice.getOuterFinish() && z<=granice.getOuterFinish()) || (x<=granice.getOuterFinish() && y>0 && y<granice.getOuterFinish() && z>=40 && z<=granice.getOuterFinish()) || (x<=granice.getOuterFinish() && y>40 && y<=granice.getOuterFinish() && z<=granice.getOuterFinish()) || (x<=granice.getOuterFinish() && y>0 && y<=10 &&z<=granice.getOuterFinish())){
		if(y>1){
			y=y-1;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();

	}

	public String moveLeft() {
		//if((x>0 && y>0 &&y<=10 && z<=granice.getOuterFinish()) || (x>0 && y>=40 && y<=granice.getOuterFinish()  && z<=granice.getOuterFinish()) || (x>0 &&x<=10 && y<=granice.getOuterFinish() && z<=granice.getOuterFinish()) || (x>0 && x<=granice.getOuterFinish() && y<=granice.getOuterFinish() && z<=10) || (x>0 && x<=granice.getOuterFinish() && y<=granice.getOuterFinish() && z>=40) || (x>40 && x<=granice.getOuterFinish() && y>=10 && y<=40 && z>=10 && z<=40))
		if(x>0){
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
