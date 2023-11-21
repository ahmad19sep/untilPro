import java.io.*;
import java.util.Scanner;

public class ByteStreamIO {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)  throws IOException, FileNotFoundException {
        FileReader reader=null;
        FileWriter writer=null;
        System.out.println("Enter the data you want to  write in the file: ");
        String data=scanner.nextLine();



        try {
            writer=new FileWriter("input.txt");
            writer.write(data);

        }finally {
            assert writer != null;
            writer.close();
        }








    }
}
