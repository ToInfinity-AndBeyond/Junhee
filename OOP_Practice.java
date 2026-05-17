public class OOP_Practice {
// OOP: Object-Oriented Programming, 객체 지향 프로그래밍
// Object: 속성과 행동을 가지는 독립된 존재 (attribute / method)
// Class: 객체를 생성하기 위한 설계도, 객체의 속성과 행동을 정의 (blueprint)

// this keyword: 현재 객체를 참조하는 키워드, 객체의 속성이나 메서드에 접근할 때 사용

// Encapsulation: data를 class 내부에 숨기고, method를 통해서 접근하도록 하는 원칙 (private, public, getter/setter)

// Bad Example
// Student s1 = new Student();
// s1.score = -100; // 잘못된 점수 설정 -> Encapsulation을 통해 score를 private으로 만들고, setScore() method를 통해서만 점수를 설정하도록 변경

// access modifier
/*
    private: 같은 클래스 내에서만 접근 가능
    public: 어디서든 접근 가능
    protected: 같은 패키지 내에서 접근 가능, 다른 패키지에서는 상속받은 클래스에서만 접근 가능
 */

// Inheritance: 기존 클래스 (parent class / superclass) 의 속성과 행동을 물려받아 새로운 클래스를 (child class / subclass) 만드는 원칙 

// Polymorphism: 같은 이름의 메서드가 다른 클래스에서 다르게 동작하는 원칙 (method overloading, method overriding)
// method overloading = static polymorphism: 같은 이름의 메서드가 매개변수 (paramter)의 타입이나 개수에 따라 다르게 동작하는 것
// method overriding = dynamic polymorphism: 부모 클래스의 메서드를 자식 클래스에서 재정의하여 다르게 동작하도록 하는 것, 부모 클래스의 메서드와 동일한 시그니처 (method name, parameter type, return type)를 가져야 함

}




class Student {
    private String name;
    private int score;

    Student (String name, int score) {
        this.name = name;
        setScore(score); // score를 직접 할당하지 않고, setScore() method를 통해서만 점수를 설정하도록 함
    }

    // getter: private으로 선언된 name과 score에 접근할 수 있도록 public method로 제공
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";
    }

    // setter: private으로 선언된 score에 값을 설정할 수 있도록 public method로 제공, 유효성 검사 추가
    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Junhee", 85);
        Student s2 = new Student("Minseok", 80);

        System.out.println(s1);
        // System.out.println("Name: " + s1.getName() + ", Score: " + s1.getScore());

        // s1.setScore(110); // Invalid score. Please enter a score between 0 and 100.
        // System.out.println("Name: " + s1.getName() + ", Score: " + s1.getScore()); // Score remains 85
    }
}


class Car {
    String brand;
    String model;
    int year;

    public Car() {

    }

    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println(brand + " " + model + " is stopping.");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Junhee", 85);
        s1.setScore(90); 

        Car myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}


class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // 부모 클래스의 생성자 호출
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        // myDog.name = "Buddy";
        // myDog.age = 3;
        // myDog.breed = "Golden Retriever";

        myDog.eat(); // Buddy is eating.
        myDog.sleep(); // Buddy is sleeping.
        myDog.bark(); // Buddy is barking.
    }
}

class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers", 2, "Gray");
        myCat.eat(); // Whiskers is eating.
        myCat.sleep(); // Whiskers is sleeping.
        myCat.meow(); // Whiskers is meowing.
    }
}

class Calculator {
    // method overloading: 같은 이름의 메서드가 매개변수의 타입이나 개수에 따라 다르게 동작하는 것
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20)); // 30
        System.out.println(calc.add(10.5, 20.5)); // 31.0
        System.out.println(calc.add(10, 20, 30)); // 60
    }
}

class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car2 extends Vehicle {
    @Override // method overriding: 부모 클래스의 메서드를 자식 클래스에서 재정의하여 다르게 동작하도록 하는 것, 부모 클래스의 메서드와 동일한 시그니처 (method name, parameter type, return type)를 가져야 함
    public void start() {
        System.out.println("Car is starting.");
    }

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.start(); // Vehicle is starting.

        Car2 myCar = new Car2();
        myCar.start(); // Car is starting.
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start(); // Bike is starting.
    }
}