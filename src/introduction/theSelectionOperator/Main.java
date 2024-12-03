package introduction.theSelectionOperator;

//Поддерживаемые типы для переменной в switch:
//Примитивные целочисленные типы (byte, short, int, char)
//Перечисления (enum)
//Класс String
//Обёртки для чисел и символов (Byte, Short, Integer, Character)
//Тип var, если значение, назначенное переменной, является совместимым с одним из вышеперечисленных типов.
public class Main {
    public static void main(String[] args) {

        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Отл");
                break;
            case 'B':
                System.out.println("Хор");
                break;
            case 'C':
                System.out.println("Удовл");
                break;
            default:
                System.out.println("Неуд");
        }


        enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
        Day today = Day.WEDNESDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case TUESDAY:
                System.out.println("Вторник");
                break;
            case WEDNESDAY:
                System.out.println("Среда");
                break;
            case THURSDAY:
                System.out.println("Четверг");
                break;
            case FRIDAY:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходные");
        }

        String color = "RED";
        switch (color) {
            case "RED":
                System.out.println("Стоп!");
                break;
            case "YELLOW":
                System.out.println("Внимание!");
                break;
            case "GREEN":
                System.out.println("Езжайте!");
                break;
            default:
                System.out.println("Неизвестный сигнал");
        }

        Integer number = 10;
        switch (number) {
            case 5:
                System.out.println("Число равно 5");
                break;
            case 10:
                System.out.println("Число равно 10");
                break;
            default:
                System.out.println("Неизвестное число");
        }

        var value = "Hello";
        switch (value) {
            case "Hello":
                System.out.println("Привет");
                break;
            case "Goodbye":
                System.out.println("Прощай");
                break;
            default:
                System.out.println("Неизвестное слово");
        }


//        Если в некоторых частях case отсутствует ключевое слово break,
//        программа продолжит выполнение следующего блока case, независимо от того,
//        соответствует ли этот блок значению выражения в switch

        int i = 0;
        int value2 = 2;

        switch (value2) {
            case 1:
                i = 1;
                break; // Выход из switch после выполнения case 1
            case 2:
                i = 2; // Установка i = 2
                // Отсутствует break, поэтому выполнение продолжится в следующем case
            case 3:
                i = 3; // Перезапись i, теперь i = 3
                break; // Выход из switch
        }
        System.out.println("i = " + i);
    }
}
