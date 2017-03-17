package drone;

public class Drone implements StandardDrone {
  private int x;
  private int y;
  private int z;
  
  public Drone(int x, int y, int z)
  {
	  this.x=x;
	  this.y=y;
	  this.z=z;
  }
  
  
  public String moveUp() {
	  int i;
	  System.out.println("Dron uzlece");
	  for (i=0;i<=-10;i--){
		  y=i;
		  System.out.println("("+x+","+y+","+z+")");
	  }
	  return "Dron je dosao na kordinate("+x+","+y+","+z+")";
	  
  }
  
  public String moveDown() {
  	
	  int i;
	  System.out.println("Dron leti dole");
	  for (i=x;i<=10;i++){
		  x=i;
		  System.out.println("("+x+","+y+","+z+")");
	  }
	  return "Dron je dosao na kordinate("+x+","+y+","+z+")";
  }


 
  public String moveLeft() {
  	
	  int i;
	  System.out.println("Dron leti levo");
	  for (i=x;i<=10;i++){
		  x=i;
		  System.out.println("("+x+","+y+","+z+")");
	  }
	  return "Dron je dosao na kordinate("+x+","+y+","+z+")";
  }


  
  public String moveRight() {
  
	  int i;
	  System.out.println("Dron leti desno");
	  for (i=x;i<=50;i++){
		  x=i;
		  System.out.println("("+x+","+y+","+z+")");
	  }
	  return "Dron je dosao na kordinate("+x+","+y+","+z+")";
  }


  
  public String moveBack() {
	  return null;
  }


  
  public String moveForth() {
	  int i;
	  System.out.println("Dron leti napred");
	  for (i=z;i<=50;i++){
		  z=i;
		  System.out.println("("+x+","+z+","+y+")");
	  }
	  return "Dron je dosao na kordinate("+x+","+z+","+y+")";
  	
  	
  }


  
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
