package drone;

public class Cube {  
	private int [] minCoordinates;
	//donja tacka dijagonale kocke
	private int cubeSideLength; 
	//duzina stranice kocke
	private int [] maxCoordinates;
	
	//gornja tacka dijagonale kocke 
	//kreira kocku na osnovu prosledjenih parametara
	public Cube(int [] cubeStartCoordinates, int side)  {  
		//implementacija 
		minCoordinates=cubeStartCoordinates;
		cubeSideLength=side;
		int x=minCoordinates[0]+side;
		int y=minCoordinates[1]+side;
		int z=minCoordinates[2]+side;
		maxCoordinates=new int[]{x,y,z};		
	}    
	//kopira prosledjenu kocku  
	public Cube(Cube cube)  {  
		this(cube.getMinCoordinates(),cube.getCubeSideLength());
		
		}    
	//default konstruktor 
	public Cube()  {  
		
	}    
	//proverava da li se prosledjene koordinate nalaze u kocki 
	public boolean checkCoordinates(int [] coordinates)  {   
		//implementacija
		if((coordinates[0]>=minCoordinates[0]&&coordinates[0]<=maxCoordinates[0])
				&&(coordinates[1]>=minCoordinates[1]&&coordinates[1]<=maxCoordinates[1])
				&&(coordinates[2]>=minCoordinates[2]&&coordinates[2]<=maxCoordinates[2]))
				return true;
		else
			return false;
		
		}   
	//proverava da li se kocke seku
	public boolean checkCubeIntersection(Cube cube)  {   
			/*if(this.checkCoordinates(cube.getMinCoordinates())||this.checkCoordinates(cube.getMaxCoordinates())){
				return true;
			}
			else{
				return false;
			}*/
		if((this.minCoordinates[0]<cube.maxCoordinates[0]&&this.maxCoordinates[0]>cube.minCoordinates[0])
				&&(this.minCoordinates[1]<cube.maxCoordinates[1]&&this.maxCoordinates[1]>cube.minCoordinates[1])
				&&(this.minCoordinates[2]<cube.maxCoordinates[2]&&this.maxCoordinates[2]>cube.minCoordinates[2])){
			return true;
		}else{
			return false;
		}
	 
		}   
	//proverava da li se kocke dodiruju 
	public boolean checkIfCubesAreTouching(Cube cube)  {   
		//implementacija 
			
			if(this.checkCubeIntersection(cube)){
				return true;
			}else{
				cube.setCubeSideLength(cube.cubeSideLength+1);
				if(this.checkCubeIntersection(cube)){
					cube.setCubeSideLength(cube.cubeSideLength-1);
					return true;
				}else{
					cube.setCubeSideLength(cube.cubeSideLength-1);
					this.setCubeSideLength(this.cubeSideLength+1);
					if(this.checkCubeIntersection(cube)){
						this.setCubeSideLength(this.cubeSideLength-1);
						return true;
						
					}else{
						this.setCubeSideLength(this.cubeSideLength-1);
						return false;
					}
				}
			}
		}  
	@Override 
	public String toString() { 
		return "Drone position: ("  + Integer.toString(minCoordinates[0]) + ","    + Integer.toString(minCoordinates[1]) + ","      + Integer.toString(minCoordinates[2]) + "), ("    + Integer.toString(maxCoordinates[0]) + ","    + Integer.toString(maxCoordinates[1]) + ","      + Integer.toString(maxCoordinates[2]) + ")";     
	}
//proverava da li se kocke dodiruju iznutra  
	public boolean checkIfCubesAreTouchingFromInside(Cube cube)  {   
	//implementacija treba da koristi checkIfCubesAreTouching
		if(this.checkIfCubesAreTouching(cube)){
			if(this.checkIfCubesAreTouchingFromOutside(cube)){
				
				return false;
			}else if(this.checkCubeIntersection(cube)){
				if(this.checkCoordinates(cube.minCoordinates)&&this.checkCoordinates(cube.maxCoordinates)){
					if(this.maxCoordinates[0]==cube.maxCoordinates[0]||this.maxCoordinates[1]==cube.maxCoordinates[1]||this.maxCoordinates[2]==cube.maxCoordinates[2]){
						return true;
					}else if(this.minCoordinates[0]==cube.minCoordinates[0]||this.minCoordinates[1]==cube.minCoordinates[1]||this.minCoordinates[2]==cube.minCoordinates[2]){
						return true;
					}else{
						return false;
					}
				}else if(cube.checkCoordinates(this.maxCoordinates)&&cube.checkCoordinates(this.minCoordinates)){
					if(this.maxCoordinates[0]==cube.maxCoordinates[0]||this.maxCoordinates[1]==cube.maxCoordinates[1]||this.maxCoordinates[2]==cube.maxCoordinates[2]){
						return true;
					}else if(this.minCoordinates[0]==cube.minCoordinates[0]||this.minCoordinates[1]==cube.minCoordinates[1]||this.minCoordinates[2]==cube.minCoordinates[2]){
						return true;
					}else{
						return false;
					}
					
					
				}else{
					return false;
				}
			}else{
				return false;
			}
			
		}else{
			return false;
		}
	}  
//proverava da li se kocke dodiruju sa spoljasnje strane  
	public boolean checkIfCubesAreTouchingFromOutside(Cube cube)  {  
	//implementacija treba da koristi checkIfCubesAreTouching  
		if(this.checkIfCubesAreTouching(cube)){
			if(this.checkCubeIntersection(cube)){
				return false;
			}else{
				return true;
			}
		}else{
			return false;
		}
	}   
	//uvecava X
	public void increaseX(int x)  {  
	//implementacija 
		minCoordinates[0]=minCoordinates[0]+x;
		maxCoordinates[0]=maxCoordinates[0]+x;
	}    
//uvecava Y 
	public void increaseY(int y)  {  
	//implementacija
		minCoordinates[1]=minCoordinates[1]+y;
		maxCoordinates[1]=maxCoordinates[1]+y;
	
	}  
	//uvecava Z   
	public void increaseZ(int z)  {   
		//implementacija  
		minCoordinates[2]=minCoordinates[2]+z;
		maxCoordinates[2]=maxCoordinates[2]+z;
	
   } 
	//smanjuje X 
	public void decreaseX(int x)  {   
	//implementacija 
		minCoordinates[0]=minCoordinates[0]-x;
		maxCoordinates[0]=maxCoordinates[0]-x;
	}   
//smanjuje Y 
	public void decreaseY(int y)  {  
	//implementacija 
		minCoordinates[1]=minCoordinates[1]-y;
		maxCoordinates[1]=maxCoordinates[1]-y;
	}    
//smanjuje Z  
	public void decreaseZ(int z)  {  
	//implementacija 
		minCoordinates[2]=minCoordinates[2]-z;
		maxCoordinates[2]=maxCoordinates[2]-z;
	} 



	public int[] getMinCoordinates() {   
		return minCoordinates;  } 

	public void setMinCoordinates(int[] minCoordinates) {   
		this.minCoordinates = minCoordinates;  }
	public int getCubeSideLength() {   
		return cubeSideLength;  } 
	 
	 public void setCubeSideLength(int side) {  
		 	this.cubeSideLength = side;
		 	this.setMaxCoordinates(new int[] {this.minCoordinates[0]+side,this.minCoordinates[1]+side,this.minCoordinates[2]+side});
		 } 
	 
	 public int[] getMaxCoordinates() {  
		 return maxCoordinates;  } 
	 
	 public void setMaxCoordinates(int[] maxCoordinates) {  
		 this.maxCoordinates = maxCoordinates; 
		 } 
	}