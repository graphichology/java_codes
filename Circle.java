
public class Circle extends Shape{
	private double Radius;
    protected double Height=1;
    /*Circle methods*/
    public Circle(){}
    public void setRadius(double newRadius){
        Radius=newRadius;
    }
    public double getRadius(){
        return Radius;
    }
    public double getArea(){
        double Area=3.14*Radius*Radius*Height;
        return Area;
    }
    public double getPremiter(){
        double Premiter=2*3.14*Radius;
        return Premiter;
    }
	
}
