package space;


public class FlySpace {
	private int granicaX = 50;
	private int granicaY = 50;
	private int granicaZ = 50;
		
	public FlySpace () {
		
	}
	
	public FlySpace(int granicaX, int granicaY, int granicaZ) {
		this.granicaX = granicaX;
		this.granicaY = granicaY;
		this.granicaZ = granicaZ;
	}
	

	public int getGranicaX() {
		return granicaX;
	}

	public int getGranicaY() {
		return granicaY;
	}

	public int getGranicaZ() {
		return granicaZ;
	}

	public void setGranicaX(int granicaX) {
		this.granicaX = granicaX;
	}

	public void setGranicaY(int granicaY) {
		this.granicaY = granicaY;
	}

	public void setGranicaZ(int granicaZ) {
		this.granicaZ = granicaZ;
	}
	
	

}
