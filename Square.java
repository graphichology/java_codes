

public class Square extends Rectangle {
	public Square(){}
    public void setLength(double newLength){
    	Length = newLength;
    	setWidth(newLength);
    }
    public double getLength(){
        return Length;
    }
}
