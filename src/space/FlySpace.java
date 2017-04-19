package space;

import java.util.List;

import javax.swing.JList;

import drone.Cube;
import drone.Drone;

public class FlySpace extends Drone {

	private int numberOfCubes=0;
	private int count=0;
	FlySpace space;
	List<Cube> listOfCubes;
	private int [] startCoordinates;
	private int x = (int) (Math.random() * (boundaries[0] - boundaries[0]-razmak)) + boundaries[0]-razmak;
	private int y = (int) (Math.random() * (boundaries[1] - boundaries[1]-razmak)) + boundaries[1]-razmak;
	private int z = (int) (Math.random() * (boundaries[2] - boundaries[2]-razmak)) + boundaries[2]-razmak;

	public FlySpace(){


	}

	public FlySpace(int [] startCoordinates,int [] boundaries, int razmak){ 
		
		super(boundaries,razmak);
		this.startCoordinates=startCoordinates;
		checkCubes();
		
	}

	
	public void checkCubes(){
		
		while(count<numberOfCubes){
			
			Cube cube = new Cube(new int[] {x,y,z},1);
			Cube cubeBoundaries = new Cube(startCoordinates,boundaries[0]-startCoordinates[0]);
			Cube cubeInside = new Cube(new int[]{startCoordinates[0]+razmak,startCoordinates[1]+razmak,startCoordinates[2]+razmak},boundaries[0]-razmak-(startCoordinates[0]+razmak));
			
			if(cubeBoundaries.checkIfCubesAreinCube(cube) == true){
				
				if(cubeInside.checkIfCubesAreinCube(cube) == false){
					
					count++;
					makeCubes();
					x = (int) (Math.random() * (boundaries[0] - boundaries[0]-razmak)) + boundaries[0]-razmak;
					y = (int) (Math.random() * (boundaries[1] - boundaries[1]-razmak)) + boundaries[1]-razmak;
					z = (int) (Math.random() * (boundaries[2] - boundaries[2]-razmak)) + boundaries[2]-razmak;
				}
			}
		}
			
	}
	
	public void makeCubes(){
		
		Cube cube = new Cube(new int[] {x,y,z},1);
		listOfCubes.add(cube);
		
		
	}
	
	public int[] getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}

	public List<Cube> getListOfCubes() {
		return listOfCubes;
	}

	public void setListOfCubes(List<Cube> listOfCubes) {
		this.listOfCubes = listOfCubes;
	}


	
	
	
	
	
	
	
	
	
	

	

}
