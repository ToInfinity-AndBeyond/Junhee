import java.util.List;
import java.util.ArrayList;
public class OOP_Rest {
    
}


// In OOP, an object can contain other objects as instance variables.

class Car {
    Engine enginel; // has-a 관계, Car는 Engine을 가지고 있음
}

class Engine {
    int horsepower;
    String type;
}

// There are two important types of has-a relationships: composition and aggrgeation.
// The main difference is aobut lifetime dependencies.

// Composition: one object is made up of other objects, and the contained objects
// cannot exist independently of the main object. (Strong)

// Whole owns the parts, if the whole is destroyed the parts are destroyed too.

// Ex) Car <--> Engine, House <--> Room


// Aggregation: one object contains references to other objects, but the contained
// objects can exist independently of the main object. (Weak)

// Ex) University <--> Student, Team <--> Player

// UML Repreesntation:


// Desgin Patterns are common sotlutions to common software design problems.
// Reusability, Readability, Reliability, Maintainability

// Singleton Pattern: ensures that a class has only one instance during the whole program,
// and provides a global access point to that instance. 

// Only one object is created; Everyione uses the same object.

//Ex) db connection, conifguration/setting manager, logger

class DatabaseConnection {
    private static DatabaseConnection instance; // static variable to hold the single instance

    private DatabaseConnection() {
        // private constructor to prevent instantiation from outside the class
    }

    // DatabaseConnection db = new DatabaseConnection(); 
    // This would cause an error because the constructor is private

    public static DatabaseConnection getInstance() {
        if (instance == null) { // null means no instance exists yet
            instance = new DatabaseConnection(); // create the single instance if it doesn't exist
        }
        return instance; // return the single instance
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}

class DatabaseConnectionTest {
    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.connect();

        // Check if db1 and db2 are the same instance
        if (db1 == db2) {
            System.out.println("db1 and db2 are the same instance.");
        } else {
            System.out.println("db1 and db2 are different instances.");
        }
    }
}

// Factory Pattern: provides a spearate method or class for creating objects.

// Instead of directly using new Button(), we as a factory to create the object.
// Ex) Button, Window, Textbox, Menu, etc. In GUI application, we can have a factory 
// that creates different types of UI components based on the platform (Windows, Mac, Linux).

// PrimaryButton, SecondaryButton, IconButton, etc. In a game, we can have a 
// factory that creates different types of enemies (Zombie, Vampire, Werewolf)
// based on the level or difficulty.

// Java에서 이 클래스는 이런 method를 반드시 가져야 한다고 정해주는 약속 (규칙, 약속)
interface Button {
    void render();
}

class PrimaryButton implements Button {
    public void render() {
        System.out.println("Rendering a primary button.");
    }
}

class AlertButton implements Button {
    public void render() {
        System.out.println("Rendering an alert button.");
    }
}


class ButtonFactory {
    public static Button createButton(String type) {
        if (type.equalsIgnoreCase("primary")) {
            return new PrimaryButton();
        } else if (type.equalsIgnoreCase("alert")) {
            return new AlertButton();
        } else {
            throw new IllegalArgumentException("Unknown button type: " + type);
        }
    }
}

class FactoryPatternTest {
    public static void main(String[] args) {
        // Button button = new PrimaryButton(); // This is not flexible, we have to change the code to create a different type of button
        // Button button = new AlertButton(); // This is not flexible, we have to change the code to create a different type of button
        Button primaryButton = ButtonFactory.createButton("primary");
        Button alertButton = ButtonFactory.createButton("alert");

        primaryButton.render();
        alertButton.render();
    }
}

// Observer Pattern: ceate a one-to-many relationships between objects.
// One object is watched by many other objects. When the main object changes, all observers are notified.


// Button Clicks --> All button in the application need to know when a button is clicked, so they can update their state or perform some action.



interface Observer {
    void update(String message);
}

// NotificationService가 어떤 메시지를 보내면, 등록된 Observer들이 모두 그 메시지를 받는 구조. 

// One object sends notification --> many observers got updated
class NotificationService {
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class ConcreteObserver implements Observer {
    public void update (String message) {
        System.out.println("Received notification: " + message);
    }
}

class EmailObserver implements Observer {
    public void update(String message) {
        System.out.println("Sending email notification: " + message);
    }
}

class ObserverPatternTest {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        EmailObserver observer3 = new EmailObserver();

        notificationService.attach(observer1);
        notificationService.attach(observer2);
        notificationService.attach(observer3);

        notificationService.notifyObservers("Button clicked!");
    }
}


// class Button {
//     void click() {
//         sendEmail();
//         saveLog();
//         updateScreen();
//     }
// }