package JavaBasics;

public class Array01 {
    public static void main(String[] args) {
        // passing Array as an arguments to Methods . Array is call by reference
        int[] numbers = {0,1};
        change(numbers);
        printArray(numbers);


    }
    public static void change(int[] n){
        n[0] = 1;
        n[1] = 0;
    }

    public static void printArray(int[] num){
        for(int i=0; i< num.length; i++){
            System.out.print(num[i] + " ");
        }
    }

}
