package space;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import drone.Cube;
import drone.Drone;

public class FlySpace extends Drone {
	
	Random rand = new Random();
	private int numberOfCubes=(int) (Math.random() * (10 - 1)) + 1; //nasumican ukupan broj prepreka
	private int count=0; //brojac za kreiranje prepreka
	FlySpace space;
	ArrayList<Cube> listOfCubes = new ArrayList<Cube>(); //lista prepreka
	private int [] startCoordinates = new int[]{0,0,0}; //pocetne koordinate space-a
	
	//random koordinate prepreka
	private int randomX; 
	private int randomY;
	private int randomZ;
	
	
	Cube cubeBoundaries; //spoljasna granica prostora
	Cube cubeInside; //unutrasnja granica prostora

	public FlySpace(){


	}

	public FlySpace(int [] startCoordinates,int [] boundaries, int razmak){ 

		super(boundaries,razmak);
		this.startCoordinates=startCoordinates;
		cubeBoundaries = new Cube(startCoordinates,boundaries[0]-startCoordinates[0]);
		cubeInside = new Cube(new int[]{startCoordinates[0]+razmak,startCoordinates[1]+razmak,startCoordinates[2]+razmak},boundaries[0]-razmak-(startCoordinates[0]+razmak));
		randomX = (int) (Math.random() * (boundaries[0] - boundaries[0]-razmak)) + boundaries[0]-razmak;
		randomY = (int) (Math.random() * (boundaries[1] - boundaries[1]-razmak)) + boundaries[1]-razmak;
		randomZ = (int) (Math.random() * (boundaries[2] - boundaries[2]-razmak)) + boundaries[2]-razmak;
		
		checkCubes();


	}
	


	public void checkCubes(){

		while(count<numberOfCubes){

			Cube cube = new Cube(new int[] {x,y,z},1);
			Cube cubeBoundaries = new Cube(startCoordinates,boundaries[0]-startCoordinates[0]);
			Cube cubeInside = new Cube(new int[]{startCoordinates[0]+razmak,startCoordinates[1]+razmak,startCoordinates[2]+razmak},boundaries[0]-razmak-(startCoordinates[0]+razmak));

			if(cubeBoundaries.checkIfCubesAreinCube(cube) == true){

				if(cubeInside.checkIfCubesAreinCube(cube) == false){	

					makeCubes();
					randomX = (int) (Math.random() * (boundaries[0] - boundaries[0]-razmak)) + boundaries[0]-razmak;
					randomY = (int) (Math.random() * (boundaries[1] - boundaries[1]-razmak)) + boundaries[1]-razmak;
					randomZ = (int) (Math.random() * (boundaries[2] - boundaries[2]-razmak)) + boundaries[2]-razmak;
				

				} else {

					randomX = (int) (Math.random() * (boundaries[0] - boundaries[0]-razmak)) + boundaries[0]-razmak;
					randomY = (int) (Math.random() * (boundaries[1] - boundaries[1]-razmak)) + boundaries[1]-razmak;
					randomZ = (int) (Math.random() * (boundaries[2] - boundaries[2]-razmak)) + boundaries[2]-razmak;
				}
			} else {

				randomX = (int) (Math.random() * (boundaries[0] - boundaries[0]-razmak)) + boundaries[0]-razmak;
				randomY = (int) (Math.random() * (boundaries[1] - boundaries[1]-razmak)) + boundaries[1]-razmak;
				randomZ = (int) (Math.random() * (boundaries[2] - boundaries[2]-razmak)) + boundaries[2]-razmak;
			}



		}

	}

	public void makeCubes(){

		Cube cube = new Cube(new int[] {x,y,z},1);
		listOfCubes.add(cube);
		count++;


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

	public void setListOfCubes(ArrayList<Cube> listOfCubes) {
		this.listOfCubes = listOfCubes;
	}

	public int getNumberOfCubes() {
		return numberOfCubes;
	}

	public void setNumberOfCubes(int numberOfCubes) {
		this.numberOfCubes = numberOfCubes;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public FlySpace getSpace() {
		return space;
	}

	public void setSpace(FlySpace space) {
		this.space = space;
	}

	public int getRandomX() {
		return randomX;
	}

	public void setRandomX(int randomX) {
		this.randomX = randomX;
	}

	public int getRandomY() {
		return randomY;
	}

	public void setRandomY(int randomY) {
		this.randomY = randomY;
	}

	public int getRandomZ() {
		return randomZ;
	}

	public void setRandomZ(int randomZ) {
		this.randomZ = randomZ;
	}



















}
