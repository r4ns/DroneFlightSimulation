package drone;

public interface StandardDrone {
	
	public abstract String moveUp(int m);
	public abstract String moveDown(int m);
	public abstract String moveLeft(int m);
	public abstract String moveRight(int m);
	public abstract String moveBack(int m);
	public abstract String moveForth(int m);
	public abstract String getFormatedCoordinates();
}
