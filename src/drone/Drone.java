package drone;

public class Drone implements StandardDrone{
private int x,y,z;
	
	public Drone(int x, int y, int z){
		if(x>=0 && x<=50)
			this.x=x;
		else 
			this.x=0;
		if(y>=0 && y<=50)
			this.y=y;
		else 
			this.y=0;
		if(z>=0 && z<=50)
			this.z=z;
		else 
			this.z=0;
	}
	@Override
	public String moveUp() {
		if((x>=0 && x<=10) || (x>=40 && x<=50))
		{
			if(y<50)
				y++;
			return getFormatedCoordinates();
		}
		else if((z>=0 && z<=10) || (z>=40 && z<=50))
		{
			if(y<50)
				y++;
			return getFormatedCoordinates();
			
		}
		else if((y>=0 && y<10) || (y>=40 && y<50))
		{
			y++;
			return getFormatedCoordinates();
		}
		else
		{
			return getFormatedCoordinates();
		}
		
		
		
	}

	@Override
	public String moveDown() {
		if((x>=0 && x<=10) || (x>=40 && x<=50))
		{
			if(y>0)
				y--;
			return getFormatedCoordinates();
		}
		else if((z>=0 && z<=10) || (z>=40 && z<=50))
		{
			if(y>0)
				y--;
			return getFormatedCoordinates();
			
		}
		else if((y>0 && y<=10) || (y>40 && y<=50))
		{
			y--;
			return getFormatedCoordinates();
		}
		else
		{
			return getFormatedCoordinates();
		}
		 
		
	}

	@Override
	public String moveLeft() {
		if((y>=0 && y<=10) || (y>=40 && y<=50))
		{
			if(x>0)
				x--;
			return getFormatedCoordinates();
		}
		else if( (z>=0 && z<=10) || (z>=40 && z<=50))
		{
			if(x>0)
				x--;
			return getFormatedCoordinates();
		}
		else if( (x>=0 && x<10) || (x>40 && x<=50))
		{
			if(x>0)
				x--;
			return getFormatedCoordinates();
		}
		else
		{
			return getFormatedCoordinates();
		}
		 
			
	}

	@Override
	public String moveRight() {
		if((y>=0 && y<=10) || (y>=40 && y<=50))
		{
			if(x<50)
				x++;
			return getFormatedCoordinates();
		}
		else if( (z>=0 && z<=10) || (z>=40 && z<=50))
		{
			if(x<50)
				x++;
			return getFormatedCoordinates();
		}
		else if( (x>=0 && x<10) || (x>=40 && x<50))
		{
			if(x<50)
				x++;
			return getFormatedCoordinates();
		}
		else
		{
			return getFormatedCoordinates();
		}
		
	}

	@Override
	public String moveForth() {
		if((x>=0 && x<=10) || (x>=40 && x<=50))
		{
			if(z>0)
				z--;
			return getFormatedCoordinates();
		}
		else if((y>=0 && y<=10) && (y>=40 && y<=50))
		{
			if(z>0)
				z--;
			return getFormatedCoordinates();
		}
		else if((z>0 && z<=10) || (z>40 && z<=50))
		{
			z--;
			return getFormatedCoordinates();
		}
		else
		{
			return getFormatedCoordinates();
					
		}
		
	}

	@Override
	public String moveBack() {
		if((x>=0 && x<=10) || (x>=40 && x<=50))
		{
			if(z<50)
				z++;
			return getFormatedCoordinates();
		}
		else if((y>=0 && y<=10) && (y>=40 && y<=50))
		{
			if(z<50)
				z++;
			return getFormatedCoordinates();
		}
		else if((z>=0 && z<10) || (z>=40 && z<50))
		{
			z++;
			return getFormatedCoordinates();
		}
		else
		{
			return getFormatedCoordinates();
					
		}
	 
	}
	public String getFormatedCoordinates() {
		
		System.out.println("Drone position is: (" +x+ ", "+y+", "+z+ ")");
		return null;
		
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
