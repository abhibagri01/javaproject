public class HPwitnno {
     //  HALF PYR WITH NUMBER

public static void inverted_half_pyramid_withnumber(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    inverted_half_pyramid_withnumber(5);
}

}
