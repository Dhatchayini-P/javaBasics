
public class Variables {

    /** variable declaration systax
     *
     * access-modifiers(default public )    DataType    variable-name assignment operator value */

    int x=100;//global variable or instance variable
    int y=200;
    int z=x-y;
    static int q=500;//static variable
    public void local(){
       int a=10;//local variable
        int b=20;
        int c=a+b;
        System.out.println("sum of a and b:"+c);
    }
    public void global(){
        System.out.println(x);

    }

}
