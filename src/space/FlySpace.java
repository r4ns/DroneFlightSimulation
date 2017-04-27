package space;

import drone.Cube;

public class FlySpace extends Cube{
	private int granicaX = 50;
	private int granicaY = 50;
	private int granicaZ = 50;
	Cube cubeInside;
	Cube cubeOutside;
		
	public FlySpace () {
		
	}
	
	public FlySpace(int granicaX, int granicaY, int granicaZ) {
		this.granicaX = granicaX;
		this.granicaY = granicaY;
		this.granicaZ = granicaZ;
	}
	
	public FlySpace (Cube cubeInside, Cube cubeOutside) {
		this.cubeInside = cubeInside;
		this.cubeOutside = cubeOutside;
		
		if (cubeInside.getCubeSideLength() < cubeOutside.getCubeSideLength()) {
			Cube obstacle1 = new Cube(new int[] {0, 2, 33}, 1);
			Cube obstacle2 = new Cube(new int[] {40, 16, 9}, 1);
			Cube obstacle3 = new Cube(new int[] {22, 0, 49}, 1);
			Cube obstacle4 = new Cube(new int[] {46, 35, 3}, 1);
		}
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

	public Cube getCubeInside() {
		return cubeInside;
	}

	public Cube getCubeOutside() {
		return cubeOutside;
	}

	public void setCubeInside(Cube cubeInside) {
		this.cubeInside = cubeInside;
	}

	public void setCubeOutside(Cube cubeOutside) {
		this.cubeOutside = cubeOutside;
	}
	
	

}
