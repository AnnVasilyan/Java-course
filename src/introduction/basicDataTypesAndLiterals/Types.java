package introduction.basicDataTypesAndLiterals;

import java.util.List;

class Person {
    String name;
    int age;
    long passport;

    public Person(String name, int age, long passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return name + ", passport=" + passport;
    }
}

public class Types {
    public static void main(String[] args) {
        {//примеры всех типов
            byte b = 0;
            short sh = 0;
            int i = 0;
            long l = 0L;
            float f = 0f;
            double d = 0.0;
            char ch = '\u0000';
            boolean bool = false;
        }

        {//имя Анна
            System.out.println("\u0410\u043D\u043D\u0430");
        }

        {//Какое значение будет в переменной c после выполнения данного кода?
//
//        int a = 1;
//        {
//            int b = 2;
//        }
//        int c = a + b;
            //Объясните полученный результат.

            // Будет выдана ошибка, тк переменная b существует только в рамках блока, обозначенного {}.
            // Обращение к переменной вне этого блока влечет ошибку существования переменной
        }


        { //Приведите пример использования перегруженного оператора +
            String str1 = "Hello, ";
            String str2 = "World";
            System.out.println(str1 + str2); // Hello, World

            int num = 52;
            System.out.println(str1 + num); // Hello, 52

            Person Anya = new Person("Anya", 20, 1234_1234_1234_1234L);
            System.out.println(str1 + Anya); // Hello, Anya, passport=1234123412341234
        }

        {
            long l = 1L;
            int i = (int) l; // сужает long до int
            int bigNum = 1000000;
            byte smallNum = (byte) bigNum; //=64, тк в тип byte помешается только первые 8 бит числа bigNum
            System.out.println(smallNum);
            int x = 65537; //за пределами диапазона char -> произошло переполнение
            char c = (char) x ;
            System.out.println(c);
        }

        {
            int a = 120;
            //byte b = a + 10; //ERROR тк большой тип int записывают в маленькую переменную byte без сужения
            byte c = (byte) (a + 10); // Все хорошо, есть сужение. запишутся первые 8 бит числа 130 = -126
            //byte d = a + 1; //ERROR тк большой тип int записывают в переменную byte без сужения
        }

        {
            // Локальная переменная
            var name = "Анна"; // Тип автоматически выводится как String
            System.out.println("Имя: " + name);

            // Коллекция
            var numbers = List.of(1, 2, 3, 4); // Тип выводится как List<Integer>
            System.out.println("Список чисел: " + numbers);

            // Переменная цикла
            for (var number : numbers) {
                System.out.println("Число: " + number);
            }

            // Тип, возвращаемый методом
            var message = getMessage();
            System.out.println("Сообщение: " + message);
        }
    }

    public static String getMessage() {
        return "hi hi";
    }
}
