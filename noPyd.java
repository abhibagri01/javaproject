public class noPyd {
     // NUMBER PYRAMID

public static void number_pyramid(int n){
for(int i=1; i<=n; i++){              //first half

            for(int j=1; j<=(n-i);j++){       //spaces -- (n-i)
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){      //star
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    number_pyramid(5);

}
}
