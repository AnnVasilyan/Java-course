package polymorphismAndInheritance.usingThisAndSuper;

class Animal {
    String name = "Animal";

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called: " + name);
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    public Dog(String name) {
        super("Parent Animal: " + name); // 1. Вызов конструктора родительского класса
        this.name = name;
        System.out.println("Dog constructor called: " + name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void demonstrateSuper() {
        System.out.println("Current class name: " + this.name); // Поле текущего класса
        System.out.println("Parent class name: " + super.name); // 2. Доступ к полю родительского класса

        super.makeSound(); // 3. Вызов метода родительского класса
        this.makeSound();  // Вызов метода текущего класса
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.demonstrateSuper();
    }
}

