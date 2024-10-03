// 10.Create a class “Shape” with a method “calculateArea()” that calculates and
// returns the area of the shape. Create two subclasses “Rectangle” and
// “Triangle” that extend “Shape” and implement the “calculateArea()” method.
 abstract class shape {
    abstract public int calculateArea();
    
}
class rectangle extends shape{
    int a,b;
    rectangle(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    public int calculateArea()
    {
        return (a*b);
    }
}
class triangle extends shape{
    int a,b;
    triangle(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int calculateArea()
    {
        return ((a*b)/2);
    }
}
public class inheritance7 {
    public static void main(String[] args) {
        shape s=new rectangle(8,9);
        System.out.println("Area of rectangle :"+s.calculateArea());
        shape n=new triangle(5,4);
        System.out.println("Area of triangle :"+n.calculateArea());
        
    }
}
