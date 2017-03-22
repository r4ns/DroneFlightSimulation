package drone;

public class Drone implements StandardDrone{
	int x=30, y=0, z=30;
	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		y++;
		return getFormatedCoordinates();
	}

@Override
	public String moveDown() {
		// TODO Auto-generated method stub
	y--;
	return getFormatedCoordinates();
	
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		
		x--;
		return getFormatedCoordinates();
	}
	
	@Override
	public String moveRight() {
		x++;
		return getFormatedCoordinates();
	}
		// TODO Auto-generated method stub
		

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
	z++;
	return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		z--;
		
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "("+x+","+y+","+z+")";
	}

}
