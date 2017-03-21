package drone;

public class Drone implements StandardDrone {
	
	int x = 30;
	int y= 0;
	int z = 30;
	
	public Drone(int x, int y, int z){
		
		this.x=x;
		this.y=y;
		this.z=z;
	}

	@Override
	public String moveUp() {
		
		System.out.println("-------------Moving up-------------");
		
		if(y>=10 && /*x==30 && z==30*/ x<=40 && x>=10 && z<=40 && z>=10){
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		
		} else if(y<=10) {
			
			for(int k=0; k<10; k++){ 
				
				y++;
				System.out.println("Drone position: ("+x+","+y+","+z+")");
				
			}
			
		} else if(x==20 &&  y==20 && z==0) {
			
			for(int k=0; k<30; k++){
				
				if(y<50){
					
					y++;
					System.out.println("Drone position: ("+x+","+y+","+z+")");
				}

			}
				
			} else {
		
			for(int i=0; i<10; i++){
				
				if(y<10){
					
					y++;
					System.out.println("Drone position: ("+x+","+y+","+z+")");
				}
			}
		}
		
		
		return null;
	
			
		}
		
		

	@Override
	public String moveDown() {
		
		
		if(x==0 && y==50 && z==20){
			
			for(int i=0; i<20; i++){
				
				y--;
				System.out.println("Drone position: ("+x+","+y+","+z+")");
			}
		}
		
		return null;
	}

	@Override
	public String moveLeft() {
		
		System.out.println("-------------Moving left-------------");
		
		if(x<=20 && y==20 && z==0){
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else if (x>=20 && x<=50 && z==0){
			
			for(int i=0; i<30; i++){
				
				x--;
				System.out.println("Drone position: ("+x+","+y+","+z+")");
				
			}
		} else if (x==20 && y==50 && z==20){
			
			for(int i=0; i<20; i++){
				
				x--;
				System.out.println("Drone position: ("+x+","+y+","+z+")");
				
			}
		}
		
		
		
		
		
		return null;
	}

	@Override
	public String moveRight() {
		
		
		System.out.println("-------------Moving right-------------");
		
		if(x>=50){
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else {
			
			for(int i=0; i<20; i++){
				
				if(x<50){
					
					x++;
					System.out.println("Drone position: ("+x+","+y+","+z+")");
				} 
		
			}
		}
		return null;
		
	}

	@Override
	public String moveBack() {
		
		System.out.println("-------------Moving back-------------");
		
		if(z<=0){
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else {
			
			for(int i = 0; i<30; i++){
				
				if(z<=30){
					z--;
					System.out.println("Drone position: ("+x+","+y+","+z+")");
					
				}
				
				
				
			}
		}
		
		
		
		return null;
	}

	@Override
	public String moveForth() {
		
		System.out.println("-------------Moving forth-------------");
		
		if(z>=20 && x==20 && y==50){
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x==0 && y==30 && z==20){
			
			for(int i=0; i<10; i++){
				
				z++;
				System.out.println("Drone position: ("+x+","+y+","+z+")");
			}
			
		}else {
			
			for(int i=0; i<20; i++){
				
				if(z<20){
					
					z++;
					System.out.println("Drone position: ("+x+","+y+","+z+")");
					
				}
			}
		}
		
		
		
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
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
