package exception.ownException;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("Это собственное исключение!");
        } catch (MyCustomException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}

