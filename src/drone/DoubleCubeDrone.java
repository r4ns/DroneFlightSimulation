package drone;

import exceptions.DroneExcpetion;
import space.FlySpace;
import util.Cube;

public class DoubleCubeDrone implements StandardDrone{

	private FlySpace space;
	private int droneCubeLength;
	private	int[] defaultCoordinates = new int[] {0,0,0};
	private Cube firstDroneCube,secondDroneCube;
	
	public DoubleCubeDrone(int [] droneBottomCoordinates,int droneCubeLength, 
						   int[] spaceBoundaries, int spaceOffset){
		try{
			if(droneBottomCoordinates == null)
				throw new NullPointerException("Invalid drone coordinates, setting default values");
			
		firstDroneCube = new Cube(droneBottomCoordinates, droneCubeLength);
		secondDroneCube = new Cube(new int[]{
				droneBottomCoordinates[0]+droneCubeLength,
				droneBottomCoordinates[1]+droneCubeLength,
				droneBottomCoordinates[2]+droneCubeLength }, droneCubeLength);
		}catch(NullPointerException ex){
			firstDroneCube = new Cube(new int[]{0,0,0,0}, droneCubeLength);
			secondDroneCube = new Cube(new int[]{
					0+droneCubeLength,
					0+droneCubeLength,
					0+droneCubeLength }, droneCubeLength);
			System.out.println(ex.getMessage());
		}
		this.droneCubeLength = droneCubeLength;
		space = new FlySpace(defaultCoordinates, spaceBoundaries, spaceOffset);
	}
	
	
	public Boolean validateDronePositionAfter(String command) throws DroneExcpetion{
		switch (command.toLowerCase()) {
		case "moveup":{
			if((!canMoveFromFlySpace(command.toLowerCase(), firstDroneCube.getMinCoordinates()) ||
					!canMoveFromObstacle(command.toLowerCase(), firstDroneCube.getMinCoordinates())))
				throw new DroneExcpetion("Drone cannot move");
			break;
		}
		case "movedown":{
			if((!canMoveFromFlySpace(command.toLowerCase(), firstDroneCube.getMinCoordinates()) ||
					!canMoveFromObstacle(command.toLowerCase(), firstDroneCube.getMinCoordinates())))
				throw new DroneExcpetion("Drone cannot move");
			break;
		}
		case "moveleft":{
			if((!canMoveFromFlySpace(command.toLowerCase(), firstDroneCube.getMinCoordinates()) ||
					!canMoveFromObstacle(command.toLowerCase(), firstDroneCube.getMinCoordinates())))
				throw new DroneExcpetion("Drone cannot move");
			break;
		}
		case "moveright":{
			if((!canMoveFromFlySpace(command.toLowerCase(), firstDroneCube.getMinCoordinates()) ||
					!canMoveFromObstacle(command.toLowerCase(), firstDroneCube.getMinCoordinates())))
				throw new DroneExcpetion("Drone cannot move");
			break;
		}
		case "moveforth":{
			if((!canMoveFromFlySpace(command.toLowerCase(), firstDroneCube.getMinCoordinates()) ||
					!canMoveFromObstacle(command.toLowerCase(), firstDroneCube.getMinCoordinates())))
				throw new DroneExcpetion("Drone cannot move");
			break;
		}
		case "moveback":{
			if((!canMoveFromFlySpace(command.toLowerCase(), firstDroneCube.getMinCoordinates()) ||
					!canMoveFromObstacle(command.toLowerCase(), firstDroneCube.getMinCoordinates())))
				throw new DroneExcpetion("Drone cannot move");
			break;
		}
		default:
			throw new DroneExcpetion("Unknown command called");
		}
		
		return true;
	}
	
	public boolean canMoveFromFlySpace(String direction, int[] currentCoordinates){
		switch (direction.toLowerCase()) {
		case "moveup":
			currentCoordinates[1]++;break;
		case "movedown":
			currentCoordinates[1]--;break;
		case "moveleft":
			currentCoordinates[0]--;break;
		case "moveright":
			currentCoordinates[0]++;break;
		case "moveforth":
			currentCoordinates[2]--;break;
		case "moveback":
			currentCoordinates[2]++;break;
		default:
			return false;
		}
		Cube droneCubeAfterMove = new Cube(currentCoordinates,droneCubeLength);
		Cube secondDroneCubeAfterMove = new Cube(new int[]{
				currentCoordinates[0]+droneCubeLength,
				currentCoordinates[1]+droneCubeLength,
				currentCoordinates[2]+droneCubeLength }, droneCubeLength);
		
		if(space.getInsideCube().checkCubeIntersection(droneCubeAfterMove) ||
		   space.getInsideCube().checkCubeIntersection(secondDroneCubeAfterMove) ||
		   space.getOutsideCube().checkCubeIntersection(droneCubeAfterMove) ||
		   space.getOutsideCube().checkCubeIntersection(secondDroneCubeAfterMove))
			return false;
		
		
		return true;
	}
	
	public boolean canMoveFromObstacle(String direction, int[] currentCoordinates){
		switch (direction.toLowerCase()) {
		case "moveup":
			currentCoordinates[1]++;break;
		case "movedown":
			currentCoordinates[1]--;break;
		case "moveleft":
			currentCoordinates[0]--;break;
		case "moveright":
			currentCoordinates[0]++;break;
		case "moveforth":
			currentCoordinates[2]--;break;
		case "moveback":
			currentCoordinates[2]++;break;
		default:
			return false;
		}
		
		Cube droneCubeAfterMove = new Cube(currentCoordinates,droneCubeLength);
		Cube secondDroneCubeAfterMove = new Cube(new int[]{
				currentCoordinates[0]+droneCubeLength,
				currentCoordinates[1]+droneCubeLength,
				currentCoordinates[2]+droneCubeLength }, droneCubeLength);
		
		for (Cube cube : space.getCubesCollection()) {
			if(cube.checkCubeIntersection(droneCubeAfterMove) || cube.checkCubeIntersection(secondDroneCubeAfterMove))
				return false;
		}
		
		return true;
	}
	
	public String getFormatedCoordinates() {
		String currentState = "Drone info:\nSide length: " + droneCubeLength + 
							   "\nFlySpace info : " + space + "\nFirst cube info: " + firstDroneCube +
							   "\nSecond cube info: " + secondDroneCube +
							   "\n__________________________________________\n";
		
		return currentState;
	}


	@Override
	public String moveUp() {
		try{
			if(validateDronePositionAfter("moveup")){
				firstDroneCube.increaseY(1);
				secondDroneCube.increaseY(1);
			}
				return getFormatedCoordinates();
		}catch(DroneExcpetion ex){
			System.out.println("ERROR: " + ex.getMessage());
			return getFormatedCoordinates();
		}
	}


	@Override
	public String moveDown() {
		try{
			if(validateDronePositionAfter("movedown")){
				firstDroneCube.decreaseY(1);
				secondDroneCube.decreaseY(1);
			}
				return getFormatedCoordinates();
		}catch(DroneExcpetion ex){
			System.out.println("ERROR: " + ex.getMessage());
			return getFormatedCoordinates();
		}
	}


	@Override
	public String moveLeft() {
		try{
			if(validateDronePositionAfter("moveleft")){
				firstDroneCube.decreaseX(1);
				secondDroneCube.decreaseX(1);
			}
				return getFormatedCoordinates();
		}catch(DroneExcpetion ex){
			System.out.println("ERROR: " + ex.getMessage());
			return getFormatedCoordinates();
		}
	}


	@Override
	public String moveRight() {
		try{
			if(validateDronePositionAfter("moveright")){
				firstDroneCube.increaseX(1);
				secondDroneCube.increaseX(1);
			}
				return getFormatedCoordinates();
		}catch(DroneExcpetion ex){
			System.out.println("ERROR: " + ex.getMessage());
			return getFormatedCoordinates();
		}
	}


	@Override
	public String moveBack() {
		try{
			if(validateDronePositionAfter("moveback")){
				firstDroneCube.increaseZ(1);
				secondDroneCube.increaseZ(1);
			}
				return getFormatedCoordinates();
		}catch(DroneExcpetion ex){
			System.out.println("ERROR: " + ex.getMessage());
			return getFormatedCoordinates();
		}
	}


	@Override
	public String moveForth() {
		try{
			if(validateDronePositionAfter("moveback")){
				firstDroneCube.decreaseZ(1);
				secondDroneCube.decreaseZ(1);
			}
				return getFormatedCoordinates();
		}catch(DroneExcpetion ex){
			System.out.println("ERROR: " + ex.getMessage());
			return getFormatedCoordinates();
		}
	}


	public FlySpace getSpace() {
		return space;
	}


	public void setSpace(FlySpace space) {
		this.space = space;
	}


	public int getDroneCubeLength() {
		return droneCubeLength;
	}


	public void setDroneCubeLength(int droneCubeLength) {
		this.droneCubeLength = droneCubeLength;
	}


	public Cube getFirstDroneCube() {
		return firstDroneCube;
	}


	public void setFirstDroneCube(Cube firstDroneCube) {
		this.firstDroneCube = firstDroneCube;
	}


	public Cube getSecondDroneCube() {
		return secondDroneCube;
	}


	public void setSecondDroneCube(Cube secondDroneCube) {
		this.secondDroneCube = secondDroneCube;
	}


	public int[] getDefaultCoordinates() {
		return defaultCoordinates;
	}

}
