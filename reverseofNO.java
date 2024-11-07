public class reverseofNO {
    import java.util.*;
    public class p12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
             //REVERSE OF A NUMBER
    int n = 13578;
    while (n>0) {
        int LastDigit = n%10; 
        System.out.print(LastDigit + " ");
        n = n/10;  //for remove LD
    } 
}            
}               
}
