package space;

public class DroneCube {

	private int x = 30;
	private int y = 0;
	private int z = 30;
	
	private int x1 = x + 2;
	private int y1 = y + 2;
	private int z1 = z - 1;
	
	private int[] leftDown = {30, 0 , 30};
	
	
	
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Drone position: (" + x + ", " + y + ", " + z + ") \n "; 
	}
	
	
	public String moveUp() {
		// TODO Auto-generated method stub
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

	
	public String moveDown() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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

	
	public String moveRight() {
		// TODO Auto-generated method stub
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

	
	public String moveBack() {
		// TODO Auto-generated method stub
		if (y < 40 && y > 10 && x < 40 && x > 10 && z > 0 && z <= 10){
			 z++;
			 return getFormatedCoordinates();
		} else if (y < 40 && y > 10 && x < 40 && x > 10 && z > 40) {
			 z++;
			 return getFormatedCoordinates();
			 } else if (((y >= 40 || y <= 10) || (x >= 40 || x <= 10)) && z > 0) {
			 z++;
			 return getFormatedCoordinates();
		 } else {
			 return getFormatedCoordinates();
			 }
	}

	
	public String moveForth() {
		// TODO Auto-generated method stub
		if (y < 40 && y > 10 && x < 40 && x > 10 && z < 10){
			 z--;
			 return getFormatedCoordinates();
		} else if (y < 40 && y > 10 && x < 40 && x > 10 && z >= 40 && z < 50) {
			 z--;
			 return getFormatedCoordinates();
		} else if (((y >= 40 || y <= 10) || (x >= 40 || x <= 10)) && z < 50) {
			 z--;
			 return getFormatedCoordinates();
		} else {
			 return getFormatedCoordinates();
			 }
	}
	
}
