
import java.util.*;
public class factorial {

           //FACTORIAL OF A NUM. N
public static int factorial(int n){
    if(n==0) return 1;
    return n*factorial(n-1);
}
public static void main(String argd[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int fact =  factorial(n);
    System.out.println(fact);
}
}
