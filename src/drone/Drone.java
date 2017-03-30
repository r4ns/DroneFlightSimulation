package drone;

public class Drone implements StandardDrone {
	
	private int x;
	private int y;
	private int z;
	
	public Drone(){
		
	}	
	
	public Drone (int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public String toString(){
		return "Trenutna pozicija drona: ("+x+","+y+","+z+")";
	}
	@Override
	public String moveUp() {
		if(x>10&&x<40&&z>10&&z<40&&y<10&&y>=0)
		{
			//donji deo y<10
			y++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
			
		}else if(x>=0&&x<=50&&y>=0&&y<50&&z>=40&&z<=50){
			//prednji deo
			y++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
			
		}else if(x>=0&&x<=50&&y>=0&&y<50&&z>=0&&z<=10){
			//zadnji deo
			y++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
			
		}else if(x>=0&&x<=10&&y>=0&&y<50&&z>=0&&z<=50){
			//levi deo
			y++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=40&&x<=50&&y>=0&&y<50&&z>=0&&z<=50){
			//desni deo
			y++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>40&&x<50&&z>10&&z<40&&y>=40&&y<50){
			
			//gornji deo
			y++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}
		return "Trenutna pozicija drona: ("+this.x+","+this.y+","+this.z+")";
		
	}

	
	@Override
	public String moveDown() {
		if(x>=0&&x<=50&&y>40&&y<=50&&z>=0&&z<=50){
			//gornji deo
			y--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>10&&x<40&&y>0&&y<=10&&z>10&&z<40){
			//donji deo y<=10
			y--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<=10&&y>0&&y<=50&&z>=0&&z<=50){
			//levi deo
			y--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=40&&x<=50&&y>0&&y<=50&&z>=0&&z<=50){
			//desni deo
			y--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<=50&&y>0&&y<=50&&z>=0&&z<=10){
			//zadnji deo
			y--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<=50&&y>0&&y<=50&&z>=40&&z<=50){
			//prednji deo
			y--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}
		return "Trenutna pozicija drona: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveLeft() {
		if(x>40&&x<=50&&y>10&&y<40&&z>10&&z<40){
			//desna strana
			x--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>0&&x<=10&&y>10&&y<40&&z>10&&z<40){
			//leva strana
			x--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>0&&x<=50&&y>0&&y<=50&&z>=0&&z<=10){
			//zadnja strana
			x--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>0&&x<=50&&y>=0&&y<=50&&z>=40&&z<=50){
			//prednja strana
			x--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>0&&x<=50&&y>=40&&y<=50&&z>=0&&z<=50){
			//gornja strana
			x--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>0&&x<=50&&y>=0&&y<=10&&z>=0&&z<=50){
			//donja strana
			x--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}
		return "Trenutna pozicija drona: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveRight() {
		if(x>=0&&x<50&&y>10&&y<40&&z>=40&&z<=50){
			//prednja strana
			x++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<50&&y>10&&y<40&&z>=0&&z<=10){
			//zadnja strana
			x++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<50&&y>=0&&y<=10&&z>=0&&z<=50){
			//donja strana
			x++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<50&&y>=40&&y<=50&&z>=0&&z<=50){
			//gornja strana
			x++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<10&&y>10&&y<40&&z>10&&z<40){
			//leva strana
			x++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=40&&x<50&&y>10&&y<40&&z>10&&z<40){
			//desna strana
			x++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}
		return "Trenutna pozicija drona: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveBack() {
		if(x>=0&&x<=50&&y>=0&&y<=10&&z>=0&&z<50){
			//donja strana
			z++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<=50&&y>=40&&y<=50&&z>=0&&z<50){
			//gornja strana
			z++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<=10&&y>=0&&y<=50&&z>=0&&z<50){
			//leva strana
			z++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=40&&x<=50&&y>=0&&y<=50&&z>=0&&z<50){
			//desna strana
			z++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>10&&x<40&&y>10&&y<40&&z>=40&&z<50){
			//prednja strana
			z++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>10&&x<40&&y>10&&y<40&&z>=0&&z<10){
			//zadnja strana
			z++;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}
		return "Trenutna pozicija drona: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveForth() {
		if(x>10&&x<40&&y>10&&y<40&&z>40&&z<=50){
			//prednja strana
			z--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>10&&x<40&&y>10&&y<40&&z>0&&z<=10){
			//zadnja strana
			z--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<=50&&y>=40&&y<=50&&z>0&&z<=50){
			//gore strana
			z--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<=50&&y>=0&&y<=10&&z>0&&z<=50){
			//donja strana
			z--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=0&&x<=10&&y>=0&&y<=50&&z>0&&z<=50){
			//leva strana
			z--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}else if(x>=40&&x<=50&&y>=0&&y<=50&&z>0&&z<=50){
			//desno strana
			z--;
			System.out.println("Trenutna pozicija drona: ("+x+","+y+","+z+")");
		}
		return "Trenutna pozicija drona: ("+x+","+y+","+z+")";
	}

	@Override
	public String getFormatedCoordinates() {
		
		return "Trenutna pozicija drona: ("+this.x+","+this.y+","+this.z+")";
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
