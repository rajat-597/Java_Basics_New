package JavaBasics;

import java.lang.module.FindException;
import java.util.Arrays;

public class Array02 {
// Arrays class methods
    public static void main(String[] args) {

        // sort()
        int [] a = {3,6,1,4,2,8,5};
        String[] name = {"Rajat", "Mahesh", "Lakshman", "Abhishek"};
       // Arrays.sort(a);
       // Arrays.sort(a, 2, 5);
        Arrays.sort(name);
        for(int i = 0; i< name.length;i++){
            System.out.print(name[i] + " ");
        }

        // Binary search
//         number should be sorted in increasing order and then if element found it will return index.if
//            element not found then it will insert the elements at position so that we don't need sorting again
//         insertion will happens with -(insertionIndex+1)

        int[] b = {8,4,6,2,8,1,3};
        Arrays.sort(b);
        for(int i = 0; i< b.length;i++){
            System.out.print(b[i] + " ");
        }
        System.out.println(Arrays.binarySearch(b,6));
        System.out.println(Arrays.binarySearch(b,9));




    }
}
