import java.io.*;

public class Append {
    public static void main(String[] args) throws IOException{
        FileWriter x = new FileWriter("new.txt");
        x.write("My name is Shubham.I am from MAU\n I am ADIT Student\n");
        System.out.println(x);
       
       //append
        // x.append("X is my friend");
        // System.out.println(x);

        x.close();

    }
}
