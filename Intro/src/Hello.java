import java.util.Locale;

public class Hello {
    public void nameOne() {
        String name = "dhatcha";// literal string
        String name1="Guru";//uppercase()
        String name2="Hello";//lowercase()
        String name3="  hi, how are you  ";//removes beginning and ending spaces of this string.
        String name4="good morning";
        name4=name4.concat(" welcome to my office");//add two string using concat() method.
        String name5="abcdefghijklmn";
        String name6="peri institute of technology";
        String name7="data";
        String name8="computerScience";
        String name9="javaString equals";
        String name10="JAVASTRING EQUALS";
        String name11="javaString equals";
        String name12="javaString methods";
        String name13="";
        System.out.println(name);
        System.out.println(name1.toUpperCase());
        System.out.println(name2.toLowerCase());
        System.out.println(name3.trim());
        System.out.println(name4);
        System.out.println(name5.length());
        String s=new String("Welcome");
        char ch=name6.charAt(2);//show a index value
        System.out.println(ch);
        float f=10.6f;
        String str=String.format("name7 is %f",f);//format
        System.out.println(str);
        System.out.println(name8.substring(2));//returns substring for given begin index.
        System.out.println(name5.substring(2,5));//returns substring for given begin index and end index.
        System.out.println(name8.contains("Science"));//boolean string contain.it show the given is true or false.
        System.out.println(name7.contains("computer"));
        String joinString1=String.join(":","28","11","1998");//string join() method.
        System.out.println(joinString1);
        String joinString2=String.join(":","20","00","08");
        System.out.println(joinString2);
        System.out.println(name9.equals(name10));// string equals method() different case
        System.out.println(name9.equals(name11));//same case and value
        System.out.println(name9.equals(name12));//different value
        System.out.println(name.isEmpty());//string isEmpty()
        System.out.println(name13.isEmpty());
        System.out.println(name.replace("dha","ak"));//replace() method
        System.out.println(name1.replace("u","a"));
        System.out.println(name9.equalsIgnoreCase(name10));//String equalsIgnoreCase() method...ignore case and same value so true
        System.out.println(name9.equalsIgnoreCase(name11));//same case and same value so true
        System.out.println(name9.equalsIgnoreCase(name12));//different value so false
        String[] wrd=name6.split("\\s");
        System.out.println(wrd);
        String word1="hello";//String intern() method
        String word2=word1.intern();
        String word3="new word";
        word3.substring(0,2);
        System.out.println(word1==word2);
        System.out.println(word2==word3);
        String word4="String indexOf() method";//String indexOf() method
        System.out.println(word4.indexOf("method"));
        System.out.println(word4.indexOf("String",2));//char after index of 2
        System.out.println(word4.indexOf("i"));
        System.out.println(word4.indexOf("i",5));
        String one="one";
        String two="ONE";




    }


    }

