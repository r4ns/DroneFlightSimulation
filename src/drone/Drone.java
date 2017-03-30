package drone;

public class Drone implements StandardDrone{
	
	private int x;
	private int y;
	private int z;
	
	public Drone (int x, int y, int z)
	{
		setX(x);
		setY(y);
		setZ(z);
	}
	
	
	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		
		
		if ((x <= 10 || x >= 40) || (z <= 10 || z >= 40))  // proveravamo da li je dron u "provaliji"
		{
			if(y < 50)
			{
				setY(getY()+1);
				
				if(y == 50)
				{
					System.out.println("Drone hits the upper border of the outer cube.");
				}
			}
		}		
		else  // ili je ispod ili iznad unutrasnje kocke
		{
			if(y < 10)  // ako je ispod
			{
				setY(getY()+1);
				if(y == 10)
				{
					System.out.println("Drone hits the lower border of the inner cube.");
				}
				
			}
			else if (y >=40 && y < 50)  // ako je iznad
			{
				setY(getY()+1);
				if(y == 50)
				{
					System.out.println("Drone hits the upper border of the outer cube.");
				}
			}
		}		
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		
		
		if ((x <= 10 || x >= 40) || (z <= 10 || z >= 40))  // proveravamo da li je dron u "provaliji"
		{
			if(y > 0)
			{
				setY(getY()-1);
				if(y == 0)
				{
					System.out.println("Drone hits the lower border of the outer cube.");
				}
			}
		}
		else  // ili je ispod ili iznad unutrasnje kocke
		{
			if(y > 40)  // ako je iznad
			{
				setY(getY()-1);
				if(y == 40)
				{
					System.out.println("Drone hits the upper border of the inner cube.");
				}
				
			}
			else if (y <= 10 && y > 0)  // ako je ispod
			{
				setY(getY()-1);
				if(y == 0)
				{
					System.out.println("Drone hits the lower border of the outer cube.");
				}
			}
		}		
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		
		if ((z <= 10 || z >= 40) || (y <= 10 || y >= 40))  //  proveravamo da li je dron u "provaliji"
		{
			if (x > 0)
			{
				setX(getX() - 1);
				if(x == 0)
				{
					System.out.println("Drone hits the left border of the outer cube.");
				}
			}
		}
		else  // ili je levo ili desno od unutrasnje kocke
		{
			if (x > 40) // ako je desno
			{
				setX(getX()-1);
				if(x == 40)
				{
					System.out.println("Drone hits the right border of the inner cube.");
				}
			}
			else if (x > 0 && x <= 10) // ako je levo
			{
				setX(getX()-1);
				if(x == 0)
				{
					System.out.println("Drone hits the left border of the outer cube.");
				}
			}
		}		
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		
		if ((z <= 10 || z >= 40) || (y <= 10 || y >= 40))  //  proveravamo da li je dron u "provaliji"
		{
			if (x < 50)
			{
				setX(getX() + 1);
				if(x == 50)
				{
					System.out.println("Drone hits the right border of the outer cube.");
				}
			}
		}
		else  // ili je levo ili desno od unutrasnje kocke
		{
			if (x < 10) // ako je levo
			{
				setX(getX()+1);
				if(x == 10)
				{
					System.out.println("Drone hits the left border of the inner cube.");
				}
			}
			else if (x < 50 && x >= 40) // ako je desno
			{
				setX(getX()+1);
				if(x == 50)
				{
					System.out.println("Drone hits the right border of the outer cube.");
				}
			}
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		
		if ((x <= 10 || x >= 40) || (y <= 10 || y >= 40))  //  proveravamo da li je dron u "provaliji"
		{
			if (z < 50)
			{
				setZ(getZ() + 1);
				if(z == 50)
				{
					System.out.println("Drone hits the closer border of the outer cube.");
				}
			}
		}
		else  // ili je ispred ili iza od unutrasnje kocke
		{
			if (z < 10) // ako je iza
			{
				setZ(getZ()+1);
				if(z == 10)
				{
					System.out.println("Drone hits the farther border of the inner cube.");
				}
			}
			else if (z < 50 && z >= 40) // ako je ispred
			{
				setZ(getZ()+1);
				if(z == 50)
				{
					System.out.println("Drone hits the closer border of the outer cube.");
				}
			}
		}
		
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		
		if ((x <= 10 || x >= 40) || (y <= 10 || y >= 40))  //  proveravamo da li je dron u "provaliji"
		{
			if (z > 0)
			{
				setZ(getZ() - 1);
				if(z == 0)
				{
					System.out.println("Drone hits the farther border of the outer cube.");
				}
			}
		}
		else  // ili je ispred ili iza od unutrasnje kocke
		{
			if (z > 40) // ako je ispred
			{
				setZ(getZ()-1);
				if(z == 40)
				{
					System.out.println("Drone hits the closer border of the inner cube.");
				}
			}
			else if (z > 0 && z <= 10) // ako je iza
			{
				setZ(getZ()-1);
				if(z == 0)
				{
					System.out.println("Drone hits the farther border of the outer cube.");
				}
			}
		}
		
		
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}


	/////////////////////////////////////////////////GETTERS AND SETTERS///////////////////////////////////////////////////
	
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
