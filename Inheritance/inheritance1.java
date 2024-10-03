// 1. Create a class “Vehicle” with a method “start()” that prints “Vehicle
// started”.Create a subclass “Car” that extends “Vehicle” and overrides the
// “start()” method to print “Car started”. Create an object of the “Vehicle” class
// and call the “start()” method.
// Create an object of the “Car” class and call the “start()” method.

class vehicle {
    public void start()
    {
        System.out.println("Vehicle started");
    }
}
class car extends vehicle {
    public void start()
    {
        System.out.println("Car started");
    }
}
class inheritance1{
    public static void main(String[] args) {
        vehicle v=new vehicle();
        v.start();
        car c=new car();
        c.start();
    }
}