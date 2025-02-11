package revision.recursion;

public class three {
    public static void main(String[] args) {
        //lexicographical order
        f(0,13);
    }
    public static void f(int i,int n){
        if(i > n) return;
        System.out.println(i);
        for(int k = 0; k <= 9; k++){
            if( k == 0 && i == 0) continue;
            f(i*10+k,n);
        }
    }
}
