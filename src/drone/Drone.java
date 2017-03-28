package drone;

public class Drone implements StandardDrone{
 
	private int x,y,z;
	
	public Drone(int x, int y, int z){
		
			this.x=x;
			this.y=y;
			this.z=z;
	}
		
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

	
	public String moveForth() {
		if((x>=0 && x<=10) || (x>=40 && x<=50))
		{
			if(z>0)
				z--;
			return getFormatedCoordinates();
		}
		else if((y>=0 && y<=10) || (y>=40 && y<=50))
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

	public String moveBack() {
		if((x>=0 && x<=10) || (x>=40 && x<=50))
		{
			if(z<50)
				z++;
			return getFormatedCoordinates();
		}
		else if((y>=0 && y<=10) || (y>=40 && y<=50))
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
		
		return "Drone position: (" +x+ ", "+y+", "+z+ ")";
		
		
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
