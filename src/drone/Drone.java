package drone;

import javax.swing.BoundedRangeModel;

public class Drone implements StandardDrone{
	private int x=30;
	private int z=30;
	private int y = 0;
	
	private int granicaX=50;
	private int granicaY=50;
	private int granicaZ=50;
	
	private int distanceFromOuter=10;
	
	private int[] pocetneKoordinate={30,0,30};
	
	public Drone (int [] start, int [] boundaries, int distanceFromBoundaris){
		this.pocetneKoordinate=start;
		this.granicaX=boundaries[0];
		this.granicaY=boundaries[1];
		this.granicaZ=boundaries[2];
		this.distanceFromOuter=distanceFromBoundaris;
	}
	public Drone(){
		
	}
	
	public boolean check(int kojeKretanje){
		if (kojeKretanje==1) {
			if (x>distanceFromOuter && x<granicaX-distanceFromOuter) {
				if (z>distanceFromOuter && z<granicaZ-distanceFromOuter) {
					if((y<distanceFromOuter && y>=0)||(y<granicaY && y>granicaY-distanceFromOuter)){
						return true;
					}
				}
				else if(y<granicaY){
					return true;
				}
			}
			else if(y<granicaY){
				return true;
			}
			else{
				return false;
			}
			
		}else if (kojeKretanje==2) {
			if(x>distanceFromOuter && x<granicaX-distanceFromOuter){
				if(z>distanceFromOuter && z<granicaZ-distanceFromOuter){
					if((y<=distanceFromOuter && y>0) || (y<=granicaY && y>granicaY-distanceFromOuter)){
						return true;
					}
				}
				else if(y>0){
					return true;
				}
			}
			else if(y>0){
				return true;
			}
			else{
				return false;
			}
		}else if (kojeKretanje==3) {
			if(y>distanceFromOuter && y<granicaY-distanceFromOuter){
				if(z>distanceFromOuter && z<granicaZ-distanceFromOuter){
					if((x<=distanceFromOuter && x>0) || (x<=granicaX && x>granicaX-distanceFromOuter)){
						return true;
					}
				}
				else if(x>0){
					return true;
				}
			}
			else if(x>0){
				return true;
			}
			else{
				return false;
			}
		}else if (kojeKretanje==4) {
			if (y>distanceFromOuter && y<granicaY-distanceFromOuter) {
				if (z>distanceFromOuter && z<granicaY-distanceFromOuter) {
					if((x<distanceFromOuter && x>=0)||(x<granicaX && x>=granicaX-distanceFromOuter)){
						return true;
					}
				}
				else if(x<granicaX){
					return true;
				}
			}
			else if(x<granicaX){
				return true;
			}
			else{
				return false;
			}
		}else if (kojeKretanje==5) {
			if(y>distanceFromOuter && y<granicaY-distanceFromOuter){
				if(x>distanceFromOuter && x<granicaX-distanceFromOuter){
					if((z<=distanceFromOuter && z>0) || (z<=granicaZ && z>granicaZ-distanceFromOuter)){
						return true;
					}
				}
				else if(z>0){
					return true;
				}
			}
			else if(z>0){
				return true;
			}
			else{
				return false;
			}
		}else if(kojeKretanje==6){
			if (y>distanceFromOuter && y<granicaY-distanceFromOuter) {
				if (x>distanceFromOuter && x<granicaX-distanceFromOuter) {
					if((z<distanceFromOuter && z>=0)||(z<granicaZ && z>=granicaZ-distanceFromOuter)){
						return true;
					}
				}
				else if(z<granicaZ){
					return true;
				}
			}
			else if(z<granicaZ){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}

	public String moveUp() {
		if(check(1)){
			y++;
			return getFormatedCoordinates() ;
		}
		else{
			return getFormatedCoordinates() ;
		}
		
	}

	public String moveDown() {
		if(check(2)){
			y--;
			return getFormatedCoordinates() ;
		}
		else{
			return getFormatedCoordinates();
		}
		
	}


	public String moveLeft() {
		if(check(3)){
			x--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
	}

	public String moveRight() {
		if(check(4)){
			x++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveForth() {
		if(check(5)){
			z--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	
	public String moveBack() {
		
		return getFormatedCoordinates() ;
	}


	public String getFormatedCoordinates() {
		return "Drone position: "+"("+x+","+y+","+z+")" ;
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
