package space;

import drone.Drone;

public class DoubleCubeDrone extends Drone{
	private Drone droneA1 ;
	private Drone droneB1 ;
	private Drone droneC1 ;
	private Drone droneD1 ;
	private Drone droneE1 ;
	private Drone droneF1 ;
	private Drone droneG1 ;
	private Drone droneH1 ;
	private Drone droneC2 ;
	private Drone droneD2 ;
	private Drone droneE2 ;
	private Drone droneF2 ;
	private Drone droneG2 ;
	private Drone droneH2 ;
	
	public DoubleCubeDrone(int [] start, FlyClass fly){
		droneA1 = new Drone(start,fly);
		start[0]++;
		start[1]++;
		start[2]++;
		droneB1 = new Drone(start,fly);
		start[2]--;
		droneC1= new Drone(start,fly);
		start[0]++;
		start[1]++;
		start[2]++;
		droneD1= new Drone(start,fly);
		start[0]--;
		droneE1= new Drone(start,fly);
		start[2]--;
		droneF1= new Drone(start,fly);
		start[0]++;
		droneG1= new Drone(start,fly);
		start[1]--;
		droneH1= new Drone(start,fly);
		start[2]++;
		droneC2= new Drone(start,fly);
		start[0]--;
		start[0]--;
		droneD2= new Drone(start,fly);
		start[2]--;
		droneE2= new Drone(start,fly);
		start[1]--;
		start[2]++;
		droneF2= new Drone(start,fly);
		start[0]++;
		droneG2= new Drone(start,fly);
		start[2]--;
		droneH2= new Drone(start,fly);
	}
	
	public String moveUp() {
		if(droneA1.check(1) && droneB1.check(1) && droneC1.check(1) && droneD1.check(1) && droneE1.check(1) && droneF1.check(1) && droneG1.check(1) && droneH1.check(1) && droneC2.check(1) && droneD2.check(1) && droneE2.check(1) && droneF2.check(1) && droneG2.check(1) && droneH2.check(1)){
			droneA1.setY(droneA1.getY()+1);
			droneB1.setY(droneB1.getY()+1);
			droneC1.setY(droneC1.getY()+1);
			droneD1.setY(droneD1.getY()+1);
			droneE1.setY(droneE1.getY()+1);
			droneF1.setY(droneF1.getY()+1);
			droneG1.setY(droneG1.getY()+1);
			droneH1.setY(droneH1.getY()+1);
			droneC2.setY(droneC2.getY()+1);
			droneD2.setY(droneD2.getY()+1);
			droneE2.setY(droneE2.getY()+1);
			droneF2.setY(droneF2.getY()+1);
			droneG2.setY(droneG2.getY()+1);
			droneH2.setY(droneH2.getY()+1);
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
	}
	
	public String moveDown() {
		if(droneA1.check(2) && droneB1.check(2) && droneC1.check(2) && droneD1.check(2) && droneE1.check(2) && droneF1.check(2) && droneG1.check(2) && droneH1.check(2) && droneC2.check(2) && droneD2.check(2) && droneE2.check(2) && droneF2.check(2) && droneG2.check(2) && droneH2.check(2)){
			droneA1.setY(droneA1.getY()-1);
			droneB1.setY(droneB1.getY()-1);
			droneC1.setY(droneC1.getY()-1);
			droneD1.setY(droneD1.getY()-1);
			droneE1.setY(droneE1.getY()-1);
			droneF1.setY(droneF1.getY()-1);
			droneG1.setY(droneG1.getY()-1);
			droneH1.setY(droneH1.getY()-1);
			droneC2.setY(droneC2.getY()-1);
			droneD2.setY(droneD2.getY()-1);
			droneE2.setY(droneE2.getY()-1);
			droneF2.setY(droneF2.getY()-1);
			droneG2.setY(droneG2.getY()-1);
			droneH2.setY(droneH2.getY()-1);
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
	}
	
	public String moveLeft() {
		if(droneA1.check(3) && droneB1.check(3) && droneC1.check(3) && droneD1.check(3) && droneE1.check(3) && droneF1.check(3) && droneG1.check(3) && droneH1.check(3) && droneC2.check(3) && droneD2.check(3) && droneE2.check(3) && droneF2.check(3) && droneG2.check(3) && droneH2.check(3)){
			droneA1.setX(droneA1.getX()-1);
			droneB1.setX(droneB1.getX()-1);
			droneC1.setX(droneC1.getX()-1);
			droneD1.setX(droneD1.getX()-1);
			droneE1.setX(droneE1.getX()-1);
			droneF1.setX(droneF1.getX()-1);
			droneG1.setX(droneG1.getX()-1);
			droneH1.setX(droneH1.getX()-1);
			droneC2.setX(droneC2.getX()-1);
			droneD2.setX(droneD2.getX()-1);
			droneE2.setX(droneE2.getX()-1);
			droneF2.setX(droneF2.getX()-1);
			droneG2.setX(droneG2.getX()-1);
			droneH2.setX(droneH2.getX()-1);
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
	}
	
	public String moveRight() {
		if(droneA1.check(4) && droneB1.check(4) && droneC1.check(4) && droneD1.check(4) && droneE1.check(4) && droneF1.check(4) && droneG1.check(4) && droneH1.check(4) && droneC2.check(4) && droneD2.check(4) && droneE2.check(4) && droneF2.check(4) && droneG2.check(4) && droneH2.check(4)){
			droneA1.setX(droneA1.getX()+1);
			droneB1.setX(droneB1.getX()+1);
			droneC1.setX(droneC1.getX()+1);
			droneD1.setX(droneD1.getX()+1);
			droneE1.setX(droneE1.getX()+1);
			droneF1.setX(droneF1.getX()+1);
			droneG1.setX(droneG1.getX()+1);
			droneH1.setX(droneH1.getX()+1);
			droneC2.setX(droneC2.getX()+1);
			droneD2.setX(droneD2.getX()+1);
			droneF2.setX(droneF2.getX()+1);
			droneE2.setX(droneE2.getX()+1);
			droneG2.setX(droneG2.getX()+1);
			droneH2.setX(droneH2.getX()+1);
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	public String moveForth() {
		if(droneA1.check(5) && droneB1.check(5) && droneC1.check(5) && droneD1.check(5) && droneE1.check(5) && droneF1.check(5) && droneG1.check(5) && droneH1.check(5) && droneC2.check(5) && droneD2.check(5) && droneE2.check(5) && droneF2.check(5) && droneG2.check(5) && droneH2.check(5)){
			droneA1.setZ(droneA1.getZ()-1);
			droneB1.setZ(droneB1.getZ()-1);
			droneC1.setZ(droneC1.getZ()-1);
			droneD1.setZ(droneD1.getZ()-1);
			droneE1.setZ(droneE1.getZ()-1);
			droneF1.setZ(droneF1.getZ()-1);
			droneG1.setZ(droneG1.getZ()-1);
			droneH1.setZ(droneH1.getZ()-1);
			droneC2.setZ(droneC2.getZ()-1);
			droneD2.setZ(droneD2.getZ()-1);
			droneF2.setZ(droneF2.getZ()-1);
			droneE2.setZ(droneE2.getZ()-1);
			droneG2.setZ(droneG2.getZ()-1);
			droneH2.setZ(droneH2.getZ()-1);
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	public String moveBack() {
		if(droneA1.check(5) && droneB1.check(5) && droneC1.check(5) && droneD1.check(5) && droneE1.check(5) && droneF1.check(5) && droneG1.check(5) && droneH1.check(5) && droneC2.check(5) && droneD2.check(5) && droneE2.check(5) && droneF2.check(5) && droneG2.check(5) && droneH2.check(5)){
			droneA1.setZ(droneA1.getZ()+1);
			droneB1.setZ(droneB1.getZ()+1);
			droneC1.setZ(droneC1.getZ()+1);
			droneD1.setZ(droneD1.getZ()+1);
			droneE1.setZ(droneE1.getZ()+1);
			droneF1.setZ(droneF1.getZ()+1);
			droneG1.setZ(droneG1.getZ()+1);
			droneH1.setZ(droneH1.getZ()+1);
			droneC2.setZ(droneC2.getZ()+1);
			droneD2.setZ(droneD2.getZ()+1);
			droneF2.setZ(droneF2.getZ()+1);
			droneE2.setZ(droneE2.getZ()+1);
			droneG2.setZ(droneG2.getZ()+1);
			droneH2.setZ(droneH2.getZ()+1);
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	public String getFormatedCoordinates() {
		return "Drone position: "+"("+Integer.toString(getDroneA1().getX())+","+Integer.toString(getDroneA1().getY())+","+Integer.toString(getDroneA1().getY())+")"
								 +"("+Integer.toString(getDroneB1().getX())+","+Integer.toString(getDroneB1().getY())+","+Integer.toString(getDroneB1().getY())+")"
								 +"("+Integer.toString(getDroneC1().getX())+","+Integer.toString(getDroneC1().getY())+","+Integer.toString(getDroneC1().getY())+")"
								 +"("+Integer.toString(getDroneD1().getX())+","+Integer.toString(getDroneD1().getY())+","+Integer.toString(getDroneD1().getY())+")";
	}
	

	public Drone getDroneA1() {
		return droneA1;
	}

	public void setDroneA1(Drone droneA1) {
		this.droneA1 = droneA1;
	}

	public Drone getDroneB1() {
		return droneB1;
	}

	public void setDroneB1(Drone droneB1) {
		this.droneB1 = droneB1;
	}

	public Drone getDroneC1() {
		return droneC1;
	}

	public void setDroneC1(Drone droneC1) {
		this.droneC1 = droneC1;
	}

	public Drone getDroneD1() {
		return droneD1;
	}

	public void setDroneD1(Drone droneD1) {
		this.droneD1 = droneD1;
	}

	public Drone getDroneE1() {
		return droneE1;
	}

	public void setDroneE1(Drone droneE1) {
		this.droneE1 = droneE1;
	}

	public Drone getDroneF1() {
		return droneF1;
	}

	public void setDroneF1(Drone droneF1) {
		this.droneF1 = droneF1;
	}

	public Drone getDroneG1() {
		return droneG1;
	}

	public void setDroneG1(Drone droneG1) {
		this.droneG1 = droneG1;
	}

	public Drone getDroneH1() {
		return droneH1;
	}

	public void setDroneH1(Drone droneH1) {
		this.droneH1 = droneH1;
	}

	public Drone getDroneC2() {
		return droneC2;
	}

	public void setDroneC2(Drone droneC2) {
		this.droneC2 = droneC2;
	}

	public Drone getDroneD2() {
		return droneD2;
	}

	public void setDroneD2(Drone droneD2) {
		this.droneD2 = droneD2;
	}

	public Drone getDroneE2() {
		return droneE2;
	}

	public void setDroneE2(Drone droneE2) {
		this.droneE2 = droneE2;
	}

	public Drone getDroneF2() {
		return droneF2;
	}

	public void setDroneF2(Drone droneF2) {
		this.droneF2 = droneF2;
	}

	public Drone getDroneG2() {
		return droneG2;
	}

	public void setDroneG2(Drone droneG2) {
		this.droneG2 = droneG2;
	}

	public Drone getDroneH2() {
		return droneH2;
	}

	public void setDroneH2(Drone droneH2) {
		this.droneH2 = droneH2;
	}
	
}
