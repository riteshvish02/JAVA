package revision.recursion;

public class one {
    //power with recursion
    public static void main(String[] args) {
        System.out.println(f(2,5));
    }
    public static int f(int a,int b){
        if(b <= 0) return 1;
        return a*f(a,b-1);
    }
}
