package drone;

public class DroneController {

	public static void main(String[] args) {		
       
		Drone dr = new Drone(30,0,30);
		System.out.println("pocetne koordinate. "+dr.getFormatedCoordinates());
		System.out.println("Dron leti gore");
       for(int i =0; i<10;i++)
       {
    	   
    	   
    	   dr.moveUp();
    	   System.out.println(dr.getFormatedCoordinates());
    	  
       }
       System.out.println("Dron leti desno");
       for(int i=0;i<10;i++)
       {
    	   dr.moveRight();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron leti gore");
       for(int i=0;i<20;i++)
       {
    	   dr.moveUp();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron leti napred");
       for(int i=0;i<20;i++)
       {
    	   dr.moveForth();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron leti levo");
       for(int i=0;i<20;i++)
       {
    	   dr.moveLeft();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron leti gore");
       for(int i=0;i<10;i++)
       {
    	   dr.moveUp();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron leti nazad");
       for(int i=0;i<20;i++)
       {
    	   dr.moveBack();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron leti levo");
       for(int i=0;i<10;i++)
       {
    	   dr.moveLeft();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron leti dole");
       for(int i=0;i<10;i++)
       {
    	   dr.moveDown();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron leti levo");
       for(int i=0;i<10;i++)
       {
    	   dr.moveLeft();
    	   System.out.println(dr.getFormatedCoordinates());
    	   
       }
       System.out.println("Dron je stigao na odrediste");
       
	}
}
