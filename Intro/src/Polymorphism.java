public class Polymorphism {

    /** Method overloading
     * same method name different parameter
     * 1
     * 2
     * 3
     * 4
     * */

    /** method over riding
     * same method name same parameters
     * differt class or subclass
     * B = 1   */

    public void add( int num1){  //same method name in polymorphism
        System.out.println(num1+num1);
    }

    public void add( float num1){  //same method name in polymorphism
        System.out.println(num1+num1);
    }

    public void add(){

    }



    public void add(int num1,int num2){
        System.out.println(num1+num2);
    }





}
