package prac;

public class Demo {

    Demo() {
        instVar = "Instance variable from default cosntructor";
    }

    Demo(String s) {
        instVar = s;
    }

    String instVar = "This is an instanceee variable";
    public void disp() {
        String localVar = "This is a locallll variable";
        System.out.println("In the disp method of class Demo");
        System.out.println(localVar);
        System.out.println(instVar);
    }
}
