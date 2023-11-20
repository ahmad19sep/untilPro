import java.util.Scanner;

public class TokenizingStrings {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        String sentence=scanner.nextLine();
        String[] token=sentence.split(" ");
        char ch;
        char a;

        for (int i=0; i<token.length; i++){
            ch=token[i].charAt(0);
            sentence=token[i].substring(0,1).toUpperCase();
            a=sentence.charAt(0);
            if (a==ch){
                System.out.println(token[i]);
            }
        }
    }
}
