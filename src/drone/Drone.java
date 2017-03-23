package drone;

public class Drone implements StandardDrone{
	private int x = 30;
	private int y = 30;
	private int z = 30;
	private String pomeraj = "dron se pomerio";
	private int granicaSpoljasnja1 = 0;
	private int granicaSpoljasnja2 = 50;
	private int granicaUnutrasnja = 10;
	private int granicaUnutrasnja2 = 40;

	public Drone(int x, int y, int z){
		this.x = x;
		this.y = y; 
		this.z = z;
	}
	
	public Drone(){
		
	}
	
	@Override
	public String getFormatedCoordinates() {
		if(this.goalReached()){
			System.out.println("DRON JE STIGAO NA CILJ!!!");
		}
		
		return "Drone position: x:"+this.x + " y:" + this.y + " z:" +this.z;
	}
	
	@Override
	public String moveUp() {
		this.y += 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		this.y -= 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		this.x -= 1 ; 
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		this.x += 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		z = this.z + 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		z = this.z - 1;
		return getFormatedCoordinates();
	}


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	public boolean goalReached(){
		if(this.x == 0 && this.y == 30 && this.z == 30){
			return true;
		}
		return false;
	}

}
