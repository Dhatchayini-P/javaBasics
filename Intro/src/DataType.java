public class DataType {
    short i=1000;
    short j=2000;
    int z=i+j;
    int count=0;
    void data() {
        System.out.println("answer"+z);
        System.out.println(count);
        System.out.println(++count);
        System.out.println(count--);
        System.out.println(count++);
        System.out.println(--count);
    }
}
