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

	@Override
	public String moveUp() {
		if(y >= 0 && y < 50){
			if((x >= 0 && x <= 10)||(x >= 40 && x<= 50)||(z >= 0 && z <= 10)||(z >= 40 && z <= 50))
				y++;
			else if(y < 10)
				y++;
			else if(y >= 40)
				y++;
		}
		return null;
	}

	@Override
	public String moveDown() {
		if(y > 0 && y <= 50){
			if((x >= 0 && x <= 10)||(x >= 40 && x <= 50)||(z >= 0 && z <= 10)||(z >= 40 && z <= 50))
				y--;
			else if(y <= 10)
				y--;
			else if(y > 40)
				y--;
		}
		return null;
	}

	@Override
	public String moveLeft() {
		if(x > 0 && x <= 50){
			if((y >= 0 && y <= 10)||(y >= 40 && y <= 50)||(z >= 0 && z <= 10)||(z >= 40 && z <= 50))
				x--;
			else if(x <= 10)
				x--;
			else if(y > 40)
				x--;
		}
		return null;
	}

	@Override
	public String moveRight() {
		if(x >= 0 && x < 50){
			if((y >= 0 && y <= 10)||(y >= 40 && y <= 50)||(z >= 0 && z <= 10)||(z >= 40 && z <= 50))
				x++;
			else if(x < 10)
				x++;
			else if(y >= 40)
				x++;
		}
		return null;
	}

	@Override
	public String moveBack() {
		if(z >= 0 && z < 50){
			if((x >= 0 && x <= 10)||(x >= 40 && x <= 50)||(y >= 0 && y <= 10)||(y >= 40 && y <= 50))
				z++;
			else if(x < 10)
				z++;
			else if(y >= 40)
				z++;
		}
		return null;
	}

	@Override
	public String moveForth() {
		if(z > 0 && z <= 50){
			if((x >= 0 && x <= 10)||(x >= 40 && x <= 50)||(y >= 0 && y <= 10)||(y >= 40 && y <= 50))
				z--;
			else if(x <= 10)
				z--;
			else if(y > 40)
				z--;
		}
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		return "Pozicija drona: "+Integer.toString(x)+", "+Integer.toString(y)+", "+Integer.toString(z);
	}

}