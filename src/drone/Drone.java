 package drone;
  
 public class Drone implements StandardDrone{
 	
 	private int[] outerBoundaries;
 	public int[] coordinates;
 	private int distanceFromOuterBox;
 	private int step=2;
 	
 	public Drone(){
 	};
 	
 	public Drone(int[] boundaries, int[] coordinates){
 		this.outerBoundaries=boundaries;
 		distanceFromOuterBox=10;
 		this.coordinates=coordinates;
 	}
 	public String moveUp() {
 		// TODO Auto-generated method stub
 		if(coordinates[1]>=10 && coordinates[1]<=40) return getFormatedCoordinates();
 		else 
 			coordinates[1]++;
 		return getFormatedCoordinates();
 	}
 
 @Override
 	public String moveDown() {
 		// TODO Auto-generated method stub
	 coordinates[1]--;
 	return getFormatedCoordinates();
 	
 	}
 
 	@Override
 	public String moveLeft() {
 		// TODO Auto-generated method stub
 		
 		coordinates[0]--;
 		return getFormatedCoordinates();
 	}
 	
 	@Override
 	public String moveRight() {
 		coordinates[0]++;
 		return getFormatedCoordinates();
 	}
 		// TODO Auto-generated method stub
 		
 
 	@Override
 	public String moveBack() {
 		// TODO Auto-generated method stub
 		coordinates[2]++;
 	return getFormatedCoordinates();
 	}
 
 	@Override
 	public String moveForth() {
 		coordinates[2]--;
 		
 		return getFormatedCoordinates();
 	}
 
 	@Override
 	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "("+coordinates[0]+","+coordinates[1]+","+coordinates[2]+")";
	}
  
 }
 