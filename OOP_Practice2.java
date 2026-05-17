// Abstract Class: 추상 클래스, 객체를 생성할 수 없는 클래스, 다른 클래스가 상속받아야 하는 클래스, 
// 추상 메서드를 가질 수 있음 (abstract method: 구현이 없는 메서드, 자식 클래스에서 반드시 구현해야 함)

abstract class Animal {
    String name;

    Animal (String name) {
        this.name = name;
    }

    abstract void makeSound(); // 추상 메서드, 구현이 없음

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}


public class OOP_Practice2 {
    
}
