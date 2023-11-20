import java.util.Scanner;

public class Questions {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String stn = "Longest wordkkkkkk in the sentence";
        char ch = 'k';
        int count = 0;
        for (int i = 0; i < stn.length(); i++) {
            int chd = stn.indexOf('o', i);
            if (chd > 0) {
                count++;
                i = chd;
            }
        }
        System.out.println("Most number of times a word occur is : " + count);
    }

}

