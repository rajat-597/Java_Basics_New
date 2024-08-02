package JavaBasics;

public class TwoDArrayExample02 {
   // max element in each row
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4}, {5,8,7,6}, {9,10,11,12}};
        int max = a[0][0];
        for(int i = 0; i<a.length;i++){
            for (int j = 0; j<a[i].length;j++){
                if(a[i][j] > max)
                    max = a[i][j];

            }
            System.out.println("sum of row " + (i+1) + " : " + max);
        }
    }
}
