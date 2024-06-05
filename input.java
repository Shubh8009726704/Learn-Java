import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("My name is : " + name);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("My age is : " + age);

        System.out.println("Enter your city : ");
        String city = sc.nextLine();
        System.out.println("My city is : " + city);

        sc.nextLine();
        System.out.println("Enter your Trade : ");
        String trade = sc.nextLine();
        System.out.println("My Trade is : " + trade);

        sc.close();
    }
}












































































