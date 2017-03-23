package drone;

public class Drone implements StandardDrone {

	private int x=30;
	private int y=0;;
	private int z=30;
	
	public Drone(){
		
	}
	public Drone(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	} 
	@Override
	public String moveUp() {
		if(x==30 && y<=10 && z==30)
		{
			System.out.print("------Moving UP------\n");
			for(int i=0;i<10;i++)
			{
				y++;
				System.out.println(this.getFormatedCoordinates());
			}
				
		}
		else{
			System.out.print("------Moving UP------\n");
			for(int i=0;i<30;i++)
			{
				y++;
				System.out.println(this.getFormatedCoordinates());
			}
			
		}
			
			
		return null;
	}
	@Override
	public String moveDown() {
		if(x==0 && y<=40 && y>=30 && z==30)
		{
			System.out.print("------Moving DOWN------\n");
			for(int i=0;i<10;i++)
			{
				y--;
				System.out.println(this.getFormatedCoordinates());
			}
				
		}
		return null;
	}
	@Override
	public String moveLeft() {
		if(x<=50 &&  x>=0 && y==40 && z==50)
		{
			System.out.print("------Moving LEFT------\n");
			for(int i=0;i<50;i++)
			{
				x--;
				System.out.println(this.getFormatedCoordinates());
			}
				
		}
		return null;
	}
	@Override
	public String moveRight() {
		if(x>=30 &&  x<=50 && y==10 && z==30)
		{
			System.out.print("------Moving RIGHT------\n");
			for(int i=0;i<20;i++)
			{
				x++;
				System.out.println(this.getFormatedCoordinates());
			}
				
		}
		return null;
	}
	@Override
	public String moveBack() {
		if(x==0 && y==40 && z>=30 && z<=50)
		{
			System.out.print("------Moving BACK------\n");
			for(int i=0;i<20;i++)
			{
				z--;
				System.out.println(this.getFormatedCoordinates());
			}
				
		}
		return null;
	}
	@Override
	public String moveForth() {
		if(x==50 && y==40 && z>=30 && z<=50)
		{
			System.out.print("------Moving FORTH------\n");
			for(int i=0;i<20;i++)
			{
				z++;
				System.out.println(this.getFormatedCoordinates());
			}
				
		}
		return null;
	}
	@Override
	public String getFormatedCoordinates() {
		
		return "Drone : "+"("+x+","+y+","+z+")";
	}
	
	
	
}