public class operator {
    int number=20;
    int number1=50;
    float number2=70.5F;
    int number3=10;
    int number4=20;
    int number5=20;
    float number6=30.5F;
    long number7=234L;
    int number8=20;
    int number9=25;
    int a=10;
    int b=20;
    int sum=(a<b)?a:b;
    int data=(a>b)?a:b;
    public void add(){
        System.out.println(number+number1);
    }
    public void sub(){
        System.out.println(number-number1);
    }
    public void mul(){
        System.out.println(number1*number2);
    }
    public void div(){
        System.out.println(number1/number2);
    }
    public void per(){
        System.out.println(number%number2);
    }
    public void gre(){
        System.out.println(number3<number4);
    }
    public void asc(){
        System.out.println(number3>number4);
    }
    public void method1(){
        System.out.println(number3<=number4);
    }
    public void method2(){
        System.out.println(number3>=number4);
    }
    public void method(){
        System.out.println(number5==number8);
    }
    public void method0(){
        System.out.println(number5=number9);
    }
    public void ternory(){
        System.out.println(sum);
        System.out.println(data);
    }
    public void logical(){
        System.out.println(a==10&&b==20);
        System.out.println(a==20&&b==20);
        System.out.println(a==10||b==20);
        System.out.println(a==10||b==10);

    }
   public void unary(){
       System.out.println(a++ + ++a);//10+12
       System.out.println(b++ + b++);//20+21
   }
}
