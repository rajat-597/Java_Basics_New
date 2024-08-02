package JavaBasics;

public class ArrayExercise03 {
    // No of occurance of an element in an array
    // [3,4,6,2,3] -- 3 --> 2 times
    public static void main(String[] args) {

        int[] num = {3, 4, 6, 2, 3, 6, 6, 7};
        int searchElement = 1;
        System.out.println(noOfOccurance(num, searchElement));
    }

    public static int noOfOccurance(int[] num, int element) {
        int totalOcc = 0;
        for (int i = 0; i < num.length; i++) {
            if (element == num[i])
                totalOcc += 1;
        }
        return totalOcc;
    }
}
