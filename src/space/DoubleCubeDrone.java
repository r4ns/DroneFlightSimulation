package space;

import drone.Drone;

public class DoubleCubeDrone extends Drone{
	
	public DoubleCubeDrone(){
		super();
	}
	
	public DoubleCubeDrone(int[] startCoordinates){
		super(startCoordinates);
	}
	public DoubleCubeDrone(int[] startCoordinates, FlySpace boundaries){
		
		super(startCoordinates, boundaries);
	}
	
	public void CheckMovementPossibilites(){
		int rightX = this.getX() + 2;
		int upperY = this.getY() + 2; 
		int backZ = this.getZ() + 1;
		
		int x = this.getX();
		int y = this.getY();
		int z = this.getZ();
		if (y == boundaries.getOuterBorder() || (y == boundaries.getSpaceBetween() && x > boundaries.getSpaceBetween() && x < boundaries.getInnerBorder() && z > boundaries.getSpaceBetween() && z < boundaries.getInnerBorder() ))
			canMoveUp = false;
		else 
			canMoveUp = true;
		
		if ((y == boundaries.getInnerBorder() && x > boundaries.getSpaceBetween() && x < boundaries.getInnerBorder() && z > boundaries.getSpaceBetween() && z < boundaries.getInnerBorder())|| y == 0)
			canMoveDown = false;
		else 
			canMoveDown = true;
		//boundaries.getSpaceBetween()
		if (x == 0 || (x== boundaries.getInnerBorder() && z > boundaries.getSpaceBetween() && z < boundaries.getInnerBorder() && y > boundaries.getSpaceBetween() && y < boundaries.getInnerBorder()))
			canMoveLeft = false;
		else 
			canMoveLeft = true;
		
		if (x == boundaries.getOuterBorder() || (x == boundaries.getSpaceBetween()  && z >  boundaries.getSpaceBetween() && z < boundaries.getInnerBorder() && y > boundaries.getSpaceBetween() && y < boundaries.getInnerBorder()))
			canMoveRight = false;
		else 
			canMoveRight = true;
		
		if (z == boundaries.getOuterBorder() || (z == boundaries.getSpaceBetween() && y > boundaries.getSpaceBetween() && y < boundaries.getInnerBorder() && x > boundaries.getSpaceBetween() && x < boundaries.getOuterBorder()))
			canMoveBack = false;
		else 
			canMoveBack = true;
		
		if (z == 0 || (z == boundaries.getInnerBorder() && y > boundaries.getSpaceBetween() && y < boundaries.getInnerBorder() && x > boundaries.getSpaceBetween() && x < boundaries.getInnerBorder()))
			canMoveForth = false;
		else 
			canMoveForth = true;
	}

}
