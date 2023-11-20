import java.util.Scanner;

public class Wordfrequency {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence = input();

        int[] count = new int[sentence.length()];
        char[] lt = new char[sentence.length()];

        process(sentence, count, lt);
        display(count, lt);


    }

    static int frequency(char ch, String stn) {
        int count = 0;
        for (int i = 0; i < stn.length(); i++) {
            int chd = stn.indexOf(ch, i);
            if (chd > 0) {
                count++;
                i = chd;
            }
        }
        return count;
    }

    static void display(int[] count, char[] lt) {

characterSortingFun(lt,count);
int total=0;
        System.out.println("-----------------------------");
        for (int i = 0; i < lt.length; i++) {
            if (count[i] != 0) {
                total+=count[i];
                System.out.printf("| %c \t<-_-> \t%d \t times |\n", lt[i], count[i]);
            }
        }
        System.out.println("----------------------------");
        totalWords(total);
    }

    static String input() {
        String sentence = scanner.nextLine();
        sentence = sentence.replaceAll("\\s", "").toLowerCase();
        return sentence;
    }

    static void process(String sentence, int[] count, char[] lt) {
        char chr;
        int incremnt = 0;
        outerLoop:
        for (int i = 0; i < sentence.length(); i++) {
            chr = sentence.charAt(i);
            for (int k = 0; k <= incremnt; k++) {
                if (chr == lt[k]) {
                    continue outerLoop;
                }
            }
            int count1 = frequency(chr, sentence);
            lt[incremnt] = chr;
            if (incremnt == 0)
                count[incremnt] = ++count1;
            else
                count[incremnt] = count1;
            incremnt++;
        }
    }


    static void characterSortingFun(char[] ary,int[] count) {


        for (int i = 0; i < ary.length; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[i] > ary[j]) {
                    swap(ary,i,j);
                    swap(count,i,j);

                }

            }
        }
    }
    static void swap(char[] ary,int i,int j){
        char temp;
        temp = ary[i];
        ary[i] = ary[j];
        ary[j] = temp;
    }
    static void swap(int[] count,int i,int j){
        int temp;
        temp = count[i];
        count[i] = count[j];
        count[j] = temp;
    }
    static void totalWords(int i){
        int total =0;
        total +=i;
        System.out.println("Total words is : "+ total);
    }
}


