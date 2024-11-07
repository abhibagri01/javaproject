import java.util.*;
public class Assign2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

              //QUE. NO. 12

      System.out.println(" Enter mark in maths");  
     int m = sc.nextInt();
     System.out.println(" Enter mark in phy");
     int p = sc.nextInt();
     System.out.println(" Enter marks in chem");
     int c = sc.nextInt();

     if(m>=60){
        if(p>=50){
            if(c>=40){
                if(m + p + c>=200 || m + p >= 150){
                    System.out.println("Student is eligible");
                }
                    else{
                        System.out.println("Student is not eligible");

                    }
                }
            }
        }
     }


    }  