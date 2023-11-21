import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamIO {
    public static void main(String[] args)  throws IOException {
        FileReader reader=null;
        try {
            reader=new FileReader("input.txt");
            int  i=0;
            i=reader.read();
            while (i!=-1){
                System.out.print((char)i+"");
                i=reader.read();




            }
        }finally {
            assert reader != null;
            reader.close();
        }








    }
}
