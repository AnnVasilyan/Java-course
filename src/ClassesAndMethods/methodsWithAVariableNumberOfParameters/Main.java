package ClassesAndMethods.methodsWithAVariableNumberOfParameters;

class VarArgsClass {
    // Метод без параметров
    public void print() {
        System.out.println("No parameters");
    }

    // Метод с переменным числом параметров
    public void print(String... messages) {
        System.out.println("VarArgs string method called:");
        for (String message : messages) {
            System.out.print("- " + message);
        }
        System.out.println();
    }

    // Метод с переменным числом параметров
    public void print(int... numbers) {
        System.out.println("VarArgs int method called:");
        for (int num : numbers) {
            System.out.println("- " + num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        VarArgsClass example = new VarArgsClass();

        // Вызов метода без параметров
        example.print();

        // Вызов метода с переменным числом параметров для String
        example.print("Hello", "World", "Java");

        // Вызов метода с переменным числом параметров для int
        example.print(1, 2, 3, 4, 5);

    }
}
