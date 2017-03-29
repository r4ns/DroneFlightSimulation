package drone;

public class Drone implements StandardDrone {
	int x = 30;
	int y = 0;
	int z = 30;
	
	public Drone() {
		
	}
	
	
	public Drone (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String moveUp() {
			if ((y < 10 || (y >= 40 & y < 50))) {
				y++;
				return "(" + x + ", " + y + ", " + z + ")";
			}
			else if (((x >= 40 & x <= 50) || (z >= 40 & z <=50) || (x >= 0 & x <= 10) || (z >= 0 & z <=10)) & (y < 50 & y >= 0))
			{
				y++;
				return "(" + x + ", " + y + ", " + z + ")";
			}
			else 
				return "(" + x + ", " + y + ", " + z + ")";
			}

	@Override
	public String moveDown() {
		if ((y > 0 & y <= 10) || (y > 40 & y <= 50)) {
			y--;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else if (((x >= 40 & x <= 50) || (z >= 40 & z <=50) || (x >= 0 & x <= 10) || (z >= 0 & z <=10)) & (y <= 50 & y > 0))
		{
			y--;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else 
			return "(" + x + ", " + y + ", " + z + ")";
	}

	@Override
	public String moveLeft() {
		if ((x > 0 & x <= 10) || (x > 40 & x <= 50)) {
			x--;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else if (((y >= 40 & y <= 50) || (z >= 40 & z <=50) || (y >= 0 & y <= 10) || (z >= 0 & z <=10)) & (x <= 50 & x > 0))
		{
			x--;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else 
			return "(" + x + ", " + y + ", " + z + ")";
	}

	@Override
	public String moveRight() {
		if (x < 10 || (x >= 40 & x < 50)) {
			x++;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else if (((y >= 40 & y <= 50) || (z >= 40 & z <=50) || (y >= 0 & y <= 10) || (z >= 0 & z <=10)) & (x < 50 & x >= 0))
		{
			x++;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else 
			return "(" + x + ", " + y + ", " + z + ")";
	}

	@Override
	public String moveForth() {
		if ((z > 0 & z <= 10) || (z > 40 & z <= 50)) {
			z--;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else if (((y >= 40 & y <= 50) || (x >= 40 & x <=50) || (y >= 0 & y <= 10) || (x >= 0 & x <=10)) & (z <= 50 & z > 0))
		{
			z--;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else 
			return "(" + x + ", " + y + ", " + z + ")";
	}

	@Override
	public String moveBack() {
		if (z < 10 || (z >= 40 & z < 50)) {
			z++;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else if (((x >= 40 & x <= 50) || (y >= 40 & y <=50) || (x >= 0 & x <= 10) || (y >= 0 & y <=10)) & (z < 50 & z >= 0))
		{
			z++;
			return "(" + x + ", " + y + ", " + z + ")";
		}
		else 
			return "(" + x + ", " + y + ", " + z + ")";
	}

	@Override
	public String getFormatedCoordinates() {
		return "(" + x + ", " + y + ", " + z + ")";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
