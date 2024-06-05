import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        
    
        //create file 
        File newFile = new File("shubh.txt");
        newFile.createNewFile();
        System.out.println(newFile.exists());

        // write in  file   
        FileWriter writeFile = new FileWriter("shubh.txt");
        writeFile.write("My name is Shubham.I am from Varanasi\n I am ADIT Student");
        writeFile.close();

         // write in  file   
         FileReader read = new FileReader("shubh.txt");
         Scanner sc = new Scanner(read);

         while(sc.hasNextLine()){
             System.out.println(sc.nextLine());
         }
       
        //delete file
        File del = new File("shubh.txt");
        // del.delete();
        // System.out.println(newFile.exists());

        if(del.delete()){
            System.out.println("File deleted successfully : " +del.getName());
        }else{
            System.out.println("File not deleted : " +del.getName());
        }
    }

}