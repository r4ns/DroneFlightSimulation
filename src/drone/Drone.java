package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
	
	public Drone(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Drone()
	{
	}

	@Override
	public String moveUp() {
		if(x > 10 && x < 40 && z > 10 && z < 40)
		{
			if((y >= 0 && y < 10) || (y >= 40 && y < 50))
				setY(this.y + 1);
		}
		else if(y < 50)
			setY(this.y + 1);
		
		return isFinalPosition();
	}

	@Override
	public String moveDown() {
		if(x > 10 && x < 40 && z > 10 && z < 40)
		{
			if((y > 0 && y <= 10) || (y > 40 && y <= 50))
				setY(this.y - 1);
		}
		else if(y > 0)
			setY(this.y - 1);
				
		return isFinalPosition();						
	}

	@Override
	public String moveLeft() {
		if(y > 10 && y < 40 && z > 10 && z < 40)
		{
			if((x > 0 && x <= 10) || (x > 40 && x <= 50))
				setX(this.x - 1);
		}
		else if(x > 0)
			setX(this.x - 1);
		
		return isFinalPosition();
	}

	@Override
	public String moveRight() {
		if(y > 10 && y < 40 && z > 10 && z < 40)
		{
			if((x >= 0 && x < 10) || (x >= 40 && x < 50))
				setX(this.x + 1);
		}
		else if(x < 50)
			setX(this.x + 1);
		
		return isFinalPosition();
	}

	@Override
	public String moveBack() {
		if(y > 10 && y < 40 && x > 10 && x < 40)
		{
			if((z >= 0 && z < 10) || (z >= 40 && z < 50))
				setZ(this.z + 1);
		}
		else if(z < 50)
			setZ(this.z + 1);
		
		return isFinalPosition();
	}

	@Override
	public String moveForth() {
		if(y > 10 && y < 40 && x > 10 && x < 40)
		{
			if((z > 0 && z <= 10) || (z > 40 && z <= 50))
				setZ(this.z - 1);
		}
		else if(z > 0)
			setZ(this.z - 1);
		
		return isFinalPosition();
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}
	
	public String isFinalPosition() {
		if(x == 0 && y == 30 && z == 30)
			return "Drone position: (0,30,30)";
		else
			return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")" ;
	}
	
	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return this.z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
