public class Questions
{
    public static void main(String[] args) {
        String stn="Longest wordkkkkkk in the sentence";
        String[] str=stn.split(" ");
        int lng=str[0].length();
        int ch=0;
        for (int i=0; i<str.length; i++){

            if (str[i].length()>lng){
                lng=str[i].length();
                ch=i;
            }
        }
        System.out.println(str[ch]);
    }
}

