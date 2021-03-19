
   public class InhertanceDemo {//single inhertance
       void add(int a, int b) {
           System.out.println(a + b);
       }

       void run() {
           System.out.println("this is add class");
       }
   }
    class sub extends InhertanceDemo{
       void subtr(){
           System.out.println("sub class is running");
       }
    }



