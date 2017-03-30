
package drone;

public class Drone implements StandardDrone {

	private int x;
	private int y;
	private int z;
	
	
	public Drone(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public String moveUp() {
		// TODO Auto-generated method stub

		if((0<=x && x<=50) && (0<=y && y<10) && (0<=z && z<=50))
		{
			y++;
		}
		else if((0<=x && x<=50) && (40<=y && y<50) && (0<=z && z<=50))
		{
			y++;
		}
		else if((0<=x && x<=50) && (0<=y && y<50) && (0<=z && z<=10))
		{
			y++;
		}
		else if((0<=x && x<=10) && (0<=y && y<50) && (0<=z && z<=50))
		{
			y++;
		}
		else if((0<=x && x<=50) && (0<=y && y<50) && (40<=z && z<=50))
		{
			y++;
		}
		else if((40<=x && x<=50) && (0<=y && y<50) && (0<=z && z<=50))
		{
			y++;	
		}
		return getFormatedCoordinates();
	}
	
	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		if((0<=x && x<=50) && (0<y && y<=10) && (0<=z && z<=50))
		{
			y--;
		}
		else if((0<=x && x<=50) && (40<y && y<=50) && (0<=z && z<=50))
		{
			y--;
		}
		else if((0<=x && x<=50) && (0<y && y<=50) && (0<=z && z<=10))
		{
			y--;
		}
		else if((0<=x && x<=10) && (0<y && y<=50) && (0<=z && z<=50))
		{
			y--;
		}
		else if((0<=x && x<=50) && (0<y && y<=50) && (40<=z && z<=50))
		{
			y--;
		}
		else if((40<=x && x<=50) && (0<y && y<=50) && (0<=z && z<=50))
		{
			y--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub

		if((0<x && x<=50) && (0<=y && y<=10) && (0<=z && z<=50))
		{
			x--;
		}
		else if((0<x && x<=50) && (40<=y && y<=50) && (0<=z && z<=50))
		{
			x--;
		}
		else if((0<x && x<=50) && (0<=y && y<=50) && (0<=z && z<=10))
		{
			x--;
		}
		else if((0<x && x<=10) && (0<=y && y<=50) && (0<=z && z<=50))
		{
			x--;
		}
		else if((0<x && x<=50) && (0<=y && y<=50) && (40<=z && z<=50))
		{
			x--;
		}
		else if((40<x && x<=50) && (0<=y && y<=50) && (0<=z && z<=50))
		{
			x--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		if((0<=x && x<50) && (0<=y && y<=10) && (0<=z && z<=50))
		{
			x++;
		}
		else if((0<=x && x<50) && (40<=y && y<=50) && (0<=z && z<=50))
		{
			x++;
		}
		else if((0<=x && x<50) && (0<=y && y<=50) && (0<=z && z<=10))
		{
			x++;
		}
		else if((0<=x && x<10) && (0<=y && y<=50) && (0<=z && z<=50))
		{
			x++;
		}
		else if((0<=x && x<50) && (0<=y && y<=50) && (40<=z && z<=50))
		{
			x++;
		}
		else if((40<=x && x<50) && (0<=y && y<=50) && (0<=z && z<=50))
		{
			x++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		if((0<=x && x<=50) && (0<=y && y<=10) && (0<=z && z<50))
		{
			z++;
		}
		else if((0<=x && x<=50) && (40<=y && y<=50) && (0<=z && z<50))
		{
			z++;
		}
		else if((0<=x && x<=50) && (0<=y && y<=50) && (0<=z && z<10))
		{
			z++;
		}
		else if((0<=x && x<=10) && (0<=y && y<=50) && (0<=z && z<50))
		{
			z++;
		}
		else if((0<=x && x<=50) && (0<=y && y<=50) && (40<=z && z<50))
		{
			z++;
		}
		else if((40<=x && x<=50) && (0<=y && y<=50) && (0<=z && z<50))
		{
			z++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		if((0<=x && x<=50) && (0<=y && y<=10) && (0<z && z<=50))
		{
			z--;
		}
		else if((0<=x && x<=50) && (40<=y && y<=50) && (0<z && z<=50))
		{
			z--;
		}
		else if((0<=x && x<=50) && (0<=y && y<=50) && (0<z && z<=10))
		{
			z--;
		}
		else if((0<=x && x<=10) && (0<=y && y<=50) && (0<z && z<=50))
		{
			z--;
		}
		else if((0<=x && x<=50) && (0<=y && y<=50) && (40<z && z<=50))
		{
			z--;
		}
		else if((40<=x && x<=50) && (0<=y && y<=50) && (0<z && z<=50))
		{
			z--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Drone position: ("+x+","+y+","+z+")";
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