package drone;
import java.awt.SecondaryLoop;

import java.lang.*;
public class Drone implements StandardDrone {

	public int x;
	public int y;
	public int z;
	public boolean poruka = false;
	
	public Drone(int x,int y,int z){
		this.x =x;
		this.y =y;
		this.z =z;
	}
	
	
	
	@Override
	public String moveUp() {

		UP_granica();
		if(poruka==true){
			return "PROBIJANJE GRANICE";
		}
		poruka = false;
		return "("+ this.x + "," + this.y + "," + this.z + ")";

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



	@Override
	public String moveDown() {
		DOWN_granica();
		//if(poruka==true){
		//	return "PROBIJANJE GRANICE";
		//}
		//poruka = false;
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

	@Override
	public String moveLeft() {
		LEFT_granica();
		//if(poruka==true){
			//return "PROBIJANJE GRANICE";
		//}
		//poruka = false;		
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

	@Override
	public String moveRight() {
		RIGHT_granica();
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

	@Override
	public String moveBack() {
		
		BACK_granica();
		return "("+ this.x + "," + this.y + "," + this.z + ")";
		
	}

	@Override
	public String moveForth() {
		
		FORTH_granica();
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}

	@Override
	public String getFormatedCoordinates() {
		return "("+ this.x + "," + this.y + "," + this.z + ")";
	}
	
	
	
	public void UP_granica(){

		if(( x >= 10 && x <=40 ) && ( z >= 10 && z <= 40)){
			if(y < 10 && y >= 0 || y >= 40 && y < 50){
				y++;
			}
		}else if(y<50){
				y++;
		}else{
			poruka=true;
		}

	}
	
	public void DOWN_granica(){
		
		if(( x >= 10 && x <=40 ) && ( z >= 10 && z <= 40)){
			if(y <= 10 && y > 0 || y > 40 && y <= 50){
				y--;
			}
		}else if(y>0){
			y--;
		}else{
			poruka=true;
		}
	}
	
	public void LEFT_granica(){
		if(y>10 && y<40){
			if(z>10 && z<40){
				if((x<=10 && x>0) || (x<=50 && x>40)){
					x--;
				}
			}
			else if(x>0){
				x--;
			}
		}
		else if(x>0){
			x--;
		}
	}
	
	public void RIGHT_granica(){
		if(y>10 && y<40){
			if(z>10 && z<40){
				if((x<=10 && x>0) || (x<=50 && x>40)){
					x++;
				}
			}
			else if(x<50){
				x++;
			}
		}
		else if(x<50){
			x++;
		}
	}
	
	public void BACK_granica(){
		if((x<=10 && x>=0) || (x<=50 && x>=40)){
			if(z<50){
				z++;
			}
		}else if((x<=40 && x>=10)){
			if((y<=10 && y>=0) || ( y >= 40 && y <= 50)){
				if(z<50){
					z++;
				}
			}
		}
	}
	
	public void FORTH_granica(){

		if((x<=10 && x>=0) || (x<=50 && x>=40)){
			if(z>0){
				z--;
			}
		}else if((x<=40 && x>=10)){
			if((y<=10 && y>=0) || ( y >= 40 && y < 50)){
				if(z>0){
					z--;
				}
			}
		}
	}

}
