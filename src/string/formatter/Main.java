package string.formatter;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {

        boolean boolValue = true;
        char charValue = 'A';
        int intValue = 42;
        double floatValue = 123.456;
        String strValue = "Hello, world!";

        Formatter formatter = new Formatter();

        // Использование спецификаторов
        formatter.format("Boolean value: %b\n", boolValue); // Спецификатор %b - логическое значение
        formatter.format("Character value: %c\n", charValue); // Спецификатор %c - символ
        formatter.format("Integer value: %d\n", intValue); // Спецификатор %d - десятичное целое
        formatter.format("Float value: %.2f\n", floatValue); // Спецификатор %f - десятичное значение с плавающей точкой
        formatter.format("String value: %s\n", strValue); // Спецификатор %s - строковое представление

        System.out.println(formatter.toString());


        // Метод flush() используется для принудительной записи данных из буфера в поток вывода.
        // Это важно при работе с буферизированными потоками, чтобы данные были немедленно выведены в консоль или файл.
        // Например, при использовании BufferedWriter, чтобы убедиться, что все данные были записаны.

        long currentTimeMillis = System.currentTimeMillis();
        Formatter timeFormatter = new Formatter();

        // Использование спецификаторов времени
        timeFormatter.format("Current time in hours: %tH\n", currentTimeMillis); // Спецификатор %tH - Час (00-23)
        timeFormatter.format("Current minute: %tM\n", currentTimeMillis); // Спецификатор %tM - Минуты
        timeFormatter.format("Current second: %tS\n", currentTimeMillis); // Спецификатор %tS - Секунды
        timeFormatter.format("Current year: %tY\n", currentTimeMillis); // Спецификатор %tY - Год в четырехзначном формате
        timeFormatter.format("Current day: %tA\n", currentTimeMillis); // Спецификатор %tA - Полное название дня недели

        System.out.println(timeFormatter.toString());

        formatter.flush();
        timeFormatter.flush();
    }
}
