package space;

import drone.Drone;

public class DoubleCubeDrone extends Drone {
	
	int x, y, z;
	private FlySpace flySpace=new FlySpace();
	int[] boundaries=flySpace.getBoundaries();

	Drone tDoleLevo;
	Drone tDoleDesno; 
	Drone tSrednjeDesno;
	Drone tGoreDesno;
	
	public DoubleCubeDrone() {
		
	}
	
	public DoubleCubeDrone (int x, int y, int z,int[] boundaries){
		this.tDoleLevo=new Drone(x, y, z, boundaries);
		this.tDoleDesno=new Drone(x+1, y, z+1, boundaries);
		this.tSrednjeDesno=new Drone(x+2, y+1, z+1, boundaries);
		this.tGoreDesno=new Drone (x+2, y+2, z+1, boundaries);
		this.boundaries=boundaries;
	}
	
	public String moveUp() {
		
		tDoleDesno.moveUp();
		tDoleLevo.moveUp();
		tSrednjeDesno.moveUp();
		tGoreDesno.moveUp();
		
		return "Tacka dole desno: "+ tDoleDesno.getFormatedCoordinates() + " Tacka dole levo: " +
		tDoleLevo.getFormatedCoordinates() +" Tacka srednje desno: " + tSrednjeDesno.getFormatedCoordinates() +
		" Tacka gore desno: " + tGoreDesno.getFormatedCoordinates();
	}

	


	public String moveDown() {
		
		tDoleDesno.moveDown();
		tDoleLevo.moveDown();
		tSrednjeDesno.moveDown();
		tGoreDesno.moveDown();
		
		return "Tacka dole desno: "+ tDoleDesno.getFormatedCoordinates() + " Tacka dole levo: " +
		tDoleLevo.getFormatedCoordinates() +" Tacka srednje desno: " + tSrednjeDesno.getFormatedCoordinates() +
		" Tacka gore desno: " + tGoreDesno.getFormatedCoordinates();
	}
	
	public String moveLeft() {
		
		tDoleDesno.moveLeft();
		tDoleLevo.moveLeft();
		tSrednjeDesno.moveLeft();
		tGoreDesno.moveLeft();
		
		return "Tacka dole desno: "+ tDoleDesno.getFormatedCoordinates() + " Tacka dole levo: " +
		tDoleLevo.getFormatedCoordinates() +" Tacka srednje desno: " + tSrednjeDesno.getFormatedCoordinates() +
		" Tacka gore desno: " + tGoreDesno.getFormatedCoordinates();
	}
	
	public String moveRight() {
		
		tDoleDesno.moveRight();
		tDoleLevo.moveRight();
		tSrednjeDesno.moveRight();
		tGoreDesno.moveRight();
		
		return "Tacka dole desno: "+ tDoleDesno.getFormatedCoordinates() + " Tacka dole levo: " +
		tDoleLevo.getFormatedCoordinates() +" Tacka srednje desno: " + tSrednjeDesno.getFormatedCoordinates() +
		" Tacka gore desno: " + tGoreDesno.getFormatedCoordinates();
	}
	
	public String moveBack() {
		
		tDoleDesno.moveBack();
		tDoleLevo.moveBack();
		tSrednjeDesno.moveBack();
		tGoreDesno.moveBack();
		
		return "Tacka dole desno: "+ tDoleDesno.getFormatedCoordinates() + " Tacka dole levo: " +
		tDoleLevo.getFormatedCoordinates() +" Tacka srednje desno: " + tSrednjeDesno.getFormatedCoordinates() +
		" Tacka gore desno: " + tGoreDesno.getFormatedCoordinates();
	}
	
	public String moveForth() {
		
		tDoleDesno.moveForth();
		tDoleLevo.moveForth();
		tSrednjeDesno.moveForth();
		tGoreDesno.moveForth();
		
		return "Tacka dole desno: "+ tDoleDesno.getFormatedCoordinates() + " Tacka dole levo: " +
		tDoleLevo.getFormatedCoordinates() +" Tacka srednje desno: " + tSrednjeDesno.getFormatedCoordinates() +
		" Tacka gore desno: " + tGoreDesno.getFormatedCoordinates();
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

	public FlySpace getFlySpace() {
		return flySpace;
	}

	public void setFlySpace(FlySpace flySpace) {
		this.flySpace = flySpace;
	}

	public int[] getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

	public Drone gettDoleLevo() {
		return tDoleLevo;
	}

	public void settDoleLevo(Drone tDoleLevo) {
		this.tDoleLevo = tDoleLevo;
	}

	public Drone gettDoleDesno() {
		return tDoleDesno;
	}

	public void settDoleDesno(Drone tDoleDesno) {
		this.tDoleDesno = tDoleDesno;
	}

	public Drone gettSrednjeDesno() {
		return tSrednjeDesno;
	}

	public void settSrednjeDesno(Drone tSrednjeDesno) {
		this.tSrednjeDesno = tSrednjeDesno;
	}

	public Drone gettGoreDesno() {
		return tGoreDesno;
	}

	public void settGoreDesno(Drone tGoreDesno) {
		this.tGoreDesno = tGoreDesno;
	}
	
	
	
	

}
