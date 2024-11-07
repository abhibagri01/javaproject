public class flotriangle {
    FLOYDS TRIANGLE

public static void floyds_triangle(int n){
    int count = 1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    floyds_triangle(5);
}


public static void floyds_triangle2(int n){
    int count = 1;             
    for(int i=1; i<=n; i++){
        for(int j=1; j<=(2*i-1);j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    floyds_triangle2(4);
}
}
