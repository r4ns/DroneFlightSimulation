public class Cube {
	
private int [] minCoordinates; 
private int cubeSideLength; 
private int [] maxCoordinates; 

public Cube(int [] cubeStartCoordinates, int side)
{
    minCoordinates[0]=cubeStartCoordinates[0];
    minCoordinates[1]=cubeStartCoordinates[1];
    minCoordinates[2]=cubeStartCoordinates[2];
    maxCoordinates[0]=cubeStartCoordinates[0]+side;
    maxCoordinates[1]=cubeStartCoordinates[1]+side;
    maxCoordinates[2]=cubeStartCoordinates[2]+side;
    cubeSideLength=side;
}

public Cube(Cube cube)
{
	this.setMinCoordinates(cube.getMinCoordinates());
	this.setMaxCoordinates(cube.getMaxCoordinates());
	this.setCubeSideLength(cube.getCubeSideLength());
}

public Cube()
{
}

public boolean checkCoordinates(int [] coordinates)
{
	if (coordinates[0]>=this.getMinCoordinates()[0] && coordinates[0]<=this.getMaxCoordinates()[0]
		&& coordinates[1]>=this.getMinCoordinates()[1] && coordinates[1]<=this.getMaxCoordinates()[1]
		&& coordinates[2]>=this.getMinCoordinates()[2] && coordinates[2]<=this.getMaxCoordinates()[2]) 
	{
		return true;
	}
	else {
		return false;
	}
}

public boolean checkCubeIntersection(Cube cube)
{
	if (checkCoordinates(cube.getMinCoordinates())==true && checkCoordinates(cube.getMaxCoordinates())==true) {
		return true;
	}
	else 
		return false;
	}

public boolean checkIfCubesAreTouching(Cube cube)
{

	if (cube.getMinCoordinates()[0]==this.getMinCoordinates()[0] && cube.getMaxCoordinates()[0]==this.getMaxCoordinates()[0]
		&& cube.getMinCoordinates()[1]==this.getMinCoordinates()[1] && cube.getMaxCoordinates()[1]==this.getMaxCoordinates()[1]
		&& cube.getMinCoordinates()[2]>=this.getMinCoordinates()[2] && cube.getMaxCoordinates()[2]<=this.getMaxCoordinates()[2]) 
	{
		return true;
	}
	else {
		return false;
	}
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
//proverava da li se kocke dodiruju iznutra
public boolean checkIfCubesAreTouchingFromInside(Cube cube)
{
//implementacija treba da koristi checkIfCubesAreTouching
}
//proverava da li se kocke dodiruju sa spoljasnje strane
public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
{
//implementacija treba da koristi checkIfCubesAreTouching
}

public void increaseX(int x)
{
	x++;
}

public void increaseY(int y)
{
	y++;
}

public void increaseZ(int z)
{
	z++;
}

public void decreaseX(int x)
{
	x--;
}

public void decreaseY(int y)
{
	y--;
}

public void decreaseZ(int z)
{
	z--;
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