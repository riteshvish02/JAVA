package string;

public class stringbuilders {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("ritesh");
        String rv = "ritesh";
        StringBuilder str2 = new StringBuilder(rv);
        str2.append("cbcbc");
        System.out.println(str2);
        System.out.println(str2.insert(2,"v"));
        str2.setCharAt(0,'d');
        System.out.println(str2);


    }
}
