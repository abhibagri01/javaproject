public class forassign {
    public class pattern {

        // HOLLOW RECTANGLE 

//     public static void hollow_rectangle(int m ,int n) {
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1||i==m || j==1||j==n){
//                     System.out.print("*");
//                 }
//                 else {
//                       System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// public static void main(String[] args){
//     hollow_rectangle(4,5);
// }


 // INVERTED HALF PYRAMID

// public static void inverted_halfpyramid(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int k=1;k<=i;k++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     inverted_halfpyramid(4);
// }

            // HALF PYR WITH NUMBER

// public static void inverted_half_pyramid_withnumber(int n){
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=n-i+1; j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     inverted_half_pyramid_withnumber(5);
// }


 // FLOYDS TRIANGLE

// public static void floyds_triangle(int n){
//     int count = 1;
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=i;j++){
//             System.out.print(count+" ");
//             count++;
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     floyds_triangle(5);
// }


// public static void floyds_triangle2(int n){
//     int count = 1;             
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=(2*i-1);j++){
//             System.out.print(count+" ");
//             count++;
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     floyds_triangle2(4);
// }

  //ZERO ONE TRIANGLE

// public static void zero_one_triangle(int n){
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//             if((i+j)%2==0){
//                 System.out.print("1");
//             }
//             else{
//                 System.out.print("0");
//             }
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     zero_one_triangle(5);
// }


  //PATTERN OF BUTTERFULY

// public static void butterfly(int n){
//     for(int i=1; i<=n; i++){     //First half

//         for(int j=1; j<=i; j++){        //Star -- i
//             System.out.print("*");
//         }
//         for(int j=1; j<=2*(n-i); j++){  //Space -- 2*(n-i)
//             System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){        //star -- i
//             System.out.print("*");
//         }
//         System.out.println();
//     }

//     for(int i=n; i>=1; i--){       // Second half
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         for(int j=1; j<=2*(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     butterfly(4);
// }

//                   //SOLID RHOMBUS

// public static void solid_rhombus(int n){
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=n; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     solid_rhombus(5);
// }

       // HOLLOW RHOMBUS
  
// public static void hollow_rhombus(int n){
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//         }
//         for(int j=1; j<=n; j++){
//             if(i==1 || i==n || j==1||j==n){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     hollow_rhombus(5);
// }

      //STAR DIAMOND

// public static void star_diamond(int n){
//     for(int i=1; i<=n; i++){              //first half

//         for(int j=1; j<=(n-i);j++){       //spaces -- (n-i)
//             System.out.print(" ");
//         }
//         for(int j=1; j<=2*i-1; j++){      //star
//             System.out.print("*");
//         }
//         System.out.println();
//     }

// for(int i=n; i>=1; i--){               // second half
//     for(int j=1; j<=(n-i);j++){
//         System.out.print(" ");
//     }
//     for(int j=1; j<=2*i-1; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// }
// public static void main(String[] args) {
//     star_diamond(4);
// }

    // NUMBER PYRAMID

// public static void number_pyramid(int n){
// for(int i=1; i<=n; i++){              //first half

//             for(int j=1; j<=(n-i);j++){       //spaces -- (n-i)
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){      //star
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// public static void main(String[] args) {
//     number_pyramid(5);

// }


//                 // PALINDROMIC PATTERN WITH NUMBER

// public static void palindromic_pattern_witn_number(int n){
//         for(int i=1; i<=n; i++){              

//             for(int j=1; j<=(n-i);j++){      //first half   //spaces -- (n-i)
//                 System.out.print(" ");
//             }
//             for(int j=i; j>=1; j--){           //number --(i to 1)
//                 System.out.print(j);
//             }
//             for(int j=2; j<=i; j++){         //second half // number -- (2 to i)
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// public static void main(String[] args) {
//     palindromic_pattern_witn_number(5);

// }































}

}
