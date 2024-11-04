package patterns;

public class Normal {
    public static void main(String[] args) {

//        //pattern 1
//        int n = 4;
//        int trows = n;
//        for(int row = 1;row <= trows;row++){
//            for (int star = 1; star <= row ; star++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //pattern 2
//        int n = 5;
//        int stars = 1;
//        int spacee = n-1;
//        int trows = n;
//        for(int row = 1;row <= trows; row++){
//           for(int space = 1; space <= spacee;space++){
//               System.out.print(" ");
//           }
//           for(int star = 1; star <= stars ; star++){
//               System.out.print("*");
//           }
//           System.out.println();
//           spacee--;
//           stars +=2;
//        }

        //pattern 3
//        int n =  99 ;
//        int star = 1;
//        int trows = n ;
//
//        for(int row = 1; row <=trows; row++){
//            for(int cps = 1; cps <= star;cps++){
//                System.out.print(cps);
//            }
//
//            System.out.println();
//            if(n/2 + 1 <= row){
//                star--;
//            }else{
//                star++;
//            }
//
//
//
//        }

        //pattern 4
        int n = 99;
        int space = n/2 + 1;
        int star = 1;
        int trows = n;
        for(int row = 1; row <= trows; row++){
            for(int csp = 1;csp <= space;csp++) {
                System.out.print(" ");
            }
            for(int cps = 1;cps <= star; cps++){
                System.out.print("*");
            }
            System.out.println();
            if(n/2 + 1 <= row){
                star -=2;
                space++;
            }else{
                space--;
                star += 2;
            }
        }

    }
}
