package space;

public class FlySpace {
	private int x, y, z;
	private int distance = 10;
	private int[] boundaries = {50, 50, 50};
	private int[] obstacles;

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
	public FlySpace(int[] boundaries, int distance, int[] obstacles){
		this.boundaries = boundaries;
		this.distance = distance;
		if(obstacles[0] < boundaries[0] && obstacles[1] < boundaries[1] && obstacles[2] < boundaries[2]){
			this.obstacles = obstacles;
		}
	}

	public int[] getObstacles() {
		return obstacles;
	}

	public void setObstacles(int[] obstacles) {
		this.obstacles = obstacles;
	}
}