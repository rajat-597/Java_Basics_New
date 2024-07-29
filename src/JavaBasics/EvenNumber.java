package JavaBasics;

public class EvenNumber {

    public static void main(String[] args) {

        for(int i =1; i<= 100; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("Display in reverse order now");
        for(int j = 100; j >= 1; --j){
            if(j%2 == 0){
                System.out.print(j + " ");
            }
        }
}
}
