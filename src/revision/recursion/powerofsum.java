package revision.recursion;

public class powerofsum {
    public static int count = 0;
    public static void main(String[] args) {
        f(13,2,1);
        System.out.println(count);
    }
    public static void f(int X,int N,int i){
        if( X == 0){
            count ++;
            return;
        };
        if(X < 0 || X < i*i) return;
        f(X- (int)(Math.pow(i,N)),N,i+1);
        f(X,N,i+1);
    }
}
