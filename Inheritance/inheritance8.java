// 12.Create a class “Animal” with a method “move()” that displays a message “The
// animal is moving”. Create two subclasses “Bird” and “Fish” that extend
// “Animal” and implement the “move()” method to display “The bird is flying”
// and “The fish is swimming” respectively.
class Animal {
    public void move()
    {
        System.out.println("The animal is moving ");
    }
}
class Bird extends Animal{
    public void move(){
        super.move();
    System.out.println("The bird is flying ");}
}
class fish extends Animal{
    public void move(){
    System.out.println("The fish is swimming ");}
}

public class inheritance8 {
    public static void main(String[] args) {
        // Bird b=new Bird();
        // b.move();
        Animal a=new Bird();
        a.move();
        Animal b=new fish();
        b.move();
    }
}
