public class MethodOverriding { //parent class
     void run() {
            System.out.println("This is a parent class");
        }
    }
    class ChildClass1 extends MethodOverriding implements MethodOverideInteface{//child class
        void run() {                      //child class only used to create a object
            System.out.println("This is a child class --1 ");
        }

        @Override
        public void runfromInteface() {
       System.out.println("hi");
        }
    }
   class ChildClass2 extends MethodOverriding implements MethodOverideInteface{// child class
            void run(){
                System.out.println("This is a child class -- 2");
            }

       @Override
       public void runfromInteface() {
           //inteface vs abstract
       }
   }






