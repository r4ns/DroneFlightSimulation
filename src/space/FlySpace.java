package space;

public class FlySpace {
	
	private int[] boundries={50, 50, 50};
	int distance=10;
	
	public FlySpace(int[] boundries, int distance) {
		
		this.boundries=boundries;
		this.distance=distance;
		
	}
	
	public int[] getBoundries() {
		return boundries;
	}

	public void setBoundries(int[] boundries) {
		this.boundries = boundries;
	}
	

}
