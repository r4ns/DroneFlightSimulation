package drone;

public interface StandardDrone {
	
	public abstract String moveUp(int gore);
	public abstract String moveDown(int dole);
	public abstract String moveLeft(int levo);
	public abstract String moveRight(int desno);
	public abstract String moveBack(int nazad);
	public abstract String moveForth(int napred);
	public abstract String getFormatedCoordinates();

}
