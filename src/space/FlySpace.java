package space;

import java.util.ArrayList;
import java.util.List;


public class FlySpace {

	private int [] minCoordinates;
	private int [] maxCoordinates;
	
	List<Cube> obsticles;
	
	public FlySpace(int[] minCoordinates, int[] maxCoordinates) {
		this.minCoordinates = minCoordinates;
		this.maxCoordinates = maxCoordinates;
		this.obsticles = new ArrayList<Cube>();
	}
	
	public int[] getMinCoordinates() {
		return minCoordinates;
	}
	
	public int[] getMaxCoordinates() {
		return maxCoordinates;
	}
	
	public void setMinCoordinates(int[] minCoordinates) {
		this.minCoordinates = minCoordinates;
	}
	
	public void setMaxCoordinates(int[] maxCoordinates) {
		this.maxCoordinates = maxCoordinates;
	}
}
