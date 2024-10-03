// . Create a class “Shape” with a method “getArea()” that returns the area of the
// shape.
// Create a subclass “Rectangle” that extends “Shape” and adds fields “length”
// and “width” and overrides the “getArea()” method to return the area of the
// rectangle.
// Create a subclass “Box” that extends “Rectangle” and adds a field “height”
// and overrides the “getArea()” method to return the surface area of the box.
// Create an object of the “Shape” class and call the “getArea()” method.
// Create an object of the “Rectangle” class and call the “getArea()” method.
// Create an object of the “Box” class and call the “getArea()” method.
class shape {
    
    public int getArea()
    {
        return 0;
    }
}
class rectangle extends shape{
    int x;int y;
    rectangle(int x,int y){
       this.x=x;this.y=y;
    }
    public int getArea()
    {
          return (x*y);
    }

}
class box extends rectangle {
    int z;
    box(int x,int y,int z)
    {
          super(x,y);
        this.z=z;
    }
    public int getArea()
    {
        return(x*y*z);
    }
}
public class inheritance6 {
    public static void main(String[] args) {
        shape s=new shape();
       System.out.println("GetArea of Shape " +s.getArea());
       System.out.println("entering into rectangle ");
       rectangle r=new rectangle(3, 5);
       System.out.println("GetArea of rectangle "+r.getArea());
       System.out.println("entering into box ");
       box b=new box(3,4,6);
       System.out.println("GetArea of box "+b.getArea());
    }
}