package drone;

public class Drone implements StandardDrone {
	
	private int x=30;
	private int y=0;
	private int z=30;
	
	public Drone(){
		
	}	
	public Drone (int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	@Override
	public String moveUp() {
		if(y>=0&&y<=10&&x<=40&&x>=10&&z>=10&&z<=40)
		{
			y=y+1;			
		}
		else if((x>=0&&x<=10)||(x<=50&&x>=40)&&(y>=0&&y<=50)&&(z>=0&&z<=10)||(z<=50&&z>=40)){
			
		}			
		return "("+x+","+y+","+z+")";
		
	}

	@Override
	public String moveDown() {
		
		return null;
	}

	@Override
	public String moveLeft() {
		
		return null;
	}

	@Override
	public String moveRight() {
		
		return null;
	}

	@Override
	public String moveBack() {
		
		return null;
	}

	@Override
	public String moveForth() {
		
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		
		return null;
	}

}
