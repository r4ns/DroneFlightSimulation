package space;

public class Test {

	public static void main(String[] args) {
		/*
		int[] p={39,8,39};
		DoubleCubeDrone d = new DoubleCubeDrone(p, 1);
		System.out.println(d.moveUp());
		System.out.println(d.moveUp());
		System.out.println(d.moveUp());
		System.out.println(d.moveRight());
		System.out.println(d.moveUp());
		System.out.println(d.moveUp());
		*/
		
		DoubleCubeDrone d=new DoubleCubeDrone();
		System.out.println(d.k1.toString());
		System.out.println(d.k2.toString());
		int i=0;
		System.out.println("novi pokret ");
		while(i<25){
			System.out.println(d.moveUp());
			i++;
		}
		int j=0;
		System.out.println("novi pokret ");
		while(j<25){
			System.out.println(d.moveDown());
			j++;
		}
		j=0;
		System.out.println("novi pokret ");
		while(j<35){
			System.out.println(d.moveRight());
			j++;
		}
		i=0;
		System.out.println("novi pokret ");
		while(i<25){
			System.out.println(d.moveUp());
			i++;
		}
		i=0;
		System.out.println("novi pokret ");
		while(i<20){
			System.out.println(d.moveLeft());
			i++;
		}
		i=0; 
		System.out.println("novi pokret ");
		while(i<20){
			System.out.println(d.moveUp());
			i++;
		}
		j=0;
		System.out.println("novi pokret ");
		while(j<5){
			System.out.println(d.moveRight());
			j++;
		}
		i=0; 
		System.out.println("novi pokret ");
		while(i<20){
			System.out.println(d.moveUp());
			i++;
		}
		j=0;
		System.out.println("novi pokret ");
		while(j<25){
			System.out.println(d.moveBack());
			j++;
		}
		j=0;
		System.out.println("novi pokret ");
		while(j<5){
			System.out.println(d.moveDown());
			j++;
		}
		j=0;
		System.out.println("novi pokret ");
		while(j<15){
			System.out.println(d.moveForth());
			j++;
		}
		j=0;
		System.out.println("novi pokret ");
		while(j<25){
			System.out.println(d.moveDown());
			j++;
		}
	}

}
