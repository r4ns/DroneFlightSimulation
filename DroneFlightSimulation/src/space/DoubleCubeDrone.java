package space;
 
import drone.Drone;
import drone.Cube; 

public class DoubleCubeDrone extends Drone{
	/*private Drone droneA1 ;
	private Drone droneB1 ;
	private Drone droneC1 ;
	private Drone droneD1 ;
	private Drone droneE1 ;
	private Drone droneF1 ;
	private Drone droneG1 ;
	private Drone droneH1 ;
	private Drone droneC2 ;
	private Drone droneD2 ;
	private Drone droneE2 ;
	private Drone droneF2 ;
	private Drone droneG2 ;
	private Drone droneH2 ;*/
	
	private Drone doleDesno;
	private Drone sredinaDesno;
	private Drone sredinaLevo;
	private Drone goreLevo;
	
	private int duzinaStranice;
	private FlyClass space;
	private int[] startCoordinaes= new int[]{30,0,30};
	public boolean callByTest=false;
	Cube downCube;
	Cube upCube;
	
	public DoubleCubeDrone(){
		
	}
	
	public DoubleCubeDrone(int[] coordinates, int side) {
		downCube = new Cube(coordinates, side);
		int[] coordinatesTop = {coordinates[0] + side, coordinates[1] + side, coordinates[2]};
		upCube = new Cube(coordinatesTop, side);
	}
	
	public DoubleCubeDrone(Drone tDoleDesno, Drone tSredinaDesno, Drone tSredinaLevo, Drone tGoreLevo) {
		this.doleDesno = tDoleDesno;
		this.sredinaDesno = tSredinaDesno;
		this.sredinaLevo = tSredinaLevo;
		this.goreLevo = tGoreLevo;
	}
	
	
	
	
	
	/*public DoubleCubeDrone(int [] start, FlyClass fly){
		droneA1 = new Drone(start,fly);
		start[0]++;
		start[1]++;
		start[2]++;
		droneB1 = new Drone(start,fly);
		start[2]--;
		droneC1= new Drone(start,fly);
		start[0]++;
		start[1]++;
		start[2]++;
		droneD1= new Drone(start,fly);
		start[0]--;
		droneE1= new Drone(start,fly);
		start[2]--;
		droneF1= new Drone(start,fly);
		start[0]++;
		droneG1= new Drone(start,fly);
		start[1]--;
		droneH1= new Drone(start,fly);
		start[2]++;
		droneC2= new Drone(start,fly);
		start[0]--;
		start[0]--;
		droneD2= new Drone(start,fly);
		start[2]--;
		droneE2= new Drone(start,fly);
		start[1]--;
		start[2]++;
		droneF2= new Drone(start,fly);
		start[0]++;
		droneG2= new Drone(start,fly);
		start[2]--;
		droneH2= new Drone(start,fly);
	}
	*/
	
	protected boolean validateDronePositionAfter(String command) {
		space=new FlyClass(new Cube(new int[]{10,10,10},30),new Cube(new int[]{0,0,0},50));
		int[] topMax = this.upCube.getMaxCoordinates();
		int[] topMin = this.upCube.getMinCoordinates();
		int[] botMax = this.downCube.getMaxCoordinates();
		int[] botMin = this.downCube.getMinCoordinates();
		
		if (space.cubeOutside.checkCoordinates(this.upCube.getMaxCoordinates()) == true 
				&& space.cubeOutside.checkCoordinates(this.downCube.getMinCoordinates()) == true
				&& space.cubeOutside.checkCoordinates(this.downCube.getMaxCoordinates()) == true
				&& space.cubeOutside.checkCoordinates(this.upCube.getMinCoordinates()) == true
				&& space.cubeInside.checkCoordinates(this.upCube.getMaxCoordinates()) == false 
				&& space.cubeInside.checkCoordinates(this.downCube.getMinCoordinates()) == false
				&& space.cubeInside.checkCoordinates(this.downCube.getMaxCoordinates()) == false
				&& space.cubeInside.checkCoordinates(this.upCube.getMinCoordinates()) == false) {
			
			if (command == "moveUp"){
				if (botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0)
				 {
					if (topMax[1] < space.cubeInside.getCubeSideLength()
							|| (botMin[1] > space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() 
									&& botMin[1] < space.cubeOutside.getCubeSideLength())) {
						return true;
					}
					else if ((botMin[0] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[0] <= space.cubeOutside.getCubeSideLength())
						|| (botMin[2] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[2] <= space.cubeOutside.getCubeSideLength())
						|| topMax[0] <= space.cubeInside.getCubeSideLength() || topMax[2] <= space.cubeInside.getCubeSideLength()) {
						return true;
					}
					else 
						return false;
				}
				else 
					return false;
			}
			else if (command == "moveDown"){
				if ((topMax[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (topMax[1] < space.cubeOutside.getCubeSideLength() && botMin[1] > 0) && (topMin[2] < space.cubeOutside.getCubeSideLength() && topMax[2] > 0)) {
					if ((botMin[1] >= (space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength()) && topMax[1] < space.cubeOutside.getCubeSideLength()) || (botMin[1] > 0 && topMax[1] < space.cubeInside.getCubeSideLength())) {
						return true;
					}
					else if ((botMin[0] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[0] <= space.cubeOutside.getCubeSideLength())
						|| (botMin[2] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[2] <= space.cubeOutside.getCubeSideLength())
						|| topMax[0] <= space.cubeInside.getCubeSideLength() || topMax[2] <= space.cubeInside.getCubeSideLength()) {
						return true;
					}
					else
						return false;
				}
				else
					return false;			
			}
			else if (command == "moveRight"){
				if ((botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (botMin[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0)) {
					if (topMax[0] < space.cubeInside.getCubeSideLength() || (botMin[0] > space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && botMin[0] < space.cubeOutside.getCubeSideLength())) {
						return true;
					}
					else if ((botMin[1] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[1] <= space.cubeOutside.getCubeSideLength())
						|| (botMin[2] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[2] <= space.cubeOutside.getCubeSideLength())
						|| topMax[1] <= space.cubeInside.getCubeSideLength() || topMax[2] <= space.cubeInside.getCubeSideLength()) {
						return true;
					}
					else 
						return false;
				}
				else
					return false;
			}
			else if (command == "moveLeft"){
				if ((topMax[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (topMax[1] < space.cubeOutside.getCubeSideLength() && botMin[1] > 0) && (topMin[2] < space.cubeOutside.getCubeSideLength() && topMax[2] > 0)) {
					if ((botMin[0] >= (space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength()) && topMax[0] < space.cubeOutside.getCubeSideLength()) || (botMin[0] > 0 && topMax[0] < space.cubeInside.getCubeSideLength())) {
						return true;
					}
					else if ((botMin[1] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[1] <= space.cubeOutside.getCubeSideLength())
						|| (botMin[2] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[2] <= space.cubeOutside.getCubeSideLength())
						|| topMax[1] <= space.cubeInside.getCubeSideLength() || topMax[2] <= space.cubeInside.getCubeSideLength()) {
						return true;
					}
					else 
						return false;
				}
				else
					return false;
			}
			else if (command == "moveBack"){
				if ((topMax[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (topMax[1] < space.cubeOutside.getCubeSideLength() && botMin[1] > 0) && (topMin[2] < space.cubeOutside.getCubeSideLength() && topMax[2] > 0)) {
					if (topMax[2] < space.cubeInside.getCubeSideLength() || (botMin[2] > space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && botMin[2] < space.cubeOutside.getCubeSideLength())) {
						return true;
					}
					else if ((botMin[0] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[0] <= space.cubeOutside.getCubeSideLength())
						|| (botMin[1] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[1] <= space.cubeOutside.getCubeSideLength())
						|| topMax[0] <= space.cubeInside.getCubeSideLength() || topMax[1] <= space.cubeInside.getCubeSideLength()) {
						return true;
					}
					else
						return false;
				}
				else
					return false;
			}
			else if (command == "moveForth"){
				if ((topMax[0] < space.cubeOutside.getCubeSideLength() && botMin[0] > 0) && (topMax[1] < space.cubeOutside.getCubeSideLength() && botMin[1] > 0) && (topMin[2] < space.cubeOutside.getCubeSideLength() && topMax[2] > 0)) {
					if ((botMin[2] >= (space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength()) && topMin[2] < space.cubeOutside.getCubeSideLength()) || (botMin[2] > 0 && botMax[2] < space.cubeInside.getCubeSideLength())) {
						return true;
					}
					else if ((botMin[0] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[0] <= space.cubeOutside.getCubeSideLength())
						|| (botMin[1] >= space.cubeOutside.getCubeSideLength() - space.cubeInside.getCubeSideLength() && topMax[1] <= space.cubeOutside.getCubeSideLength())
						|| topMax[0] <= space.cubeInside.getCubeSideLength() || topMax[1] <= space.cubeInside.getCubeSideLength()) {
						return true;
					}
					else
						return false;
				}
				else
					return false;
			}
			else
				return false;
		}
		else 
			return false;	
	}
	
	public String moveUp() {
		if(this.validateDronePositionAfter("moveUp") == true){
			this.downCube.increaseY();
			this.upCube.increaseY();
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
	}
	
	public String moveDown() {
		if(this.validateDronePositionAfter("moveDown")){
			this.downCube.decreaseY();
			this.upCube.decreaseY();
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
	}
	
	public String moveLeft() {
		if(this.validateDronePositionAfter("moveLeft") == true){
			this.downCube.decreaseX();
			this.downCube.decreaseX();
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
	}
	
	public String moveRight() {
		if(this.validateDronePositionAfter("moveRight") == true){
			this.downCube.increaseX();
			this.upCube.increaseX();
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	public String moveForth() {
		if(this.validateDronePositionAfter("moveForth") == true){
			this.downCube.decreaseZ();
			this.upCube.decreaseZ();
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	public String moveBack() {
		if(this.validateDronePositionAfter("moveBack") == true){
			this.downCube.increaseZ();
			this.upCube.increaseZ();
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	public String getFormatedCoordinates() {
		return this.downCube.toString() + this.upCube.toString();
	}

	public Drone getDoleDesno() {
		return doleDesno;
	}

	public void setDoleDesno(Drone doleDesno) {
		this.doleDesno = doleDesno;
	}

	public Drone getSredinaDesno() {
		return sredinaDesno;
	}

	public void setSredinaDesno(Drone sredinaDesno) {
		this.sredinaDesno = sredinaDesno;
	}

	public Drone getSredinaLevo() {
		return sredinaLevo;
	}

	public void setSredinaLevo(Drone sredinaLevo) {
		this.sredinaLevo = sredinaLevo;
	}

	public Drone getGoreLevo() {
		return goreLevo;
	}

	public void setGoreLevo(Drone goreLevo) {
		this.goreLevo = goreLevo;
	}

	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}

	public FlyClass getSpace() {
		return space;
	}

	public void setSpace(FlyClass space) {
		this.space = space;
	}

	public int[] getStartCoordinaes() {
		return startCoordinaes;
	}

	public void setStartCoordinaes(int[] startCoordinaes) {
		this.startCoordinaes = startCoordinaes;
	}

	public boolean isCallByTest() {
		return callByTest;
	}

	public void setCallByTest(boolean callByTest) {
		this.callByTest = callByTest;
	}

	public Cube getDownCube() {
		return downCube;
	}

	public void setDownCube(Cube downCube) {
		this.downCube = downCube;
	}

	public Cube getUpCube() {
		return upCube;
	}

	public void setUpCube(Cube upCube) {
		this.upCube = upCube;
	}
	
/*
	public Drone getDroneA1() {
		return droneA1;
	}

	public void setDroneA1(Drone droneA1) {
		this.droneA1 = droneA1;
	}

	public Drone getDroneB1() {
		return droneB1;
	}

	public void setDroneB1(Drone droneB1) {
		this.droneB1 = droneB1;
	}

	public Drone getDroneC1() {
		return droneC1;
	}

	public void setDroneC1(Drone droneC1) {
		this.droneC1 = droneC1;
	}

	public Drone getDroneD1() {
		return droneD1;
	}

	public void setDroneD1(Drone droneD1) {
		this.droneD1 = droneD1;
	}

	public Drone getDroneE1() {
		return droneE1;
	}

	public void setDroneE1(Drone droneE1) {
		this.droneE1 = droneE1;
	}

	public Drone getDroneF1() {
		return droneF1;
	}

	public void setDroneF1(Drone droneF1) {
		this.droneF1 = droneF1;
	}

	public Drone getDroneG1() {
		return droneG1;
	}

	public void setDroneG1(Drone droneG1) {
		this.droneG1 = droneG1;
	}

	public Drone getDroneH1() {
		return droneH1;
	}

	public void setDroneH1(Drone droneH1) {
		this.droneH1 = droneH1;
	}

	public Drone getDroneC2() {
		return droneC2;
	}

	public void setDroneC2(Drone droneC2) {
		this.droneC2 = droneC2;
	}

	public Drone getDroneD2() {
		return droneD2;
	}

	public void setDroneD2(Drone droneD2) {
		this.droneD2 = droneD2;
	}

	public Drone getDroneE2() {
		return droneE2;
	}

	public void setDroneE2(Drone droneE2) {
		this.droneE2 = droneE2;
	}

	public Drone getDroneF2() {
		return droneF2;
	}

	public void setDroneF2(Drone droneF2) {
		this.droneF2 = droneF2;
	}

	public Drone getDroneG2() {
		return droneG2;
	}

	public void setDroneG2(Drone droneG2) {
		this.droneG2 = droneG2;
	}

	public Drone getDroneH2() {
		return droneH2;
	}

	public void setDroneH2(Drone droneH2) {
		this.droneH2 = droneH2;
	}*/
	
	
}
