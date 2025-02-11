package revision.recursion;

public class parenthesis {
    public static void main(String[] args) {
        f(3,0,0,"");
    }
    public static void f(int n,int o,int c,String output){
        if(o > n) return;
        if(o == c){
            System.out.println(output);
        }
        f(n,o+1,c,output + "(");
        if(c < o){
            f(n,o,c+1,output + ")");
        }
    }
}
