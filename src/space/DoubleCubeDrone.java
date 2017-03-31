package space;

public class DoubleCubeDrone {
	
	private int x, y, z;
	private int[] boundaries;

public  String moveUp(){
		
		y++;
		if(!check())
			y--;
		    
		return  "("+x+","+y+","+z+")";
	    
	}
	public  String moveDown() {
		
			y--;
		if(!check())
			y++;
		
		
		return"("+x+","+y+","+z+")";
	}
	public  String moveLeft(){
		
		
		x--;
		if(!check())
			x++;
		
		
		return "("+x+","+y+","+z+")";
	}
	public  String moveRight(){
		
		
		x++;
		if(!check())
			x--;
		
		
		return "("+x+","+y+","+z+")";
	}
	public  String moveBack(){
			
		z++;
		if(!check())
			z--;		
		
		return "("+x+","+y+","+z+")";
	}
	
	public String moveForth(){
			
		z--;
		if(!check())
			z++;
				
		return "("+x+","+y+","+z+")";
	}
	
public boolean check() {
		
		if((10<x&&x<boundaries[0]-10)&&(10<y&&y<boundaries[1]-10)&&(10<z&&z<boundaries[2]-10))
		{
			return false;
		}
		else if (0>x||x> boundaries[0]||0>y||y>boundaries[1]||0>z||z> boundaries[2])
		{
			return false;
		}
		else
		{
		return true;
		}
	}
}
