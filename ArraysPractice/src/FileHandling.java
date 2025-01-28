import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[]args){
       String table = "";
        int x = 5 ;
       for(int j =2; j<10 ; j++){
           table += x + "*" + j + "=" + x * j;
           table += "\n";
       }



        try{
           FileWriter obj = new FileWriter("Multiplication Table");
           obj.write(table);
           obj.close();
           System.out.println("Successfully Written");
       }catch (IOException e){
           e.printStackTrace();
       }
//
        // to read file
//        try {
//            File obj = new File("Multiplication Table");
//            Scanner sc = new Scanner(obj);
//            while (sc.hasNext()){
//                String data = sc.nextLine();
//                System.out.println(data);
//
//            }
//            sc.close();
//
//
//        }catch (FileNotFoundException e){
//            System.out.println("Error Occured");
//            e.printStackTrace();

//        }

    }
}