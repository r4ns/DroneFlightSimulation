package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
	public Drone(){
		
	}
	
	public Drone(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	
	@Override
	public String moveUp() {
		this.y+=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		this.y-=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		this.x-=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		this.x+=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		this.z+=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		this.z-=1;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		if(strigaoNaCilj()==true){
			return "Dron je stigao na cilj!\nPozicija drona: (" + x + "," + y + "," + z + ")";
		}
		
		return "Pozicija drona: (" + x + "," + y + "," + z + ")";
	}
	
	public boolean strigaoNaCilj(){
		if(this.x==0 && this.y==30 && this.z==30){
			return true;
		}else{
			return false;
		}
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
}
