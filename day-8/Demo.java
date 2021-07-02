package prac;

public class Demo {

    static String comp = "a static variable";

    Demo() {
        instVar = "Instance variable from default cosntructor";
    }

    Demo(String s) {
        instVar = s;
    }
    public static void statMethod() {
        System.out.println("this is a static method");
    }

    String instVar = "This is an instanceee variable";
    public void disp() {
        String localVar = "This is a locallll variable";
        System.out.println("In the disp method of class Demo");
        System.out.println(localVar);
        System.out.println("ths is instance var" + instVar);
    }
}