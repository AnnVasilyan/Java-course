package interfaces.defaulAndStatic;

interface Interface {
    // Абстрактный метод
    void abstractMethod();

    // Метод с реализацией
    default void defaultMethod() {
        System.out.println("Default method in MyInterface");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }
}

class MyClass implements Interface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented in MyClass");
    }

    // Mожно переопределить default метод (опционально)
    @Override
    public void defaultMethod() {
        System.out.println("Default method overridden in MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        // Вызов абстрактного метода (через объект класса)
        myClass.abstractMethod();
        // Вызов default метода (через объект класса)
        myClass.defaultMethod();
        // Вызов static метода (через имя интерфейса)
        Interface.staticMethod();
        // Нельзя вызвать staticMethod через объект:
        // myClass.staticMethod();
    }
}
