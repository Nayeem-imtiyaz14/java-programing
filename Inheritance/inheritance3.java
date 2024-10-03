// Create a class “Shape” with a method “getArea()” that returns the area of the
// shape.Create a subclass “Rectangle” that extends “Shape” and adds fields
// “length” and “width” and overrides the “getArea()” method to return the area
// of the rectangle.Create an object of the “Shape” class and call the “getArea()”
// method.Create an object of the “Rectangle” class and call the “getArea()”
// method.
import java.util.*;
 class shape{
    int a,b;
     shape(int a,int b)
     {
       this.a=a;
       this.b=b;
     }
     public int getarea(){
        return 0;
     }
}
class rectangle extends shape{
    rectangle(int a,int b)
    {
    
        super(a, b);
       
    }
    public int getarea()
    {
        return(a*b);
    }
}
public class inheritance3{
    public static void main(String[] args) {
        System.out.println("Enter two integers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        
        shape s=new shape(a,b);
        s.getarea();
        rectangle r=new rectangle(a,b);
        System.out.println("area = "+r.getarea());
        sc.close();
    }
}
