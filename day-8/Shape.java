package prac;

public abstract class Shape {
    
    abstract float area();

    public void dispArea(float area) {
        System.out.println("printing area of a shape " +area);
    }

}


class Circle extends Shape {
    @Override
    float area() { 
        return 1.2f;
    }

}

class ShapeUtility {
    public static void main(String[] args) {
        Shape circle = new Circle();
        float areaofcircle = circle.area();
        circle.dispArea(areaofcircle);
    }
}