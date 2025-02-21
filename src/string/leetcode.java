package string;

public class leetcode {
    public static void main(String[] args) {
        //rotation of another string
        String s = "abcde";
        String goal = "abced";
        String str = s+s;
        System.out.println(str);
        System.out.println(str.contains(goal));;
    }
}
