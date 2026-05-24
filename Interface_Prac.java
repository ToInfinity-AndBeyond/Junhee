public class Interface_Prac {
    
}

class Animal {
    void bark() {
        System.out.println("The animal is barking.");
    }
}

interface Runnable {
    void run();
}

interface Swimmable {
    void swim();
}

class Dog extends Animal implements Runnable, Swimmable {
    public void run() {
        System.out.println("The dog is running.");
    }

    public void swim() {
        System.out.println("The dog is swimming.");
    }
}
