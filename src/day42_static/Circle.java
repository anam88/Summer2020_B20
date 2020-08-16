package day42_static;

public class Circle {
    double radius;
    double diameter;
    static double pi = 3.14;

    public void setCircleInfo(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }
    public double calcArea(){
        return radius * radius * pi;
    }
    public double calPerimeter(){
        return diameter * pi;
    }
    public String toString(){
        return "Radius: "+radius+"\nDiameter: "+diameter+"\nValue of pi: "+pi+
                "\nArea of Circle: "+calcArea()+"\nPerimeter: "+calPerimeter();
    }


}
