public class butterfly {
    PATTERN OF BUTTERFULY

public static void butterfly(int n){
    for(int i=1; i<=n; i++){     //First half

        for(int j=1; j<=i; j++){        //Star -- i
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){  //Space -- 2*(n-i)
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){        //star -- i
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=n; i>=1; i--){       // Second half
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    butterfly(4);
}
