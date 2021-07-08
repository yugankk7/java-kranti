package prac;

class A {
    int variable_in_A;
    void methodInA() {
        System.out.println("This method is in class A");
    }
}

class B extends A{
    int variable_in_B;
    void methodInB() {
        System.out.println("This method is in class B");
    }
}

class C extends B {
    int variable_in_C;
    void methodInC() {
        System.out.println("This method is in class C");
    }
}

interface area_sq {
    void areaofsq();
}
interface area_circle {
    void areaofcircle();
}
interface area_rectangle extends area_circle, area_sq{
    float areaofrectangle(float l, float b);
}

class Areas implements area_rectangle {
    public void areaofcircle(){
        System.out.println("Area of circle");
    }
    public void areaofsq(){
        System.out.println("area of sq");
    }
    public float areaofrectangle(float l, float b) {
        return l*b;
    }
} 
class Prac {
    public static void main(String[] args) {
        C objC = new C();
        objC.methodInA();
        objC.methodInB();
        objC.methodInC();
        area_sq s = new Areas();
        s.areaofsq();
        area_circle c = new Areas();
        c.areaofcircle();
        Areas arearect = new Areas();
        arearect.areaofcircle();
        arearect.areaofsq();
        

        System.out.println(arearect.areaofrectangle(2.2f, 3.3f));
    }
}
