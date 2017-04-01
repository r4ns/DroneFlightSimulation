package drone;

public class Drone implements StandardDrone{
 
	private int x,y,z;
	private int[] startCoordinates;
	private int boundryOfX;
	private int boundryOfY;
	private int boundryOfZ;
	private int distanceOfInnerCube;
	
	public Drone(int x, int y, int z){
		
			this.x=x;
			this.y=y;
			this.z=z;
	}
	public Drone(int[] startCoordinates, int[] boundries, int distanceOfInnerCube){
		
		this.x=startCoordinates[0];
		this.y=startCoordinates[1];
		this.z=startCoordinates[2];
		this.boundryOfX=boundries[0];
		this.boundryOfY=boundries[1];
		this.boundryOfZ=boundries[2];
		this.distanceOfInnerCube=distanceOfInnerCube;
		
	}
	public boolean proveri(String nameOfMethod){
		if(nameOfMethod=="moveUp"){
			if((x>=0 && x<=distanceOfInnerCube) || (x>=boundryOfX-distanceOfInnerCube && x<=boundryOfX) && y<boundryOfY )
				return true;
			else if((z>=0 && z<=distanceOfInnerCube) || (z>=boundryOfZ-distanceOfInnerCube && z<=boundryOfZ) && y<boundryOfY)
				return true;
			else if((y>=0 && y<distanceOfInnerCube) || (y>=boundryOfY-distanceOfInnerCube && y<boundryOfY))	
				return true;
			else
				return false;
		}
		else if(nameOfMethod == "moveDown")
		{
			if((x>=0 && x<=distanceOfInnerCube) || (x>=boundryOfX-distanceOfInnerCube && x<=boundryOfX) && y>0)
				return true;
			else if((z>=0 && z<=distanceOfInnerCube) || (z>=boundryOfZ-distanceOfInnerCube && z<=boundryOfZ) && y>0)
				return true;
			else if((y>0 && y<=distanceOfInnerCube) || (y>boundryOfY-distanceOfInnerCube && y<=boundryOfY))
				return true;
			else
				return false;
			
		}
		else if(nameOfMethod=="moveLeft")
		{
			if((y>=0 && y<=distanceOfInnerCube) || (y>=boundryOfY-distanceOfInnerCube && y<=boundryOfY) && x>0)
				return true;
			
			
		}
		
		
		return false;
		
	}
	
	public String moveUp() {
			proveri("moveUp");
			y++;
			return getFormatedCoordinates();
	}

	
	public String moveDown() {
		proveri("moveDown");
		y--;
		return getFormatedCoordinates();
		
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
