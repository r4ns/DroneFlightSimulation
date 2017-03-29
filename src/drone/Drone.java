package drone;

public class Drone implements StandardDrone {
	
	int x;
	int y;
	int z;
	
	public Drone(int i, int j, int k) {
		
		x=i;
		y=j;
		z=k;
	}
	
	public Drone(){
		
	}

	@Override
	public String moveUp() {
		
		if(x > 10 && x < 40 && z > 10 && z < 40)
		{
			if(y >= 0 && y < 10 || y >= 40 && y < 50)
			{
				y++;
			}
			
		}
		else if (y <50)
			y++;
		
		return "Pozicija drona: (" + x + ","+ y + "," + z + ")";

	}

	@Override
	public String moveDown() {
		
		if(x > 10 && x < 40 && z > 10 && z < 40)
		{
			if(y <= 50 && y > 40 || y <= 10 && y > 0)
			{
				y--;
			}
			
		}
		else if (y > 0)
			y--;
		
		return "Pozicija drona: (" + x + ","+ y + "," + z + ")";

	}

	@Override
	public String moveLeft() {
		
		if(y > 10 && y < 40 && z > 10 && z < 40)
		{
			if(x <= 50 && x > 40 || x <= 10 && x > 0)
			{
				x--;
			}
			
		}
		else if (x > 0)
			x--;
		
		return "Pozicija drona: (" + x + ","+ y + "," + z + ")";

	}

	@Override
	public String moveRight() {
		
		if(y > 10 && y < 40 && z > 10 && z < 40)
		{
			if(x >= 0 && x < 10 || x >= 40 && x < 50)
			{
				x++;
			}
			
		}
		else if (x < 50)
			x++;
		
		return "Pozicija drona: (" + x + ","+ y + "," + z + ")";
	}

	@Override
	public String moveBack() {
		
		if(y > 10 && y < 40 && x > 10 && x < 40)
		{
			if(z >= 0 && z < 10 || z >= 40 && z < 50)
			{
				z++;
			}
			
		}
		else if (z < 50)
			z++;
		
		return "Pozicija drona: (" + x + ","+ y + "," + z + ")";

	}

	@Override
	public String moveForth() {
	
		if(y > 10 && y < 40 && x > 10 && x < 40)
		{
			if(z <= 50 && z > 40 || z <= 10 && z > 0)
			{
				z--;
			}
			
		}
		else if (x > 0)
			z--;
		
		return "Pozicija drona: (" + x + ","+ y + "," + z + ")";
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Pozicija drona: (" + x + ","+ y + "," + z + ")";
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
