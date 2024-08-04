package JavaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
    // check if the elements are unique in the AL. not Duplicate elements
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the Element from the users ");
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i<5;i++){
            int n = sc.nextInt();
            if(!al.contains(n))
            al.add(n);
        }
        System.out.println(al);


    }
}
