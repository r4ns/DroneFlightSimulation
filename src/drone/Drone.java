package drone;

public class Drone implements StandardDrone {

		private int x=30;
		private int y=0;
		private int z=30;
	@Override
	public String moveUp() {
		if(x<=40 &&x>=10 && z>=10 && z<=40 && (y<10||y>=40)&&y>=0&&y<50){
			y=y+1;
			return getFormatedCoordinates();
		}
		else if(((x>=0 && x<=10)||(x<=50 && x>=40))&&((z>=0 && z<=10)||(z<=50 && z>=40))&& y>=0 && y<=50){
			y=y+1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveDown() {
		if(x<=40 &&x>=10 && z>=10 && z<=40 && ((y>40&&y<=50)||(y>0&&y<=10))){
			y=y-1;
			return getFormatedCoordinates();
		}
		else if(((x>=0 && x<=10)||(x<=50 && x>=40))&&((z>=0 && z<=10)||(z<=50 && z>=40))&& y>=0 && y<=50){
			y=y-1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveLeft() {
		
		return "Drone position: "+"("+x+","+y+","+z+")";
	}

	@Override
	public String moveRight() {
		if(y<=40 &&y>=10 && z>=10 && z<=40 && (x<10||x>=40)&&x>=0&&x<50){
			x=x+1;
			return getFormatedCoordinates();
		}
		else if(((y>=0 && y<=10)||(y<=50 && y>=40))&&((z>=0 && z<=10)||(z<=50 && z>=40))&& x>=0 && x<=50){
			x=x+1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveBack() {
		z=z-1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		z=z+1;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: "+"("+x+","+y+","+z+")";
	}

}
