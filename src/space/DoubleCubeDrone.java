package space;
import utility.*;

public class DoubleCubeDrone {
	int[] niz={30,0,30};
	int duzina=1;
	Cube k1;
	Cube k2;
	FlySpace prostor=new FlySpace();
	
	public DoubleCubeDrone(){
		k1=new Cube(niz,duzina);
		k2=new Cube(k1);
	}
	
	public DoubleCubeDrone(int[] start,int duzina){
		for(int i=0;i<niz.length;i++){
			niz[i]=start[i];
		}
		this.duzina=duzina;
		k1=new Cube(niz,duzina);
		k2=new Cube(k1);
	}
	
	public String moveUp(){
		if((k2.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false && k2.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)
				|| (k2.getMaxCoordinates()[0]==prostor.getVelika().getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getVelika().getMinCoordinates()[0] 
				|| k2.getMaxCoordinates()[0]==prostor.getMala().getMinCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getMala().getMaxCoordinates()[0]
				|| k2.getMaxCoordinates()[2]==prostor.getVelika().getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getVelika().getMinCoordinates()[2] 
				|| k2.getMaxCoordinates()[2]==prostor.getMala().getMinCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getMala().getMaxCoordinates()[2])
				&& k2.getMaxCoordinates()[1]<prostor.getVelika().getMaxCoordinates()[1]){
			k1.increaseY(1);
			k2.increaseY(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	public String moveDown(){
		if((k1.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false && k1.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)
				|| (k2.getMaxCoordinates()[0]==prostor.getVelika().getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getVelika().getMinCoordinates()[0] 
				|| k2.getMaxCoordinates()[0]==prostor.getMala().getMinCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getMala().getMaxCoordinates()[0]
				|| k2.getMaxCoordinates()[2]==prostor.getVelika().getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getVelika().getMinCoordinates()[2] 
				|| k2.getMaxCoordinates()[2]==prostor.getMala().getMinCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getMala().getMaxCoordinates()[2])
				&& k1.getMaxCoordinates()[1]>prostor.getVelika().getMinCoordinates()[1]){
			k1.decreaseY(1);
			k2.decreaseY(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	
	public String moveRight(){
		if((k2.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false && k2.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)
				|| (k2.getMaxCoordinates()[1]==prostor.getVelika().getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getVelika().getMinCoordinates()[1]  
				|| k2.getMaxCoordinates()[1]==prostor.getMala().getMinCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getMala().getMaxCoordinates()[1]
				|| k2.getMaxCoordinates()[2]==prostor.getVelika().getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getVelika().getMinCoordinates()[2] 
				|| k2.getMaxCoordinates()[2]==prostor.getMala().getMinCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getMala().getMaxCoordinates()[2])
				&& k2.getMaxCoordinates()[0]<prostor.getVelika().getMaxCoordinates()[0]){
			k1.increaseX(1);
			k2.increaseX(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	
	public String moveLeft(){
		if((k1.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false && k1.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false)
				|| (k2.getMaxCoordinates()[1]==prostor.getVelika().getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getVelika().getMinCoordinates()[1]  
				|| k2.getMaxCoordinates()[1]==prostor.getMala().getMinCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getMala().getMaxCoordinates()[1]
				|| k2.getMaxCoordinates()[2]==prostor.getVelika().getMaxCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getVelika().getMinCoordinates()[2]  
				|| k2.getMaxCoordinates()[2]==prostor.getMala().getMinCoordinates()[2] || k1.getMinCoordinates()[2]==prostor.getMala().getMaxCoordinates()[2])
				&& k1.getMaxCoordinates()[0]>prostor.getVelika().getMinCoordinates()[0] ){
			k1.decreaseX(1);
			k2.decreaseX(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	
	public String moveForth(){
		if((k1.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false)&&(k2.checkIfCubesAreTouchingFromOutside(prostor.getMala())==false)
				&& (k1.checkIfCubesAreTouchingFromOutside(prostor.getVelika())==false)&&(k2.checkIfCubesAreTouchingFromOutside(prostor.getVelika())==false)
				|| (k2.getMaxCoordinates()[0]==prostor.getVelika().getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getVelika().getMinCoordinates()[0] 
				|| k2.getMaxCoordinates()[0]==prostor.getMala().getMinCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getMala().getMaxCoordinates()[0]
				|| k2.getMaxCoordinates()[1]==prostor.getVelika().getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getVelika().getMinCoordinates()[1]  
				|| k2.getMaxCoordinates()[1]==prostor.getMala().getMinCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getMala().getMaxCoordinates()[1])
				&& k2.getMaxCoordinates()[2]<prostor.getVelika().getMaxCoordinates()[2]){
			k1.increaseZ(1);
			k2.increaseZ(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	public String moveBack(){
		if((k1.checkIfCubesAreTouchingFromInside(prostor.getMala())==false)&&(k2.checkIfCubesAreTouchingFromInside(prostor.getMala())==false)
				&& (k1.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)&&(k2.checkIfCubesAreTouchingFromInside(prostor.getVelika())==false)
				|| (k2.getMaxCoordinates()[0]==prostor.getVelika().getMaxCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getVelika().getMinCoordinates()[0]  
				|| k2.getMaxCoordinates()[0]==prostor.getMala().getMinCoordinates()[0] || k1.getMinCoordinates()[0]==prostor.getMala().getMaxCoordinates()[0]
				|| k2.getMaxCoordinates()[1]==prostor.getVelika().getMaxCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getVelika().getMinCoordinates()[1]  
				|| k2.getMaxCoordinates()[1]==prostor.getMala().getMinCoordinates()[1] || k1.getMinCoordinates()[1]==prostor.getMala().getMaxCoordinates()[1])
				&& k2.getMaxCoordinates()[2]>prostor.getVelika().getMinCoordinates()[2] ){
			k1.decreaseZ(1);
			k2.decreaseZ(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	
	
	
	public String getFormatedCoordinates() {
		return k1.toString()+"-->"+k2.toString();
	}
}

