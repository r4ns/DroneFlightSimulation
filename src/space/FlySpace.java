package space;

public class FlySpace {
	public FlySpace(int outerBorder, int innerBorder){
		this.innerBorder = innerBorder;
		this.outerBorder = outerBorder;
		this.spaceBetween = outerBorder - innerBorder;
	}
	int innerBorder, outerBorder;
	
	int spaceBetween;
	public int getInnerBorder() {
		return innerBorder;
	}
	public void setInnerBorder(int innerBorder) {
		this.innerBorder = innerBorder;
	}
	public int getOuterBorder() {
		return outerBorder;
	}
	public void setOuterBorder(int outerBorder) {
		this.outerBorder = outerBorder;
	}
	public int getSpaceBetween() {
		return spaceBetween;
	}
}
