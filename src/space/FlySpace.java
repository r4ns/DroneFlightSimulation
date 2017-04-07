package space;

public class FlySpace {
	
	private int granicaX=50;
	private int granicaY=50;
	private int granicaZ=50;
	private int razmak=10;
	
	public FlySpace(int[] granice,int u){
		
		granicaX=granice[0];
		granicaY=granice[1];
		granicaZ=granice[2];
		razmak=u;
		
		
		
	}

	

	public int getRazmak() {
		return razmak;
	}

	

	public void setRazmak(int razmak) {
		this.razmak = razmak;
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
