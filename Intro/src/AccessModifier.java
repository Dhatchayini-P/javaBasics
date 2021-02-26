public class AccessModifier {
    public void method(){
        System.out.println("hi,guys");
    }
    private void methodTwo(){ //can't able to execute
        System.out.println("method two");
    }
    protected void methodThree(){
        System.out.println("method three");
    }
}
