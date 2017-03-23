package drone;

public class Drone implements StandardDrone {
	
	int x = 30;
	int y = 0;
	int z = 30;

	
	public String moveUp() {
		
		if((y>=0 & y<10) || (y>=40 & y<50)){
		
			y++;
			return getFormatedCoordinates();
		}
			
			else if(((x>=0 & x<=10) || (x>=40 & x<=50) || (z>=0 & z<=10) || (z>=40 & z<50)) & (y>=0 & y<50)){
			 	
			y++;
			return getFormatedCoordinates();
			}
		
			else
				return getFormatedCoordinates();
	}
	

	
	public String moveDown() {
		
		if((y>0 & y<10) || (y>=40 & y<50)){
			
			y--;
			return getFormatedCoordinates();
		}
			
			else if(((x>=0 & x<=10) || (x>=40 & x<=50) || (z>=0 & z<=10) || (z>=40 & z<=50)) & (y>=0 & y<=50)){
				
			y--;
			return getFormatedCoordinates();
			}
			else
				return getFormatedCoordinates();
		
		
	}

	
	public String moveLeft() {

		if((x>0 & x<=10) || (x>40 & x<=50)){
			
			x--;
			return getFormatedCoordinates();
		}
			
			else if(((y>=0 & y<=10) || (y>=40 & y<=50) || (z>=0 & z<=10) || (z>=40 & z<=50)) & (x>0 & x<=50)){
				
			x--;
			return getFormatedCoordinates();
			}
			else
				return getFormatedCoordinates();
	}

	
	public String moveRight() {
		
		if((x>=0 & x<10) || (x>=40 & x<50)){
			
			x++;
			return getFormatedCoordinates();
		}
			
			else if(((y>=0 & y<=10) || (y>=40 & y<=50) || (z>=0 & z<=10) || (z>=40 & z<=50)) & (x>=0 & x<50)){
				
			x++;
			return getFormatedCoordinates();
			}
		
			else
				return getFormatedCoordinates();
		
	}

	
	public String moveBack() {
		if((z>=0 & z<10) || (z>=40 & z<50)){
			
			z++;
			return getFormatedCoordinates();
		}
			
			else if(((y>=0 & y<=10) || (y>=40 & y<=50) || (x>=0 & x<=10) || (x>=40 & x<=50)) & (z>=0 & z<=50)){
				
			z++;
			return getFormatedCoordinates();
			}
			else
				return getFormatedCoordinates();
		
	}

	
	public String moveForth() {
		
		if((z>0 & z<10) || (z>=40 & z<50)){
			
			z--;
			return getFormatedCoordinates();
		}
			
			else if(((y>=0 & y<=10) || (y>=40 & y<=50) || (x>=0 & x<=10) || (x>=40 & x<=50)) & (z>=0 & z<=50)){
				
			z--;
			return getFormatedCoordinates();
			}
			else
				return getFormatedCoordinates();
		
	}

	
	public String getFormatedCoordinates() {
		
		return String.format("Pozicija drona:  (" + x + "," + y + "," + z + ")");
	}

}
