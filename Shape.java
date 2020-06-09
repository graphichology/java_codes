public class Shape {
	/*Shape fields*/
    static String Color;
    static boolean Filled;
    /*Shape Methods*/
    public Shape(){}
    public String getColor(){
        return Color;
    }
    public String getFilled(){
    	if (Filled==true) return "Fill";
    	else return "Stroke" ;
    }

}
