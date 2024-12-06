package stream.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"))) {  // Создаем Scanner для чтения файла
            while (scanner.hasNextLine()) {  // Пока есть строки в файле
                String line = scanner.nextLine();  // Чтение строки из файла
                System.out.println(line);  // Выводим строку на экран
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());  // Обработка исключения, если файл не найден
        }
    }
}
