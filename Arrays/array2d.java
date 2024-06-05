import java.util.*;

public class array2d {
    public static void main(String args[]){
        // int num[][] = new int[3][5];
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] num = new int[rows][cols];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                num[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(num[i][j] + " ");
            }
            System.out.println();  
        }
    }
}
