public class starDia {
      //STAR DIAMOND

public static void star_diamond(int n){
    for(int i=1; i<=n; i++){              //first half

        for(int j=1; j<=(n-i);j++){       //spaces -- (n-i)
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++){      //star
            System.out.print("*");
        }
        System.out.println();
    }

for(int i=n; i>=1; i--){               // second half
    for(int j=1; j<=(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }
    System.out.println();
}
}
public static void main(String[] args) {
    star_diamond(4);
}

}
