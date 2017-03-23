package drone;

public class Drone implements StandardDrone{
	
	private int x,y,z;
	private int uGranica1 = 10;
	private int uGranica2 = 40;
	private int sGranica1 = 0;
	private int sGranica2 = 50;
	private int[] cilj = {0, 30, 30};
	
	public Drone(int c[]){
		this.x = c[0];
		this.y = c[1];
		this.z = c[2];
	}
	
	public Drone(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	
	private boolean uIvici(int k){
		if(k>= sGranica1 && k <=uGranica1 || k>=uGranica2 && k <= sGranica2){
			return true;
		}
		return false;
	}
	
	public boolean stigaoNaCilj(){
		if(x == cilj[0] && y == cilj[1] && z == cilj[2])
			return true;
		else
			return false;
	}
	
	private int pomeri(int k, int i){
		
		if(k + i == sGranica1 || k + i == sGranica2){
			return k + i;
		}
		if(k == sGranica1 && i == -1 || k == sGranica2  && i == 1){
			return k;
		}
		return k + i;
	}
	
	private int pomeriSigurno(int k, int i){
		
		if(k + i == sGranica1 || k + i == uGranica1 || k + i == uGranica2 || k + i == sGranica2){
			return k + i;
		}
		if(k == sGranica1 && i == -1 || k == uGranica1  && i == 1|| k == uGranica2  && i == -1|| k == sGranica2  && i == 1){
			
			return k;
		}
		return k + i;
	}
	
	
	
	public String moveUp() {
		if(uIvici(x) || uIvici(z)){
			y = pomeri(y,1);
		}else if(uIvici(y)){
			y = pomeriSigurno(y,1);
		}
		
		return getFormatedCoordinates();
	}

	
	public String moveDown() {
		if(uIvici(x) || uIvici(z)){
			y = pomeri(y,-1);
		}else if(uIvici(y)){
			y = pomeriSigurno(y,-1);
		}
		return getFormatedCoordinates();
	}

	
	public String moveRight() {
		if(uIvici(y) || uIvici(z)){
			x = pomeri(x,1);
		}else if(uIvici(x)){
			x = pomeriSigurno(x,1);
		}
		return getFormatedCoordinates();
	}

	
	public String moveLeft() {
		if(uIvici(y) || uIvici(z)){
			x = pomeri(x,-1);
		}else if(uIvici(x)){
			x = pomeriSigurno(x,-1);
		}
		return getFormatedCoordinates();
	}

	
	public String moveBack() {
		if(uIvici(y) || uIvici(x)){
			z = pomeri(z,1);
		}else if(uIvici(z)){
			z = pomeriSigurno(z,1);
		}
		return getFormatedCoordinates();
	}

	
	public String moveForth() {
		if(uIvici(y) || uIvici(x)){
			z = pomeri(z,-1);
		}else if(uIvici(z)){
			z = pomeriSigurno(z,-1);
		}
		return getFormatedCoordinates();
	}

	public String getFormatedCoordinates()
	{
		String s = "";
		if(stigaoNaCilj())
			s = "//Target reached";
		
		return "My position is: (" + Integer.toString(getX()) + ","
				+ Integer.toString(getY()) + ","  
				+ Integer.toString(getZ()) + ") " + s;
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

}
