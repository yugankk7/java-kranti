package prac;

class Manager {
    
    Long sal;


    }


class Emp extends Manager {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.sal = 100L;
        Manager m1 = new Manager();
        m1.sal= 1000L;
        System.out.println("Manager sal is " + m1.sal);
        System.out.println("Employee sal is " + e1.sal);

    }
}


class Vehicle {

    Vehicle() {
        System.out.println("constructor of superclass vehicle");
    }
    Integer wheels = 4;
    Long mileage;
    public void move() {
        System.out.println("Move in vehicle class");
    }
}

class Car extends Vehicle{
    @Override
    public void move() {
        System.out.println("Move in car class");
    }
}

class SuperCar extends Car {
    public void turbo() {
        System.out.println("In turbo method");
    }

    public void changewheels() {
        wheels = 6;
    }
}

class Bike extends Vehicle{
    Integer wheels;
    @Override
    public void move() {
        System.out.println("Move in bike class ");
    }
    public void printNumberOfWheels() {
        wheels = 2;
        System.out.println(wheels);
        System.out.println(super.wheels);
    }
}


class AutomobileManagemnet {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car mercedes = new Car();
        mercedes.wheels = 4;
        // Vehicle v = mercedes;
        // v.move();
        Bike r1 = new Bike();
        Bike ktm = new Bike();

        r1.printNumberOfWheels();

        ktm.wheels = 3;
        System.out.println("\nWheels in ktm are " + ktm.wheels);

        bmw.move();

        SuperCar lambo = new SuperCar(); 
        lambo.changewheels();  
        System.out.println(lambo.wheels);

    }
}