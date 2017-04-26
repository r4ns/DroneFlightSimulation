package drone;

public class Cube {

	private int [] minCoordinates; //donja tacka dijagonale kocke
	private int cubeSideLength; //duzina stranice kocke
	private int [] maxCoordinates;
	private boolean checkFunction; //posebno proveravanje koordinata kada se kocke seku
	private String [] methods = new String[6];

	//kreira kocku na osnovu prosledjenih parametara
	public Cube(int [] cubeStartCoordinates, int side)
	{
		this.minCoordinates=cubeStartCoordinates;
		this.cubeSideLength=side;
		int x=cubeStartCoordinates[0]+side;
		int y=cubeStartCoordinates[1]+side;
		int z=cubeStartCoordinates[2]+side;
		setMaxCoordinates(new int [] {x,y,z});

	}

	//kopira prosledjenu kocku
	public Cube(Cube cube)
	{
		this.cubeSideLength=cube.getCubeSideLength();
		this.minCoordinates=cube.getMinCoordinates();
		this.maxCoordinates=cube.getMaxCoordinates();

	}
	//default konstruktor
	public Cube()
	{
		
	}

	public Cube(int [] cubeStartCoordinates)
	{
		this.minCoordinates = cubeStartCoordinates;
	}


	//proverava da li se prosledjene koordinate nalaze u kocki
	public boolean checkCoordinates(int [] coordinates)
	{
		if(checkFunction==true){

			if(coordinates[0]>minCoordinates[0] && coordinates[0]<maxCoordinates[0]) {
				
				if(coordinates[1]>minCoordinates[1] && coordinates[1]<maxCoordinates[1]){
					
					if(coordinates[2]>minCoordinates[2] && coordinates[2]<maxCoordinates[2]){
						
						return true;
					}
				}

			} else {

				return false;
			}



		} else{

			if(coordinates[0]>=minCoordinates[0] && coordinates[0]<=maxCoordinates[0]){

				if(coordinates[1]>=minCoordinates[1] && coordinates[1]<=maxCoordinates[1]){
					
					if(coordinates[2]>=minCoordinates[2] && coordinates[2]<=maxCoordinates[2]){

						return true;
					}
				}

					
			}
		}


		return false; 

	}
	
	
	//proverava da li se kocke seku
	public boolean checkCubeIntersection(Cube cube)
	{

		checkFunction=true;
	
		if(equals(minCoordinates,cube.getMinCoordinates()) == true && cubeSideLength == cube.getCubeSideLength()){
			
			
				return true;
				
		} else {
			
			if(checkCoordinates(cube.getH()) == true){
				
				checkFunction=false;
				return true;
				
			} else if (checkCoordinates(cube.getG()) == true){
				
				checkFunction=false;
				return true;
				
			}else if (checkCoordinates(cube.getE()) == true){
				
				checkFunction=false;
				return true;
				
			}else if (checkCoordinates(cube.getA()) == true){
				
				checkFunction=false;
				return true;
				
			}else if (checkCoordinates(cube.getB()) == true){
				
				checkFunction=false;
				return true;
				
			}else if (checkCoordinates(cube.getC()) == true){
				
				checkFunction=false;
				return true;
				
			} else if (checkCoordinates(cube.minCoordinates) == true){
				
				checkFunction=false;
				return true;
				
			}else if (checkCoordinates(cube.maxCoordinates) == true){
				
				checkFunction=false;
				return true;
				
			} else {
				
				checkFunction=false;
				return false;
			}
		}
		

	}
	//proverava da li se kocke dodiruju
	public boolean checkIfCubesAreTouching(Cube cube)
	{

		//leva strana

		if(cube.maxCoordinates[0]==cube.minCoordinates[0]){//max

			if(cube.maxCoordinates[1]>=minCoordinates[1] && cube.maxCoordinates[1]<=maxCoordinates[1]){

				if(cube.maxCoordinates[2]>=minCoordinates[2] && cube.maxCoordinates[2]<=maxCoordinates[2]){

					methods[2]="moveLeft";
					return true;
				}
			}		
			
		} else if (cube.getG()[0]==cube.getG()[0]){//g

			if(cube.getG()[1]>=minCoordinates[1] && cube.getG()[1]<=maxCoordinates[1]){

				if(cube.getG()[2]>=minCoordinates[2] && cube.getG()[2]<=maxCoordinates[2]){
					methods[2]="moveLeft";
					return true;
				}
			}		
			
		} else if (cube.getB()[0]==cube.getB()[0]){//b

			if(cube.getB()[1]>=minCoordinates[1] && cube.getB()[1]<=maxCoordinates[1]){

				if(cube.getB()[2]>=minCoordinates[2] && cube.getB()[2]<=maxCoordinates[2]){
					methods[2]="moveLeft";
					return true;
				}
			}		
			
		} else if (cube.getC()[0]==cube.getC()[0]){

			if(cube.getC()[1]>=minCoordinates[1] && cube.getC()[1]<=maxCoordinates[1]){

				if(cube.getC()[2]>=minCoordinates[2] && cube.getC()[2]<=maxCoordinates[2]){
					methods[2]="moveLeft";
					return true;
				}
			}		
		}


		//gore

		if(cube.getE()[0]>=minCoordinates[0] && cube.getE()[0]<=maxCoordinates[0]){

			if(cube.getE()[1]==minCoordinates[1]){

				if(cube.getE()[2]>=minCoordinates[2] && cube.getE()[2]<=maxCoordinates[2]){
					
					methods[0]="moveUp";
					return true;
				}
			}
			
		} else if(cube.maxCoordinates[0]>=minCoordinates[0] && cube.maxCoordinates[0]<=maxCoordinates[0]){

			if(cube.maxCoordinates[1]==minCoordinates[1]){

				if(cube.maxCoordinates[2]>=minCoordinates[2] && cube.maxCoordinates[2]<=maxCoordinates[2]){
					
					methods[0]="moveUp";
					return true;
				}
			}
			
		} else if(cube.getG()[0]>=minCoordinates[0] && cube.getG()[0]<=maxCoordinates[0]){

			if(cube.getG()[1]==minCoordinates[1]){

				if(cube.getG()[2]>=minCoordinates[2] && cube.getG()[2]<=maxCoordinates[2]){
					methods[0]="moveUp";
					return true;
				}
			}
			
		}else if(cube.getH()[0]>=minCoordinates[0] && cube.getH()[0]<=maxCoordinates[0]){

			if(cube.getH()[1]==minCoordinates[1]){

				if(cube.getH()[2]>=minCoordinates[2] && cube.getH()[2]<=maxCoordinates[2]){
					methods[0]="moveUp";
					return true;
				}
			}
		}


		//desno

		if(cube.minCoordinates[0]==maxCoordinates[0]){

			if(cube.minCoordinates[1]>=minCoordinates[1] && cube.minCoordinates[1]<=maxCoordinates[1]){

				if(cube.minCoordinates[2]>=minCoordinates[2] && cube.minCoordinates[2]<=maxCoordinates[2]){
					methods[3]="moveRight";
					return true; 
				}
			}
			
		} else if(cube.getA()[0]==maxCoordinates[0]){

			if(cube.getA()[1]>=minCoordinates[1] && cube.getA()[1]<=maxCoordinates[1]){

				if(cube.getA()[2]>=minCoordinates[2] && cube.getA()[2]<=maxCoordinates[2]){
					methods[3]="moveRight";
					return true; 
				}
			}
			
		}else if(cube.getE()[0]==maxCoordinates[0]){

			if(cube.getE()[1]>=minCoordinates[1] && cube.getE()[1]<=maxCoordinates[1]){

				if(cube.getE()[2]>=minCoordinates[2] && cube.getE()[2]<=maxCoordinates[2]){
					methods[3]="moveRight";
					return true; 
				}
			}
			
		} else if(cube.getH()[0]==maxCoordinates[0]){

			if(cube.getH()[1]>=minCoordinates[1] && cube.getH()[1]<=maxCoordinates[1]){

				if(cube.getH()[2]>=minCoordinates[2] && cube.getH()[2]<=maxCoordinates[2]){
					methods[3]="moveRight";
					return true; 
				}
			}
		}

		//nazad

		if(cube.getE()[0]>=minCoordinates[0] && cube.getE()[0]<=maxCoordinates[0]) {

			if(cube.getE()[1]>=minCoordinates[1] && cube.getE()[1]<=maxCoordinates[1]){

				if(cube.getE()[2]==minCoordinates[2]){
					methods[5]="moveForth";
					return true;
				}
			}
			
		} else if(cube.maxCoordinates[0]>=minCoordinates[0] && cube.maxCoordinates[0]<=maxCoordinates[0]){

			if(cube.maxCoordinates[1]>=minCoordinates[1] && cube.maxCoordinates[1]<=maxCoordinates[1]){

				if(cube.maxCoordinates[2]==minCoordinates[2]){
					methods[5]="moveForth";
					return true;
				}
			}
			
		} else if(cube.getA()[0]>=minCoordinates[0] && cube.getA()[0]<=maxCoordinates[0]){

			if(cube.getA()[1]>=minCoordinates[1] && cube.getA()[1]<=maxCoordinates[1]){

				if(cube.getA()[2]==minCoordinates[2]){
					methods[5]="moveForth";
					return true;
				}
			}
			
		} else if(cube.getB()[0]>=minCoordinates[0] && cube.getB()[0]<=maxCoordinates[0]){

			if(cube.getB()[1]>=minCoordinates[1] && cube.getB()[1]<=maxCoordinates[1]){

				if(cube.getB()[2]==minCoordinates[2]){
					methods[5]="moveForth";
					return true;
				}
			}
		} 

		//napred

		if(cube.getH()[0]>=minCoordinates[0] && cube.getH()[0]<=maxCoordinates[0]) {

			if(cube.getH()[1]>=minCoordinates[1] && cube.getH()[1]<=maxCoordinates[1]){

				if(cube.getH()[2]==maxCoordinates[2]){
					methods[4]="moveBack";
					return true;
				}
			}
			
		} else if(cube.getG()[0]>=minCoordinates[0] && cube.getG()[0]<=maxCoordinates[0]){

			if(cube.getG()[1]>=minCoordinates[1] && cube.getG()[1]<=maxCoordinates[1]){

				if(cube.getG()[2]==minCoordinates[2]){
					methods[4]="moveBack";
					return true;
				}
			}
			
		} else if(cube.minCoordinates[0]>=minCoordinates[0] && cube.minCoordinates[0]<=maxCoordinates[0]){

			if(cube.minCoordinates[1]>=minCoordinates[1] && cube.minCoordinates[1]<=maxCoordinates[1]){

				if(cube.minCoordinates[2]==minCoordinates[2]){
					methods[4]="moveBack";
					return true;
				}
			}
			
		} else if(cube.getC()[0]>=minCoordinates[0] && cube.getC()[0]<=maxCoordinates[0]){

			if(cube.getC()[1]>=minCoordinates[1] && cube.getC()[1]<=maxCoordinates[1]){

				if(cube.getC()[2]==minCoordinates[2]){
					methods[4]="moveBack";
					return true;
				}
			}
		}

		//dole 

		if(cube.getA()[0]>=minCoordinates[0] && cube.getA()[0]<=maxCoordinates[0]){

			if(cube.getA()[1]==minCoordinates[1]){

				if(cube.getA()[2]>=minCoordinates[2] && cube.getA()[2]<=maxCoordinates[2]){
					methods[1]="moveDown";
					return true;
				}
			}
			
		} else if(cube.getB()[0]>=minCoordinates[0] && cube.getB()[0]<=maxCoordinates[0]){

			if(cube.getB()[1]==minCoordinates[1]){

				if(cube.getB()[2]>=minCoordinates[2] && cube.getB()[2]<=maxCoordinates[2]){
					methods[1]="moveDown";
					return true;
				}
			}
			
		} else if(cube.getC()[0]>=minCoordinates[0] && cube.getC()[0]<=maxCoordinates[0]){

			if(cube.getC()[1]==minCoordinates[1]){

				if(cube.getC()[2]>=minCoordinates[2] && cube.getC()[2]<=maxCoordinates[2]){
					methods[1]="moveDown";
					return true;
				}
			}
			
		}else if(cube.minCoordinates[0]>=minCoordinates[0] && cube.minCoordinates[0]<=maxCoordinates[0]){

			if(cube.minCoordinates[1]==minCoordinates[1]){

				if(cube.minCoordinates[2]>=minCoordinates[2] && cube.minCoordinates[2]<=maxCoordinates[2]){
					methods[1]="moveDown";
					return true;
				}
			}
		}


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

	//proverava da li se kocke dodiruju iznutra
	public boolean checkIfCubesAreTouchingFromInside(Cube cube)
	{	
		//provera da li se kocka nalazi unutar druge kocke

		if (this.checkCoordinates(cube.getMinCoordinates())==true &&
				this.checkCoordinates(cube.getMaxCoordinates())==true &&
				this.checkCoordinates(cube.getA())==true && 
				this.checkCoordinates(cube.getB())==true &&
				this.checkCoordinates(cube.getC())==true &&
				this.checkCoordinates(cube.getE())==true &&
				this.checkCoordinates(cube.getG())==true &&
				this.checkCoordinates(cube.getH())==true){

			return this.checkIfCubesAreTouching(cube);

		}

		return false;

	}

	public boolean checkIfCubesAreinCube(Cube cube){

		if (this.checkCoordinates(cube.getMinCoordinates())==true &&
				this.checkCoordinates(cube.getMaxCoordinates())==true &&
				this.checkCoordinates(cube.getA())==true && 
				this.checkCoordinates(cube.getB())==true &&
				this.checkCoordinates(cube.getC())==true &&
				this.checkCoordinates(cube.getE())==true &&
				this.checkCoordinates(cube.getG())==true &&
				this.checkCoordinates(cube.getH())==true){


			return true;
		}

		return false;
	}
	
	
	//proverava da li se kocke dodiruju sa spoljasnje strane
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube)
	{

		if (this.checkCoordinates(cube.getMinCoordinates())==false ||
				this.checkCoordinates(cube.getMaxCoordinates())==false ||
				this.checkCoordinates(cube.getA())==false ||
				this.checkCoordinates(cube.getB())==false ||
				this.checkCoordinates(cube.getC())==false ||
				this.checkCoordinates(cube.getE())==false ||
				this.checkCoordinates(cube.getG())==false ||
				this.checkCoordinates(cube.getH())==false){

			if(this.checkIfCubesAreTouching(cube)==true){

				return true;
				
			} else {

				return false;
			}


		}


		return false; 


	}
	
	//uvecava X
	public void increaseX(int x)
	{
		x++;
	}
	//uvecava Y
	public void increaseY(int y)
	{
		y++;
	}
	//uvecava Z
	public void increaseZ(int z)
	{
		z++;
	}
	//smanjuje X
	public void decreaseX(int x)
	{
		x++;
	}
	//smanjuje Y
	public void decreaseY(int y)
	{
		y++;
	}
	//smanjuje Z
	public void decreaseZ(int z)
	{
		z++;
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



	public int[] getA() {

		int a[]={minCoordinates[0],minCoordinates[1],minCoordinates[2]+cubeSideLength};
		return a;
	}



	public int[] getB() {
		int b[]={maxCoordinates[0],minCoordinates[1],maxCoordinates[2]};
		return b;
	}



	public int[] getE() {
		int e[]={maxCoordinates[0]-cubeSideLength,maxCoordinates[1],maxCoordinates[2]};
		return e;
	}



	public int[] getH() {
		int h[]={minCoordinates[0],minCoordinates[1]+cubeSideLength,minCoordinates[2]};
		return h;
	}



	public int[] getG() {

		int g[]={maxCoordinates[0],minCoordinates[1],maxCoordinates[2]-cubeSideLength};
		return g;
	}



	public int[] getC() {

		int c[]={minCoordinates[0]+cubeSideLength,minCoordinates[1],minCoordinates[2]};
		return c;
	}
	
	public boolean equals(int first[],int second[]){
		
		if(first[0] == second[0] && first[1] == second[1] && first[2] == second[2]){
			
			return true;
			
		} else {
			
			return false;
		}
		
		 
	}

	public String[] getMethods() {
		return methods;
	}

	public void setMethods(String[] methods) {
		this.methods = methods;
	}

	










}
