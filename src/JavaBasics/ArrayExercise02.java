package JavaBasics;

public class ArrayExercise02 {

    // WAP to display sum, product, avg of the given element of an array
    public static void main(String[] args) {
        int[] num = {3,4,7,-2,5,9};
        int sum = 0, prod = 1, avg;
        int n = num.length;
       for(int i= 0; i<n;i++){
           sum = sum + num[i];
           prod = prod * num[i];
        }
        System.out.println("sum of Array element is "+ sum);
        System.out.println("Product of Array element is "+ prod);
        avg = prod/n;
        System.out.println("average is "+ avg);

    }
}
