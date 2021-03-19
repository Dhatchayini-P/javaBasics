public class multiLevel {
  void add(){                   //here we can create a div class as object and we can call methods from multilevel and add
  }
  void add1(int a,int b){
      System.out.println(a+b);

  }
}
class add extends multiLevel{
    void run2(){
        System.out.println("this is sub class");
    }
}
class div extends  add {
    void run3() {
        System.out.println("this is sub class 2");

    }
}