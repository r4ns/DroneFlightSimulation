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
		if(((x>=0 && x<=10)||(x>=40 && x<=50)) && (y>=0 && y<50) && (z>=0 && z<=50)){
			this.y+=1;
			return getFormatedCoordinates();
		} else if(((y>=0 && y<10) || (y>=40 && y<50)) && ((z>=0 && z<=50) && (x>=0 && x<=50))){
			this.y+=1;
			return getFormatedCoordinates();
		} else if((x>=0 && x<=50) && ((z>=0 && z<=10)||(z>=40 && z<=50)) && (y>=0 && y<50)){
			this.y+=1;
			return getFormatedCoordinates();
		} else {
			if(y==10)
				return getFormatedCoordinates();
			else
				return getFormatedCoordinates();
		}
	}

	@Override
	public String moveDown() {
		if(((x>=0 && x<=10) || (x>=40 && x<=50)) && (z>=0 && z<=50) && (y>0 && y<=50)){
			this.y-=1;
			return getFormatedCoordinates();
		} else if(((y>0 && y<=10)||(y>40 && y<=50)) && ((x>=0 && x<=50) &&  (z>=0 && z<=50) )){
			this.y-=1;
			return getFormatedCoordinates();
		} else if((x>=0 && x<=50) && ((z>=0 && z<=10)||(z>=40 && z<=50)) && (y>0 && y<=50)){
			this.y-=1;
			return getFormatedCoordinates();
		} else {
			if(y==0)
				return getFormatedCoordinates();
			else
				return getFormatedCoordinates();
		}
	}

	@Override
	public String moveLeft() {
		if(((y>=0 && y<=10) || (y>=40 && y<=50)) && (x>0 && x<=50) && ((z>=0 && z<=50))){
			this.x-=1;
			return getFormatedCoordinates();
		} else if(( y>=10 && y<=40) && (z>=0 && z<=50) && ((x>0 && x<=10) || (x>40 && x<=50)) ){
			this.x-=1;
			return getFormatedCoordinates();
		}else if((y>=10 && y<=40) && (x>10 && x<=40) && ((z>=0 && z<=10) || (z>=40 && z<=50))){
			this.x-=1;
			return getFormatedCoordinates();
		}
		else {
			if(x==0)
				return getFormatedCoordinates();
			else
				return getFormatedCoordinates();
		}
	}

	@Override
	public String moveRight() {
		if(((y>=0 && y<=10) || (y>=40 && y<=50)) && (x>=0 && x<50) && ((z>=0 && z<=50))){
			this.x+=1;
			return getFormatedCoordinates();
		} else if((y>=10 && y<=40) && ((x>=0 && x<10)||(x>=40 && x<50)) && (z>=0 && z<=50)){
			this.x+=1;
			return getFormatedCoordinates();
		} else if(((z>=0 && z<=10)||(z>=40 && z<=50)) && (y>=10 && y<=40) && (x>=10 && x<40)){
			this.x+=1;
			return getFormatedCoordinates();
		}
		else {
			if (x==50)
				return getFormatedCoordinates();
			else
				return getFormatedCoordinates();
		}
	}

	@Override
	public String moveBack() {
		if(z==50){
			return getFormatedCoordinates();
		}else if(((z>=0 && z<10) || (z>=40 && y<50)) && (x>=0 && x<=50) && (y>=0 && y<=50)){
			this.z+=1;
			return getFormatedCoordinates();
		}else if((z>=10 && z<40) && ((x>=0 && x<=10)||(x>=40 && x<=50)) && (y>=0 && y<=50)){
			this.z+=1;
			return getFormatedCoordinates();
		}else if(((y>=0 && y<=10) || (y>=40 && y<=50)) && (z>=10 && z<40) && (x>=10 && x<=40)){
			this.z+=1;
			return getFormatedCoordinates();
		}else {
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveForth() {
		if(((z>0 && z<=10) || (z>40&&y<=50)) && (x>=0 && x<=50) && ((y>=0 && y<=50))){
			this.z-=1;
			return getFormatedCoordinates();
		}else if((z>10 && z<=40) && ((x>=0 && x<=10) || (x>=40 && x<=50)) && (y>=0&&y<=50)){
			this.z-=1;
			return getFormatedCoordinates();
		}else if(((y>=0 && y<=10)||(y>=40 && y<=50)) && (z>10 && z<=40) && (x>=10 && x<=40)){
			this.z-=1;
			return getFormatedCoordinates();
		}else {
			if (z==0)
				return getFormatedCoordinates();
			else
				return getFormatedCoordinates();
		}
	}

	@Override
	public String getFormatedCoordinates() {
		return "Pozicija drona: (" + x + "," + y + "," + z + ")";
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
