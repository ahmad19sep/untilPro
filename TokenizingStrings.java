import java.util.Scanner;

public class TokenizingStrings {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        String sentence=scanner.nextLine();
        char ch=scanner.next().charAt(0);
      int index=  indeexOf(sentence,ch);
        System.out.println(ch+" is on index "+index);
        }
        static int indeexOf(String s,char chr){
        int index=-1;
        for (int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if (ch==chr){
               index=i;
               break;
            }
        }
        return index;
        }
    }


