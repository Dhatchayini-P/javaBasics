import java.lang.invoke.SwitchPoint;

public class ConditionDemo {
    void meth() { //if condition
        int age = 25;
        if (age > 18) {
            System.out.println("you can vote in election");
        }
    }

    void method() {// if-else condition
        int age = 20;
        if (age > 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you have to wait for 18 age");
        }
    }

    void methodOne() {
        int num = 100;
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    void methodTwo() {
        int year = 2021;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Normal year");
        }
    }

    void methodThree() { // ternary operator
        int age = 18;
        String name = age >= 18 ? "eligible" : "not eligible";
        System.out.println(name);

    }

    void methodFour() {// if-else-if ladder condition
        int number = 0;
        if (number > 0) {
            System.out.println("positive number");
        } else if (number < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("zero");
        }
    }



    void methodFive() { //nested if condition
        int age = 6;
        boolean indianCitizen = false;
        if (age >= 18) {
            if (indianCitizen ) {
                System.out.println("you are eligible to vote in india");
            } else {
                System.out.println("you are not eligible to vote in india");
            }
        } else {
            System.out.println("you are age must be 18 or above 18");
        }
    }

    void methodSix() { //switch() condition
        int month = 9;
        String monthName="";
        switch (month) {
            case 1:
                monthName = "january";
                break;
            case 2:
                monthName = "february";
                break;
            case 3:
                monthName = "march";
                break;
            case 4:
                monthName = "april";
                break;
            case 5:
                monthName = "may";
                break;
            case 6:
                monthName = "june";
                break;
            case 7:
                monthName = "july";
                break;
            case 8:
                monthName = "august";
                break;
            case 9:
                monthName = "september";
                break;
            case 10:
                monthName = "october";
                break;
            case 11:
                monthName = "november";
                break;
            case 12:
                monthName = "december";
                break;
            default:
                System.out.println("Invalidate Month!");
        }
        System.out.println(monthName);
    }

    void methodSeven() { //for loop
        int i = 10;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    void methodEight() { //nested for loop
        int i = 2;
        int j = 5;
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 5; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    void methodNine() { //pyramid

//        ROw= i column = j
        //Row(1,1) (1,2),(1,3)
        for (int i = 1; i <= 5; i++) {
            //1st time i =2

            //column
            for (int j = 1; j <= i; j++) {


                System.out.print("* ");
            }


            System.out.println();
        }
    }
    void methodTen(){// for-each loop
        int arr[]={12,23,34,45,56,67,78,89};
        for( int i:arr) {
                System.out.println(i);
        }

        /**
         * for n syntax
         * for (initial value , condition,increet or decreement)
         *
         * foreach
         * for(DATETYPE var:value to loop )*/
    }
    void method1(){ //while loop
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

    }
    void method2(){ //do while loop
        int i=10;
        do{
            System.out.println(i);
            i++;
        }while(i<=20);
    }
}