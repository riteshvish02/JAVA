package patterns;

public class Practisetwo {
    public static void main(String[] args) {
        int n = 11;
        int space = n-2;
        int sp = 1;
        int trows =  n;
        int star = 1;
        for(int row = 1; row<=trows;row++){
            for(int csp = 0; csp <= sp;csp++){
                System.out.print(" ");
            }
            int secstar = star;
            if(row == trows/2+1){
                secstar = star - 1;
            }
            for(int cs = 1; cs <= secstar;cs++){
                System.out.print("*");
            }
            for(int csp = 1; csp <= space;csp++){
                System.out.print(" ");
            }

            for(int cs = 1; cs <= star;cs++){
                System.out.print("*");
            }
            System.out.println();
            if(row <= trows/2){
                sp++;
            }else{
                sp--;
            }
            if(row <= trows/2){
                space -=2;
            }else{
                space +=2;
            }

        }
    }
}
