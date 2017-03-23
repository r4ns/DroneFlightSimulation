package drone;

public class Drone implements StandardDrone {
	
	private int x=30;
	private int y=0;
	private int z=30;
	private int [] outerBoundaries;
	private int distanceFromOuterBox=10;
	private int [] coordinates;
	private int step=1;

   public Drone ()
   {
	   
   }
   public Drone (int x, int y, int z)
   {
	   x=this.x;
	   y=this.y;
	   z=this.z;
   }
   public Drone (int [] boundaries, int [] coordinates)
   {
	   this.outerBoundaries=boundaries;
	  // distanceFromOuterBox=10;
	   this.coordinates=coordinates;
   }
   
	public String moveUp() {
		
		
		if (coordinates[0]==30 && coordinates[1]<10  )
		{  
			
				coordinates[1]++;
			
			
		}
		else {
			
			coordinates[1]++;
			
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
		
		return "Dron position:"  + "(" + Integer.toString(coordinates[0]) + "," + Integer.toString(coordinates[1])  +  "," + Integer.toString(coordinates[2]) + ")";
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
