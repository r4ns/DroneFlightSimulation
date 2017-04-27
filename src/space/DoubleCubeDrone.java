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
		
		/*this.startCoordinates1[0] = tDoleDesno.getX();
		this.startCoordinates1[1] = tDoleDesno.getY();
		this.startCoordinates1[2] = tDoleDesno.getZ();
		
		this.startCoordinates2[0] = tGoreLevo.getX();
		this.startCoordinates2[1] = tGoreLevo.getY();
		this.startCoordinates2[2] = tGoreLevo.getZ();
		
		this.startCoordinates3[0] = tSredinaDesno.getX();
		this.startCoordinates3[1] = tSredinaDesno.getY();
		this.startCoordinates3[2] = tSredinaDesno.getZ();
		
		this.startCoordinates4[0] = tSredinaLevo.getX();
		this.startCoordinates4[1] = tSredinaLevo.getY();
		this.startCoordinates4[2] = tSredinaLevo.getZ();*/

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
				/*if (botMax[1] == space.cubeInside.getCubeSideLength()-1 
						&& botMax[0] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[0] > space.cubeInside.getCubeSideLength()
						&& botMax[2] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[2] > space.cubeInside.getCubeSideLength()) {
					return false;
				}
				else if (topMax[1] < space.cubeOutside.getCubeSideLength()) {
					return true;
				}
				else {
					return false;
				}*/
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
					/*this.moveRight();
					this.moveUp();
					this.moveUp();
					this.moveLeft();*/
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					/*this.moveLeft();
					this.moveUp();
					this.moveUp();
					this.moveRight();*/
					return true;
				}
				else {
					return false;
				}
			}
			
			else if (command == "moveDown") {
				/*if (botMax[1] == space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() + 1 
						&& botMax[0] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[0] > space.cubeInside.getCubeSideLength()
						&& botMax[2] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[2] > space.cubeInside.getCubeSideLength()) {
					return false;
				}
				else if (botMin[1] > 0) {
					return true;
				}
				else {
					return false;
				}*/
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
					/*this.moveRight();
					this.moveUp();
					this.moveUp();
					this.moveLeft();*/
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					/*this.moveLeft();
					this.moveUp();
					this.moveUp();
					this.moveRight();*/
					return true;
				}
				else {
					return false;
				}
				
			}
			
			else if (command == "moveRight") {
				/*if (botMax[0] == space.cubeInside.getCubeSideLength()-1 
						&& botMax[1] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[1] > space.cubeInside.getCubeSideLength()
						&& botMax[2] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[2] > space.cubeInside.getCubeSideLength()) {
					return false;
				}
				else if (topMax[0] < space.cubeOutside.getCubeSideLength()) {
					return true;
				}
				else {
					return false;
				}*/
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
					/*this.moveRight();
					this.moveUp();
					this.moveUp();
					this.moveLeft();*/
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					/*this.moveLeft();
					this.moveUp();
					this.moveUp();
					this.moveRight();*/
					return true;
				}
				else {
					return false;
				}
			}
			
			else if (command == "moveLeft") {
				/*if (botMax[0] == space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() + 1 
						&& botMax[1] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[1] > space.cubeInside.getCubeSideLength()
						&& botMax[2] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[2] > space.cubeInside.getCubeSideLength()) {
					return false;
				}
				else if (botMin[0] > 0) {
					return true;
				}
				else {
					return false;
				}*/
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
					/*this.moveRight();
					this.moveUp();
					this.moveUp();
					this.moveLeft();*/
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					/*this.moveLeft();
					this.moveUp();
					this.moveUp();
					this.moveRight();*/
					return true;
				}
				else {
					return false;
				}
			}
			
			else if (command == "moveBack") {
				/*if (botMax[2] == space.cubeInside.getCubeSideLength()-1 
						&& botMax[0] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[0] > space.cubeInside.getCubeSideLength()
						&& botMax[1] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[1] > space.cubeInside.getCubeSideLength()) {
					return false;
				}
				else if (topMax[2] < space.cubeOutside.getCubeSideLength()) {
					return true;
				}
				else {
					return false;
				}
			}*/
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
					/*this.moveRight();
					this.moveUp();
					this.moveUp();
					this.moveLeft();*/
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					/*this.moveLeft();
					this.moveUp();
					this.moveUp();
					this.moveRight();*/
					return true;
				}
				else {
					return false;
				}
		}
			
			else if (command == "moveForth") {
				/*if (botMax[2] == space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() + 1 
						&& botMax[0] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[0] > space.cubeInside.getCubeSideLength()
						&& botMax[1] < space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
						&& botMax[1] > space.cubeInside.getCubeSideLength()) {
					return false;
				}
				else if (botMin[2] > 0) {
					return true;
				}
				else {
					return false;
				}*/
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
					/*this.moveRight();
					this.moveUp();
					this.moveUp();
					this.moveLeft();*/
					return true;
				}
				else if (checkTouchingCubeTop(dummy) == false && checkTouchingCubeBottom(dummy) == true) {
					/*this.moveLeft();
					this.moveUp();
					this.moveUp();
					this.moveRight();*/
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
		/*if ((tDoleDesno.provera("moveUp") == true) && (tSredinaDesno.provera("moveUp") == true)
					&& (tSredinaLevo.provera("moveUp") == true) && (tGoreLevo.provera("moveUp") == true)) {
					
		return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}*/
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
		/*
			if ((tDoleDesno.provera("moveDown") == true) && (tSredinaDesno.provera("moveDown") == true)
					&& (tSredinaLevo.provera("moveDown") == true) && (tGoreLevo.provera("moveDown") == true)) {
				this.tDoleDesno.moveDown();
				this.tGoreLevo.moveDown();
				this.tSredinaDesno.moveDown();
				this.tSredinaLevo.moveDown();
				return getFormatedCoordinates();			
			}
			else
				return getFormatedCoordinates();*/
		
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
			/*if ((tDoleDesno.provera("moveLeft") == true) && (tSredinaDesno.provera("moveLeft") == true)
					&& (tSredinaLevo.provera("moveLeft") == true) && (tGoreLevo.provera("moveLeft") == true)) {
				this.tDoleDesno.moveLeft();
				this.tGoreLevo.moveLeft();
				this.tSredinaDesno.moveLeft();
				this.tSredinaLevo.moveLeft();
				return getFormatedCoordinates();
			}
		else
			return getFormatedCoordinates();*/
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
			/*if ((tDoleDesno.provera("moveRight") == true) && (tSredinaDesno.provera("moveRight") == true)
					&& (tSredinaLevo.provera("moveRight") == true) && (tGoreLevo.provera("moveRight") == true)) {
				this.tDoleDesno.moveRight();
				this.tGoreLevo.moveRight();
				this.tSredinaDesno.moveRight();
				this.tSredinaLevo.moveRight();
				return getFormatedCoordinates();
			}
			else
				return getFormatedCoordinates();*/
		
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
		/*if ((tDoleDesno.provera("moveBack") == true) && (tSredinaDesno.provera("moveBack") == true)
					&& (tSredinaLevo.provera("moveBack") == true) && (tGoreLevo.provera("moveBack") == true)) {
				this.tDoleDesno.moveBack();
				this.tGoreLevo.moveBack();
				this.tSredinaDesno.moveBack();
				this.tSredinaLevo.moveBack();
				return getFormatedCoordinates();
		}
		else
				return getFormatedCoordinates();*/
		
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
			/*if ((tDoleDesno.provera("moveForth") == true) && (tSredinaDesno.provera("moveForth") == true)
					&& (tSredinaLevo.provera("moveForth") == true) && (tGoreLevo.provera("moveForth") == true)) {
				this.tDoleDesno.moveForth();
				this.tGoreLevo.moveForth();
				this.tSredinaDesno.moveForth();
				this.tSredinaLevo.moveForth();
				return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();*/
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
		/*return "Dole desna: (" + this.tDoleDesno.getX() + ", " + this.tDoleDesno.getY() + ", " + this.tDoleDesno.getZ() + ")  "
				+ "Sredina desna: (" + this.tSredinaDesno.getX() + ", " + this.tSredinaDesno.getY() + ", " + this.tSredinaDesno.getZ() + ")  "
				+ "Sredina leva: (" + this.tSredinaLevo.getX() + ", " + this.tSredinaLevo.getY() + ", " + this.tSredinaLevo.getZ() + ")  "
				+ "Gore leva: (" + this.tGoreLevo.getX() + ", " + this.tGoreLevo.getY() + ", " + this.tGoreLevo.getZ() + ")"; */
		
		return this.cubeBottom.toString() + this.cubeTop.toString();
	}
	
	public boolean checkTouchingCubeBottom (DoubleCubeDrone drone) {
		/*for (int i = 0; i < space.getArrayOfCubes().length; i++) {
			if (drone.cubeBottom.checkIfCubesAreTouching(space.arrayOfCubes[i]) || drone.cubeTop.checkIfCubesAreTouching(space.arrayOfCubes[i])) {
				return false;
			}
			else {
				return true;
			}
		}*/
		
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
		/*for (int i = 0; i < space.getArrayOfCubes().length; i++) {
			if (drone.cubeBottom.checkIfCubesAreTouching(space.arrayOfCubes[i]) || drone.cubeTop.checkIfCubesAreTouching(space.arrayOfCubes[i])) {
				return false;
			}
			else {
				return true;
			}
		}*/
		
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
