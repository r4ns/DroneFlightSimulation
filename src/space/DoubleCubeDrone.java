package space;
import utility.*;

public class DoubleCubeDrone {
	private int[] niz;
	private int duzina;
	Cube k1;
	Cube k2;
	int[] koor={30,30,30};
	Cube prepreka=new Cube(koor,1);
	FlySpace prostor=new FlySpace();
	
	public DoubleCubeDrone(){
		k1=new Cube(niz,duzina);
		k2=new Cube(k1);
	}
	
	public DoubleCubeDrone(int[] start,int duzina){
		this.duzina=duzina;
		k1=new Cube(start,duzina);
		k2=new Cube(k1);
	}
	
	protected boolean validateDronePositionAfter(String komanda){
		String k=komanda.toLowerCase();
		switch(k){
		case "moveup":
			if((k2.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false && k2.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)
					|| (k2.getMaxCoordinates()[0]==prostor.getVelika().getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getVelika().getMinCoordinates()[0] 
					|| k2.getMaxCoordinates()[0]==prostor.getMala().getMinCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getMala().getMaxCoordinates()[0]
					|| k2.getMaxCoordinates()[2]==prostor.getVelika().getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getVelika().getMinCoordinates()[2] 
					|| k2.getMaxCoordinates()[2]==prostor.getMala().getMinCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getMala().getMaxCoordinates()[2])
					&& k2.getMaxCoordinates()[1]<prostor.getVelika().getMaxCoordinates()[1])
				if((k2.checkIfCubesAreTouchingFromOutside(prepreka)==false && k1.checkIfCubesAreTouchingFromOutside(prepreka)==false)
					|| (k2.getMaxCoordinates()[0]==prepreka.getMinCoordinates()[0] || k1.getMaxCoordinates()[0]==prepreka.getMinCoordinates()[0]
					|| k2.getMaxCoordinates()[2]==prepreka.getMinCoordinates()[2] || k1.getMaxCoordinates()[2]==prepreka.getMinCoordinates()[2]
					|| k1.getMinCoordinates()[1]==prepreka.getMaxCoordinates()[1])
					&& k2.getMaxCoordinates()[1]<prepreka.getMinCoordinates()[1])
					return true;
				else
					return false;
			else
				return false;
		case "movedown":
			if((k1.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false && k1.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)
					|| (k2.getMaxCoordinates()[0]==prostor.getVelika().getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getVelika().getMinCoordinates()[0] 
					|| k2.getMaxCoordinates()[0]==prostor.getMala().getMinCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getMala().getMaxCoordinates()[0]
					|| k2.getMaxCoordinates()[2]==prostor.getVelika().getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getVelika().getMinCoordinates()[2] 
					|| k2.getMaxCoordinates()[2]==prostor.getMala().getMinCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getMala().getMaxCoordinates()[2])
					&& k1.getMaxCoordinates()[1]>prostor.getVelika().getMinCoordinates()[1])
				if((k2.checkIfCubesAreTouchingFromOutside(prepreka)==false && k1.checkIfCubesAreTouchingFromOutside(prepreka)==false)
						|| ((k2.getMaxCoordinates()[0]==prepreka.getMinCoordinates()[0]+1 && k2.getMaxCoordinates()[2]==prepreka.getMinCoordinates()[2]+1) || k1.getMinCoordinates()[0]==prepreka.getMaxCoordinates()[0]
						|| k2.getMinCoordinates()[2]==prepreka.getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prepreka.getMaxCoordinates()[2]
						|| k2.getMaxCoordinates()[1]==prepreka.getMinCoordinates()[1])
						)
						return true;
					else
						return false;
			else
				return false;
		case "moveright":
			if((k2.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false && k2.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)
					|| (k2.getMaxCoordinates()[1]==prostor.getVelika().getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getVelika().getMinCoordinates()[1]  
					|| k2.getMaxCoordinates()[1]==prostor.getMala().getMinCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getMala().getMaxCoordinates()[1]
					|| k2.getMaxCoordinates()[2]==prostor.getVelika().getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getVelika().getMinCoordinates()[2] 
					|| k2.getMaxCoordinates()[2]==prostor.getMala().getMinCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getMala().getMaxCoordinates()[2])
					&& k2.getMaxCoordinates()[0]<prostor.getVelika().getMaxCoordinates()[0])
				if((k2.checkIfCubesAreTouchingFromOutside(prepreka)==false && k1.checkIfCubesAreTouchingFromOutside(prepreka)==false)
						|| (k1.getMinCoordinates()[0]==prepreka.getMinCoordinates()[0]+1 || k1.getMaxCoordinates()[1]==prepreka.getMinCoordinates()[1]
						|| k2.getMaxCoordinates()[2]==prepreka.getMinCoordinates()[2] || k1.getMaxCoordinates()[2]==prepreka.getMinCoordinates()[2]
								|| k1.getMinCoordinates()[0]==prepreka.getMaxCoordinates()[0])
						&& k2.getMaxCoordinates()[0]>prepreka.getMinCoordinates()[0])
						return true;
					else
						return false;
			else
				return false;
		case "moveleft":
			if((k1.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false && k1.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false)
					|| (k2.getMaxCoordinates()[1]==prostor.getVelika().getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getVelika().getMinCoordinates()[1]  
					|| k2.getMaxCoordinates()[1]==prostor.getMala().getMinCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getMala().getMaxCoordinates()[1]
					|| k2.getMaxCoordinates()[2]==prostor.getVelika().getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getVelika().getMinCoordinates()[2]  
					|| k2.getMaxCoordinates()[2]==prostor.getMala().getMinCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getMala().getMaxCoordinates()[2])
					&& k1.getMaxCoordinates()[0]>prostor.getVelika().getMinCoordinates()[0])
				if((k2.checkIfCubesAreTouchingFromOutside(prepreka)==false && k1.checkIfCubesAreTouchingFromOutside(prepreka)==false)
						|| (k2.getMinCoordinates()[1]==prepreka.getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prepreka.getMaxCoordinates()[1]
						|| k2.getMinCoordinates()[2]==prepreka.getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prepreka.getMaxCoordinates()[2]
								|| k2.getMaxCoordinates()[0]==prepreka.getMinCoordinates()[0])
						&& k1.getMinCoordinates()[0]>prepreka.getMaxCoordinates()[0])
						return true;
					else
						return false;
			else
				return false;
		case "moveforth":
			if((k1.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false)&&(k2.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false)
					&& (k1.checkIfCubesAreTouchingFromOutside(prostor.getVelika())==false)&&(k2.checkIfCubesAreTouchingFromOutside(prostor.getVelika())==false)
					|| (k2.getMaxCoordinates()[0]==prostor.getVelika().getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getVelika().getMinCoordinates()[0] 
					|| k2.getMaxCoordinates()[0]==prostor.getMala().getMinCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getMala().getMaxCoordinates()[0]
					|| k2.getMaxCoordinates()[1]==prostor.getVelika().getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getVelika().getMinCoordinates()[1]  
					|| k2.getMaxCoordinates()[1]==prostor.getMala().getMinCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getMala().getMaxCoordinates()[1])
					&& k2.getMaxCoordinates()[2]<prostor.getVelika().getMaxCoordinates()[2])
				if((k2.checkIfCubesAreTouchingFromOutside(prepreka)==false && k1.checkIfCubesAreTouchingFromOutside(prepreka)==false)
						|| (k2.getMaxCoordinates()[1]==prepreka.getMinCoordinates()[1] || k1.getMaxCoordinates()[1]==prepreka.getMinCoordinates()[1]
						|| k2.getMaxCoordinates()[0]==prepreka.getMinCoordinates()[0] || k1.getMaxCoordinates()[0]==prepreka.getMinCoordinates()[0]
								|| k1.getMaxCoordinates()[2]==prepreka.getMinCoordinates()[2])
						&& k2.getMaxCoordinates()[2]==prepreka.getMaxCoordinates()[2])
						return true;
					else
						return false;
			else
				return false;
		case "moveback":
			if((k1.checkIfCubesAreTouchingFromInside(prostor.getMala())==false)&&(k2.checkIfCubesAreTouchingFromInside(prostor.getMala())==false)
					&& (k1.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)&&(k2.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)
					|| (k2.getMaxCoordinates()[0]==prostor.getVelika().getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getVelika().getMinCoordinates()[0]  
					|| k2.getMaxCoordinates()[0]==prostor.getMala().getMinCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getMala().getMaxCoordinates()[0]
					|| k2.getMaxCoordinates()[1]==prostor.getVelika().getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getVelika().getMinCoordinates()[1]  
					|| k2.getMaxCoordinates()[1]==prostor.getMala().getMinCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getMala().getMaxCoordinates()[1])
					&& k2.getMaxCoordinates()[2]>prostor.getVelika().getMinCoordinates()[2])
				if((k2.checkIfCubesAreTouchingFromOutside(prepreka)==false && k1.checkIfCubesAreTouchingFromOutside(prepreka)==false)
						|| (k2.getMinCoordinates()[1]==prepreka.getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prepreka.getMaxCoordinates()[1]
						|| k2.getMinCoordinates()[0]==prepreka.getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prepreka.getMaxCoordinates()[0]
								|| k1.getMaxCoordinates()[2]==prepreka.getMaxCoordinates()[2])
						&& (k2.getMinCoordinates()[2]==prepreka.getMinCoordinates()[2]))
						return true;
					else
						return false;
			else
				return false;
		}
		return false;
	}
	
	public String moveUp(){
		if(validateDronePositionAfter("moveup")){
			k1.increaseY(1);
			k2.increaseY(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates()+" no move!";
	}
	public String moveDown(){
		if(validateDronePositionAfter("movedown")){
			k1.decreaseY(1);
			k2.decreaseY(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates()+ " no move!";
	}
	
	public String moveRight(){
		if(validateDronePositionAfter("moveright")){
			k1.increaseX(1);
			k2.increaseX(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates()+" no move!";
	}
	
	public String moveLeft(){
		if(validateDronePositionAfter("moveleft")){
			k1.decreaseX(1);
			k2.decreaseX(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates()+" no move!";
	}
	
	public String moveForth(){
		if(validateDronePositionAfter("moveforth")){
			k1.increaseZ(1);
			k2.increaseZ(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates()+" no move!";
	}
	public String moveBack(){
		if(validateDronePositionAfter("moveback")){
			k1.decreaseZ(1);
			k2.decreaseZ(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates()+" no move!";
	}
	
	
	
	public String getFormatedCoordinates() {
		return k1.toString()+"-->"+k2.toString();
	}
}
