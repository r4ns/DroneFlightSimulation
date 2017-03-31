package drone;

import space.FlySpace;

public class Drone implements StandardDrone{
	private int x=30;
	private int y=0;
	private int z=30;
	
	private FlySpace obj=new FlySpace();
	
	@Override
	public String moveUp() {
		if(((x>=obj.getStartOuter()&&x<=obj.getStartInner())||(x>=obj.getFinishInner()&&x<=obj.getFinishOuter()))&&(z>=obj.getStartOuter()&&z<=obj.getFinishOuter())&&(y>=obj.getStartOuter()&&y<obj.getFinishOuter())){
			y++;
			return getFormatedCoordinates();
		}else if(((y>=obj.getStartOuter()&&y<obj.getStartInner())||(y>=obj.getFinishInner()&&y<obj.getFinishOuter()))&&((z>=obj.getStartOuter()&&z<=obj.getFinishOuter())&&(x>=obj.getStartOuter()&&x<=obj.getFinishOuter()))){
			y++;
			return getFormatedCoordinates();
		}else if((x>=obj.getStartOuter()&&x<=obj.getFinishOuter())&&((z>=obj.getStartOuter()&&z<=obj.getStartInner())||(z>=obj.getFinishInner()&&z<=obj.getFinishOuter()))&&(y>=obj.getStartOuter()&&y<obj.getFinishOuter())){
			y++;
			return getFormatedCoordinates();
		}else {
			return getFormatedCoordinates()+"//dron hits edge !!!";
		}
	}
	@Override
	public String moveDown() {
		if(((x>=obj.getStartOuter()&&x<=obj.getStartInner())||(x>=obj.getFinishInner()&&x<=obj.getFinishOuter()))&&(z>=obj.getStartOuter()&&z<=obj.getFinishOuter())&&(y>obj.getStartOuter()&&y<=obj.getFinishOuter())){
			y--;
			return getFormatedCoordinates();
		}else if(((y>obj.getStartOuter()&&y<=obj.getStartInner())||(y>obj.getFinishInner()&&y<=obj.getFinishOuter()))&&((z>=obj.getStartOuter()&&z<=obj.getFinishOuter())&&(x>=obj.getStartOuter()&&x<=obj.getFinishOuter()))){
			y--;
			return getFormatedCoordinates();
		}else if((x>=obj.getStartOuter()&&x<=obj.getFinishOuter())&&((z>=obj.getStartOuter()&&z<=obj.getStartInner())||(z>=obj.getFinishInner()&&z<=obj.getFinishOuter()))&&(y>obj.getStartOuter()&&y<=obj.getFinishOuter())){
			y--;
			return getFormatedCoordinates();
		}else {
			return getFormatedCoordinates()+"//dron hits edge !!!";
		}
	}
	@Override
	public String moveLeft() {
		if(((y>=obj.getStartOuter()&&y<=obj.getStartInner())||(y>=obj.getFinishInner()&&y<=obj.getFinishOuter()))&&(x>obj.getStartOuter()&&x<=obj.getFinishOuter())&&((z>=obj.getStartOuter()&&z<=obj.getFinishOuter()))){
			x--;
			return getFormatedCoordinates();
		}else if((y>=obj.getStartInner()&&y<=obj.getFinishInner())&&((x>obj.getStartOuter()&&x<=obj.getStartInner())||(x>obj.getFinishInner()&&x<=obj.getFinishOuter()))&&z>=obj.getStartOuter()&&z<=obj.getFinishOuter()){
			x--;
			return getFormatedCoordinates();
		}else if(((z>=obj.getStartOuter()&&z<=obj.getStartInner())||(z>=obj.getFinishInner()&&z<=obj.getFinishOuter()))&&(y>=obj.getStartInner()&&y<=obj.getFinishInner())&&(x>obj.getStartInner()&&x<=obj.getFinishInner())){
			x--;
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates()+"//dron hits edge !!!";
		}
	}
	@Override
	public String moveRight() {
		if(((y>=obj.getStartOuter()&&y<=obj.getStartInner())||(y>=obj.getFinishInner()&&y<=obj.getFinishOuter()))&&(x>=obj.getStartOuter()&&x<obj.getFinishOuter())&&((z>=obj.getStartOuter()&&z<=obj.getFinishOuter()))){
			x++;
			return getFormatedCoordinates();
		}else if((y>=obj.getStartInner()&&y<=obj.getFinishInner())&&((x>=obj.getStartOuter()&&x<obj.getStartInner())||(x>=obj.getFinishInner()&&x<obj.getFinishOuter()))&&(z>=obj.getStartOuter()&&z<=obj.getFinishOuter())){
			x++;
			return getFormatedCoordinates();
		}else if(((z>=obj.getStartOuter()&&z<=obj.getStartInner())||(z>=obj.getFinishInner()&&z<=obj.getFinishOuter()))&&(y>=obj.getStartInner()&&y<=obj.getFinishInner())&&(x>=obj.getStartInner()&&x<obj.getFinishInner())){
			x++;
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates()+"//dron hits edge !!!";
		}
	}
	@Override
	public String moveForth() {
		if(((z>obj.getStartOuter()&&z<=obj.getStartInner())||(z>obj.getFinishInner()&&y<=obj.getFinishOuter()))&&(x>=obj.getStartOuter()&&x<=obj.getFinishOuter())&&((y>=obj.getStartOuter()&&y<=obj.getFinishOuter()))){
			z--;
			return getFormatedCoordinates();
		}else if((z>obj.getStartInner()&&z<=obj.getFinishInner())&&((x>=obj.getStartOuter()&&x<=obj.getStartInner())||(x>=obj.getFinishInner()&&x<=obj.getFinishOuter()))&&(y>=obj.getStartOuter()&&y<=obj.getFinishOuter())){
			z--;
			return getFormatedCoordinates();
		}else if(((y>=obj.getStartOuter()&&y<=obj.getStartInner())||(y>=obj.getFinishInner()&&y<=obj.getFinishOuter()))&&(z>obj.getStartInner()&&z<=obj.getFinishInner())&&(x>=obj.getStartInner()&&x<=obj.getFinishInner())){
			z--;
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates()+"//dron hits edge !!!";
		}
	}
	@Override
	public String moveBack() {
		if(((z>=obj.getStartOuter()&&z<obj.getStartInner())||(z>=obj.getFinishInner()&&y<obj.getFinishOuter()))&&(x>=obj.getStartOuter()&&x<=obj.getFinishOuter())&&((y>=obj.getStartOuter()&&y<=obj.getFinishOuter()))){
			z++;
			return getFormatedCoordinates();
		}else if((z>=obj.getStartInner()&&z<obj.getFinishInner())&&((x>=obj.getStartOuter()&&x<=obj.getStartInner())||(x>=obj.getFinishInner()&&x<=obj.getFinishOuter()))&&(y>=obj.getStartOuter()&&y<obj.getFinishOuter())){
			z++;
			return getFormatedCoordinates();
		}else if(((y>=obj.getStartOuter()&&y<=obj.getStartInner())||(y>=obj.getFinishInner()&&y<=obj.getFinishOuter()))&&(z>=obj.getStartInner()&&z<obj.getFinishInner())&&(x>=obj.getStartInner()&&x<=obj.getFinishInner())){
			z++;
			return getFormatedCoordinates();
		}
		else {
			return getFormatedCoordinates()+"//dron hits edge !!!";
		}
	}
	@Override
	public String getFormatedCoordinates() {
		return String.format("Drone position: ("+x+","+y+","+z+")");
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
