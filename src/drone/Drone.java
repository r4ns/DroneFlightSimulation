package drone;

public class Drone implements StandardDrone {
	private int x = 30;
	private int y = 0;
	private int z = 30;


public String moveUp(){
	if (x<40 && x>10 && z<40 && z >10 && y<10 && y<40){
		y++;
		return getFormatedCoordinates();
	}

	else if (((x<=10 || x>=40) || (z<=10 || z>=40))  && y<50){
		y++;
		return getFormatedCoordinates();
	}
	else {
		return getFormatedCoordinates();
	}
}

public String moveDown(){
	if(x>10 && x<40 && y>40 && y<50 && z>10 && z<40){
		y--;
		return getFormatedCoordinates();
	}

	 else if (((x<=10 || x>=40) || (z<=10 || z>=40)) && y>0){
		y--;
		return getFormatedCoordinates();
	} 
	else {
		return getFormatedCoordinates();
	}
}
public String moveLeft(){
	if((x>0 && x<10 || x>40) && y>10 && y<40 && z>10 && z<40){
		x--;
		return getFormatedCoordinates();
	}
	else if (((y<=10 || y>=40) || (z<=10 || z>=40)) && x>0){
		x--;
		return getFormatedCoordinates();
	}
	else {
		return getFormatedCoordinates();
	}
}

public String moveRight(){
	if((x>10 && x<40 || x<10) && y>10 && y<40 && z>=40 && z<50){
		x++;
		return getFormatedCoordinates();
	}
	else if (((y<=10 || y>=40) || (z<=10 || z>=40)) && x<50){
		x++;
		return getFormatedCoordinates();
	}
	else {
		return getFormatedCoordinates();
	}
}

public String moveBack(){
	if(x>10 && x<40 && y>10 && y<40 && z>0 && z<10){
		z++;
		return getFormatedCoordinates();
	}
	else if (((y<=10 || y>=40) || (x<=10 || x>=40)) && z>0){
		z++;
		return getFormatedCoordinates();
	}
	else {
		return getFormatedCoordinates();
	}

}
public String moveForth(){
	if(x>10 && x<40 && y>10 && y<40 &&  z>=40 && z>50){
		z--;
		return getFormatedCoordinates();
	}
	else if (((y<=10 || y>=40) || (x<= 10 || x>= 40)) && z<50){
		z--;
		return getFormatedCoordinates();
	}
	else {
		return getFormatedCoordinates();
	}
}


public String getFormatedCoordinates() {
	return "Drone position: (" 
			+ Integer.toString(x) + ","
			+ Integer.toString(y) + ","
			+ Integer.toString(z) + ")";
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