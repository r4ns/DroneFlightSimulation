package drone;

public class Drone {
	private int x = 30;
	private int y = 0;
	private int z = 30;
	
	public String getFormatedCoordinates (){
		return "Drone position: (" + x + ", " + y + ", " + z + ")"; 
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
	
	public String moveLeft(){
		if (y < 40 && y > 10 && z < 40 && z > 10 && x > 40){
			x--;
			return getFormatedCoordinates();
		} else if (y < 40 && y > 10 && z < 40 && z > 10 && x > 0 && x <= 10){
			x--;
			return getFormatedCoordinates();
		} else if (((y >= 40 || y <= 10) || (z >= 40 || z <= 10)) && x > 0) {
			x--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
	
	public String moveRight(){
		if (y < 40 && y > 10 && z < 40 && z > 10 && x >= 40 && x < 50){
			x++;
			return getFormatedCoordinates();
		} else if (y < 40 && y > 10 && z < 40 && z > 10 && x < 10){
			x++;
			return getFormatedCoordinates();
		} else if (((y >= 40 || y <= 10) || (z >= 40 || z <= 10)) && x < 50) {
			x++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
	
	public String moveForth(){
		if (y < 40 && y > 10 && x < 40 && x > 10 && z > 0 && z <= 10){
			z--;
			return getFormatedCoordinates();
		} else if (y < 40 && y > 10 && x < 40 && x > 10 && z > 40) {
			z--;
			return getFormatedCoordinates();
		} else if (((y >= 40 || y <= 10) || (x >= 40 || x <= 10)) && z > 0) {
			z--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}
	
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
}
