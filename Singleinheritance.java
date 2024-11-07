import java.util.*;

          //    SINGLE INHERITANCE

class Animal{
    void eat() {System.out.println("eating...");}
}
class Dog extends Animal{
void bark(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String arg[]){
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}

       