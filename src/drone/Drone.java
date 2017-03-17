package drone;

public class Drone implements StandardDrone{
	
	public int koordinataX;
	public int koordinataY;
	public int koordinataZ;
	

	public String getFormatedCoordinates() {
		return "Drone position: (" + koordinataX + ", " + koordinataY + ", " + koordinataZ + ")";
	 
	}
	
	public String moveUp() {
		if (koordinataY < 10 && koordinataX <= 40 && koordinataX >= 10 && koordinataZ <= 40 && koordinataZ >= 10){
			koordinataY ++; 
		}
		else if(koordinataY < 50){
			koordinataY++;
		}
		return getFormatedCoordinates();
	}

	public String moveDown() {
		if (koordinataY < 50 && koordinataY >= 40 && koordinataX <=40 && koordinataX >= 10 && koordinataZ <= 40 && koordinataZ >= 10)
		{koordinataY--;}
		else if(koordinataY > 0)
		{
			koordinataY--;
		}
		return getFormatedCoordinates();
	}


	public String moveLeft() {
		if (koordinataY <= 40 && koordinataY >= 10 && koordinataX >=0 && koordinataZ <= 40 && koordinataZ >= 10)
		{koordinataX++;}
		else if(koordinataX <= 10)
		{
			koordinataX++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if (koordinataY <= 40 && koordinataY >= 10 && koordinataX >40 && koordinataZ <= 40 && koordinataZ >= 10){
			koordinataX ++; 
		}
		else if(koordinataY < 50){
			koordinataX++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
