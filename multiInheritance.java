public class multiInheritance {
          // MULTILEVEL INHERITANCE

class Animal{
    void eat(){System.out.println("eating...");}
}  
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}               
class BabyDog extends Dog{
void weep(){System.out.println("weeping...");}
}
class TestInheritance{
    public static void main(String arg[]){
BabyDog d = new BabyDog();
d.weep();
d.bark();
d.eat();
    }
}
}
