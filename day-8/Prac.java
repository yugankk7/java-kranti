package prac;


public class Prac {

    public static void main(String[] args) {
        
        Demo d1 = new Demo();
        d1.disp();
        Demo d2 = new Demo();
        d1.instVar = "Hello from d1";
        d1.disp();
        d2.instVar = "hello form d2";
        d2.disp();

        Demo d3 = new Demo("D3 constructor");
        d3.disp();

        System.out.println("\nThis is static method call - ");
        Demo.statMethod();

        System.out.println("\nTesting paramatrized constructoe call");
        Demo d4 = new Demo("bla bla bal");
        d4.disp();


    }

}