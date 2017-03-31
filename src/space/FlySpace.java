package space;

public class FlySpace {
	private int startOuter=0;
	private int startInner=10;
	
	private int finishInner=40;
	private int finishOuter=50;
	
	public FlySpace(){}
	public FlySpace(int startO,int startI,int finishI,int finishO){
		startOuter=startO;
		startInner=startI;
		finishInner=finishI;
		finishOuter=finishO;
	}
	
	public int getStartOuter() {
		return startOuter;
	}
	public void setStartOuter(int startOuter) {
		this.startOuter = startOuter;
	}
	public int getStartInner() {
		return startInner;
	}
	public void setStartInner(int startInner) {
		this.startInner = startInner;
	}
	public int getFinishInner() {
		return finishInner;
	}
	public void setFinishInner(int finishInner) {
		this.finishInner = finishInner;
	}
	public int getFinishOuter() {
		return finishOuter;
	}
	public void setFinishOuter(int finishOuter) {
		this.finishOuter = finishOuter;
	}

}
