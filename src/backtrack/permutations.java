package backtrack;

public class permutations {
    public static void main(String[] args) {
        String str = "abc";
        permutation(str,0,str.length()-1);
    }
    public static void permutation(String str,int l ,int r){
        if(l >= r){
            System.out.println(str);
            return;
        }
        for(int i = l;i <= r;i++){
            String st = swap(str,l,i);
            permutation(st,l+1,r);
             swap(st,l,i);
        }
    }
    public static String swap(String str,int a,int b){
        char temp;
        char arr[] = str.toCharArray();
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        String st = String.valueOf(arr);
        return st;
    }

}
