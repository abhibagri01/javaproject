public class HR {
    HOLLOW RECTANGLE 

    public static void hollow_rectangle(int m ,int n) {
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==m || j==1||j==n){
                    System.out.print("*");
                }
                else {
                      System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    hollow_rectangle(4,5);
}
}
