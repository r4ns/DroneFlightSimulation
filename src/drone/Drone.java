package drone;

import space.FlySpace;

/*public class Drone implements StandardDrone {

		private int x=30;
		private int y=0;
		private int z=30;
		private int granicaX=50;
		private int granicaY=50;
		private int granicaZ=50;
		private int razmak=10;
		
		public Drone(int[] start,int[] granice, int razmak){
			x=start[0];
			y=start[1];
			z=start[2];
			granicaX=granice[0];
			granicaY=granice[1];
			granicaZ=granice[2];
			this.razmak=razmak;
			
			
		}
		public Drone(int[] start,FlySpace fs){
			x=start[0];
			y=start[1];
			z=start[2];
			granicaX=fs.getGranicaX();
			granicaY=fs.getGranicaY();
			granicaZ=fs.getGranicaZ();
			razmak=fs.getRazmak();
			
		}
		public Drone(){
			
		}
	

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
		else if(smer=="moveBack"){
			if(((y<=razmak&& y>=0)||(y>=granicaY-razmak&&y<=granicaY))&&z>0){
				
				return true;
			}
			else if(((x<=razmak &&x>=0)||(x>=granicaX-razmak &&x<=granicaX))&&z>0){
				
				return true;
			}
			else if((z<=granicaZ&&z>granicaZ-razmak)||(z>0&&z<=razmak)){
				
				return true;
			}
			else{
				return false;
			}
		}
		else if(smer=="moveForth"){
			if(((y<=razmak&& y>=0)||(y>=granicaY-razmak&&y<=granicaY))&&z<granicaZ){
				
				return true;
			}
			else if(((x<=razmak &&x>=0)||(x>=granicaX-razmak &&x<=granicaX))&&z<granicaZ){
				
				return true;
			}
			else if((z<granicaZ&&z>=granicaZ-razmak)||(z>=0&&z<razmak)){
				
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



	
	public String moveBack() {
		if(provera("moveBack")){
			z--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
		
	}


	public String moveForth() {
		if(provera("moveForth")){
			z++;
			return getFormatedCoordinates();
		}else{
			return getFormatedCoordinates();
		}
	
	}
}*/