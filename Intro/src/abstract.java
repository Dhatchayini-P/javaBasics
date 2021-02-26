abstract class word {
     abstract void display(); //declaration
}


class wordOne extends word{
    void display(){ // define
        System.out.println("display a word");
    }
}