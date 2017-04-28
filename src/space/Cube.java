package space;

public class Cube {
	private int [] minCoordinates; //donja tacka dijagonale kocke
	private int cubeSideLength; //duzina stranice kocke
	private int [] maxCoordinates; //gornja tacka dijagonale kocke
	//kreira kocku na osnovu prosledjenih parametara
	public Cube(int [] cubeStartCoordinates, int side)
	{
		minCoordinates = cubeStartCoordinates.clone();
		maxCoordinates = new int[cubeStartCoordinates.length];
		cubeSideLength = side;
		//Prosledjivanje vrednosti a ne reference u slucaju izmene vrednosti niza u pozivanoj klasi
		for (int i = 0; i <cubeStartCoordinates.length; i++){
			maxCoordinates[i] = minCoordinates[i] + side;	
		}
	}
		//kopira prosledjenu kocku
	public Cube(Cube cube)
	{
		this.minCoordinates = cube.getMinCoordinates().clone();
		this.maxCoordinates = cube.getMaxCoordinates().clone();
		this.cubeSideLength = cube.getCubeSideLength();
	}
	//default konstruktor
	public Cube()
	{
	}
		//proverava da li se prosledjene koordinate nalaze u kocki
	public boolean checkCoordinates(int [] coordinates)
	{
		for (int i = 0; i < coordinates.length; i++){
			if (coordinates[i] < minCoordinates[i])
				return false;
			else if (coordinates[i] - minCoordinates[i] > cubeSideLength)
				return false;
			
		}
		return true;
	}
		//proverava da li se kocke seku
	public boolean checkCubeIntersection(Cube cube)
	{	
		for (int x = 1; x < this.cubeSideLength; x++){
			for (int y = 1; y < this.cubeSideLength; y++){
				for (int z = 1; z < this.cubeSideLength ; z++){
					int[] coordinates = new int[]{minCoordinates[0] + x, minCoordinates[1] + y, minCoordinates[2] + z};
					boolean areInterstected = cube.checkCoordinates(coordinates);
					if (areInterstected) return true;
				}
			}
		}
		return false;
	}
		//proverava da li se kocke dodiruju
	public boolean checkIfCubesAreTouching(Cube cube)
	{
		String log = "Rezultat: \n";
		boolean result = false;
		//Provera da li uopste mogu da se dodiruju
		if (cube.getMaxCoordinates()[0] < minCoordinates[0] || cube.getMaxCoordinates()[1] < minCoordinates[1] || cube.getMaxCoordinates()[2] < minCoordinates[2])
			return false;
		
		if (this.maxCoordinates[0] < cube.getMinCoordinates()[0] ||  this.maxCoordinates[1] < cube.getMinCoordinates()[1] || this.maxCoordinates[2] < cube.getMinCoordinates()[2])
			return false;
		

		//Provera dodirivanja na po y pravcu: gore - dole
		if (minCoordinates[1] == cube.getMaxCoordinates()[1] || maxCoordinates[1] == cube.getMinCoordinates()[1]){
			log += "Kockama se dodiruju donja i gornja strana\n";
			result = true;
		}
		else if (minCoordinates[1] == cube.getMinCoordinates()[1]){
			log += "Kockama se dodiruju donje strane\n";
			result = true;
		}
		else if (maxCoordinates[1] == cube.getMaxCoordinates()[1]){
			log += "Kockama se dodiruju gornje strane\n";
			result = true;
		}
		
		
		//Provera dodirivanja po x pravcu: levo - desno
		if (minCoordinates[0] == cube.getMinCoordinates()[0]){
			log += "Kockama se dodiruju leve strane\n";
			result = true;
		}
		else if (maxCoordinates[0] == cube.getMaxCoordinates()[0]){
			log += "Kockama se dodiruju desne strane\n";
			result = true;
		}
		else if (maxCoordinates[0] == cube.getMinCoordinates()[0] || minCoordinates[0] == cube.getMaxCoordinates()[0]){
			log += "Kockama se dodiruju leva i desna strana\n";
			result = true;
		}
		
		//Provera dodirivanja po z pravcu: napred - nazad
		if (minCoordinates[2] == cube.getMinCoordinates()[2]){
			log += "Kockama se dodiruju zadnje strane\n";
			result = true;
		} 
		else if (maxCoordinates[2] == cube.getMaxCoordinates()[2]){
			log += "Kockama se dodiruju prednje strane";
			result = true;
		}
		else if (maxCoordinates[2] == cube.getMinCoordinates()[2] || minCoordinates[2] == cube.getMaxCoordinates()[2]){
			log += "Kockama se dodiruju prednja i zadnja strana";
			result = true;
		}
		
		//if (result) System.out.println(log);
		System.out.println("Rezultat: "+ result);
		return result;
	}
	@Override
	public String toString()
	{
		return "Cube position: ("
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
		if (!checkIfCubesAreTouching(cube))
			return false;
		else {
			for (int i = 0; i < 3; i++){
				if (minCoordinates[i] == cube.getMinCoordinates()[i]|| maxCoordinates[i] == cube.getMaxCoordinates()[i])
					return true;
			}
			return false;
		}
	}
	
	//proverava da li se kocke dodiruju sa spoljasnje strane
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
	{
		if (!checkIfCubesAreTouching(cube))
			return false;
		else {
			for (int i = 0; i < 3; i++){
				if (minCoordinates[i] == cube.getMaxCoordinates()[i] || maxCoordinates[i] == cube.getMinCoordinates()[i])
					return true;
			}
			return false;
		}
	}
	
	//uvecava X
	public void increaseX(int x)
	{
		minCoordinates[0] += x;
		maxCoordinates[0] += x;
	}
	
	//uvecava Y
	public void increaseY(int y)
	{
		minCoordinates[1] += y;
		maxCoordinates[1] += y;
	}
	
	//uvecava Z
	public void increaseZ(int z)
	{
		minCoordinates[2] += z;
		maxCoordinates[2] += z;
	}
	
	//smanjuje X
	public void decreaseX(int x)
	{
		minCoordinates[0] -= x;
		maxCoordinates[0] -= x;
	}
	
	//smanjuje Y
	public void decreaseY(int y)
	{
		minCoordinates[1] -= y;
		maxCoordinates[1] -= y;
	}
	
	//smanjuje Z
	public void decreaseZ(int z)
	{
		minCoordinates[2] -= z;
		maxCoordinates[2] -= z;
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
