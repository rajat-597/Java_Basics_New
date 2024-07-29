package JavaBasics;

public class Method02 {
    public static void main(String[] args) {
        //write prime number between two number 1 to 50
      printPrimeBetween(10, 30);
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
            return true;
    }

        public static void printPrimeBetween(int start, int end){
            for(int i = start; i<= end ; i++){
            if(isPrime(i))
                System.out.println(i + " " );
        }
        }
}
