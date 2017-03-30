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
		upBorder();
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveDown(){
		downBorder();
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveLeft(){
		leftBorder();
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveRight(){
		rightBorder();
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveBack(){
		backBorder();
		return "Drone position(x:"+x+" y:"+y+" z:"+z+")";
	}
	public String moveForth(){
		forthBorder();
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
	
	public void upBorder(){
		if((x >= 10 && x<= 40) && (z >= 10 && z<= 40)){
			if(y <= 10 && y > 0 || y > 40 && y <= 50){
				y++;
			}
		}else if(y<=50){
			y++;
		}
	}
	
	public void downBorder(){
		if((x >= 10 && x<= 40) && (z >= 10 && z<= 40)){
			if(y <= 10 && y > 0 || y > 40 && y <= 50){
				y--;
			}
		}else if(y>0){
			y--;
		}
	}
	
	public void leftBorder(){
		if((z<=10 && z>=0)||(z<=50 && z>=40)){
			if(x>0)
				x--;
		}else if((z<=40 && z>=10)){
			if((y<=10 && y>=0)||(y>=40 && y<50)){
				if(x>0)
					x--;
			}
		}
		
	}
	
	public void rightBorder(){
		if((z<=10 && z>=0)||(z<=50 && z>=40)){
			if(x<50)
				x++;
		}else if((z<=40 && z>=10)){
			if((y<=10 && y>=0)||(y>=40 && y<50)){
				if(x<50)
					x++;
			}
		}
		
	}
	
	public void backBorder(){
		if((x<=10 && x>=0) || (x<=50 && x>=40)){
			if(z<50)
				z++;
		}else if((x<=40 && x>=10)){
			if((y<=10 && y>=0) || (y>=40 && y<=50)){
				if(z<50)
					z++;
			}
		}
	}
	
	public void forthBorder(){
		if((x<=10 && x>=0) || (x<=50 && x>=40)){
			if(z>0)
				z--;
		}else if((x<=40 && x>=10)){
			if((y<=10 && y>=0) || (y>=40 && y<=50)){
				if(z>0)
					z--;
			}
		}
	}

}
