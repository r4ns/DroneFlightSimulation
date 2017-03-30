package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
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

	@Override
	public String moveUp() {
		if(y >= 0 && y < 50){
			if(x <= 10 || x >= 40 || z <= 10 || z >= 40)
				y++;
			else if(y < 10)
				y++;
			else if(y >= 40)
				y++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if(y > 0 && y <= 50){
			if(x <= 10 || x >= 40 || z <= 10 || z >= 40)
				y--;
			else if(y <= 10)
				y--;
			else if(y > 40)
				y--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(x > 0 && x <= 50){
			if(y <= 10 || y >= 40 || z <= 10 || z >= 40)
				x--;
			else if(x <= 10)
				x--;
			else if(x > 40)
				x--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if(x >= 0 && x < 50){
			if(y <= 10 || y >= 40 || z <= 10 || z >= 40)
				x++;
			else if(x < 10)
				x++;
			else if(y >= 40)
				x++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if(z >= 0 && z < 50){
			if(x <= 10 || x >= 40 || y <= 10 || y >= 40)
				z++;
			else if(x < 10)
				z++;
			else if(y >= 40)
				z++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(z > 0 && z <= 50){
			if(x <= 10 || x >= 40 || y <= 10 || y >= 40)
				z--;
			else if(x <= 10)
				z--;
			else if(y > 40)
				z--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "Pozicija drona: "+Integer.toString(x)+", "+Integer.toString(y)+", "+Integer.toString(z);
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