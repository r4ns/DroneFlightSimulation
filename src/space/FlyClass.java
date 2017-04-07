package space;

import drone.Cube;

public class FlyClass {
	private int granicaX;
	private int granicaY;
	private int granicaZ;
	
	private int distanceFromOuter;
	
	Cube cubeVeca;
	Cube cubeManja;
	
	public FlyClass(int[] boundaries, int razmak) {
		granicaX=boundaries[0];
		granicaY=boundaries[1];
		granicaZ=boundaries[2];
		distanceFromOuter=razmak;
	}
	public int getDistanceFromOuter() {
		return distanceFromOuter;
	}
	public void setDistanceFromOuter(int distanceFromOuter) {
		this.distanceFromOuter = distanceFromOuter;
	}
	public int getGranicaX() {
		return granicaX;
	}
	public void setGranicaX(int granicaX) {
		this.granicaX = granicaX;
	}
	public int getGranicaY() {
		return granicaY;
	}
	public void setGranicaY(int granicaY) {
		this.granicaY = granicaY;
	}
	public int getGranicaZ() {
		return granicaZ;
	}
	public void setGranicaZ(int granicaZ) {
		this.granicaZ = granicaZ;
	}
	
	
	
}
