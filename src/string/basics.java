package string;

public class basics {
    public static void main(String[] args) {
            String name = "ritesh";
            System.out.println(name);
        String name2 = new String("startup");
        System.out.println(name2);
        System.out.println(name2.length());
        System.out.println(name.concat(name2));
        Boolean ans = name.equals(name2);
        System.out.println(ans);
        String val1 = "abc";
        String val2 = "abc";
        System.out.println("using literals");
        System.out.println(val1 == val2);
        System.out.println(val1.equals(val2));
        String val3 = new String("abc");
        String val4 = new String("abc");
        String val5 =  val4;
        System.out.println("without literals");
        System.out.println(val3 == val4);
        System.out.println(val3.equals(val4));
        System.out.println(val4 == val5);
        System.out.println(val4.equals(val5));
        String escapeChar = "hello this is \"ritesh\" ";
        System.out.println(escapeChar);
        String checkimmutable = "hello";
        checkimmutable = "hiii";
        System.out.println(checkimmutable.charAt(0));
        System.out.println(checkimmutable.substring(0,2));
        System.out.println(checkimmutable.substring(2));
        System.out.println(checkimmutable.lastIndexOf("i"));
        System.out.println(checkimmutable.startsWith("i"));
    }


}
