
    import java.util.*;
    public class p12 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
                         //  the largest of 3 number
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        if(a>b && a>c){
            System.out.println(" the gretest no is  ="+a);
        }
        else if (b>a && b>c){
            System.out.println(" the gretest no is  ="+b);
        }
        else{
        System.out.println(" the gretest no is  ="+c);
        }
}
