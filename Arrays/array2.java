import java.util.Scanner;

public class array2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //input
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        // for(int i=0;i<size;i++){
        //     System.out.println(number[i]);
        // }
        for(int i=0;i<number.length;i++){
            if(number[i] == x ){
            System.out.println("The number of length " + i);
        }}
    }
}
