package JavaBasics;

import java.util.Arrays;

public class TwoDimensionalArray {

    // initialize, print 2-D Array

    public static void main(String[] args) {
        int [][] a = {{1,2,3}, {2,4}, {5,6,7}};
        printArray(a);
    }

    public static void printArray(int[][] num) {
        for(int i = 0; i<num.length; i++){
            for (int j = 0; j<num[i].length; j++){ // here num[i].length() -- will get each row length.
                System.out.print(num[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
