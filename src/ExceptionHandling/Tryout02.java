package ExceptionHandling;

public class Tryout02 {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            getNumberFromArray(a);
        }catch (Exception e){
            System.out.println("We might get Arithmetic Exception");
            e.getMessage();
        }

    }

    public static int getNumberFromArray(int [] a) throws ArithmeticException{
        return a[8];
    }
}
