package drone;

public class Drone implements StandardDrone{
	
	int x;
	int y;
	int z;
	
	public Drone(){
		x = 30;
		y = 0;
		z = 30;
	}
	
	public Drone(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean horizontala(){
		if(((z >= 0  && z <= 10) || (z >=40 && z <= 50)) && (y >= 0 && y <= 50) && (x >=0 && x <=50)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean vertikala(){
		if(((x >= 0  && x<=10) || (x>=40 && x<=50)) && (y >= 0 && y <= 50) && (z >=0 && z <=50)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean profil(){
		if(((y >= 0  && y<=10) || (y>=40 && y<=50)) && (z >= 0 && z<=50) && (x >= 0 && x<=50)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean unutrasnjaKocka(int n1, int n2){
		if((n1 >= 10  && n1<=40) && (n2>=10 && n2<=40)){
			return true;
		}else{
			return false;
		}
	}
	
	public String moveUp(){
		if ((horizontala() || vertikala() || profil()) && unutrasnjaKocka(x, z)) {
			if(y == 10){
				y=10;
			}else if(y<50){
				y++;
			}
		}else if(horizontala() || vertikala() || profil()){
			if(y < 50){
				y++;
			}
		}
		return getFormatedCoordinates();
		
	}
	
	@Override
	public String moveDown() {
		if ((horizontala() || vertikala() || profil()) && unutrasnjaKocka(x, z)) {
			if(y == 40){
				y=40;
			}else if(y>0){
				y--;
			}
		}else if(horizontala() || vertikala() || profil()){
			if(y > 0)
				y--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if ((horizontala() || vertikala() || profil()) && unutrasnjaKocka(y, z)) {
			if(x == 40){
				x=40;
			}else if(x>0){
				x--;
			}
		}else if(horizontala() || vertikala() || profil()){
			if(x > 0)
				x--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if ((horizontala() || vertikala() || profil()) && unutrasnjaKocka(y, z)) {
			if(x == 10){
				x=10;
			}else if(x<50){
				x++;
			}
		}else if(horizontala() || vertikala() || profil()){
			if(x < 50)
				x++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if ((horizontala() || vertikala() || profil()) && unutrasnjaKocka(x, y)) {
			if(z == 40){
				z=40;
			}else if(z > 0){
				z--;
			}
		}else if(horizontala() || vertikala() || profil()){
			if(z >0)
				z--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if ((horizontala() || vertikala() || profil()) && unutrasnjaKocka(x, y)) {
			if(z == 10){
				z=10;
			}else if(z<50){
				z++;
			}
		}else if(horizontala() || vertikala() || profil()){
			if(z < 50)
				z++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: (" + x + " ," + y + ", " + z + ")" ;
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

