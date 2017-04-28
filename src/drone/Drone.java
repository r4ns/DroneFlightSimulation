 package drone;
  
 public class Drone implements StandardDrone{
 	
 	private int[] outerBoundaries;
 	int [] boundaries;
 	public int[] coordinates={30,0,30};
 	int space;
 	//private int distanceFromOuterBox;
 	//private int step=2;
 	
 	public Drone(){
 	};
 	
 	public Drone(int[] coordinates){
 		this.coordinates=coordinates;
 	}
 	
 	public Drone(int[] boundaries, int[] coordinates){
 		//,
 		this.outerBoundaries=boundaries;
 		//distanceFromOuterBox=10;
 		this.coordinates=coordinates;
 	}
 	
 	public Drone(int [] boundaries, int space){
 		
 		 		this.boundaries=boundaries;
 		 		this.space=space;
 		 }
 	
 	public String moveUp() {
 		// TODO Auto-generated method stub
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
 