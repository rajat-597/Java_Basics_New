package JavaBasics;

import java.util.Scanner;

public class PaliandromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.next();
//        String originalString = str;
//
//        String reverseStr = "";
//        for(int i = str.length()-1; i>=0; i--){
//           reverseStr = reverseStr + str.charAt(i) ;
//
//        }
//        System.out.println(reverseStr);
//        if (reverseStr.equals(originalString))
//            System.out.println("The Given String is a paliandrome");
//        else
//            System.out.println("The Given String is not a paliandrome");

        boolean ispaliandrom = true;
        for(int i = 0 , j = str.length()-1; i<j; i++, j--){
            if(str.charAt(i) == str.charAt(j)){
                continue;
            }
            ispaliandrom = false;
            break;
        }
        System.out.println(ispaliandrom? "paliandrom" : "Not Paliandrom");
    }
}
