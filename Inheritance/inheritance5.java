// 6. Create a class “Animal” with a method “makeSound()” that prints a sound.
// Create a subclass “Mammal” that extends “Animal” and adds a method
// “giveBirth()” that prints “Giving birth”.
// Create a subclass “Dog” that extends “Mammal” and overrides the
// “makeSound()” method to print “Woof!”.
// Create an object of the “Animal” class and call the “makeSound()” method.
// Create an object of the “Mammal” class and call the “makeSound()” and
// “giveBirth()” methods.
// Create an object of the “Dog” class and call the “makeSound()” and
// “giveBirth()” methods.
class Animal {
    public void makeSound()
    {
        System.out.println("sound");
    }
}
class Mammal extends Animal{
    public void giveBirth()
    {
        System.out.println("Giving birth");
    }
}
class Dog extends Mammal{
    public void makeSound()
    {
        System.out.println("Woof");
    }
}

class inheritance5 {
    public static void main(String args[])
    {
          Animal a=new Animal();
          a.makeSound();
          Mammal m=new Mammal();
          m.makeSound();
          m.giveBirth();
          Dog g=new Dog();
          g.makeSound();
          g.giveBirth();
    }
}