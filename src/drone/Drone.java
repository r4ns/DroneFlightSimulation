package drone;

public class Drone implements StandardDrone{
	private int x=30,y,z=30;

	public String moveUp() {
		if (x>10 && x<40) {
			if (z>10 && z<40) {
				if((y<10 && y>=0)||(y<50 && y>=40)){
					y++;
				}
			}
			else if(y<50){
				y++;
			}
		}
		else if(y<50){
			y++;
		}
		return getFormatedCoordinates() ;
	}


	public String moveDown() {
		if(x>10 && x<40){
			if(z>10 && z<40){
				if((y<=10 && y>0) || (y<=50 && y>40)){
					y--;
				}
			}
			else if(y<50){
				y--;
			}
		}
		else if(y>0){
			y--;
		}
		return getFormatedCoordinates();
	}


	public String moveLeft() {
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
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if (y>10 && y<40) {
			if (z>10 && z<40) {
				if((x<10 && x>=0)||(x<50 && x>=40)){
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
		return getFormatedCoordinates() ;
	}

	@Override
	public String moveBack() {
		if(y>10 && y<40){
			if(x>10 && x<40){
				if((z<=10 && z>0) || (z<=50 && z>40)){
					z--;
				}
			}
			else if(z>0){
				z--;
			}
		}
		else if(z>0){
			z--;
		}
		return getFormatedCoordinates();
	}

	
	public String moveForth() {
		if (y>10 && y<40) {
			if (x>10 && x<40) {
				if((z<10 && z>=0)||(z<50 && z>=40)){
					z++;
				}
			}
			else if(z<50){
				z++;
			}
		}
		else if(z<50){
			z++;
		}
		return getFormatedCoordinates() ;
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: "+"("+x+","+y+","+z+")" ;
	}

}
