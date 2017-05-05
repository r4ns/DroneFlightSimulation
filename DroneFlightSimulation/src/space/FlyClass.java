package space;
 
import java.util.ArrayList;

import drone.Cube;

public class FlyClass {
	private int granicaX;
	private int granicaY;
	private int granicaZ;
	
	Cube cubeInside;
	Cube cubeOutside;
	
	private int distanceFromOuter;
	private ArrayList<Cube> prepreke = new ArrayList<Cube>();
	
	public FlyClass(){
		 
	}
	
	public FlyClass(int[] boundaries, int razmak) {
		granicaX=boundaries[0];
		granicaY=boundaries[1];
		granicaZ=boundaries[2];
		distanceFromOuter=razmak;
	}
	
	public FlyClass (Cube cubeInside, Cube cubeOutside) {
		this.cubeInside = cubeInside;
		this.cubeOutside = cubeOutside;
		
		if (cubeInside.getCubeSideLength() < cubeOutside.getCubeSideLength()) {
			Cube obstacle1 = new Cube(new int[] {0, 2, 33}, 1);
			Cube obstacle2 = new Cube(new int[] {40, 16, 9}, 1);
			Cube obstacle3 = new Cube(new int[] {22, 0, 49}, 1);
			Cube obstacle4 = new Cube(new int[] {46, 35, 3}, 1);
		}
	}
	
	public FlyClass( int[] boundaries, int offset,int numOfObstacles) {
			this(boundaries,offset);
				spawnObstacles(numOfObstacles); //Spawns exact number of obstacles
			}
	
	public FlyClass(int[] boundaries, int offset,boolean spawnObstacles) {
		this(boundaries,offset);
		if(spawnObstacles)
			spawnObstacles((int)(Math.random() * 11)); //Spawns up to 10 obstacles 
		}
	
	public void spawnObstacles(int numOfObstacles){
				for(int i = 0;i<numOfObstacles;i++){
					int tmpX = (int) Math.random() * granicaX;
					int tmpY = (int) Math.random() * granicaY;
					int tmpZ = (int) Math.random() * granicaZ;
					Cube obstacle = new Cube(new int[]{tmpX,tmpY,tmpZ}, 1);
					prepreke.add(obstacle);
				}
					
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
