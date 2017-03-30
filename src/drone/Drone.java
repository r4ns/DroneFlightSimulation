package drone;

public class Drone implements StandardDrone {
  	
 	private int x = 30;
 	private int y = 0;
 	private int z = 30;
  	
  	private int [] outerBoundaries;
  	private int distanceFromOuterBox=10;
 	private int [] coordinates1;
 	private int [] coordinates = {30,0,30};
  	private int step=1;
  	
  	
  	public Drone(){
  		
 	}
 	public Drone(int x, int y, int z){
 		
 		this.x = x;
 		this.y = y;
 		this.z = z;
 	}
 	
 		
  	public Drone(int [] boundaries, int [] coordinates)
  	{
  		this.outerBoundaries= boundaries;
  		distanceFromOuterBox=10;
  		this.coordinates1 = coordinates;
  	}
  	
 	
 
 	@Override
  	public String moveUp() {
 		if (y<11)
 		{
 			y++;
 		}
 		else
 		{
 			System.out.println("Greska");
 		}
 		if(coordinates1[0] > 10 && coordinates1[0]< 40 && coordinates1[2] > 10 && coordinates1[2] < 40)
 			 		{
 			 			if(coordinates1[1] >= 0 && coordinates1[1] < 10 || coordinates1[1] >= 40 && coordinates1[1] < 50)
 			 			{
 			 				coordinates1[1]++;
 			 			}
 			 			
 			 		}
 			 		else if (coordinates1[1]>=0 && coordinates1[1] <50)
 			 			coordinates1[1]++;
 		
  		
  		return getFormatedCoordinates();
  	}
  
  	@Override
  	public String moveDown() {
 		y--;
 	if(coordinates1[0] > 10 && coordinates1[0] < 40 && coordinates1[2] > 10 && coordinates1[2] < 40)
 			 		{
 			 			if(coordinates1[1] <= 50 && coordinates1[1] > 40 || coordinates1[1] <= 10 && coordinates1[1] > 0)
 			 			{
 		 				coordinates1[1]--;
 			 			}
			 			
 			 		}
 			 		else if (coordinates1[1] > 0 && coordinates1[1]<=50)
 			 			coordinates1[1]--;
 		
  		return getFormatedCoordinates();
  	}
  
  	@Override
  	public String moveLeft() {
 		x--;
 		if(coordinates1[1] > 10 && coordinates1[1] < 40 && coordinates1[2] > 10 && coordinates1[2] < 40)
 			 		{
 		 			if(coordinates1[0] <= 50 && coordinates1[0] > 40 || coordinates1[0] <= 10 && coordinates1[0] > 0)
 			 			{
 			 				coordinates1[0]--;
 			 			}
 			 			
 			 		}
 					else if (coordinates1[0] > 0 && coordinates1[0]<=50)
 					coordinates1[0]--;
 		
  		return getFormatedCoordinates();
  	}
  
  	@Override
  	public String moveRight() {
 		x++;
 		if(coordinates1[1] > 10 && coordinates1[1] < 40 && coordinates1[2] > 10 && coordinates1[2] < 40)
 			 		{
 			 			if(coordinates1[0] >= 0 && coordinates1[0] < 10 || coordinates1[0] >= 40 && coordinates1[0] < 50)
 			 			{
 			 				coordinates1[0]++;
 			 			}
 			 			
 			 		}
 			 		else if (coordinates1[0] >= 0 && coordinates1[0] < 50)
 			 			coordinates1[0]++;
 			 		
 		
  		return getFormatedCoordinates();
  	}
  
  	@Override
  	public String moveBack() {
 		z--;
 		if(coordinates1[1] > 10 && coordinates1[1] < 40 && coordinates1[0] > 10 && coordinates1[0] < 40)
 			 		{
 			 			if(coordinates1[2] >= 0 && coordinates1[2] < 10 || coordinates1[2] >= 40 && coordinates1[2] < 50)
 			 			{
 			 				coordinates1[2]++;
 			 			}
 			 			
 			 		}
 			 		else if (coordinates1[2]>=0 && coordinates1[2] < 50)
 			 			coordinates1[2]++;
  		return getFormatedCoordinates();
  	}
  
  	@Override
  	public String moveForth() {
 		z++;
 		if(coordinates1[1] > 10 && coordinates1[1] < 40 && coordinates1[0] > 10 && coordinates1[0] < 40)
 			 		{
 			 			if(coordinates1[2]<= 50 && coordinates1[2] > 40 || coordinates1[2] <= 10 && coordinates1[2] > 0)
 			 			{
 			 				coordinates1[2]--;
 			 			}
 			 			
 			 		}
 			 		else if (coordinates1[2] > 0 && coordinates1[2]<=50)
 			 			coordinates1[2]--;
 			 		
  		return getFormatedCoordinates();
  	}
  
  	@Override
  	public String getFormatedCoordinates() {
  		
 		System.out.println(("(" + this.x + "," + this.y + "," + this.z + ")"));
 		System.out.println("(" + Integer.toString(coordinates1[0]) +
 				"," + Integer.toString(coordinates1[1])  + 
 				"," + Integer.toString(coordinates1[2]) + ")");
  		
 		return ("(" + Integer.toString(coordinates1[0]) +
 				"," + Integer.toString(coordinates1[1])  + 
 				"," + Integer.toString(coordinates1[2]) + ")");
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