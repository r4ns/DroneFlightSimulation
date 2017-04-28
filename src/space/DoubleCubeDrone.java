package space;

import drone.Cube;
import drone.DroneOne;
import tests.DroneException;

public class DoubleCubeDrone extends DroneOne {
	
	private DroneOne tDoleDesno;
	private DroneOne tSredinaDesno;
	private DroneOne tSredinaLevo;
	private DroneOne tGoreLevo;
	private Cube cubeBottom;
	private Cube cubeTop;
	private int[] startCoordinates = {30, 0, 30};
	private FlySpace space;

	
	public DoubleCubeDrone () {
		
	}
	
	public DoubleCubeDrone (int[] coordinates, int side) {
		cubeBottom = new Cube(coordinates, side);
		int[] coordinatesTop = {coordinates[0] + side, coordinates[1] + side, coordinates[2]};
		cubeTop = new Cube(coordinatesTop, side);
	}
	
	
	public DoubleCubeDrone(DroneOne tDoleDesno, DroneOne tSredinaDesno, DroneOne tSredinaLevo, DroneOne tGoreLevo) {
		this.tDoleDesno = tDoleDesno;
		this.tSredinaDesno = tSredinaDesno;
		this.tSredinaLevo = tSredinaLevo;
		this.tGoreLevo = tGoreLevo;
		
		

	}
	
	protected boolean validateDronePositionAfter(String command) {
		space = new FlySpace(new Cube(new int[] {10, 10, 10}, 30), new Cube(new int[] {0, 0, 0}, 50));
		int[] topMax = this.cubeTop.getMaxCoordinates();
		int[] topMin = this.cubeTop.getMinCoordinates();
		int[] botMax = this.cubeBottom.getMaxCoordinates();
		int[] botMin = this.cubeBottom.getMinCoordinates();
		
		int[] startDummy = {botMin[0], botMin[1], botMin[2] - 1};
		DoubleCubeDrone dummy;
		
		if (space.cubeOutside.checkCoordinates(this.cubeTop.getMaxCoordinates()) == true 
				&& space.cubeOutside.checkCoordinates(this.cubeBottom.getMinCoordinates()) == true
				&& space.cubeOutside.checkCoordinates(this.cubeBottom.getMaxCoordinates()) == true
				&& space.cubeOutside.checkCoordinates(this.cubeTop.getMinCoordinates()) == true
				&& space.cubeInside.checkCoordinates(this.cubeTop.getMaxCoordinates()) == false 
				&& space.cubeInside.checkCoordinates(this.cubeBottom.getMinCoordinates()) == false
				&& space.cubeInside.checkCoordinates(this.cubeBottom.getMaxCoordinates()) == false
				&& space.cubeInside.checkCoordinates(this.cubeTop.getMinCoordinates()) == false) {
			
			if (command == "moveUp") {
				
				startDummy[1]++;
				dummy = new DoubleCubeDrone(startDummy, 1);
				if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == true) {
					if ((botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0)) {
						if (topMax[1] < space.cubeInside.getCubeSideLength() || (botMin[1] > space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && botMin[1] < space.cubeOutside.getCubeSideLength())) {
							return true;
						}
						else if ((botMin[0] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[0] <= space.cubeOutside.getCubeSideLength())
							|| (botMin[2] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[2] <= space.cubeOutside.getCubeSideLength())
							|| topMax[0] <= space.cubeInside.getCubeSideLength() || topMax[2] <= space.cubeInside.getCubeSideLength()) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == false) {
					
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					
					return true;
				}
				else {
					return false;
				}
			}
			
			else if (command == "moveDown") {
				
				startDummy[1]--;
				dummy = new DoubleCubeDrone(startDummy, 1);
				if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == true) {
					if ((topMax[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (topMax[1] < space.cubeOutside.getCubeSideLength() && botMin[1] > 0) && (topMin[2] < space.cubeOutside.getCubeSideLength() && topMax[2] > 0)) {
						if ((botMin[1] >= (space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength()) && topMax[1] < space.cubeOutside.getCubeSideLength()) || (botMin[1] > 0 && topMax[1] < space.cubeInside.getCubeSideLength())) {
							return true;
						}
						else if ((botMin[0] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[0] <= space.cubeOutside.getCubeSideLength())
							|| (botMin[2] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[2] <= space.cubeOutside.getCubeSideLength())
							|| topMax[0] <= space.cubeInside.getCubeSideLength() || topMax[2] <= space.cubeInside.getCubeSideLength()) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == false) {
					
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					
					return true;
				}
				else {
					return false;
				}
				
			}
			
			else if (command == "moveRight") {
				
				startDummy[0]++;
				dummy = new DoubleCubeDrone(startDummy, 1);
				if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == true) {
					if ((botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0)) {
						if (topMax[0] < space.cubeInside.getCubeSideLength() || (botMin[0] > space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && botMin[0] < space.cubeOutside.getCubeSideLength())) {
							return true;
						}
						else if ((botMin[1] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[1] <= space.cubeOutside.getCubeSideLength())
							|| (botMin[2] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[2] <= space.cubeOutside.getCubeSideLength())
							|| topMax[1] <= space.cubeInside.getCubeSideLength() || topMax[2] <= space.cubeInside.getCubeSideLength()) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == false) {
					
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					
					return true;
				}
				else {
					return false;
				}
			}
			
			else if (command == "moveLeft") {
				
				startDummy[0]--;
				dummy = new DoubleCubeDrone(startDummy, 1);
				if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == true) {
					if ((topMax[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (topMax[1] < space.cubeOutside.getCubeSideLength() && botMin[1] > 0) && (topMin[2] < space.cubeOutside.getCubeSideLength() && topMax[2] > 0)) {
						if ((botMin[0] >= (space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength()) && topMax[0] < space.cubeOutside.getCubeSideLength()) || (botMin[0] > 0 && topMax[0] < space.cubeInside.getCubeSideLength())) {
							return true;
						}
						else if ((botMin[1] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[1] <= space.cubeOutside.getCubeSideLength())
							|| (botMin[2] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[2] <= space.cubeOutside.getCubeSideLength())
							|| topMax[1] <= space.cubeInside.getCubeSideLength() || topMax[2] <= space.cubeInside.getCubeSideLength()) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == false) {
					
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					
					return true;
				}
				else {
					return false;
				}
			}
			
			else if (command == "moveBack") {
				
				startDummy[2]++;
				dummy = new DoubleCubeDrone(startDummy, 1);
				if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == true) {
					if ((topMax[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (topMax[1] < space.cubeOutside.getCubeSideLength() && botMin[1] > 0) && (topMin[2] < space.cubeOutside.getCubeSideLength() && topMax[2] > 0)) {
						if (topMax[2] < space.cubeInside.getCubeSideLength() || (botMin[2] > space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && botMin[2] < space.cubeOutside.getCubeSideLength())) {
							return true;
						}
						else if ((botMin[0] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[0] <= space.cubeOutside.getCubeSideLength())
							|| (botMin[1] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[1] <= space.cubeOutside.getCubeSideLength())
							|| topMax[0] <= space.cubeInside.getCubeSideLength() || topMax[1] <= space.cubeInside.getCubeSideLength()) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == false) {
					
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					
					return true;
				}
				else {
					return false;
				}
		}
			
			else if (command == "moveForth") {
				
				startDummy[2]--;
				dummy = new DoubleCubeDrone(startDummy, 1);
				if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == true) {
					if ((topMax[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (topMax[1] < space.cubeOutside.getCubeSideLength() && botMin[1] > 0) && (topMin[2] < space.cubeOutside.getCubeSideLength() && topMax[2] > 0)) {
						if ((botMin[2] >= (space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength()) && topMin[2] < space.cubeOutside.getCubeSideLength()) || (botMin[2] > 0 && botMax[2] < space.cubeInside.getCubeSideLength())) {
							return true;
						}
						else if ((botMin[0] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[0] <= space.cubeOutside.getCubeSideLength())
							|| (botMin[1] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[1] <= space.cubeOutside.getCubeSideLength())
							|| topMax[0] <= space.cubeInside.getCubeSideLength() || topMax[1] <= space.cubeInside.getCubeSideLength()) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
				else if (checkTouchingCubeTop(dummy) == true && checkTouchingCubeBottom(dummy) == false) {
					
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public String moveUp() {
		
		if (this.validateDronePositionAfter("moveUp") == true) {
			this.cubeBottom.increaseY();
			this.cubeTop.increaseY();
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates();
		}
	}
		
	public String moveDown(){
		
		
		if (this.validateDronePositionAfter("moveDown") == true) {
			this.cubeBottom.decreaseY();
			this.cubeTop.decreaseY();
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveLeft() {
			
		if (this.validateDronePositionAfter("moveLeft") == true) {
			this.cubeBottom.decreaseX();
			this.cubeTop.decreaseX();
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates();
		}
	}
	public String moveRight(){		
			
		
		if (this.validateDronePositionAfter("moveRight") == true) {
			this.cubeBottom.increaseX();
			this.cubeTop.increaseX();
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates();
		}
			
	}
	@Override
	public String moveBack() {
		
		
		if (this.validateDronePositionAfter("moveBack") == true) {
			this.cubeBottom.increaseZ();
			this.cubeTop.increaseZ();
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates();
		}
	}
	
	@Override
	public String moveForth() {
			
		if (this.validateDronePositionAfter("moveForth") == true) {
			this.cubeBottom.decreaseZ();
			this.cubeTop.decreaseZ();
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates();
		}
	}
	
	public String getFormatedCoordinates() {
		
		return this.cubeBottom.toString() + this.cubeTop.toString();
	}
	
	public boolean checkTouchingCubeBottom (DoubleCubeDrone drone) {
		
		
		if (drone.cubeBottom.checkCubeIntersection(space.arrayOfCubes[0]) 
				|| drone.cubeBottom.checkCubeIntersection(space.arrayOfCubes[1]) 
				|| drone.cubeBottom.checkCubeIntersection(space.arrayOfCubes[2]) 
				|| drone.cubeBottom.checkCubeIntersection(space.arrayOfCubes[3])) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean checkTouchingCubeTop (DoubleCubeDrone drone) {
		
		
		if (drone.cubeTop.checkCubeIntersection(space.arrayOfCubes[0]) 
				|| drone.cubeTop.checkCubeIntersection(space.arrayOfCubes[1]) 
				|| drone.cubeTop.checkCubeIntersection(space.arrayOfCubes[2]) 
				|| drone.cubeTop.checkCubeIntersection(space.arrayOfCubes[3])) {
			return false;
		}
		else {
			return true;
		}
	}
	
public void check() throws DroneException {
		
		for(int i=0; i < space.getArrayOfCubes().length; i++){
			if(this.cubeBottom.checkIfCubesAreTouching(space.arrayOfCubes[i]) || this.cubeTop.checkIfCubesAreTouching(space.arrayOfCubes[i])){
				
				throw new DroneException();
			}
		}
		
	
	}

	public DroneOne gettDoleDesno() {
		return tDoleDesno;
	}
	public DroneOne gettSredinaDesno() {
		return tSredinaDesno;
	}
	public DroneOne gettSredinaLevo() {
		return tSredinaLevo;
	}
	public DroneOne gettGoreLevo() {
		return tGoreLevo;
	}
	public void settDoleDesno(DroneOne tDoleDesno) {
		this.tDoleDesno = tDoleDesno;
	}
	public void settSredinaDesno(DroneOne tSredinaDesno) {
		this.tSredinaDesno = tSredinaDesno;
	}
	public void settSredinaLevo(DroneOne tSredinaLevo) {
		this.tSredinaLevo = tSredinaLevo;
	}
	public void settGoreLevo(DroneOne tGoreLevo) {
		this.tGoreLevo = tGoreLevo;
	}
	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}

	public Cube getCubeBottom() {
		return cubeBottom;
	}

	public Cube getCubeTop() {
		return cubeTop;
	}

	public FlySpace getSpace() {
		return space;
	}

	public void setCubeBottom(Cube cubeBottom) {
		this.cubeBottom = cubeBottom;
	}

	public void setCubeTop(Cube cubeTop) {
		this.cubeTop = cubeTop;
	}

	public void setSpace(FlySpace space) {
		this.space = space;
	}



	
	

}
