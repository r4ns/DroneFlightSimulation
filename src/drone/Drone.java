package drone;

public class Drone implements StandardDrone {
	private int x = 30;
	private int y = 0;
	private int z = 30;
	
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
				y++;
		}
		else if(y < 50)
			y++;
		
		if(x == 0 && y == 30 && z == 30)
			return "Drone reach the final position: (0, 30, 30)";
		else
			return "Drone position: (" + x + "," + y + "," + z + ")" ;
	}

	@Override
	public String moveDown() {
		if(x > 10 && x < 40 && z > 10 && z < 40)
		{
			if((y > 0 && y <= 10) || (y > 40 && y <= 50))
				y--;
		}
		else if(y > 0)
			y--;
				
		return "Drone position: (" + x + "," + y + "," + z + ")";							
	}

	@Override
	public String moveLeft() {
		if(y > 10 && y < 40 && z > 10 && z < 40)
		{
			if((x > 0 && x <= 10) || (x > 40 && x <= 50))
				x--;
		}
		else if(x > 0)
			x--;
		
		return "Drone position: (" + x + "," + y + "," + z + ")";
	}

	@Override
	public String moveRight() {
		if(y > 10 && y < 40 && z > 10 && z < 40)
		{
			if((x >= 0 && x < 10) || (x >= 40 && x < 50))
				x++;
		}
		else if(x < 50)
			x++;
		
		return "Drone position: (" + x + "," + y + "," + z + ")";
	}

	@Override
	public String moveBack() {
		if(y > 10 && y < 40 && x > 10 && x < 40)
		{
			if((z >= 0 && z < 10) || (z >= 40 && z < 50))
				z++;
		}
		else if(z < 50)
			z++;
		
		return "Drone position: (" + x + "," + y + "," + z + ")";
	}

	@Override
	public String moveForth() {
		if(y > 10 && y < 40 && x > 10 && x < 40)
		{
			if((z > 0 && z <= 10) || (z > 40 && z <= 50))
				z--;
		}
		else if(z > 0)
			z--;
		
		return "Drone position: (" + x + "," + y + "," + z + ")";
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Drone position: (" + x + "," + y + "," + z + ")";
	}
	
}
