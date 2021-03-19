
public class ConstructorDemo //class name and method name should be same in constructor.
{

     ConstructorDemo()// default constructor
         {
            System.out.println("car is created");
        }
         int speed;
         String color;
        ConstructorDemo(int s,String c)//parameter constructor
        {
           speed=s;
           color=c;
         }

        void display(){
             System.out.println("car is displayed");
        }

    }


