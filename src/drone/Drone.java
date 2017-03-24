package drone;

public class Drone implements StandardDrone {
	private int x=30;
	private int y=0;
	private int z=30;
	
	
	public String getFormatedCoordinates() {
		
		return "Drone position (" + x + ", " + y + ", " + z + ")";
	}
	public String moveUp(){
		if (x < 40 && x > 10 && z < 40 && z > 10 && y < 10){
			y++;
			return getFormatedCoordinates();
		} else if (x < 40 && x > 10 && z < 40 && z > 10 && y < 50 && y >=40){
			y++;
			return getFormatedCoordinates();
		} else if (((x >=40 || x <= 10) || (z >=40 || z <= 10))  && y < 50){
			y++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
	
	/*public String moveUp () {
		if ((x<=10 || x>=40) && (z<=10 || z>=40) && y<50) {
			y++;
			return getFormatedCoordinates();
		} else if (x>10 && x<40 && z>10 && z<40 && y<10) {
			y++;
			return getFormatedCoordinates();
		} else if (x>10 && x<40 && z>10 && z<40 && y>40 && y<50) {
			y++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}*/
	
	/*public String moveDown() {
		if((x<=10 || x>=40) && (z<=10 || z>=40) && y>0){
			y--;
			return getFormatedCoordinates();
		} else if (x>10 && x<40 && z>10 && z<40 && y>0 ){
			y--;
			return getFormatedCoordinates();
		} else if (x>10 && x<40 && z>10 && z<40 && y>40 && y<=50){
			y--;
			return getFormatedCoordinates();
		}
			else {
				return getFormatedCoordinates();
				}
			}*/
	public String moveDown(){
		if (x < 40 && x > 10 && z < 40 && z > 10 && y > 0){
			y--;
			return getFormatedCoordinates();
		} else if (x < 40 && x > 10 && z < 40 && z > 10 && y <= 50 && y > 40){
			y--;
			return getFormatedCoordinates();
		} else if (((x >=40 || x <= 10) || (z >=40 || z <= 10)) && y > 0){
			y--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
	
	public String moveLeft() {
		if(x>0 && (x<=10 || x>40) && y>10 && y<40 && z>10 && z<40 ){	
			x--;
			return getFormatedCoordinates();
		} else if(x>0 && (y<10 || y>40) && z>0 && z<50){
			x--;
			return getFormatedCoordinates();
		} else if(x>0 && y>0 && y<50 && (z<10 || z>40)){
			x--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
	}
	}
	public String moveRight(){
		if((x<10 || (x>40 && x<50)) && y>10 && y<40 && z>10 && z<40){
			x++;
			return getFormatedCoordinates();
		}else if (x<50 && (y<10 || y>40) && z>0 && z<50) {
			x++;
			return getFormatedCoordinates();
		} else if (x<50 && y>0 && y<50 && z<10 && z>40) {
			x++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}	
	}
	
	/*public String moveBack() {
		if((x<10 || x>40) && y>0 && y<50 && z>0 && z<50){
			z++;
			return getFormatedCoordinates();
		} else if (x<50 && x>0 && y<10 && y>40 && z<50 && z>0) {
			z++;
			return getFormatedCoordinates();
		} else if (x>10 && x<40 && y<40 && y>10 && z<10 && z>40 && z<50) {
			z++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}*/
	public String moveBack(){
		if (y < 40 && y > 10 && x < 40 && x > 10 && z < 10){
			z++;
			return getFormatedCoordinates();
		} else if (y < 40 && y > 10 && x < 40 && x > 10 && z >= 40 && z < 50) {
			z++;
			return getFormatedCoordinates();
		} else if (((y >= 40 || y <= 10) || (x >= 40 || x <= 10)) && z < 50) {
			z++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
	
	public String moveForth(){
		if(x<10 && x>40 && y>0 && y<50 && z<50 && z>0){
			z--;
			return getFormatedCoordinates();
		} else if (x<50 && x>0 && (y<10 || y>40) && z<50 && z>0) {
			z--;
			return getFormatedCoordinates();
		} else if (x>10 && x<40 && y<40 && y>10 && z>0 && z<10 && z>40 && z<50) {
			z++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
}
	
