package JavaBasics;

public class ArrayExercise04 {
    // find min and Max value

    public static void main(String[] args) {
        int[] a = {3,5,7,9,2,11,5};
        System.out.println(maxElement(a));
        System.out.println(minElement(a));

    }

    public static int maxElement(int[] num){
        int max  = num[0];
        for(int i=1; i< num.length;i++){
            if(num[i]> max)
                max = num[i];
        }
        return max;
    }

    public static int minElement(int[] num){
        int min  = num[0];
        for(int i=1; i< num.length;i++){
            if(num[i]<min)
                min = num[i];
        }
        return min;
    }
}
