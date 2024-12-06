package string.stringBuf;

public class Main {
    public static void main(String[] args) {
        {// 1. StringBuilder append() - добавляет строку в конец
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(", World!");
            System.out.println(sb);  // Выведет: Hello, World!

            // 2. StringBuffer append() - добавляет строку в конец
            StringBuffer sbf = new StringBuffer("Java");
            sbf.append(" Programming");
            System.out.println(sbf);  // Выведет: Java Programming

            // 3. StringBuilder insert() - вставляет строку в указанную позицию
            sb.insert(5, " Beautiful");
            System.out.println(sb);  // Выведет: Hello Beautiful, World!

            // 4. StringBuffer insert() - вставляет строку в указанную позицию
            sbf.insert(4, " Language");
            System.out.println(sbf);  // Выведет: Java Language Programming

            // 5. StringBuilder delete() - удаляет часть строки по индексам
            sb.delete(5, 15);  // Удаляет строку с позиции 5 по 14 (не включая 15)
            System.out.println(sb);  // Выведет: Hello, World!

            // 6. StringBuffer delete() - удаляет часть строки по индексам
            sbf.delete(4, 14);  // Удаляет строку с позиции 4 по 13 (не включая 14)
            System.out.println(sbf);  // Выведет: Java Programming

            // 7. StringBuilder reverse() - переворачивает строку
            sb.reverse();
            System.out.println(sb);  // Выведет: !dlroW ,olleH

            // 8. StringBuffer reverse() - переворачивает строку
            sbf.reverse();
            System.out.println(sbf);  // Выведет: gnimmargorP avaJ

            // 9. StringBuilder capacity() - возвращает текущую вместимость StringBuilder
            System.out.println("Capacity of StringBuilder: " + sb.capacity());  // Выведет емкость объекта StringBuilder

            // 10. StringBuffer capacity() - возвращает текущую вместимость StringBuffer
            System.out.println("Capacity of StringBuffer: " + sbf.capacity());  // Выведет емкость объекта StringBuffer
        }

        {// Преобразование из String в StringBuilder
            String str = "Hello, World!";
            StringBuilder sb = new StringBuilder(str); // Конструктор StringBuilder принимает строку
            System.out.println("StringBuilder: " + sb); // Выведет: Hello, World!

            // Преобразование из String в StringBuffer
            StringBuffer sbf = new StringBuffer(str); // Конструктор StringBuffer принимает строку
            System.out.println("StringBuffer: " + sbf); // Выведет: Hello, World!

            // Преобразование из StringBuilder в String
            String strFromSB = sb.toString(); // Метод toString() возвращает строку из StringBuilder
            System.out.println("String from StringBuilder: " + strFromSB); // Выведет: Hello, World!

            // Преобразование из StringBuffer в String
            String strFromSBF = sbf.toString(); // Метод toString() возвращает строку из StringBuffer
            System.out.println("String from StringBuffer: " + strFromSBF); // Выведет: Hello, World!

            // Преобразование из StringBuilder в StringBuffer
            StringBuffer sbfFromSB = new StringBuffer(sb.toString()); // Конструктор StringBuffer принимает строку
            System.out.println("StringBuffer from StringBuilder: " + sbfFromSB); // Выведет: Hello, World!

            // Преобразование из StringBuffer в StringBuilder
            StringBuilder sbFromSBF = new StringBuilder(sbf.toString()); // Конструктор StringBuilder принимает строку
            System.out.println("StringBuilder from StringBuffer: " + sbFromSBF); // Выведет: Hello, World!
        }
    }
}
