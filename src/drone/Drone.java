package drone;

import space.FlySpace;

public class Drone implements StandardDrone{
	
	protected FlySpace boundaries;
	int x, y, z;
	int sidesVisited;
	boolean topSideVisited, backSideVisited, frontSideVisited, bottomSideVisited, leftSideVisited, rightSideVisited;
	public Drone(){
		x = 30;
		y = 0;
		z = 30;
		boundaries = new FlySpace(50,40);
		CheckSides();
	}
	public Drone(int[] startCoordinates){
		x = startCoordinates[0];
		y = startCoordinates[1];
		z =  startCoordinates[2];
		boundaries = new FlySpace(50,40);
		CheckSides();
	}
	
	public Drone(int[] startCoordinates, FlySpace boundaries){
		this.boundaries = boundaries;
	}
	public Drone(FlySpace boundaries){
		this.boundaries = boundaries;
		x = 30; 
		y = 30;
		z = 30;
	}
	public void takeAFlight(){
		for (int i = 0; i < 5; i++){
			System.out.println(moveUp());
			CheckSides();
		}
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getSidesVisited() {
		return sidesVisited;
	}

	public void setSidesVisited(int sidesVisited) {
		this.sidesVisited = sidesVisited;
	}

	public void CheckSides(){
		if (x == 50 && z > 0 && y> 0 && !rightSideVisited){
			System.out.println("Rightmost side visited");
			rightSideVisited = true;
			sidesVisited++;
			System.out.println("----------->Sides visited so far: " + sidesVisited);
		}
		if (z == 50 && x > 0 &&  y > 0 && !backSideVisited){
			System.out.println("Back side visited");
			backSideVisited = true;
			sidesVisited++;
			System.out.println("----------->Sides visited so far: " + sidesVisited);
		}
		if (y == 0 && z > 0 && x > 0 && !bottomSideVisited){
			bottomSideVisited = true;
			System.out.println("Bottom side visited");
			sidesVisited++;
			System.out.println("----------->Sides visited so far: " + sidesVisited);
		}
		if (x == 0 && z > 0 && y > 0 && !leftSideVisited){
			leftSideVisited = true;
			System.out.println("Left side visited");
			sidesVisited++;
			System.out.println("----------->Sides visited so far: " + sidesVisited);
		}
		if (y == 50 && z > 0 && x > 0 && !topSideVisited){
			topSideVisited = true;
			System.out.println("Top side visited");
			sidesVisited++;
			System.out.println("----------->Sides visited so far: " + sidesVisited);
		}
		if (z == 0 && x > 0 && y > 0 && !frontSideVisited){
			frontSideVisited = true;
			System.out.println("Front side visited");
			sidesVisited++;
			System.out.println("----------->Sides visited so far: " + sidesVisited);
		}
			
	}
	protected boolean canMoveLeft, canMoveRight, canMoveUp, canMoveDown, canMoveForth, canMoveBack;
	public void CheckMovementPossibilites(){
		
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
	
	public String moveUp() {
		CheckMovementPossibilites();
		if (!canMoveUp)
			return "Drone can't perform this move.";
		
		return "Drone went up to " + ++y + " height.";
	}

	public String moveDown() {
		CheckMovementPossibilites();
		if (!canMoveDown)
			return "Drone can't perform this move.";
		
		return "Drone went down to " + --y + " height.";
	}

	public String moveLeft() {
		CheckMovementPossibilites();
		if (!canMoveLeft)
			return "Drone can't perform this move.";
		return "Drone went left to " + --x + " x coordinate.";
	}

	public String moveRight() {
		CheckMovementPossibilites();
		if (!canMoveRight)
			return "Drone can't perform this move.";
		return "Drone went right to " + ++x + " x coordinate.";
	}

	public String moveBack() {
		CheckMovementPossibilites();
		if (!canMoveBack)
			return "Drone can't perform this move.";
		return "Drone moved backwards to " + ++z + " z coordinate.";
	}

	public String moveForth() {
		CheckMovementPossibilites();
		if (!canMoveForth)
			return "Drone can't perform this move.";
		return "Drone moved forward to " + --z + " z coordinate.";
	}

	public String getFormatedCoordinates() {
		return "[" + x + ", " + y + ", " +  z + "]";
	}

}
