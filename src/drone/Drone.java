package drone;

public class Drone implements StandardDrone {
	
	private int x=30;
	private int y=0;
	private int z=30;

   public Drone ()
   {
	   
   }
   public Drone (int x, int y, int z)
   {
	   x=this.x;
	   y=this.y;
	   z=this.z;
   }
   
	public String moveUp() {
		
		
		if (x==30 && y<10  )
		{  
			
				y++;
			
			
		}
		else {
			
				y++;
			
		}
		
		return getFormatedCoordinates();
		
	}

	@Override
	public String moveDown() {
		if (x==0 && y>=30 && y<=40 )
		{  
				y--;
			
		}
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
	
		if (x>=0 && x<=50 && y==40 && z==50 )
		{  
			
				x--;
			
		}
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		
		if (x>=30 && x<=50 && y==10 )
		{  
			
				x++;
				
			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if (x==0 && y==40 && z>=30 && z<=50 )
		{  
			
				z--;
			
		}
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if (z>=30 && z<=50 && x==50 && y==40 )
		{  
				z++;
			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		
		return "Dron:"  + "( " + x + " , " + y +  " , " + z + " )";
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
