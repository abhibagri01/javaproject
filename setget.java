class abc {
         private String name;
    void Set(String name){
        this.name=name;
    }
    void get(){
        System.out.println(name);
    }

        }
public class SetGet {

    public static void main(String[] args) {
        abc emp=new abc();
        emp.Set("hbhk");
        emp.get();
//        System.out.println(emp.name);
    }
}
