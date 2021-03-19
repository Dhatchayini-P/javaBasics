import java.util.Scanner;

public class Test {
    Test(){

    }
    int a;
    Test(int a){
      /*  System.out.println("Before constructor call "+a);
        this.a=a;
        System.out.println("After constructor call "+a);*/
    }
    void one(){
        int age=18;
        switch (age){
            case 18:
                System.out.println("Eligible to vote");
                break;
            case 75:
                System.out.println("Senior citizen");
                break;
            default:
                System.out.println("please wait your below 18 yrs");

        }
    }
    void two(){
        char ch='s';
        switch (ch){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case '0':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
            case 'A':
                System.out.println("vowel");
                break;
            case 'E':
                System.out.println("vowel");
                break;
            case 'I':
                System.out.println("vowel");
                break;
            case 'O':
                System.out.println("vowel");
                break;
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("It is not a vowel");
                break;

        }

    }
    void Three(){
        for( int i=0;i<=10;i++){
            if(i==5)
           break;
            {
                System.out.println("i:"+i);

            }
            System.out.println("loop is completed");
        }
    }
    void Four(){

        for(int i=0;i<10;i++){
            if(i%2==0)
                continue;
            System.out.println(i);
        }
    }
    void five(){
        String name;
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name");
        name=input.next();
        System.out.println("The given name is printed"+name);
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter the rollNumber");
        number =input1.nextInt();
        System.out.println("The given number is printed"+number);

    }

}
