interface InterfaceDemo {
    void method();
}
class rectangle implements InterfaceDemo{
   public void method(){ //public should be mentioned
        System.out.println("rectangle is printed");
    }
}
class circle implements InterfaceDemo{
    public void method(){
        System.out.println("circle is printed");
    }
}
/** here interface and class involve than implements used.otherwise class and class involves,interface and
  interface involves then extends keyword should be used.*/

// creating other interface
interface Printable{
    void print();
    void print1();

}

interface Showable{
    void print();
}

class TestInterface3 implements Printable, Showable{
    public void print(){
        System.out.println("Hello");
    }

    @Override
    public void print1() {

    }
}