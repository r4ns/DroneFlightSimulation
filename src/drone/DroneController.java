package drone;

public class DroneController {

	public static void main(String[] args) {		
		Drone d = new Drone(30, 0 ,30);
		
		int i =0;
		
		while(i < 12)
		{
			System.out.println(d.moveUp());
			i++;
		}
		
		i = 0;
		while(i < 21)
		{
			System.out.println(d.moveRight());
			i++;
		}
		
		i = 0;
		while(i < 23)
		{
			System.out.println(d.moveUp());
			i++;
		}
		
		i = 0;
		while(i < 16)
		{
			System.out.println(d.moveForth());
			i++;
		}
		
		i = 0;
		while(i < 12)
		{
			System.out.println(d.moveLeft());
			i++;
		}
		
		i = 0;
		while(i < 5)
		{
			System.out.println(d.moveForth());
			i++;
		}
		
		i = 0;
		while(i < 18)
		{
			System.out.println(d.moveLeft());
			i++;
		}
		
		i = 0;
		while(i < 17)
		{
			System.out.println(d.moveUp());
			i++;
		}
		
		i = 0;
		while(i < 21)
		{
			System.out.println(d.moveBack());
			i++;
		}
		
		i = 0;
		while(i < 22)
		{
			System.out.println(d.moveLeft());
			i++;
		}
		
		i = 0;
		while(i < 20)
		{
			System.out.println(d.moveDown());
			i++;
		}
	}
}
