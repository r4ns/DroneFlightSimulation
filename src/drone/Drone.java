 package drone;
  
 public class Drone implements StandardDrone{
 	
 	private int[] boundaries={0,10,40,50};
 	public int[] coordinates={30,0,30};
 	
 	public Drone()
 	{
 		
 	}
 	
 	public Drone(int[] coordinates){
 		this.coordinates=coordinates;
 	}
 	
 	public Drone(int[] boundaries, int[] coordinates){
 		this.boundaries=boundaries;
 		this.coordinates=coordinates;
 	}
 	public String moveUp() {
 		// TODO Auto-generated method stub
 		if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[2]>10 &&coordinates[2]<40) && coordinates[1]<10){
 			coordinates[1]++;
 			 			return getFormatedCoordinates();
 			 		} else if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[2]>10 &&coordinates[2]<40) && (coordinates[1]>=40 && coordinates[1]<50)){
 			 			coordinates[1]++;
 			 			return getFormatedCoordinates();
 			 		} else if (((coordinates[0]>=40 || coordinates[0]<=10) || (coordinates[2]>=40 || coordinates[2]<= 10))  && coordinates[1]<50){
 			 			coordinates[1]++;
 			 			return getFormatedCoordinates();
 			 		} else {
 			 			
 			 			return getFormatedCoordinates();
 			 		}
 	}
 
 @Override
 	public String moveDown() {
 		// TODO Auto-generated method stub
	 if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[2]>10 &&coordinates[2]<40) && coordinates[1]>0 && coordinates[1]<=10){
			coordinates[1]--;
			 			return getFormatedCoordinates();
			 		} else if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[2]>10 && coordinates[2]<40) && (coordinates[1]<=50 && coordinates[1]>40)){
			 			coordinates[1]--;
			 			return getFormatedCoordinates();
			 		} else if (((coordinates[0]>=40 || coordinates[0]<= 10) || (coordinates[2]>=40 || coordinates[2]<= 10))  && coordinates[1]>0){
			 			coordinates[1]--;
			 			return getFormatedCoordinates();
			 			
			 		} else {
			 			
			 			return getFormatedCoordinates();
			 		}
	}
 	
 
 	@Override
 	public String moveLeft() {
 		// TODO Auto-generated method stub
 		
 		 if ((coordinates[1]>10 &&coordinates[1]<40) && (coordinates[2]>10 &&coordinates[2]<40) && (coordinates[0]<=10 && coordinates[0]>0)){
 			coordinates[0]--;
 			 			return getFormatedCoordinates();
 			 		} else if ((coordinates[1]>10 &&coordinates[1]<40) && (coordinates[2]>10 && coordinates[2]<40) && (coordinates[0]>40 && coordinates[0]<=50)){
 			 			coordinates[0]--;
 			 			return getFormatedCoordinates();
 			 		} else if (((coordinates[1]>=40 || coordinates[1]<= 10) || (coordinates[2]>=40 || coordinates[2]<= 10))  && coordinates[0]>0){
 			 			coordinates[0]--;
 			 			return getFormatedCoordinates();
 			 		} else {
 			 			return getFormatedCoordinates();
 			 		}
 		
 	}
 	
 	@Override
 	public String moveRight() {
		 if ((coordinates[1]>10 &&coordinates[1]<40) && (coordinates[2]>10 &&coordinates[2]<40) && coordinates[0]<10){
			coordinates[0]++;
			 			return getFormatedCoordinates();
			 		} else if ((coordinates[1]>10 &&coordinates[1]<40) && (coordinates[2]>10 &&coordinates[2]<40) && (coordinates[0]>=40 && coordinates[0]<50)){
			 			coordinates[0]++;
			 			return getFormatedCoordinates();
			 		} else if (((coordinates[1]>=40 || coordinates[1]<= 10) || (coordinates[2]>=40 || coordinates[2]<= 10))  && coordinates[0]<50){
			 			coordinates[0]++;
			 			return getFormatedCoordinates();
			 		} else {
			 			return getFormatedCoordinates();
			 		}
		
	}
 	
 		// TODO Auto-generated method stub
 		
 
 	@Override
 	public String moveBack() {
 		// TODO Auto-generated method stub
 		 if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[1]>10 &&coordinates[1]<40) && coordinates[2]<10){
 			coordinates[2]++;
 			 			return getFormatedCoordinates();
 			 		} else if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[1]>10 &&coordinates[1]<40) && (coordinates[2]>=40 && coordinates[2]<50)){
 			 			coordinates[2]++;
 			 			return getFormatedCoordinates();
 			 		} else if (((coordinates[0]>=40 || coordinates[0]<= 10) || (coordinates[1]>=40 || coordinates[1]<= 10))  && coordinates[2]<50){
 			 			coordinates[2]++;
 			 			return getFormatedCoordinates();
 			 		} else {
 			 			return getFormatedCoordinates();
 			 		}
 	
 	}
 
 	@Override
 	public String moveForth() {
 		if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[1]>10 &&coordinates[1]<40) && (coordinates[2]>0 && coordinates[2]<=10)){
 			coordinates[2]--;
 			 			return getFormatedCoordinates();
 			 		} else if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[1]>10 && coordinates[1]<40) && coordinates[2]>40){
 			 			coordinates[2]--;
 			 			return getFormatedCoordinates();
 			 		} else if (((coordinates[0]>=40 || coordinates[0]<= 10) || (coordinates[1]>=40 || coordinates[1]<= 10))  && coordinates[2]>0){
 			 			coordinates[2]--;
 			 			return getFormatedCoordinates();
 			 		} else {
 			 			return getFormatedCoordinates();
 			 		}
 	}
 
 	@Override
 	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "("+coordinates[0]+","+coordinates[1]+","+coordinates[2]+")";
	}
  
}
