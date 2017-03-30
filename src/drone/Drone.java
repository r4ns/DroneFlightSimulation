package drone;

public class Drone implements StandardDrone{
	private int xTrenutno = 30;
	private int yTrenutno = 0;
	private int zTrenutno = 30;
	
	public Drone(int x, int y, int z){
		this.xTrenutno = x;
		this.yTrenutno = y; 
		this.zTrenutno = z;
		System.out.println("Dron se stvorio, " + this.getFormatedCoordinates());
	}
	

	
	
	public Drone(){
		
	}
	
	@Override
	public String getFormatedCoordinates() {
		if(this.goalReached()){
			System.out.println("DRON JE STIGAO NA CILJ!!!");
		}
		
		return "Drone position: x:"+this.xTrenutno + " y:" + this.yTrenutno + " z:" +this.zTrenutno;
	}
	
	@Override
	public String moveUp() {

		if ((yTrenutno >= 0 && yTrenutno < 10) && (xTrenutno >= 0 && xTrenutno < 50) && (zTrenutno >= 0 && zTrenutno < 50))
			yTrenutno++;
		else if ((yTrenutno >= 40 && yTrenutno < 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			yTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno < 50) && (xTrenutno >= 40 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			yTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno < 50) && (xTrenutno >= 0 && xTrenutno <= 10)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			yTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno < 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 40 && zTrenutno <= 50))
			yTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno < 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 10))
			yTrenutno++;

		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if ((yTrenutno > 0 && yTrenutno <= 10) && (xTrenutno >= 0 && xTrenutno <= 50) && (zTrenutno >= 0 && zTrenutno <= 50))
			yTrenutno--;
		else if ((yTrenutno > 40 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			yTrenutno--;
		else if ((yTrenutno > 0 && yTrenutno <= 50) && (xTrenutno >= 40 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			yTrenutno--;
		else if ((yTrenutno > 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 10)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			yTrenutno--;
		else if ((yTrenutno > 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 40 && zTrenutno <= 50))
			yTrenutno--;
		else if ((yTrenutno > 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 10))
			yTrenutno--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if ((yTrenutno >= 0 && yTrenutno <= 10) && (xTrenutno > 0 && xTrenutno <= 50) && (zTrenutno >= 0 && zTrenutno <= 50))
			xTrenutno--;
		else if ((yTrenutno >= 40 && yTrenutno <= 50) && (xTrenutno > 0 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			xTrenutno--;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno > 40 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			xTrenutno--;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno > 0 && xTrenutno <= 10)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			xTrenutno--;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno > 0 && xTrenutno <= 50)
				&& (zTrenutno >= 40 && zTrenutno <= 50))
			xTrenutno--;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno > 0 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno <= 10))
			xTrenutno--;

		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if ((yTrenutno >= 0 && yTrenutno <= 10) && (xTrenutno >= 0 && xTrenutno < 50) && (zTrenutno >= 0 && zTrenutno <= 50))
			xTrenutno++;
		else if ((yTrenutno >= 40 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno < 50)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			xTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 40 && xTrenutno < 50)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			xTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno < 10)
				&& (zTrenutno >= 0 && zTrenutno <= 50))
			xTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno < 50)
				&& (zTrenutno >= 40 && zTrenutno <= 50))
			xTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno < 50)
				&& (zTrenutno >= 0 && zTrenutno <= 10))
			xTrenutno++;

		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if ((yTrenutno >= 0 && yTrenutno <= 10) && (xTrenutno >= 0 && xTrenutno <= 50) && (zTrenutno >= 0 && zTrenutno < 50))
			zTrenutno++;
		else if ((yTrenutno >= 40 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno < 50))
			zTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 40 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno < 50))
			zTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 10)
				&& (zTrenutno>= 0 && zTrenutno < 50))
			zTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 40 && zTrenutno < 50))
			zTrenutno++;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno >= 0 && zTrenutno < 10))
			zTrenutno++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if ((yTrenutno >= 0 && yTrenutno <= 10) && (xTrenutno >= 0 && xTrenutno <= 50) && (zTrenutno > 0 && zTrenutno <= 50))
			zTrenutno--;
		else if ((yTrenutno >= 40 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno > 0 && zTrenutno <= 50))
			zTrenutno--;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 40 && xTrenutno <= 50)
				&& (zTrenutno > 0 && zTrenutno <= 50))
			zTrenutno--;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 10)
				&& (zTrenutno > 0 && zTrenutno <= 50))
			zTrenutno--;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno > 40 && zTrenutno <= 50))
			zTrenutno--;
		else if ((yTrenutno >= 0 && yTrenutno <= 50) && (xTrenutno >= 0 && xTrenutno <= 50)
				&& (zTrenutno > 0 && zTrenutno <= 10))
			zTrenutno--;

		return getFormatedCoordinates();
	}


	public int getX() {
		return xTrenutno;
	}

	public int getY() {
		return yTrenutno;
	}

	public int getZ() {
		return zTrenutno;
	}

	public void setX(int x) {
		this.xTrenutno = x;
	}

	public void setY(int y) {
		this.yTrenutno = y;
	}

	public void setZ(int z) {
		this.zTrenutno = z;
	}
	
	
	public boolean goalReached(){
		if(this.xTrenutno == 0 && this.yTrenutno == 30 && this.zTrenutno == 30){
			return true;
		}
		return false;
	}

}
