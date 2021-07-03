// package prac;

// interface A {
//     void test();
// }

// interface X {
//     void xTest();
// }

// class B implements A, X {
//     public void test() {
//         System.out.println("implementation of interface A in B");
//     }
//     public void xTest() {
//         System.out.println("Implementation of interface X in A");
//     }
// }

// class Prac {
//     public static void main(String[] args) {
//         A objA = new B();
//         objA.test();
//         objA.xTest();
//     }
// }


package prac;



// interface Shape {
//     void area();
// }

// class Circle implements Shape {
//     public void area() {
//         System.out.println("area of circle");;
//     }
// }
// class Square implements Shape {
//     @Override
//     public void area() {
//         System.out.println("area of square");
//     }
// }
// class Prac {
//     public static void main(String[] args) {
//         Shape c = new Circle();
//         c.area();
//         Shape s = new Square();
//         s.area();
//     }
// }


interface area_sq {
    void areaofsq();
}
interface area_circle {
    void areaofcircle();
}
interface area_rectangle {
    float areaofrectangle(float l, float b);
}

class Areas implements area_sq, area_circle, area_rectangle {
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

public class Prac {
    public static void main(String[] args) {
        area_sq s = new Areas();
        s.areaofsq();
        area_circle c = new Areas();
        c.areaofcircle();
        Areas arearect = new Areas();
        System.out.println(arearect.areaofrectangle(2.2f, 3.3f));
    
    }
}
