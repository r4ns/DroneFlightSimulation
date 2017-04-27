package drone;

import space.FlySpace;
import utility.Cube;

public class Drone implements StandardDrone {
	
	private Cube k1;
	private Cube k2;
	private FlySpace fs;
	
	

   public Drone ()
   {
	   
   }
   
   public Drone(Cube k1, Cube k2, FlySpace fs){
	   this.k1 = k1;
	   this.k2 = k2;
	   this.fs = fs;
   }
   
   @Override
	public String moveUp( int j ) {
		
		for(int i=0; i<j; i++){
			
			k1.increaseY(1);
			
			if(!(fs.getVelikaKocka().checkCoordinates(k1.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k1) && !fs.getPrepreka().checkCubeIntersection(k1))){
				k1.decreaseY(1);	
			}else{
				
				k2.increaseY(1);
				if(!(fs.getVelikaKocka().checkCoordinates(k2.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k2) && !fs.getPrepreka().checkCubeIntersection(k2))){
					k1.decreaseY(1);
					k2.decreaseY(1);
				}
			}
		}

		return getFormatedCoordinates();
		
	}

	@Override
	public String moveDown(int j) {
		for(int i=0; i<j; i++){	
			k1.decreaseY(1);
			
			if(!(fs.getVelikaKocka().checkCoordinates(k1.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k1) && !fs.getPrepreka().checkCubeIntersection(k1))){
				k1.increaseY(1);	
			}else{
				
				k2.decreaseY(1);
				if(!(fs.getVelikaKocka().checkCoordinates(k2.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k2) && !fs.getPrepreka().checkCubeIntersection(k2))){
					k1.increaseY(1);
					k2.increaseY(1);
				}
			}
		}

		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft(int j) {
	
		for(int i=0; i<j; i++){	
			k1.decreaseX(1);
			
			if(!(fs.getVelikaKocka().checkCoordinates(k1.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k1) && !fs.getPrepreka().checkCubeIntersection(k1))){
				k1.increaseX(1);	
			}else{
				
				k2.decreaseX(1);
				if(!(fs.getVelikaKocka().checkCoordinates(k2.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k2) && !fs.getPrepreka().checkCubeIntersection(k2))){
					k1.increaseX(1);
					k2.increaseX(1);
				}
			}
		}
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight(int j) {
		
		for(int i=0; i<j; i++){
			
			k1.increaseX(1);
			
			if(!(fs.getVelikaKocka().checkCoordinates(k1.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k1) && !fs.getPrepreka().checkCubeIntersection(k1))){
				k1.decreaseX(1);	
			}else{
				
				k2.increaseX(1);
				if(!(fs.getVelikaKocka().checkCoordinates(k2.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k2)&& !fs.getPrepreka().checkCubeIntersection(k2))){
					k1.decreaseX(1);
					k2.decreaseX(1);
				}
			}
		}

		return getFormatedCoordinates();
	}

	@Override
	public String moveBack(int j) {
		for(int i=0; i<j; i++){	
			k1.decreaseZ(1);
			
			if(!(fs.getVelikaKocka().checkCoordinates(k1.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k1) && !fs.getPrepreka().checkCubeIntersection(k1))){
				k1.increaseZ(1);	
			}else{
				
				k2.decreaseZ(1);
				if(!(fs.getVelikaKocka().checkCoordinates(k2.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k2) && !fs.getPrepreka().checkCubeIntersection(k2))){
					k1.increaseZ(1);
					k2.increaseZ(1);
				}
			}
		}
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth(int j) {
		for(int i=0; i<j; i++){
			
			k1.increaseY(1);
			
			if(!(fs.getVelikaKocka().checkCoordinates(k1.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k1) && !fs.getPrepreka().checkCubeIntersection(k1))){
				k1.decreaseY(1);	
			}else{
				
				k2.increaseY(1);
				if(!(fs.getVelikaKocka().checkCoordinates(k2.getMaxCoordinates()) && !fs.getMalaKocka().checkCubeIntersection(k2)&& !fs.getPrepreka().checkCubeIntersection(k2))){
					k1.decreaseY(1);
					k2.decreaseY(1);
				}
			}
		}
			
		return getFormatedCoordinates();
		
	}

	
	@Override
	public String getFormatedCoordinates() {
		
		return "Dron position:"  + "k1(" + k1 + ") k2(" + k2 + ")";
	}

	
}
