package drone;

public class Drone implements StandardDrone{

	int x, y, z;
	int sidesVisited;
	boolean topSideVisited, backSideVisited, frontSideVisited, bottomSideVisited, leftSideVisited, rightSideVisited;
	public Drone(){
		x = 30;
		y = 0;
		z = 30;
		CheckSides();
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
	
	@Override
	public String moveUp() {
		if (y == 50 || (y == 10 && x > 10 && x < 40 && z > 10 && z < 40 ))
			return "Drone can't perform this move.";
		
		return "Drone went up to " + ++y + " height.";
	}

	@Override
	public String moveDown() {
		if ((y == 40 && x > 10 && x < 40 && z > 10 && z < 40)|| y == 0)
			return "Drone can't perform this move.";
		
		return "Drone went down to " + --y + " height.";
	}

	@Override
	public String moveLeft() {
		if (x == 0 || (x== 40 && z > 10 && z < 40 && y > 10 && y < 40))
			return "Drone can't perfom this move";
		return "Drone went left to " + --x + " x coordinate.";
	}

	@Override
	public String moveRight() {
		if (x == 50 || (x == 10  && z > 10 && z < 40 && y > 10 && y < 40))
			return "Drone can't perfom this move";
		return "Drone went right to " + ++x + " x coordinate.";
	}

	@Override
	public String moveBack() {
		if (z == 50 || (z == 10 && y > 10 && y < 40 && x > 10 && x < 50))
			return "Drone can't perfom this move";
		return "Drone moved backwards to " + ++z + " z coordinate.";
	}

	@Override
	public String moveForth() {
		if (z == 0 || (z == 40 && y > 10 && y < 40 && x > 10 && x < 40))
			return "Drone can't perfom this move";
		return "Drone moved forwart to " + --z + " z coordinate.";
	}

	@Override
	public String getFormatedCoordinates() {
		return "[" + x + ", " + y + ", " +  z + "]";
	}

}
