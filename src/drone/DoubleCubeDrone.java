package drone;

import exceptions.DroneExcpetion;
import space.FlySpace;
import util.Cube;

public class DoubleCubeDrone {

	private FlySpace space;
	private int droneCubeLength;
	private	int[] defaultCoordinates = new int[] {0,0,0};
	private Cube firstDroneCube,secondDroneCube;
	
	public DoubleCubeDrone(int [] droneBottomCoordinates,int droneCubeLength, 
						   int[] spaceBoundaries, int spaceOffset){
		firstDroneCube = new Cube(droneBottomCoordinates, droneCubeLength);
		secondDroneCube = new Cube(new int[]{
				droneBottomCoordinates[0]+droneCubeLength,
				droneBottomCoordinates[1]+droneCubeLength,
				droneBottomCoordinates[2]+droneCubeLength }, droneCubeLength);
		this.droneCubeLength = droneCubeLength;
		space = new FlySpace(defaultCoordinates, spaceBoundaries, spaceOffset);
		
	}
	
	public String validateDronePositionAfter(String command) throws DroneExcpetion{
		switch (command.toLowerCase()) {
		case "moveup":
			//TODO
			break;
		case "movedown":
			//TODO
			break;
		case "moveleft":
			//TODO
			break;
		case "moveright":
			//TODO
			break;
		case "moveforth":
			//TODO
			break;
		case "moveback":
			//TODO
			break;

		default:
			throw new DroneExcpetion("Unknown command called");
		}
		return null;
	}
	
	public String getFormatedCoordinates() {
		
		return null;
	}

}
