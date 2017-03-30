package drone;

public class Drone implements StandardDrone {
	
	
	private int [] outerBoundaries;
	private int distanceFromOuterBox=10;
	private int [] coordinates = {30,0,30};
	private int step=1;
	
	
	public Drone(){
		
	}	
	public Drone(int[] coordinates){
		this.coordinates = coordinates;
	}
	public Drone(int [] boundaries, int [] coordinates)
	{
		this.outerBoundaries= boundaries;
		distanceFromOuterBox=10;
		this.coordinates = coordinates;
	}

	public String moveUp() {
		if(coordinates[0] > 10 && coordinates[0]< 40 && coordinates[2] > 10 && coordinates[2] < 40)
			 		{
			 			if(coordinates[1] >= 0 && coordinates[1] < 10 || coordinates[1] >= 40 && coordinates[1] < 50)
			 			{
			 				coordinates[1]++;
			 				
			 			}
			 			
			 		}
			 		else if (coordinates[1]>=0 && coordinates[1] <50)
			 			coordinates[1]++;
		
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if(coordinates[0] > 10 && coordinates[0] < 40 && coordinates[2] > 10 && coordinates[2] < 40)
			 		{
			 			if(coordinates[1] <= 50 && coordinates[1] > 40 || coordinates[1] <= 10 && coordinates[1] > 0)
			 			{
			 				coordinates[1]--;
			 			}
			 			
			 		}
			 		else if (coordinates[1] > 0 && coordinates[1]<=50)
			 			coordinates[1]--;
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(coordinates[1] > 10 && coordinates[1] < 40 && coordinates[2] > 10 && coordinates[2] < 40)
			 		{
			 			if(coordinates[0] <= 50 && coordinates[0] > 40 || coordinates[0] <= 10 && coordinates[0] > 0)
			 			{
			 				coordinates[0]--;
			 			}
			 			
			 		}
					else if (coordinates[0] > 0 && coordinates[0]<=50)
						coordinates[0]--;
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if(coordinates[1] > 10 && coordinates[1] < 40 && coordinates[2] > 10 && coordinates[2] < 40)
			 		{
			 			if(coordinates[0] >= 0 && coordinates[0] < 10 || coordinates[0] >= 40 && coordinates[0] < 50)
			 			{
			 				coordinates[0]++;
			 			}
			 			
			 		}
			 		else if (coordinates[0] >= 0 && coordinates[0] < 50)
			 			coordinates[0]++;
			 		
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if(coordinates[1] > 10 && coordinates[1] < 40 && coordinates[0] > 10 && coordinates[0] < 40)
			 		{
			 			if(coordinates[2] >= 0 && coordinates[2] < 10 || coordinates[2] >= 40 && coordinates[2] < 50)
			 			{
			 				coordinates[2]++;
			 			}
			 			
			 		}
			 		else if (coordinates[2]>=0 && coordinates[2] < 50)
			 			coordinates[2]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(coordinates[1] > 10 && coordinates[1] < 40 && coordinates[0] > 10 && coordinates[0] < 40)
			 		{
			 			if(coordinates[2]<= 50 && coordinates[2] > 40 || coordinates[2] <= 10 && coordinates[2] > 0)
			 			{
			 				coordinates[2]--;
			 			}
			 			
			 		}
			 		else if (coordinates[2] > 0 && coordinates[2]<=50)
			 			coordinates[2]--;
			 		
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		
		System.out.println("(" + Integer.toString(coordinates[0]) +
				"," + Integer.toString(coordinates[1])  + 
				"," + Integer.toString(coordinates[2]) + ")");
		
		return ("(" + Integer.toString(coordinates[0]) +
				"," + Integer.toString(coordinates[1])  + 
				"," + Integer.toString(coordinates[2]) + ")");
	}




}
