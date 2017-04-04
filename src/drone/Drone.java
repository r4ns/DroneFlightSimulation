package drone;

import space.FlySpace;

public class Drone implements StandardDrone{
	
	int x;
	int y;
	int z;
	
	public Drone(){
		x = 30;
		y = 0;
		z = 30;
	}
	
	public Drone(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Drone(int[] coordinates){
		this.x = coordinates[0];
		this.y = coordinates[1];
		this.z = coordinates[2];
	}
	
	FlySpace space = new FlySpace(10, 40, 0, 50);
	
	public String moveUp(){
		if ( space.kretanjeGore(x, y, z)) {
			y++;
		}
		
		return getFormatedCoordinates();
		
	}
	
	@Override
	public String moveDown() {
		if ( space.kretanjeDole(x, y, z)) {
			y--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if ( space.kretanjeDole(y, x, z)) {
			x--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if ( space.kretanjeGore(y, x, z)) {
			x++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if ( space.kretanjeDole(y, z, x)) {
			z--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if ( space.kretanjeGore(y, z, x)) {
			z++;
		}
		return getFormatedCoordinates();
	}
	
	@Override
	public String getFormatedCoordinates() {
		return "Drone position: (" + x + "," + y + "," + z + ")" ;
	}
	
	public String getCoordinates() {
		return "(" + x + "," + y + "," + z + ") " ;
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
