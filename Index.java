import java.util.Scanner;
public class Index {
	public static void main(String args[])
    {
		Scanner in = new Scanner(System.in);
		Shape objShape=new Shape();
		System.out.println("what is the color:");
		Shape.Color = in.nextLine();
		System.out.println("is shape filled?");
		Shape.Filled = Boolean.parseBoolean(in.nextLine());
		System.out.println("Enter name of the shape: Circle-Cylinder-Rectangle-Square");
		String shape = in.nextLine();
		switch(shape) {
		case "Circle" :
			System.out.println("enter the radius : ");
			Circle obj=new Circle();
			obj.setRadius(in.nextDouble());
			System.out.println("color:"+objShape.getColor()+"\n "+objShape.getFilled()+"\n radius:"+obj.getRadius()+"\n Area:"+obj.getArea()+"\n premiter:"+obj.getPremiter());
			break;
		case "Cylinder":
			Cylinder obj2=new Cylinder();
			System.out.println("enter the radius : ");
			obj2.setRadius(in.nextDouble());
			System.out.println("enter the height : ");
			obj2.setHeight(in.nextDouble());
			System.out.println("color:"+objShape.getColor()+"\n "+objShape.getFilled()+"\n radius:"+obj2.getRadius()+"\n height:"+obj2.getHeight()+"\n Area:"+obj2.getArea());
			break;
		case "Rectangle":
			Rectangle obj3=new Rectangle();
			System.out.println("enter the length : ");
			obj3.setLenght(in.nextDouble());
			System.out.println("enter the width : ");
			obj3.setWidth(in.nextDouble());
			System.out.println("color:"+objShape.getColor()+"\n "+objShape.getFilled()+"\n length:"+obj3.getLenght()+"\n width:"+obj3.getWidth()+"\n Area:"+obj3.getArea()+"\n premiter:"+obj3.getPremiter());
			break;
		case "Square":
			Square obj4=new Square();
			System.out.println("enter the length:");
			obj4.setLength(in.nextDouble());
			System.out.println("color:"+objShape.getColor()+"\n "+objShape.getFilled()+"\n length:"+obj4.getLenght()+"\n Area:"+obj4.getArea()+"\n premiter:"+obj4.getPremiter());
			break;
			
		}
    }
}
