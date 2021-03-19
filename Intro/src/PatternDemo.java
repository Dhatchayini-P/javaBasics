import java.util.Scanner;

public class PatternDemo {
    void star() {
        for (int i = 1; i <= 5; i++) {    /**(1,5) (1,4) (1,3) (3,1) (3,2) (3,3) (4,1) (4,2) (4,3) (4,4) (5,1) (5,2) (5,3) (5,4) (5,5)*/
            for (int j = 5; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    void star1() {
//        for (int i = 1; i <= 5; i++) { //(1,5) (1,4) (1,3) (1,2) (1,1) (2,5) (2,4) (2,3) (2,2) (3,5) (3,4) (3,3) (4,5)
//            for (int j =5; j >=i; j--) {//(4,4) (5,5)
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    void star2(){
//        for(int i=1;i<=5;i++){
//            for(int j=5;j>=i;j--){
//                System.out.print("");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}


