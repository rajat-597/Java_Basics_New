package JavaBasics;

import java.util.Arrays;

public class ArrayExercise05 {
    // in a array place odd element first followed by even element

    public static void main(String[] args) {

        int[] a = {1,2,4,5,7,9,11,14,13};

        // select odd and even
//        for(int  i = 0; i<a.length; i++) {
//            if (a[i] % 2 != 0) {
//                System.out.print(a[i] + " ");
//            }
//        }
//            for(int  j = 0; j<a.length; j++){
//                if(a[j]% 2 == 0){
//                    System.out.print(a[j] + " ");
//                }
//
//        }

        int[] temp = new int[a.length];
        int j = 0;
        int k = a.length-1;
     //   System.out.println(a.length);
      //  System.out.println(k);

        for(int i = 0; i<a.length;i++){
            if(a[i]%2 != 0)
                temp[j++] = a[i];
            else
                temp[k--] = a[i];
        }

        copyArray(temp,a);
        System.out.print(Arrays.toString(a));
    }

    public static void copyArray(int[] temp, int[] a){
        for(int i = 0; i<a.length; i++){
             a[i] = temp[i];
        }
    }

    }


