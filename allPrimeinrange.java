public class allPrimeinrange {
        // ALL PRIME IN RANGE
public static void PrimeinRange(int n){
       for(int i=2;i<=n;i++){
              if(isPrime(i)){
                     System.out.print(i+" ");
              }
       }
       System.out.println();
}
public static void main(String[] args) {
       PrimeinRange(20);
}

}
