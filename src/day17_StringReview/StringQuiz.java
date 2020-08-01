package day17_StringReview;

public class StringQuiz {
    public static void main(String[] args) {
        String str = " ";
        str.trim();//ignored not assign to the variable
        int l= str.length();
        boolean A = str.isEmpty();
        System.out.println(l);
        System.out.println(A);//false
    }
}
