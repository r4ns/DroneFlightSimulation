package drone;

public class Drone implements StandardDrone {
    //levo desno po x
	//gore dole po y
	//napred oduzimamo od z nazad dodajemo vrednosti na z
	
	private int x;
	private int y;
	private int z;
	private int[]outerBoundaries;
	private int[]coordinates;
	
	
	public Drone(int x, int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Drone(int []coordinates){
		this.x=coordinates[0];
		this.y=coordinates[1];
		this.z=coordinates[2];
	}
	
	@Override
	public String moveUp() {
		if(((x>=0&&x<=10)||(x>=40&&x<=50))&&(z>=0&&z<=50)&&(y>=0&&y<50)){
			 setY(y+1);
			 return getFormatedCoordinates();
		}else if(((y>=0&&y<10)||(y>=40&&y<50))&&((z>=0&&z<=50)&&(x>=0&&x<=50))){
			 setY(y+1);
			 return getFormatedCoordinates();
		}else if((x>=0&&x<=50)&&((z>=0&&z<=10)||(z>=40&&z<=50))&&(y>=0&&y<50)){
			 setY(y+1);
			 return getFormatedCoordinates();
		}else {
			 return getFormatedCoordinates();
		}
	}

	@Override
	public String moveDown() {
		if(((x>=0&&x<=10)||(x>=40&&x<=50))&&(z>=0&&z<=50)&&(y>0&&y<=50)){
 			setY(y-1);
 		    return getFormatedCoordinates();
 		}else if(((y>0&&y<=10)||(y>40&&y<=50))&&((z>=0&&z<=50)&&(x>=0&&x<=50))){
 			setY(y-1);
 			return getFormatedCoordinates();
 		}else if((x>=0&&x<=50)&&((z>=0&&z<=10)||(z>=40&&z<=50))&&(y>0&&y<=50)){
 			setY(y-1);
 			return getFormatedCoordinates();
 		}else {
 			return getFormatedCoordinates();
 		}
	}

	@Override
	public String moveLeft() {
		if(((y>=0&&y<=10)||(y>=40&&y<=50))&&(x>0&&x<=50)&&((z>=0&&z<=50))){
 			setX(x-1);
 			return getFormatedCoordinates();
 		}else if((y>=10&&y<=40)&&((x>0&&x<=10)||(x>40&&x<=50))&&z>=0&&z<=50){
 			setX(x-1);
 			return getFormatedCoordinates();
 		}else if(((z>=0&&z<=10)||(z>=40&&z<=50))&&(y>=10&&y<=40)&&(x>10&&x<=40)){
 			setX(x-1);
 			return getFormatedCoordinates();
 		}
 		else {
 			return getFormatedCoordinates();
 		}
	}

	@Override
	public String moveRight() {
		if(((y>=0&&y<=10)||(y>=40&&y<=50))&&(x>=0&&x<50)&&((z>=0&&z<=50))){
 			setX(x+1);
 			return getFormatedCoordinates();
 		}else if((y>=10&&y<=40)&&((x>=0&&x<10)||(x>=40&&x<50))&&(z>=0&&z<=50)){
 			setX(x+1);
 			return getFormatedCoordinates();
 		}else if(((z>=0&&z<=10)||(z>=40&&z<=50))&&(y>=10&&y<=40)&&(x>=10&&x<40)){
 			setX(x+1);
 			return getFormatedCoordinates();
 		}
 		else {
 			return getFormatedCoordinates();
 		}
	}

	@Override
	public String moveBack() {
		if(((z>=0&&z<10)||(z>=40&&y<50))&&(x>=0&&x<=50)&&((y>=0&&y<=50))){
 			setZ(z+1);
 			return getFormatedCoordinates();
 		}else if((z>=10&&z<40)&&((x>=0&&x<=10)||(x>=40&&x<=50))&&(y>=0&&y<50)){
 			setZ(z+1);
 			return getFormatedCoordinates();
 		}else if(((y>=0&&y<=10)||(y>=40&&y<=50))&&(z>=10&&z<40)&&(x>=10&&x<=40)){
 			setZ(z+1);
 			return getFormatedCoordinates();
 		}
 		else {
 			return getFormatedCoordinates();
 		}
	}

	@Override
	public String moveForth() {
		if(((z>0&&z<=10)||(z>40&&y<=50))&&(x>=0&&x<=50)&&((y>=0&&y<=50))){
 			setZ(z-1);
 			return getFormatedCoordinates();
 		}else if((z>10&&z<=40)&&((x>=0&&x<=10)||(x>=40&&x<=50))&&(y>=0&&y<=50)){
 			setZ(z-1);
 			return getFormatedCoordinates();
 		}else if(((y>=0&&y<=10)||(y>=40&&y<=50))&&(z>10&&z<=40)&&(x>=10&&x<=40)){
   		    setZ(z-1);
 			return getFormatedCoordinates();
 		}
 		else {
 			return getFormatedCoordinates();
 		}
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: ("+x + ", "+ y +", "+z+")";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	
	
	

}
