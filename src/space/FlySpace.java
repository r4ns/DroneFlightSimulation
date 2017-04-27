package space;

public class FlySpace {
	   
    private int[] outerBoundaries = new int[3];
    private int[] innerSpace = new int[3];
   
   
    public FlySpace (int outerBoundariesX, int outerBoundariesY, int outerBoundariesZ, int innerSpaceX, int innerSpaceY, int innerSpaceZ){
        outerBoundaries[0] = outerBoundariesX;
        outerBoundaries[1] = outerBoundariesY;
        outerBoundaries[2] = outerBoundariesZ;
       
        innerSpace[0] = innerSpaceX;
        innerSpace[1] = innerSpaceY;
        innerSpace[2] = innerSpaceZ;
    }
   
   
    public int getInnerSpaceX (){
        return innerSpace[0];
        }
   
    public int getInnerSpaceY (){
        return innerSpace[1];
    }
   
    public int getInnerSpaceZ (){
        return innerSpace[2];
    }
         
    public int getOuterBoundariesX (){
        return outerBoundaries[0];
    }
   
    public int getOuterBoundariesY (){
        return outerBoundaries[1];
    }
   
    public int getOuterBoundariesZ (){
        return outerBoundaries[2];
    }
   
   
   
}