package exception.errors;

public class Main {
//    1. ArithmeticException - генерируется, когда происходит ошибка в арифметических операциях (например, деление на ноль).
//    2. ArrayIndexOutOfBoundsException - генерируется, когда происходит попытка доступа к элементу массива по недопустимому индексу.
//    3. IllegalArgumentException - генерируется, когда метод получает недопустимый или неправильный аргумент.
//    4. ClassCastException - генерируется, когда попытка приведения объекта к неподходящему типу не удается.
//    5. NullPointerException - генерируется, когда выполняется операция с объектом, который равен null.
    public static void main(String[] args) {
        try {
            // ArithmeticException - деление на ноль
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Деление на ноль");
        }

        try {
            // ArrayIndexOutOfBoundsException - неправильный индекс массива
            int[] arr = new int[5];
            int value = arr[10]; // Попытка доступа к элементу за пределами массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Индекс массива вне диапазона");
        }

        try {
            // IllegalArgumentException - недопустимый аргумент
            setAge(-1); // Попытка установить отрицательный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Неверное значение аргумента");
        }

        try {
            // ClassCastException - ошибка приведения типов
            Object obj = new Integer(100);
            String str = (String) obj; // Невозможно привести Integer к String
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Ошибка приведения типов");
        }

        try {
            // NullPointerException - операция с null объектом
            String str = null;
            int length = str.length(); // Попытка вызвать метод на null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Обращение к методу на null");
        }
    }

    // Пример метода, генерирующего IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
