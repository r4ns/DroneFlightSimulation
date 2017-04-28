package drone;

import space.FlySpace;

public class DroneOne extends FlySpace implements StandardDrone {

		protected int x;
		protected int y;
		protected int z;
		private int granica=50;
		private int[] startnaPozicija;
		private int razmak=10;
		private FlySpace space;
		
		public DroneOne(int[] pozicija) {
			this.startnaPozicija = pozicija;
		}
		
		public DroneOne(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
			
		}
		
		public DroneOne(int x, int y, int z, FlySpace space) {
			this(x, y, z);
			this.space = space;
		}
		public DroneOne(){
			
		}
	
	public boolean provera(String smer){
		if(smer=="moveUp"){
			if ((y < razmak || (y >= granica - razmak & y < granica))) {
				return true;
			}
			else if(((x >= granica - razmak & x <= granica) || (z >= granica - razmak & z <= granica) || (x >= 0 & x <= razmak) || (z >= 0 & z <= razmak)) & (y < granica & y >= 0)){
				return true;
			}
			else{
				return false;
			}
			
		}
		else if(smer=="moveDown"){
			if((y > 0 & y <= razmak) || (y > granica - razmak & y <= granica)){
				
				return true;
			}
			else if(((x >= granica - razmak & x <= granica) || (z >= granica - razmak & z <= granica) || (x >= 0 & x <= razmak) || (z >= 0 & z <= razmak)) & (y <= granica & y > 0)){
				
				return true;
			}
			else{
				return false;
			}
			
		}
		else if(smer=="moveRight"){
			if(x < razmak || (x >= granica - razmak & x < granica)){
				
				return true;
			}
			else if(((y >= granica - razmak & y <= granica) || (z >= granica - razmak & z <=granica) || (y >= 0 & y <= razmak) || (z >= 0 & z <= razmak)) & (x < granica & x >= 0)){
				
				return true;
			}
			else{
				return false;
			}
			
		}
		else if(smer=="moveLeft"){
			if((x > 0 & x <= razmak) || (x > granica - razmak & x <= granica)){
				
				return true;
			}
			else if(((y >= granica - razmak & y <= granica) || (z >= granica - razmak & z <=granica) || (y >= 0 & y <= razmak) || (z >= 0 & z <=razmak)) & (x <= granica & x > 0)){
				
				return true;
			}
			else{
				return false;
			}
		}
		else if(smer=="moveBack"){
			if(z < razmak || (z >= granica - razmak & z < granica)){
				
				return true;
			}
			else if(((x >= granica - razmak & x <= granica) || (y >= granica - razmak & y <=granica) || (x >= 0 & x <= razmak) || (y >= 0 & y <=razmak)) & (z < granica & z >= 0)){
				
				return true;
			}
			else{
				return false;
			}
		}
		else if(smer=="moveForth"){
			if((z > 0 & z <= razmak) || (z > granica - razmak & z <= granica)){
				
				return true;
			}
			else if(((y >= granica - razmak & y <= granica) || (x >= granica - razmak & x <=granica) || (y >= 0 & y <= razmak) || (x >= 0 & x <=razmak)) & (z <= granica & z > 0)){
				
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
		
	}
	public String moveUp() {
		if(provera("moveUp")){
			y++;
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
	}
	public String moveDown(){
		if(provera("moveDown")){
			y--;
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveLeft() {
		if(provera("moveLeft")){
			x--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	public String moveRight(){
		
		if(provera("moveRight")){
			x++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
			
		}
	}
	@Override
	public String moveBack() {
		if(provera("moveBack")){
			z++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	
	@Override
	public String moveForth() {
		if(provera("moveForth")){
			z--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String getFormatedCoordinates() {
		return "(" + x + ", " + y + ", " + z + ")";
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

	public int getGranica() {
		return granica;
	}

	public int getRazmak() {
		return razmak;
	}

	public void setGranica(int granica) {
		this.granica = granica;
	}

	public void setRazmak(int razmak) {
		this.razmak = razmak;
	}
	

}
