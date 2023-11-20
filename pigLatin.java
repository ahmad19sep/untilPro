public class pigLatin {
    public static void main(String[] args) {
       String sentence="This is an sentence";
       String[] token=sentence.split(" ");
       char ch='q';
       sentence="";
        for (String s : token) {
            ch = s.charAt(0);
            sentence = sentence.concat(s.substring(1) + ch + "ay  ");

        }
        System.out.println(sentence);
    }
}
