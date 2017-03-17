package drone;

public class Drone implements StandardDrone {
	private int x ;
	private int y ;
	private int z ;
	
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	



	public String moveUp() {
		if(y<10 && y<10 || y>40) {
			y=y+1;	
			return "pomerio se gore za 1 " + " vrednost y je = " + y ;
		}
		else 
			return "ne moze";	
	}


	public String moveDown() {
		if(y<50 || y>0 && y<40) {
			y=y-1;	
			return "pomerio se dole za 1 " + " vrednost y je = " + y ;
		}
		else 
			return "ne moze";
	}


	@Override
	public String moveLeft() {
		if(y>0 && y<10){
			x=x+1;
			return "dron je pomeren u levo za 1" + "vrednost x = " + x; 
		}
		
		else if(x>0 && x<10 || x>40 && x<50){
			x=x+1;
			return "dron je pomeren u levo za 1" + "vrednost x = " + x;
		}
		
		else 
			return "nije moguce pomeriti dron";
	}



	@Override
	public String moveRight() {
		if(y>0 && y<10){
			x=x-1;
			return "dron je pomeren u desno za 1" + "vrednost x = " + x; 
		}
		
		else if(x>0 && x<10 || x>40 && x<50){
			x=x-1;
			return "dron je pomeren u desno za 1" + "vrednost x = " + x;
		}
		
		else 
			return "nije moguce pomeriti dron";
	}




	@Override
	public String moveBack() {
		if(y>0 && y<10 && z<50 && z>0){
			z=z+1;
			return "pomeren je nazad, vrednost z = " + z;
		}
		else if (y>40 && y<50 && z<50 && z>0){
			
		}
		return null;
	}


	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
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
