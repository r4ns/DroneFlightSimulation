 package drone;
  
 public class Drone implements StandardDrone{
 	
 	private int[] outerBoundaries;
 	int [] boundaries;
 	public int[] coordinates={30,0,30};
 	int space;
 	
 	public Drone(){
 	};
 	
 	public Drone(int[] coordinates){
 		this.coordinates=coordinates;
 	}
 	
 	public Drone(int[] boundaries, int[] coordinates){
 		this.outerBoundaries=boundaries;
 		this.coordinates=coordinates;
 	}
 	
 	public Drone(int [] boundaries, int space){
 		
 		 		this.boundaries=boundaries;
 		 		this.space=space;
 		 }
 	
 	public String moveUp() {
 		if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[2]>10 &&coordinates[2]<40) && coordinates[1]<10){
 			coordinates[1]++;
 			 			return getFormatedCoordinates();
 			 		} else if ((coordinates[0]>10 &&coordinates[0]<40) && (coordinates[2]>10 &&coordinates[2]<40) && coordinates[1]>=40){
 			 			coordinates[1]++;
 			 			return getFormatedCoordinates();
 			 		} else if (((coordinates[0]>=40 || coordinates[0]<= 10) || (coordinates[2]>=40 || coordinates[2]<= 10))  && coordinates[1]< 50){
 			 			coordinates[1]++;
 			 			return getFormatedCoordinates();
 			 		} else {
 			 			
 			 			return getFormatedCoordinates();
 			 		}
 	}
 
 @Override
 	public String moveDown() {
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
 	
 		
 		
 
 	@Override
 	public String moveBack() {
 		
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
		
		return "("+coordinates[0]+","+coordinates[1]+","+coordinates[2]+")";
	}
  
 }
 