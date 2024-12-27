package search;

public class longestcommanprefix {
    public static void main(String[] args) {
        String arr[] = {"flower","flower","flower"};
        String prefix = arr[0];
        for(int i = 1; i < arr.length; i++){
            while(!arr[i].startsWith(prefix)){
                System.out.println(i);
                prefix = prefix.substring(0,prefix.length()-1);
                System.out.println("prefix" + " " + prefix);
                if(prefix.isEmpty()){
                    System.out.println("empty ");
                }
            }
        }
        System.out.println(prefix);


    }
}
