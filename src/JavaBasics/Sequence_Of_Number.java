package JavaBasics;

import java.util.Scanner;

public class Sequence_Of_Number {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
     //   System.out.println("Enter the number in sequence ");
      //  int n = sc.nextInt();
        int sum = 0;
//        for(int i=1; i<100; i++){
//            sum = sum + n;
//            System.out.println("value of sum " + sum);
//            if(sum > 100 ) {
//                System.out.println("Done the total value is " + sum);
//                break;
//            }
//            n = sc.nextInt();
//        }



        // optimized code
        while(sum<=100){
            System.out.println("Enter a number ");
            sum = sum + sc.nextInt();
        }
        System.out.println("Done " +sum );
    }
}
