public class Polymorphism {

    /** Method overloading
     * same method name different parameter
     * 1
     * 2
     * 3
     * 4
     * */

    /**
     * method over riding
     * same method name same parameters
     * differt class or subclass
     * B = 1
     */

    //method overloading
    public void add(int num1) {  //same method name in polymorphism
        System.out.println(num1 + num1);
    }

    public void add(float num1) {
        System.out.println(num1 + num1);
    }

    static int add(int a, int b) {
        return a + b;
    }
}


