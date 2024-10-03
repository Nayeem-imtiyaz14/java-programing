// Create a class “Person” with fields “name” and “age” and a method
// “display()” that prints the name and age of the person. Create a subclass
// “Employee” that extends “Person” and adds a field “salary” and a method
// “display()” that prints the name, age, and salary of the employee.
// Create an object of the “Person” class and call the “display()” method. Create
// an object of the `Employee` class and call the “display()” method.
class person{
    String name;int age;
    person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println("Name :"+name+" Age is "+age);
    }
}
class employee extends person{
    int salary;
    employee(String name,int age,int salary){
    super(name,age);
    this.salary=salary;}
    public void display()
    {
        System.out.println("Name :"+name+" Age is "+age+" Salary is "+salary);   
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        person p=new person("nayeem",20);
        employee e=new employee("ubaid", 15, 200000);
        p.display();
        e.display();
    }
}
