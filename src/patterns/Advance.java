package patterns;

public class Advance {
    public static void main(String[] args) {
        int n = 6;
        for(int frow = 1; frow <= 2*n - 1;frow++){
            System.out.print("*");
        }
        System.out.println();
        int space = 1;
        int star = n-1;
        int trows = n-1;
        for(int row = 1 ; row <= trows ;row++){
            for(int cs = 1; cs <= star ; cs++){
                System.out.print("*");
            }
            for(int csp = 1; csp <= space ; csp++){
                System.out.print(" ");
            }
            for(int cs = 1; cs <= star ; cs++){
                System.out.print("*");
            }
            System.out.println();
            space += 2;
            star --;

        }
    }
}
