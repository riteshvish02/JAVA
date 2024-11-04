package patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n = 9;
        int trows = n;
        int space = n-2;
        int star = 1;
        for(int row = 1; row <= trows;row++){
            for(int cs = 1; cs <= star ; cs ++){
                System.out.print("*");
            }
            for(int csp = 1; csp <= space ; csp++){
                System.out.print(" ");
            }
            int sstar = star;
            if(row == trows/2+1){
                sstar =  star - 1;
            }
            for(int cs = 1; cs <= sstar; cs++){
                System.out.print("*");
            }
            System.out.println();
            if(row <= trows/2){
                star++;
                space -= 2;
            }else{
                star--;
                space+=2;
            }
        }
    }
}
