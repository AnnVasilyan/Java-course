package polymorphismAndInheritance.finalClasses;

final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

// Попытка унаследовать финальный класс
//class Subclass extends FinalClass { // Ошибка компиляции: Cannot inherit from final class
//    // Нельзя добавить какую-либо логику, так как наследование запрещено
//}

class Superclass {
    public final void finalMethod() {
        System.out.println("This is a final method in the superclass.");
    }
}

class Subclass extends Superclass {
    // Попытка переопределить final-метод вызовет ошибку компиляции
    // @Override
    // public void finalMethod() { // Ошибка: Cannot override the final method from Superclass
    //     System.out.println("Trying to override the final method.");
    // }
}

public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display(); // Вызов метода финального класса
    }
}
