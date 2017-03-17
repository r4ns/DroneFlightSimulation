package drone;

public class Drone implements StandardDrone{
	private int x=0;
	private int y=0;
	private int z=0;

	public void movement(String unos){
		if(unos=="XD"){
			if(checkPosition(y)&checkPosition(z)&checkPosition(x)){
				moveRight();
			}else{
				System.out.println(toString());
			}
		}else if(unos=="XL"){
			if(checkPosition(y)&checkPosition(z)&checkPosition(x)){
				moveLeft();
			}else{
				System.out.println(toString());			}
		}else if(unos=="YG"){
			if(checkPosition(x)&&checkPosition(z)&checkPosition(y)){
				moveUp();
			}else{
				System.out.println(toString()+"//Drone hits");			}
		}else if(unos=="YD"){
			if(checkPosition(x)&checkPosition(z)&checkPosition(y)){
				moveDown();
			}else{
				System.out.println(toString());			}
		}
		else if(unos=="ZN"){
			if(checkPosition(x)&checkPosition(y)&checkPosition(z)){
				moveForth();
			}else{
				System.out.println(toString());			}
		}
		else if(unos=="ZNZ"){
			if(checkPosition(x)&checkPosition(y)&checkPosition(z)){
				moveUp();
			}else{
				System.out.println(toString());			}
		}
	}
	
	public boolean checkPosition(int k){
		if((k>=0&&k<10)||(k>=40&&k<50))		
			return true;
		else 
			return false;
	}

	@Override
	public String toString(){
		return String.format("Drone position: ("+x+","+y+","+z+")");
	}
	@Override
	public String moveUp() {
		y++;
		System.out.println(toString());
		return null;
	}
	@Override
	public String moveDown() {
		y--;
		System.out.println(toString());
		return null;
	}
	@Override
	public String moveLeft() {
		x++;
		System.out.println(toString());
		return null;
	}
	@Override
	public String moveRight() {
		x--;
		System.out.println(toString());
		return null;
	}
	@Override
	public String moveBack() {
		z--;
		System.out.println(toString());
		return null;
	}
	@Override
	public String moveForth() {
		z++;
		System.out.println(toString());
		return null;
	}
	@Override
	public String getFormatedCoordinates() {
		
		return null;
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
