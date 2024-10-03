class base {
    public void area()
    {

    }
    public void display()
        {

        }
}
class rectangle extends base{
    public void area()
    {
        System.out.println("Hi i am calculating rectangle area");
    }
    public void display()
    {
        System.out.println("Hi i am displaying rectangle area");
    }
    
}
class circle extends base{
    public void area()
    {
        System.out.println("Hi i am calculating circle area");
    }
    public void display()
    {
        System.out.println("Hi i am displaying circle area");
    }
}
class test {
    public static void main(String[] args) {
        // early binding
        circle c=new circle();
        c.display();

        rectangle r=new rectangle();
        r.area();

        // late binding
        base b=new rectangle();
        b.display();
    }
}