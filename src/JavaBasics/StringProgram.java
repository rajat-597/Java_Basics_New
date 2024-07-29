package JavaBasics;

public class StringProgram {
    public static void main(String[] args) {
         String str = "Hello World program";
         // H e l l o W o r l d
// space in between each charector
//        for (int i = 0; i<= str.length()-1; i++){
//            System.out.print(str.charAt(i) + " ");
//        }

        // Reverse of a String ( Rajat -- tajaR)
        String reverseStr  = "";
         System.out.print("Reverse of a String " + str + " is ");
        for(int i = str.length()-1 ; i>=0  ; i--){
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.print(reverseStr);

    }
}
