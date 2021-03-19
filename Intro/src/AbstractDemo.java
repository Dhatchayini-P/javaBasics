abstract class AbstractDemo {
    abstract void method();//declaration

    abstract void method2();

    void method3() {

    }

}


class Abstract1 extends AbstractDemo {


    @Override
    void method() {

    }

    @Override
    void method2() {

    }

}


class Abstract2 extends AbstractDemo {
    void method() {
        System.out.println("code running in abstract2");
    }

    @Override
    void method2() {

    }
}

// creating another abstract
abstract class Bike {
    abstract void run();

    void speed() {
        System.out.println("bike speed is 100");
    }

    void bike() {
        System.out.println("bike is created");
    }
}

class Pulsar extends Bike {
    void run() {
        System.out.println("Pulsar started to run");
    }
}

class R15 extends Bike {
    void run() {
        System.out.println("R15 is running ");
    }
}

