

public class Rectangle extends Shape{
	protected double Length;
	protected double Width;
    /*Rectangle Methods*/
    public Rectangle(){}
    public void setLenght(double newLenght){
    	Length = newLenght;
    }
    public void setWidth(double newWidth){
        Width=newWidth;
    }
    public double getLenght(){
        return Length;
    }
    public double getWidth(){
        return Width;
    }
    public double getArea(){
        return Length*Width;
    }
    public double getPremiter(){
        return 2*(Length+Width);
    }
}
