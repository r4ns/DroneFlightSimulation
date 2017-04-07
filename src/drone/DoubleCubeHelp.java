package drone;

public class DoubleCubeHelp extends Drone {
	
	int x;
	int y;
	int z;
	
	public DoubleCubeHelp(){
		
	}
	
	public DoubleCubeHelp(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	@Override
	public String moveUp() {
		if(upBorderBool())
			y++;
		else
			System.out.println("Can't move in that direction!");
		return getFormatedCoordinates();
	}
	
	public boolean upBorderBool(){
		if((x >= 10 && x<= 40) && (z >= 10 && z<= 40)){
			if(y < 10 && y >= 0 || y >= 40 && y < 50){
				return true;
				
			}
		}else if(y<=50){
			return true;
			
		}
		return false;
			
	}
	
	@Override
	public String moveDown() {
		if(downBorderBool())
			y--;
		else
			System.out.println("Can't move in that direction!");
		return getFormatedCoordinates();
	}
	
	public boolean downBorderBool(){
		if((x >= 10 && x<= 40) && (z >= 10 && z<= 40)){
			if(y < 10 && y > 0 || y >= 40 && y < 50){
				return true;
			}
		}else if(y>0){
			return true;
		}
		return false;
	}
	
	@Override
	public String moveLeft() {
		if(leftBorderBool())
			x--;
		else
			System.out.println("Can't move in that direction!");
		return getFormatedCoordinates();
	}
	
	public boolean leftBorderBool(){
		if(y>10 && y<40){
			if(z>10 && z<40){
				if((x<=10 && x>0) || (x<=50 && x>40)){
					return true;
				}
			}
			else if(x>0){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String moveRight() {
		if(rightBorderBool())
			x++;
		else
			System.out.println("Can't move in that direction!");
		return getFormatedCoordinates();
	}
	
	public boolean rightBorderBool(){
		if (y>10 && y<40) {
			if (z>10 && z<40) {
				if((x<10 && x>=0)||(x<50 && x>=40)){
					return true;
				}
			}
			else if(x<50){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String moveBack() {
		if(backBorderBool())
			z++;
		else
			System.out.println("Can't move in that direction!");
		return getFormatedCoordinates();
	}
	
	public boolean backBorderBool(){
		if((x<=10 && x>=0) || (x<=50 && x>=40)){
			if(z<50)
				return true;
		}else if((x<=40 && x>=10)){
			if((y<=10 && y>=0) || (y>=40 && y<=50)){
				if(z<50){
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String moveForth() {
		if(forthBorderBool())
			z--;
		else
			System.out.println("Can't move in that direction!");
		return getFormatedCoordinates();
	}
	
	public boolean forthBorderBool(){
		if((x<=10 && x>=0) || (x<=50 && x>=40)){
			if(z>0)
				return true;
		}else if((x<=40 && x>=10)){
			if((y<=10 && y>=0) || (y>=40 && y<=50)){
				if(z>0){
					return true;
				}
			}
		}
		return false;
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
	
	@Override
	public String getFormatedCoordinates() {
		
		return this.x+","+this.y+","+this.z;
	}
		
	
}
