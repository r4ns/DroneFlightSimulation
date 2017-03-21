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
			System.out.println("Move up:");
			for(int i=0; i<10; i++)
			{
				y++;
				System.out.println("x=" + x + " y=" + y +  " z=" + z);
			}
		}
		else {
			System.out.println("Move up:");
			for(int i=0; i<30; i++)
			{
				y++;
				System.out.println("x=" + x + " y=" + y +  " z=" + z);
			}
		}
		
		return null;
		
	}

	@Override
	public String moveDown() {
		if (x==0 && y>=30 && y>=40  )
		{  
			System.out.println("Move down:");
			for(int i=30; i<40; i++)
			{
				y--;
				System.out.println("x=" + x + " y=" + y +  " z=" + z);
			}
		}
		
		return null;
	}

	@Override
	public String moveLeft() {
	
		if (x>=0 && x<=50 && y==40 && z==50 )
		{  
			System.out.println("Move left:");
			for(int i=0; i<50; i++)
			{
				x--;
				System.out.println("x=" + x + " y=" + y +  " z=" + z);
			}
		}
		
		return null;
	}

	@Override
	public String moveRight() {
		
		if (x>=30 && x<=50 && y==10 )
		{  
			System.out.println("Move right:");
			for(int i=30; i<50; i++)
			{
				x++;
				System.out.println("x=" + x + " y=" + y +  " z=" + z);
			}
		}
		return null;
	}

	@Override
	public String moveBack() {
		if (x==0 && y==40 && z>=30 && z<=50 )
		{  
			System.out.println("Move right:");
			for(int i=0; i<20; i++)
			{
				z--;
				System.out.println("x=" + x + " y=" + y +  " z=" + z);
			}
		}
		
		return null;
	}

	@Override
	public String moveForth() {
		if (z>=30 && z<=50 && x==50 && y==40 )
		{  
			System.out.println("Move forth:");
			for(int i=30; i<50; i++)
			{
				z++;
				System.out.println("x=" + x + " y=" + y +  " z=" + z);
			}
		}
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
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
