package JavaBasics;

public class TwoDArrayExample01 {
    // sum of first row, second row, Third row

    public static void main(String[] args) {
        int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int sum = 0;
        for(int i = 0; i<a.length;i++){
            for (int j = 0; j<a[i].length;j++){
                sum = sum + a[i][j];
            }
            System.out.println("sum of row " + (i+1) + " : " + sum);
        }
    }
}

