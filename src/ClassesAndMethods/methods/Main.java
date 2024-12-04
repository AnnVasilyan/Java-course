package ClassesAndMethods.methods;

//ПЕРЕГРУЗКА
class OverloadingExample {
    // Метод с одним параметром
    public void print(String message) {
        System.out.println("Message: " + message);
    }

    // Перегруженный метод с двумя параметрами
    public void print(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }

    // Перегруженный метод с другим типом параметра
    public void print(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        example.print("Hello");
        example.print("Value is", 42);
        example.print(100);
    }
}

//ПЕРЕОПРЕДЕЛЕНИЕ

class Parent {
    public void display() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    // Переопределение метода
    @Override
    public void display() {
        System.out.println("This is the child class method.");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        parent.display(); // Вызов метода родительского класса
        childAsParent.display(); // Вызов переопределенного метода
        child.display(); // Вызов переопределенного метода
    }
}
