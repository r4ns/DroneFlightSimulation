package space;

public class FlySpace {

	private int x, y, z;
	private int distance = 10;
	private int[] boundaries = { 50, 50, 50 };

	public int[] getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

	public FlySpace() {}

	public FlySpace(int[] boundaries, int distance){
		this.boundaries = boundaries;
		this.distance = distance;
	}
}