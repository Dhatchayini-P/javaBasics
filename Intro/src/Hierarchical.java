public class Hierarchical {
    void hi(){
        System.out.println("This is my class");
    }
    void method(int x,float y){
        System.out.println(x*y);
    }
}
class run extends Hierarchical{ // we cant able to call any method from this class
    void method1(){
        System.out.println("this is my second class");
    }
}
class run2 extends Hierarchical{// we can create a object in run2 class and call a method from only in hierarchical and run2
    void method3(){
        System.out.println("this is my third class");
    }
}