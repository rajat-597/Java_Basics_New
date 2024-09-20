package ExceptionHandling;

public class Tryout01 {

    public static void main(String[] args) {

        int[] a = new int[5];
        int num = 5;

        System.out.println(a[3]);

//        try {
//            System.out.println(a[7]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.getMessage();
//        }

//        try {
//            System.out.println(num/0);  // will give Arithmetic exception if won't handle
//            System.out.println(a[7]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.getMessage();
//        }catch (ArithmeticException e){
//            System.out.println("Handle Arithmetic Exception");
//        }finally {
//            System.out.println("it will run irrespective of we get error or not");
//        }

        // alternate approach
        try {
            System.out.println(num/0);  // will give Arithmetic exception if won't handle
            System.out.println(a[7]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            e.getMessage();
        }finally {
            System.out.println("it will run irrespective of we get error or not");
        }

        System.out.println("We reach end of program");
    }

}

// Note : Exception is the top class for all the other Exception. If we write Exception e it will handle
// all the exception and we don't need to write other exception.