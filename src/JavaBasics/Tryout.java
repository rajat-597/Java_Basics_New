package JavaBasics;

public class Tryout {
    public static void main(String[] args) {
        int i = 2;
       // System.out.println(++i); // 2
       //  System.out.println(i++); // 1
       // --i; // it is correct
        //System.out.println(--i);
       // System.out.println(i--);


        System.out.println(i);

        int j  = i++ + 2;
        int k  = ++i + 2;

        System.out.println(j);
        System.out.println(i);

        System.out.println(k);
    }
}
