package drone;

public class Cube {
private int [] minCoordinates; //donja tacka dijagonale kocke
private int cubeSideLength; //duzina stranice kocke
private int [] maxCoordinates; //gornja tacka dijagonale kocke

//kreira kocku na osnovu prosledjenih parametara
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

//kopira prosledjenu kocku
public Cube(Cube cube)
{
	this.cubeSideLength = cube.getCubeSideLength();
	this.minCoordinates = cube.getMinCoordinates();
	this.maxCoordinates = cube.getMaxCoordinates();
}

//default konstruktor
public Cube()
{
	
}

//proverava da li se prosledjene koordinate nalaze u kocki
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

//proverava da li se kocke seku
public boolean checkCubeIntersection(Cube cube)
{
	/*
	int[] pt1 = {cube.minCoordinates[0], cube.minCoordinates[1], cube.minCoordinates[2] - 1};
	int[] pt2 = cube.minCoordinates;
	int[] pt3 = {cube.minCoordinates[0], cube.minCoordinates[1] + 1, cube.minCoordinates[2] - 1};
	int[] pt4 = {cube.minCoordinates[0], cube.minCoordinates[1] + 1, cube.minCoordinates[2]};
	int[] pt5 = {cube.maxCoordinates[0], cube.maxCoordinates[1] - 1, cube.maxCoordinates[2]};
	int[] pt6 = {cube.minCoordinates[0] + 1, cube.minCoordinates[1], cube.minCoordinates[2]};
	int[] pt7 = cube.maxCoordinates;
	int[] pt8 = {cube.maxCoordinates[0], cube.maxCoordinates[1], cube.maxCoordinates[2] + 1};
	if (this.checkCoordinates(cube.getMinCoordinates()) == true || this.checkCoordinates(cube.getMaxCoordinates()) == true
			|| this.checkCoordinates(pt1) == true || this.checkCoordinates(pt3) == true || this.checkCoordinates(pt4) == true 
			|| this.checkCoordinates(pt5) == true || this.checkCoordinates(pt6) == true || this.checkCoordinates(pt8) == true)
		return true;
	else
		return false;
		*/
	
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

//proverava da li se kocke dodiruju
public boolean checkIfCubesAreTouching(Cube cube)
{
	/*int[] pt1 = {cube.minCoordinates[0], cube.minCoordinates[1], cube.minCoordinates[2] - 1};
	int[] pt2 = cube.minCoordinates;
	int[] pt3 = {cube.minCoordinates[0], cube.minCoordinates[1] + 1, cube.minCoordinates[2] - 1};
	int[] pt4 = {cube.minCoordinates[0], cube.minCoordinates[1] + 1, cube.minCoordinates[2]};
	int[] pt5 = {cube.maxCoordinates[0], cube.maxCoordinates[1] - 1, cube.maxCoordinates[2]};
	int[] pt6 = {cube.minCoordinates[0] + 1, cube.minCoordinates[1], cube.minCoordinates[2]};
	int[] pt7 = cube.maxCoordinates;
	int[] pt8 = {cube.maxCoordinates[0], cube.maxCoordinates[1], cube.maxCoordinates[2] + 1};
	
	int[] thisCubePt1 = {this.minCoordinates[0], this.minCoordinates[1], this.minCoordinates[2] - 1};
	int[] thisCubePt2 = this.minCoordinates;
	int[] thisCubePt3 = {this.minCoordinates[0], this.minCoordinates[1] + 1, this.minCoordinates[2] - 1};
	int[] thisCubePt4 = {this.minCoordinates[0], this.minCoordinates[1] + 1, this.minCoordinates[2]};
	int[] thisCubePt5 = {this.maxCoordinates[0], this.maxCoordinates[1] - 1, this.maxCoordinates[2]};
	int[] thisCubePt6 = {this.minCoordinates[0] + 1, this.minCoordinates[1], this.minCoordinates[2]};
	int[] thisCubePt7 = this.maxCoordinates;
	int[] thisCubePt8 = {this.maxCoordinates[0], this.maxCoordinates[1], this.maxCoordinates[2] + 1};
	*/
	
		int[] startCoordinates = {cube.minCoordinates[0], cube.minCoordinates[1], cube.minCoordinates[2] - cube.cubeSideLength};
		Cube dummy = new Cube(startCoordinates, cube.cubeSideLength + 1);
		if (this.checkCubeIntersection(dummy) == true) {
			return true;
		}
		else
			return false;
	
	/*if (this.maxCoordinates == pt3) {
		return true;
	}
	else if (this.maxCoordinates == pt5) {
		return true;
	}
	else if (this.minCoordinates == pt6) {
		return true;
	}
	else if (this.minCoordinates == pt4) {
		return true;
	}
	else if (this.maxCoordinates == pt8) {
		return true;
	}
	else if (thisCubePt8 == pt7) {
		return true;
	}
	else if (this.maxCoordinates == pt6) {
		return true;
	}
	else if (thisCubePt3 == pt5) {
		return true;
	}
	else if (this.maxCoordinates == pt1) {
		return true;
	}
	else if (thisCubePt4 == pt2) {
		return true;
	}
	else if (thisCubePt1 == pt4) {
		return true;
	}
	else if (thisCubePt2 == pt3) {
		return true;
	}
	else if (thisCubePt4 == pt6) {
		return true;
	}
	else if (thisCubePt8 == pt2) {
		return true;
	}
	else if (thisCubePt6 == pt1) {
		return true;
	}
	else if (thisCubePt1 == pt6) {
		return true;
	}
	else if (thisCubePt5 == pt2) {
		return true;
	}
	else if (thisCubePt2 == pt5) {
		return true;
	}
	else if (thisCubePt3 == pt6) {
		return true;
	}
	else if (thisCubePt4 == pt5) {
		return true;
	}
	else if (thisCubePt2 == pt7) {
		return true;
	}
	else if (thisCubePt1 == pt8) {
		return true;
	}
	else if (thisCubePt6 == pt3) {
		return true;
	}
	else if (thisCubePt5 == pt4) {
		return true;
	}
	else if (thisCubePt7 == pt2) {
		return true;
	}
	else if (thisCubePt8 == pt1) {
		return true;
	}
	else
		return false;*/
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
	
	/*if ((this.checkCoordinates(cube.getMinCoordinates()) == true 
			&& this.checkCoordinates(cube.getMaxCoordinates()) == true) 
			&& this.checkCoordinates(pt1) == true
			&& this.checkCoordinates(pt3) == true
			&& this.checkCoordinates(pt4) == true
			&& this.checkCoordinates(pt6) == true
			&& this.checkCoordinates(pt5) == true
			&& this.checkCoordinates(pt8) == true) {
		if (cube.checkIfCubesAreTouching(this)) {
			return true;
		}
		else
			return false;
	}
	else
		return false;*/
	
	if (this.checkCubeIntersection(cube) == true && this.checkIfCubesAreTouching(cube) == true)
		return true;
	else
		return false;
}

//proverava da li se kocke dodiruju sa spoljasnje strane
public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
{

	
	/*if ((this.checkCoordinates(cube.getMinCoordinates()) == false 
			&& this.checkCoordinates(cube.getMaxCoordinates()) == false) 
			&& this.checkCoordinates(pt1) == false
			&& this.checkCoordinates(pt3) == false
			&& this.checkCoordinates(pt4) == false
			&& this.checkCoordinates(pt6) == false
			&& this.checkCoordinates(pt5) == false
			&& this.checkCoordinates(pt8) == false) {
		
				if (this.checkIfCubesAreTouching(cube) == true)
					return true;
				else
					return false;
	}
	else
		return false;*/
	
	if (this.checkCubeIntersection(cube) == false && this.checkIfCubesAreTouching(cube) == true)
		return true;
	else
		return false;
	
}

//uvecava X
public void increaseX()
{
	this.minCoordinates[0]++;
	this.maxCoordinates[0]++;
}

//uvecava Y
public void increaseY()
{
	this.minCoordinates[1]++;
	this.maxCoordinates[1]++;
}

//uvecava Z
public void increaseZ()
{
	this.minCoordinates[2]++;
	this.maxCoordinates[2]++;
}

//smanjuje X
public void decreaseX()
{
	this.minCoordinates[0]--;
	this.maxCoordinates[0]--;
}
//smanjuje Y
public void decreaseY()
{
	this.minCoordinates[1]--;
	this.maxCoordinates[1]--;
}

//smanjuje Z
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
