public class interface {
    //interface decleration : by first user
interface Drawable{
       void draw();
}
// implementation : by second user
class Rectangle implements Drawable{
       public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
       public void draw(){System.out.println("drawing circle");}
}
//
class TestInheritance{
       public static void main(String[] args) {
              Circle d = new Circle();
              d.draw();
       }
}
}