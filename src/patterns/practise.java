package patterns;

public class practise {
    public static void main(String[] args) {
//        int n = 9;
//        int trows = n;
//        int star = n;
//        for(int row = 1; row <= trows; row++){
//            for(int cs = 1 ;cs <= star; cs++){
//                System.out.print("*");
//            }
//            System.out.println();
//            star--;
//        }

        //mirror triangle
//        int n = 9;
//        int trows = n;
//        int space = n-1;
//        int star = 1;
//        for(int row = 1;row <=trows;row++){
//            for(int csp = 1;csp<= space;csp++){
//                System.out.print(" ");
//            }
//            for(int cs = 1 ; cs <=star ; cs++){
//                System.out.print("*");
//            }
//            System.out.println();
//            space--;
//            star++;
//        }

        int n = 20;
        int trows = n;
        int spaceCount = n;
        int star = 1;
        int sp = 0;
        for(int row = 1; row <= trows; row++){
            int space = spaceCount + (spaceCount-3);

            for(int csp = 1;csp <= sp; csp++){
                System.out.print(" ");
            }
             for(int cs = 1; cs <= star; cs++){
                 System.out.print("*");
             }
             for(int csp = 1;csp <= space; csp++){
                 System.out.print(" ");
             }
             if(row == trows){
                 break;
             }
            for(int cs = 1; cs <= star; cs++){
                System.out.print("*");
            }
            System.out.println();
            spaceCount--;
            sp++;


        }

    }
}
