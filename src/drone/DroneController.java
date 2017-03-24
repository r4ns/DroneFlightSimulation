package drone;

public class DroneController {

	public static void main(String[] args) {

		boolean prekidac = true;
		Drone dron= new Drone(30,0,30);//0,30,30

		while(prekidac!=false){

			if(dron.getY()==0)
				System.out.println(dron.getFormatedCoordinates());

			if(dron.getY()<10 || (dron.getX()==50 && dron.getY()>=10 && dron.getY()<50 &&  dron.getZ()==30)){
				if((dron.getX()==30 && dron.getY()==0 && dron.getZ()==30) || (dron.getX()==50 && dron.getY()==10 && dron.getZ()==30))
					System.out.println("--------------Moving up-----------------");

				System.out.println(dron.moveUp());
			}
			if(dron.getX()<50 && dron.getY()==10 && dron.getZ()==30){
				if(dron.getX()==30&& dron.getY()==10 &&dron.getZ()==30)
					System.out.println("--------------Moving right--------------");

				System.out.println(dron.moveRight());
			}
			if((dron.getX()>0 && dron.getY()==50 && dron.getZ()==30) || (dron.getX()>0 && dron.getY()==30 && dron.getZ()==50)){
				if((dron.getX()==50 && dron.getY()==50 && dron.getZ()==30) || (dron.getX()==25 && dron.getY()==30 && dron.getZ()==50))
					System.out.println("-------------Moving left----------------");

				System.out.println(dron.moveLeft());
			}	
			if(dron.getX()==25 && dron.getY()==50 && dron.getZ()<50){
				if(dron.getX()==25 && dron.getY()==50 && dron.getZ()==30)
					System.out.println("-------------Moving forth---------------");

				System.out.println(dron.moveForth());
			}
			if(dron.getX()==25 && dron.getY()>30 && dron.getZ()==50){
				if(dron.getX()==25 && dron.getY()==50 && dron.getZ()==50)
					System.out.println("------------Moving down-----------------");

				System.out.println(dron.moveDown());
			}
			if(dron.getX()==0 && dron.getY()==30 && dron.getZ()>30 ){
				if(dron.getX()==0 && dron.getY()==30 && dron.getZ()==50)
					System.out.println("--------------Moving back---------------");

				System.out.println(dron.moveBack());
			}
			if(dron.getX()==0 && dron.getY()==30 && dron.getZ()==30){
				System.out.println("-------Dron came to the destination-----");
				prekidac=false;
			}
		}
	}
}
