public class polymorphism {
    public void add( int num1){  //same method name in polymorphism
        System.out.println(num1+num1);
    }
    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }
}
class A//super class or parent class
{
    public void display(){
        System.out.println("A class");
    }
}
class B extends A//subclass or child class
{
    public void display(){
        System.out.println("B class");
    }
}