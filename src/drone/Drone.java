package drone;

public class Drone implements StandardDrone{

	int x=30;
	int y=0;
	int z=30;
	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		y++;
		
		//System.out.println(x +","+y+","+z);
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

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		z--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		z++;
		
		//System.out.println(x +","+y+","+z);
		return getFormatedCoordinates();
		
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		System.out.println(x +","+y+","+z);
		return null;
	}

}
