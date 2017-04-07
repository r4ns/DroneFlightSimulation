package space;

import drone.Drone;

public class DoubleCubeDron extends Drone {
	
	private Drone tacka1;
	private Drone tacka2;
	private Drone tacka3;
	private Drone tacka4;
	private Drone tacka5;
	private Drone tacka6;
	private Drone tacka7;
	private Drone tacka8;
	private Drone tacka9;
	private Drone tacka10;
	
	private Drone tacka11;
	private Drone tacka12;
	private Drone tacka13;
	private Drone tacka14;
	
	
	
	
	
	
	
	public DoubleCubeDron(int[] start,FlySpace fs){
		tacka1=new Drone(start,fs);
		start[0]++;
		start[1]++;
		start[2]++;
		tacka2=new Drone(start,fs);
		start[2]--;
		tacka3=new Drone(start,fs);
		start[1]++;
		start[0]++;
		start[2]++;
		tacka4=new Drone(start,fs);
		start[0]--;
		tacka5=new Drone(start,fs);
		start[2]--;
		tacka6=new Drone(start,fs);
		start[0]++;
		tacka7=new Drone(start,fs);
		start[1]--;
		tacka8=new Drone(start,fs);
		start[2]++;
		tacka9=new Drone(start,fs);
		start[0]--;
		start[0]--;
		tacka10=new Drone(start,fs);
		start[2]--;
		tacka11=new Drone(start,fs);
		start[1]--;
		start[2]++;
		tacka12=new Drone(start,fs);
		start[0]++;
		tacka13=new Drone(start,fs);
		start[2]--;
		tacka14=new Drone(start,fs);
		
		
		
		
		
		
	}
	public String getFormatedCoordinates(){
		//return "("+ tacka1.getFormatedCoordinates()+","+tacka2.getFormatedCoordinates()+","+tacka3.getFormatedCoordinates()+","+tacka4.getFormatedCoordinates()+")";
		return "("+"("+Integer.toString(getTacka1().getX())+","+Integer.toString(getTacka1().getY())+","+Integer.toString(getTacka1().getZ())+"),"
		+"("+Integer.toString(getTacka2().getX())+","+Integer.toString(getTacka2().getY())+","+Integer.toString(getTacka2().getZ())+"),"
		+"("+Integer.toString(getTacka3().getX())+","+Integer.toString(getTacka3().getY())+","+Integer.toString(getTacka3().getZ())+"),"
		+"("+Integer.toString(getTacka4().getX())+","+Integer.toString(getTacka4().getY())+","+Integer.toString(getTacka4().getZ())+")"+")";
	}

	

	



	public Drone getTacka1() {
		return tacka1;
	}

	public Drone getTacka2() {
		return tacka2;
	}

	public Drone getTacka3() {
		return tacka3;
	}

	public Drone getTacka4() {
		return tacka4;
	}

	public void setTacka1(Drone tacka1) {
		this.tacka1 = tacka1;
	}

	public void setTacka2(Drone tacka2) {
		this.tacka2 = tacka2;
	}

	public void setTacka3(Drone tacka3) {
		this.tacka3 = tacka3;
	}

	public void setTacka4(Drone tacka4) {
		this.tacka4 = tacka4;
	}
	public String moveUp() {
		
		if(tacka4.provera("moveUp")&&tacka3.provera("moveUp")&&tacka2.provera("moveUp")&&tacka1.provera("moveUp")&&tacka5.provera("moveUp")&&tacka6.provera("moveUp")&&tacka7.provera("moveUp")&&tacka8.provera("moveUp")&&tacka9.provera("moveUp")&&tacka10.provera("moveUp")&&tacka11.provera("moveUp")&&tacka12.provera("moveUp")&&tacka13.provera("moveUp")&&tacka14.provera("moveUp")){
			
				tacka4.setY(tacka4.getY()+1);
				tacka3.setY(tacka3.getY()+1);
				tacka2.setY(tacka2.getY()+1);
				tacka1.setY(tacka1.getY()+1);
				tacka5.setY(tacka5.getY()+1);
				tacka6.setY(tacka6.getY()+1);
				tacka7.setY(tacka7.getY()+1);
				tacka8.setY(tacka8.getY()+1);
				tacka9.setY(tacka9.getY()+1);
			tacka10.setY(tacka10.getY()+1);
			tacka11.setY(tacka11.getY()+1);
			tacka12.setY(tacka12.getY()+1);
			tacka13.setY(tacka11.getY()+1);
			tacka14.setY(tacka12.getY()+1);
			
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	public String moveDown() {
		if(tacka1.provera("moveDown")&&tacka4.provera("moveDown")&&tacka3.provera("moveDown")&&tacka2.provera("moveDown")&&tacka5.provera("moveDown")&&tacka6.provera("moveDown")&&tacka7.provera("moveDown")&&tacka8.provera("moveDown")&&tacka9.provera("moveDown")&&tacka10.provera("moveDown")&&tacka11.provera("moveDown")&&tacka12.provera("moveDown")&&tacka13.provera("moveDown")&&tacka2.provera("moveDown")){
			
			tacka4.setY(tacka4.getY()-1);
			tacka3.setY(tacka3.getY()-1);
			tacka2.setY(tacka2.getY()-1);
			tacka1.setY(tacka1.getY()-1);
			tacka5.setY(tacka5.getY()-1);
			tacka6.setY(tacka6.getY()-1);
			tacka7.setY(tacka7.getY()-1);
			tacka8.setY(tacka8.getY()-1);
			tacka9.setY(tacka9.getY()-1);
			tacka10.setY(tacka10.getY()-1);
			tacka11.setY(tacka11.getY()-1);
			tacka12.setY(tacka12.getY()-1);
			tacka13.setY(tacka11.getY()-1);
			tacka14.setY(tacka12.getY()-1);
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
	}
	public String moveRight() {
		if(tacka4.provera("moveRight")&&tacka3.provera("moveRight")&&tacka2.provera("moveRight")&&tacka1.provera("moveRight")
				&&tacka5.provera("moveRight")&&tacka6.provera("moveRight")&&tacka7.provera("moveRight")&&tacka8.provera("moveRight")&&tacka10.provera("moveRight")&&tacka11.provera("moveRight")&&tacka12.provera("moveRight")&&tacka13.provera("moveRight")&&tacka14.provera("moveRight")&&tacka9.provera("moveRight")){
			tacka4.setX(tacka4.getX()+1);
			tacka3.setX(tacka3.getX()+1);
			tacka2.setX(tacka2.getX()+1);
			tacka1.setX(tacka1.getX()+1);
			tacka5.setX(tacka4.getX()+1);
			tacka6.setX(tacka3.getX()+1);
			tacka7.setX(tacka2.getX()+1);
			tacka8.setX(tacka1.getX()+1);
			tacka9.setX(tacka4.getX()+1);
			tacka10.setX(tacka3.getX()+1);
			tacka11.setX(tacka2.getX()+1);
			tacka12.setX(tacka1.getX()+1);
			tacka13.setX(tacka4.getX()+1);
			tacka14.setX(tacka3.getX()+1);
			
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
	}
	public String moveLeft() {
		if(tacka4.provera("moveLeft")&&tacka3.provera("moveLeft")&&tacka2.provera("moveLeft")&&tacka1.provera("moveLeft")&&tacka5.provera("moveLeft")&&tacka6.provera("moveLeft")&&tacka7.provera("moveLeft")&&tacka8.provera("moveLeft")&&tacka9.provera("moveLeft")&&tacka10.provera("moveLeft")&&tacka11.provera("moveLeft")&&tacka12.provera("moveLeft")&&tacka13.provera("moveLeft")&&tacka14.provera("moveLeft")){
			tacka4.setX(tacka4.getX()-1);
			tacka3.setX(tacka3.getX()-1);
			tacka2.setX(tacka2.getX()-1);
			tacka1.setX(tacka1.getX()-1);
			tacka5.setX(tacka5.getX()-1);
			tacka6.setX(tacka6.getX()-1);
			tacka7.setX(tacka7.getX()-1);
			tacka8.setX(tacka8.getX()-1);
			tacka9.setX(tacka9.getX()-1);
			tacka10.setX(tacka10.getX()-1);
			tacka11.setX(tacka11.getX()-1);
			tacka12.setX(tacka12.getX()-1);
			tacka14.setX(tacka14.getX()-1);
			tacka13.setX(tacka13.getX()-1);
			
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
	}
	public String moveBack() {
		if(tacka4.provera("moveBack")&&tacka3.provera("moveBack")&&tacka2.provera("moveBack")&&tacka1.provera("moveBack")&&tacka5.provera("moveBack")&&tacka6.provera("moveBack")&&tacka7.provera("moveBack")&&tacka8.provera("moveBack")&&tacka9.provera("moveBack")&&tacka10.provera("moveBack")&&tacka11.provera("moveBack")&&tacka12.provera("moveBack")&&tacka13.provera("moveBack")&&tacka14.provera("moveBack")){
			tacka4.setZ(tacka4.getZ()-1);
			tacka3.setZ(tacka3.getZ()-1);
			tacka2.setZ(tacka2.getZ()-1);
			tacka1.setZ(tacka1.getZ()-1);
			tacka5.setZ(tacka5.getZ()-1);
			tacka6.setZ(tacka6.getZ()-1);
			tacka7.setZ(tacka7.getZ()-1);
			tacka8.setZ(tacka8.getZ()-1);
			tacka9.setZ(tacka9.getZ()-1);
			tacka10.setZ(tacka10.getZ()-1);
			tacka11.setZ(tacka11.getZ()-1);
			tacka12.setZ(tacka12.getZ()-1);
			tacka13.setZ(tacka13.getZ()-1);
			tacka14.setZ(tacka14.getZ()-1);
			
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
	}
	public String moveForth() {
		if(tacka4.provera("moveForth")&&tacka3.provera("moveForth")&&tacka2.provera("moveForth")&&tacka1.provera("moveForth")&&tacka5.provera("moveForth")&&tacka6.provera("moveForth")&&tacka7.provera("moveForth")&&tacka8.provera("moveForth")&&tacka9.provera("moveForth")&&tacka10.provera("moveForth")&&tacka11.provera("moveForth")&&tacka12.provera("moveForth")&&tacka13.provera("moveForth")&&tacka14.provera("moveForth")){
			tacka4.setZ(tacka4.getZ()+1);
			tacka3.setZ(tacka3.getZ()+1);
			tacka2.setZ(tacka2.getZ()+1);
			tacka1.setZ(tacka1.getZ()+1);
			tacka5.setZ(tacka5.getZ()+1);
			tacka6.setZ(tacka6.getZ()+1);
			tacka7.setZ(tacka7.getZ()+1);
			tacka8.setZ(tacka8.getZ()+1);
			tacka9.setZ(tacka9.getZ()+1);
			tacka10.setZ(tacka10.getZ()+1);
			tacka11.setZ(tacka11.getZ()+1);
			tacka12.setZ(tacka12.getZ()+1);
			tacka14.setZ(tacka14.getZ()+1);
			tacka13.setZ(tacka13.getZ()+1);
		
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	

}
