package drone;

public class Drone implements StandardDrone {

		private int x=30;
		private int y=0;
		private int z=30;
	@Override
	/*public String moveUp() {
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
	}*/
	public String moveUp() {
		if(((x<=10&& x>=0)||(x>=40&&x<=50))&&y<50){
			y=y+1;
			return getFormatedCoordinates();
		}
		else if(((z<=10 &&z>=0)||(z>=40 &&z<=50))&&y<50){
			y=y+1;
			return getFormatedCoordinates();
		}
		else if((y<50&&y>=40)||(y>=0&&y<10)){
			y=y+1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	public String moveDown(){
		if(((x<=10&& x>=0)||(x>=40&&x<=50))&&y>0){
			y=y-1;
			return getFormatedCoordinates();
		}
		else if(((z<=10 &&z>=0)||(z>=40 &&z<=50))&&y>0){
			y=y-1;
			return getFormatedCoordinates();
		}
		else if((y<=50&&y>40)||(y>0&&y<=10)){
			y=y-1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	/*@Override
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
	*/

	@Override
	public String moveLeft() {
		if(((y<=10&& y>=0)||(y>=40&&y<=50))&&x>0){
			x=x-1;
			return getFormatedCoordinates();
		}
		else if(((z<=10 &&z>=0)||(z>=40 &&z<=50))&&x>0){
			x=x-1;
			return getFormatedCoordinates();
		}
		else if((x<=50&&x>40)||(x>0&&x<=10)){
			x=x-1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
		
	}
	public String moveRight(){
		if(((y<=10&& y>=0)||(y>=40&&y<=50))&&x<50){
			x=x+1;
			return getFormatedCoordinates();
		}
		else if(((z<=10 &&z>=0)||(z>=40 &&z<=50))&&x<500){
			x=x+1;
			return getFormatedCoordinates();
		}
		else if((x<50&&x>=40)||(x>=0&&x<10)){
			x=x+1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	/*@Override
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
	*/

	@Override
	public String moveBack() {
		if(((y<=10&& y>=0)||(y>=40&&y<=50))&&z>0){
			z=z-1;
			return getFormatedCoordinates();
		}
		else if(((x<=10 &&x>=0)||(x>=40 &&x<=50))&&z>0){
			z--;
			return getFormatedCoordinates();
		}
		else if((z<=50&&z>40)||(z>0&&z<=10)){
			z=z-1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveForth() {
		if(((y<=10&& y>=0)||(y>=40&&y<=50))&&z<50){
			z=z+1;
			return getFormatedCoordinates();
		}
		else if(((x<=10 &&x>=0)||(x>=40 &&x<=50))&&z<50){
			z=z+1;
			return getFormatedCoordinates();
		}
		else if((z<50&&z>=40)||(z>=0&&z<10)){
			z=z+1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: "+"("+x+","+y+","+z+")";
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
	

}
