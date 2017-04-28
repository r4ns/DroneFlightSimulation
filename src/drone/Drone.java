package drone;

public class Drone implements StandardDrone {
	private int x = 30;
	private int y  = 0;
	private int z  = 30;
	
	
	



	public String moveUp() {
		if(((x>=0 && x<=10) || (x>=40 && x<=50))  && ((z>=0 && z<=50) && (y>=0 && y<50)) ) {
			y++;
			return getFormatedCoordinates();
		} else if((x>=10&& x<=40) && (z>=10 && z<=40) && ((y>=0 && y<10) || (y>=40 && y<50))){
			y++;
			return getFormatedCoordinates();
		} else if((x>=10&& x<=40) && (y>=0 && y<50) && ((z>=0 && z<10) || (z>=40 && z<50)) ) {
			y++;
			return getFormatedCoordinates();
			
		} else
			return getFormatedCoordinates() + "dron hits the edge";
		
		
		
			
	}


	public String moveDown() {
		if(((x>=0 && x<=10) || (x>=40 && x<=50))  && ((z>=0 && z<=50) && (y>0 && y<=50))) {
			y--;
			return getFormatedCoordinates();
		} else if((x>=10&& x<=40) && (z>=10&& z<=40) && ((y>0 && y<=10) || (y>40 && y<=50))){
			y--;
			return getFormatedCoordinates();
		} else if ((x>=10 && x<=40) && (y>10 && y<=40) && ((z>=0 && z<10) || (z>=40 && z<50))) {
			y--;
			return getFormatedCoordinates();
			
		} else
			return getFormatedCoordinates() + "dron hits the edge";
		
		
	}


	@Override
	public String moveLeft() {
		if(((y>=0 && y<=10) || (y>=40 && y<=50)) && (x>0 && x<=50) && (z>=0 && z<=50)){
			x--;
			return getFormatedCoordinates();
		}
		else if ((y>=10 && y<=40) && ((z>=0 && z<=10) || (z>=40 && z<=50)) && (x>0 && x<=50) ){
			x--;
			return getFormatedCoordinates();
		} else if((y>=10 && y<=40) && (z>=10 && z<=40) && ((x>0 && x<=10) || (x>40 && x<=50) )){
			x--;
			return getFormatedCoordinates();
			
		} else{
			return getFormatedCoordinates() + "dron hits the edge"; }
	}



	@Override
	public String moveRight() {
		if(((y>=0 && y<=10) || (y>=40 && y<=50)) && (x>=0 && x<50) && (z>=0 && z<=50)){
			x++;
			return getFormatedCoordinates();
		}
		else if ((y>=10 && y<=40) && ((z>=0 && z<=10) || (z>=40 && z<=50)) && (x>=0 && x<50) ){
			x++;
			return getFormatedCoordinates();
		} else if((y>=10 && y<=40) && (z>=0 && z<=50) && ((x>=0 && x<10) || (x>=40 && x<50) )){
			x++;
			return getFormatedCoordinates();
			
		} else{
			return getFormatedCoordinates() + "dron hits the edge"; }
	}
	




	@Override
	public String moveBack() {
		if((z>=0 && z<10) || (z>=40 && z<50) && (x>=0 && x<=50) && (y>=0 && y<=50)) {
			z++;
			return getFormatedCoordinates();
		} else if((z>=10 && z<40) && ((x>= 0 && x<=10) || (x>= 40 && x<=50) ) && (y>=0 && y<=50) ){
			z++;
			return getFormatedCoordinates();
		} else if ((z>=10 && z<40) && ((y>= 0 && y<=10) || (y>= 40 && y<=50) ) && (x>=0 && x<=50) ) {
			z++;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + "dron hits the edge";
	}


	@Override
	public String moveForth() {
		
		if((z>0 && z<=10) || (z>40 && z<=50) && (x>=0 && x<=50) && (y>=0 && y<=50)) {
			z--;
			return getFormatedCoordinates();
		} else if((z>10 && z<=40) && ((x>= 0 && x<=10) || (x>= 40 && x<=50) ) && (y>=0 && y<=50) ){
			z--;
			return getFormatedCoordinates();
		} else if ((z>10 && z<=40) && ((y>= 0 && y<=10) || (y>= 40 && y<=50) ) && (x>=0 && x<=50) ) {
			z--;
			return getFormatedCoordinates();
		} else
			return getFormatedCoordinates() + "dron hits the edge";
		
		
	}



	@Override
	public String getFormatedCoordinates() {
		
		return "Drone position: (" + x + "," + y + "," + z + ")"   ;
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
