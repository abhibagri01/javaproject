public class prime {
    import java.util.*;
    public class oep {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    // check for prime
    for( int i=2;i<=n;i++){
        if(i==n){
            System.out.println("it is  prime");
        }
        else{
            if(n%i==0){
                System.out.println("it is not a prime");
                break;
            }
            }

        }
    }
}
}
