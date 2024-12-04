package polymorphismAndInheritance.nestedClasses;

interface Interface {
    void interfaceMethod();

    // Вложенный класс в интерфейс
    class NestedClass {
        public void print() {
            System.out.println("Message inside Interface");
        }
    }
}
public class TestNestedClassInInterface {
    public static void main(String[] args) {
        Interface.NestedClass nested = new Interface.NestedClass();
        nested.print();
    }
}

public class Main {
}
