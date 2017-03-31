package drone;

public class Drone implements StandardDrone {

		private int x=30;
		private int y=0;
		private int z=30;
		private int granicaX=50;
		private int granicaY=50;
		private int granicaZ=50;
		private int razmak=10;
		
		public Drone(int[] start,int[] granice, int razmak){
			granicaX=granice[0];
			granicaY=granice[1];
			granicaZ=granice[2];
			this.razmak=razmak;
			
			
		}
		public Drone(){
			
		}
	
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
	public boolean provera(String smer){
		if(smer=="moveUp"){
			if(((x<=razmak&& x>=0)||(x>=granicaX-razmak&&x<=granicaX))&&y<granicaY){
				return true;
			}
			else if(((z<=razmak &&z>=0)||(z>=granicaZ-razmak &&z<=granicaZ))&&y<granicaY){
				return true;
			}
			else if((y<granicaY&&y>=granicaY-razmak)||(y>=0&&y<razmak)){
				return true;
			}
			else{
				return false;
			}
			
		}
		else if(smer=="moveDown"){
			if(((x<=razmak&& x>=0)||(x>=granicaX-razmak&&x<=50))&&y>0){
				
				return true;
			}
			else if(((z<=razmak &&z>=0)||(z>=granicaZ-razmak &&z<=50))&&y>0){
				
				return true;
			}
			else if((y<=granicaY&&y>granicaY-razmak)||(y>0&&y<=razmak)){
				
				return true;
			}
			else{
				return false;
			}
			
		}
		else if(smer=="moveRight"){
			if(((y<=razmak&& y>=0)||(y>=granicaY-razmak&&y<=granicaY))&&x<granicaX){
				
				return true;
			}
			else if(((z<=razmak &&z>=0)||(z>=granicaZ-razmak &&z<=granicaZ))&&x<granicaX){
				
				return true;
			}
			else if((x<granicaX&&x>=granicaX-razmak)||(x>=0&&x<razmak)){
				
				return true;
			}
			else{
				return false;
			}
			
		}
		else if(smer=="moveLeft"){
			if(((y<=razmak&& y>=0)||(y>=granicaY-razmak&&y<=granicaY))&&x>0){
				
				return true;
			}
			else if(((z<=razmak &&z>=0)||(z>=granicaZ-razmak &&z<=granicaZ))&&x>0){
				
				return true;
			}
			else if((x<=granicaX&&x>granicaX-razmak)||(x>0&&x<=razmak)){
			
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
	/*	if(((x<=10&& x>=0)||(x>=40&&x<=50))&&y<50){
			y=y+1;
			return getFormatedCoordinates();
		}
		else if(((z<=10 &&z>=0)||(z>=40 &&z<=50))&&y<50){
			y=y+1;
			return getFormatedCoordinates();
		}
		else if((y<50&&y>=40)||(y>=0&&y<10)){
			y++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}*/
	}
	public String moveDown(){
		if(provera("moveDown")){
			y--;
			return getFormatedCoordinates();
			
		}
		else{
			return getFormatedCoordinates();
		}
		/*if(((x<=10&& x>=0)||(x>=40&&x<=50))&&y>0){
			y--;
			return getFormatedCoordinates();
		}
		else if(((z<=10 &&z>=0)||(z>=40 &&z<=50))&&y>0){
			y=y-1;
			return getFormatedCoordinates();
		}
		else if((y<=50&&y>40)||(y>0&&y<=10)){
			y--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}*/
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
		if(provera("moveLeft")){
			x--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		/*if(((y<=10&& y>=0)||(y>=40&&y<=50))&&x>0){
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
		}*/
		
		
	}
	public String moveRight(){
		
		if(provera("moveRight")){
			x++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
			
		}
		/*if(((y<=10&& y>=0)||(y>=40&&y<=50))&&x<50){
			x=x+1;
			return getFormatedCoordinates();
		}
		else if(((z<=10 &&z>=0)||(z>=40 &&z<=50))&&x<50){
			x=x+1;
			return getFormatedCoordinates();
		}
		else if((x<50&&x>=40)||(x>=0&&x<10)){
			x=x+1;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}*/
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
