package drone;

public class Drone implements StandardDrone {

	private int x;
	private int y;
	private int z;
	private int [] boundaries;
	

public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

public Drone(int x, int y, int z)
{
	this.x=x;
	this.y=y;
	this.z=z;
}


	

@Override
public String moveUp() {
	//desna
	if (y>=0 && y<50 && z>=0 && z<=50  && x>=40 && x<=50 )
	{
		y++;
		return getFormatedCoordinates();
		
	}
	//leva
	else if(y>=0 && y<50 && z>=0 && z<=50 && x>=0 && x<=10)
	{
		y++;
		return getFormatedCoordinates();
	}
	//prednja
	else if(y>=0 && y<50 && z>=40 && z<=50 && x>=0 && x<=50)
	{
		y++;
		return getFormatedCoordinates();
	}
	//zadnja
	else if(y>=0 && y<=50 && z>=0 && z<=10 && x>=0 && x<=50)
	{
		y++;
		return getFormatedCoordinates();
		
	}
	//gornja
	else if(y>=40 && y<50 && z>=0 && z<=50 && x>=0 && x<=50)
	{
		y++;
		return getFormatedCoordinates();
	}
	// donja
	else if(y>=0 && y<10 && z>=0 && z<=50 && x>=0 && x<=50)
	{
		y++;
		return getFormatedCoordinates();
	}
	else 
	
		return getFormatedCoordinates();
	
	
	
	
	// TODO Auto-generated method stub

}

@Override
public String moveDown() {
	
	//desna
		if (y>0 && y<=50 && z>=0 && z<=50 && x>=40 && x<=50 )
		{
			y--;
			return getFormatedCoordinates();
			
		}
		//leva
		else if(y>0 && y<=50 && z>=0 && z<=50 && x>=0 && x<=10)
		{
			y--;
			return getFormatedCoordinates();
		}
		//prednja
		else if(y>0 && y<=50 && z>=40 && z<=50 && x>=0 && x<=50)
		{
			y--;
			return getFormatedCoordinates();
		}
		//zadnja
		else if(y>0 && y<=50 && z>=0 && z<=10 && x>=0 && x<=50)
		{
			y--;
			return getFormatedCoordinates();
			
		}
		//gornja
		else if(y>40 && y<=50 && z>=0 && z<=50 && x>=0 && x<=50)
		{
			y--;
			return getFormatedCoordinates();
		}
		// donja
		else if(y>0 && y<=10 && z>=0 && z<=50 && x>=0 && x<=50)
		{
			y--;
			return getFormatedCoordinates();
		}
		 
		
		return getFormatedCoordinates();
		
	
	// TODO Auto-generated method stub
	
}

@Override
public String moveLeft() {
	//desna
			if (y>=0 && y<=50 && z>=0 && z<=50 && x>=40 && x<50 )
			{
				x--;
				return getFormatedCoordinates();
				
			}
			//leva
			else if(y>=0 && y<=50 && z>=0 && z<=50 && x>=0 && x<10)
			{
				x--;
				return getFormatedCoordinates();
			}
			//prednja
			else if(y>=0 && y<=50 && z>=40 && z<=50 && x>=0 && x<50)
			{
				x--;
				return getFormatedCoordinates();
			}
			//zadnja
			else if(y>=0 && y<=50 && z>=0 && z<=10 && x>=0 && x<50)
			{
				x--;
				return getFormatedCoordinates();
				
			}
			//gornja
			else if(y>=40 && y<=50 && z>=0 && z<=50 && x>=0 && x<50)
			{
				x--;
				return getFormatedCoordinates();
			}
			// donja
			else if(y>=0 && y<10 && z>=0 && z<=50 && x>=0 && x<50)
			{
				x--;
				return getFormatedCoordinates();
			}
			else 
			
				return getFormatedCoordinates();
			
	// TODO Auto-generated method stub
	
}

@Override
public String moveRight() {
	//desna
	if (y>=0 && y<=50 && z>=0 && z<=50  && x>40 && x<=50 )
	{
		x++;
		return getFormatedCoordinates();
		
	}
	//leva
	else if(y>=0 && y<=50 && z>=0 && z<=50 && x>0 && x<=10)
	{
		x++;
		return getFormatedCoordinates();
	}
	//prednja
	else if(y>=0 && y<=50 && z>=40 && z<=50 && x>0 && x<=50)
	{
		x++;
		return getFormatedCoordinates();
	}
	//zadnja
	else if(y>=0 && y<=50 && z>=0 && z<=10 && x>0 && x<=50)
	{
		x++;
		return getFormatedCoordinates();
		
	}
	//gornja
	else if(y>=40 && y<=50 && z>=0 && z<=50 && x>0 && x<=50)
	{
		x++;
		return getFormatedCoordinates();
	}
	// donja
	else if(y>=0 && y<10 && z>=0 && z<=50 && x>0 && x<=50)
	{
		x++;
		return getFormatedCoordinates();
	}
	else 
	
		return getFormatedCoordinates();
	
	// TODO Auto-generated method stub
	
}

@Override
public String moveBack() {
	//desna
	if (y>=0 && y<=50 && z>0 && z<=50  && x>=40 && x<=50 )
	{
		z++;
		return getFormatedCoordinates();
		
	}
	//leva
	else if(y>=0 && y<=50 && z>0 && z<=50 && x>=0 && x<=10)
	{
		z++;
		return getFormatedCoordinates();
	}
	//prednja
	else if(y>=0 && y<=50 && z>40 && z<=50 && x>=0 && x<=50)
	{
		z++;
		return getFormatedCoordinates();
	}
	//zadnja
	else if(y>=0 && y<=50 && z>0 && z<=10 && x>=0 && x<=50)
	{
		z++;
		return getFormatedCoordinates();
		
	}
	//gornja
	else if(y>=40 && y<=50 && z>0 && z<=50 && x>=0 && x<=50)
	{
		z++;
		return getFormatedCoordinates();
	}
	// donja
	else if(y>=0 && y<10 && z>0 && z<=50 && x>=0 && x<=50)
	{
		z++;
		return getFormatedCoordinates();
	}
	else 
	
		return getFormatedCoordinates();
	
	// TODO Auto-generated method stub
	
}

@Override
public String moveForth() {
	//desna
	if (y>=0 && y<=50 && z>=0 && z<50 && x>=40 && x<=50)
	{
		z--;
		return getFormatedCoordinates();
		
	}
	//leva
	else if(y>=0 && y<=50 && z>=0 && z<50 && x>=0 && x<=10)
	{
		z--;
		return getFormatedCoordinates();
	}
	//prednja
	else if(y>=0 && y<=50 && z>=40 && z<50 && x>=0 && x<=50)
	{
		z--;
		return getFormatedCoordinates();
	}
	//zadnja
	else if(y>=0 && y<=50 && z>=0 && z<10 && x>=0 && x<=50)
	{
		z--;
		return getFormatedCoordinates();
		
	}
	//gornja
	else if(y>=40 && y<=50 && z>=0 && z<50 && x>=0 && x<=50)
	{
		z--;
		return getFormatedCoordinates();
	}
	// donja
	else if(y>=0 && y<10 && z>=0 && z<50 && x>=0 && x<=50)
	{
		z--;
		return getFormatedCoordinates();
	}
	else 
	
		return getFormatedCoordinates();
	
	// TODO Auto-generated method stub
}

@Override
public String getFormatedCoordinates() {
	// TODO Auto-generated method stub
	// System.out.println("drone position: (" + x + ", " + y + ", " + z + ")");
	return ("Drone position: (" + x + "," + y + "," + z + ")");

}}