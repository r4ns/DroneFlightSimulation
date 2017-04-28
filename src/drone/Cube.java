package drone;

public class Cube {
private int [] minCoordinates;
private int cubeSideLength; 
private int [] maxCoordinates; 


public Cube(int [] cubeStartCoordinates, int side)
{
	int x1 = cubeStartCoordinates[0];
	int y1 = cubeStartCoordinates[1];
	int z1 = cubeStartCoordinates[2] + side;
	this.cubeSideLength = side;
	int x = cubeStartCoordinates[0] + side; 
	int y = cubeStartCoordinates[1] + side;
	int z = cubeStartCoordinates[2];
	this.setMinCoordinates(new int[] {x1, y1, z1});
	this.setMaxCoordinates(new int[] {x, y, z});
}


public Cube(Cube cube)
{
	this.cubeSideLength = cube.getCubeSideLength();
	this.minCoordinates = cube.getMinCoordinates();
	this.maxCoordinates = cube.getMaxCoordinates();
}


public Cube()
{
	
}


public boolean checkCoordinates(int [] coordinates)
{
	if ((coordinates[0] >= this.minCoordinates[0] && coordinates[0] <= this.maxCoordinates[0])
			&& (coordinates[1] >= this.minCoordinates[1] && coordinates[1] <= this.maxCoordinates[1])
			&& (coordinates[2] >= this.maxCoordinates[2] && coordinates[2] <= this.minCoordinates[2])) {
		return true;
	}
	else
		return false;
}


public boolean checkCubeIntersection(Cube cube)
{
	
	
	
	if ((cube.minCoordinates[0] <= this.minCoordinates[0] && cube.maxCoordinates[0] >= this.minCoordinates[0])
			|| (cube.minCoordinates[1] <= this.minCoordinates[1] && cube.maxCoordinates[1] >= this.minCoordinates[1])
			|| (cube.minCoordinates[2] <= this.minCoordinates[2] && cube.maxCoordinates[2] >= this.minCoordinates[2])
			|| (this.minCoordinates[0] <= cube.minCoordinates[0] && this.maxCoordinates[0] >= cube.minCoordinates[0])
			|| (this.minCoordinates[1] <= cube.minCoordinates[1] && this.maxCoordinates[1] >= cube.minCoordinates[1])
			|| (this.minCoordinates[2] <= cube.minCoordinates[2] && this.maxCoordinates[2] >= cube.minCoordinates[2])) {
		return true;
	}
	else
		return false;
}


public boolean checkIfCubesAreTouching(Cube cube)
{
	
	
		int[] startCoordinates = {cube.minCoordinates[0], cube.minCoordinates[1], cube.minCoordinates[2] - cube.cubeSideLength};
		Cube dummy = new Cube(startCoordinates, cube.cubeSideLength + 1);
		if (this.checkCubeIntersection(dummy) == true) {
			return true;
		}
		else
			return false;
	
	
	
	
}

@Override
public String toString()
{
return "Drone position: ("
+ Integer.toString(minCoordinates[0]) + ","
+ Integer.toString(minCoordinates[1]) + ","
+ Integer.toString(minCoordinates[2]) + "), ("
+ Integer.toString(maxCoordinates[0]) + ","
+ Integer.toString(maxCoordinates[1]) + ","
+ Integer.toString(maxCoordinates[2]) + ")";
}


public boolean checkIfCubesAreTouchingFromInside(Cube cube)
{	
	
	
	
	if (this.checkCubeIntersection(cube) == true && this.checkIfCubesAreTouching(cube) == true)
		return true;
	else
		return false;
}


public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
{

	
	
	
	if (this.checkCubeIntersection(cube) == false && this.checkIfCubesAreTouching(cube) == true)
		return true;
	else
		return false;
	
}


public void increaseX()
{
	this.minCoordinates[0]++;
	this.maxCoordinates[0]++;
}


public void increaseY()
{
	this.minCoordinates[1]++;
	this.maxCoordinates[1]++;
}


public void increaseZ()
{
	this.minCoordinates[2]++;
	this.maxCoordinates[2]++;
}


public void decreaseX()
{
	this.minCoordinates[0]--;
	this.maxCoordinates[0]--;
}

public void decreaseY()
{
	this.minCoordinates[1]--;
	this.maxCoordinates[1]--;
}


public void decreaseZ()
{
	this.minCoordinates[2]--;
	this.maxCoordinates[2]--;
}

public int[] getMinCoordinates() {
return minCoordinates;
}
public void setMinCoordinates(int[] minCoordinates) {
this.minCoordinates = minCoordinates;
}
public int getCubeSideLength() {
return cubeSideLength;
}
public void setCubeSideLength(int cubeSideLength) {
this.cubeSideLength = cubeSideLength;
}
public int[] getMaxCoordinates() {
return maxCoordinates;
}
public void setMaxCoordinates(int[] maxCoordinates) {
this.maxCoordinates = maxCoordinates;
}
}
