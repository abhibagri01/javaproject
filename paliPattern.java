public class paliPattern {
             // PALINDROMIC PATTERN WITH NUMBER

public static void palindromic_pattern_witn_number(int n){
        for(int i=1; i<=n; i++){              

            for(int j=1; j<=(n-i);j++){      //first half   //spaces -- (n-i)
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){           //number --(i to 1)
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){         //second half // number -- (2 to i)
                System.out.print(j);
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    palindromic_pattern_witn_number(5);

}
}
