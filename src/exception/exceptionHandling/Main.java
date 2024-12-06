package exception.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Деление на ноль вызывает ArithmeticException
        } catch (ArithmeticException e) { // перехвачено
            System.out.println("ArithmeticException перехвачено: Деление на ноль");
        }

        String str = null;
        int length = str.length(); // Здесь возникнет NullPointerException, который не будет перехвачен
    }
}
