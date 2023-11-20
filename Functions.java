public class Functions {
    public static void main(String[] args) {
        char[] f = {'s', 'r', 'a', 'b', 'y', 'c', 'f', 'v', 'z', 'q',',',';','0'};
        characterSortingFun(f);
        for (char i : f) {
            System.out.println(i);
        }
    }

    static void characterSortingFun(char[] ary) {


        for (int i = 0; i < ary.length; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[i] > ary[j]) {
                   swap(ary,i,j);

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
}
