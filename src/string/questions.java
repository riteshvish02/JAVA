package string;

public class questions {
    public static void main(String[] args) {
        //replace ascii
        System.out.println(replaceAscii("abcd"));
        //  all substrings
//        allsubstrings("code");
    }
    public static StringBuilder replaceAscii(String str){
        StringBuilder str1 = new StringBuilder(str);
        for(int i = 0;i <= str1.length() - 1;i++){
            char ch = str1.charAt(i);
            if(i%2 == 0){
                ch = (char)(ch + 1);
                str1.setCharAt(i,ch);
            }else{
                ch = (char)(ch - 1);
                str1.setCharAt(i,ch);
            }
        }
        return str1;
    }
    public static void allsubstrings(String str){
        for(int i = 0; i <= str.length()-1;i++){
            for(int j = i;j <= str.length()-1;j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }
}
