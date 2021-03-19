public class  StringDemo {
  public void  method()
  {
      StringBuilder sb=new StringBuilder("java ");//same variable used to store the value in stringBuilder
      sb.append("class");//append() method
      sb.append(" value ");
      sb.toString();
      System.out.println(sb);//mutable

      String s=new String("Welcome");//different variables used to store the values in string
      String n="Welcome";
      String nm="world";
      String res=n.concat(nm);//immutable

      StringBuilder sb1=new StringBuilder("hello");//insert() method
      sb1.insert(2,"welcome");
      System.out.println(sb1);

      StringBuilder sb2=new StringBuilder("hello");//replace() method
      sb2.replace(0,3,"java");
      StringBuilder sb3=new StringBuilder("thankYou");
      sb3.replace(2,4,"hi");
      System.out.println(sb2);
      System.out.println(sb3);

      StringBuilder sb4=new StringBuilder("school");//delete() method
      sb4.delete(1,3);
      System.out.println(sb4);

      StringBuilder sb5=new StringBuilder("Good Morning");//reverse() method
      sb5.reverse();
      System.out.println(sb5);

//      StringBuilder sb6=new StringBuilder("hi,everyone");//capacity() method
//      System.out.println(sb6.capacity());//(16*2)+2=34
//
//      StringBuilder sb7=new StringBuilder("welcome");//ensureCapacity() method
//      sb7.ensureCapacity(20);
//      System.out.println(sb7);

   }
}
