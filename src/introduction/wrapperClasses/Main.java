package introduction.wrapperClasses;

public class Main {
    public static void main(String[] args) {
        {
            String decimal = "1111"; //в 10ой
            String hexa = "0X1F"; // в 16ой тк 0X
            String octal = "0217"; // в 8ой
            Integer number = Integer.decode(decimal);
            System.out.println("Decimal [" + decimal + "] = " + number);
            number = Integer.decode(hexa); // из 16ой в 10ую
            System.out.println("Hexa [" + hexa + "] = " + number);
            number = Integer.decode(octal); // из 8щй в 10ую
            System.out.println("Octal [" + octal + "] = " + number);
        }

        {
            //Boolean bool1 = new Boolean(true); // устарело
            //Boolean bool2 = new Boolean("true"); // устарело
            Boolean bool3 = Boolean.valueOf("true");
            Boolean bool4 = Boolean.valueOf(true);
            Boolean bool5 = Boolean.TRUE;
            Boolean bool6 = true;
        }

        {
            Integer intObject = null; // Объект равен null
            int i = intObject; // примитивный тип не может быть null
        }

        {
            //java.lang.Integer.valueOf(int) кэширует значения от -128 до 127 (верхнюю границу можно изменять)
            int i1 = 128;
            Integer a1 = i1; //автоупаковка java.lang.Integer.valueOf(int)
            Integer b1 = i1; //значение не сохраняется в pool'е
            System.out.println("a1==i1 " + (a1 == i1)); //true - автораспаковка
            System.out.println("b1==i1 " + (b1 == i1)); //true - автораспаковка
            System.out.println("a1==b1 " + (a1 == b1)); //false - значение не сохраняется в pool'е, поэтому сравнение по ссылкам
            System.out.println("a1.equals(i1) -> " + a1.equals(i1)); //true - автоупаковка, equals сравнивает значения
            System.out.println("b1.equals(i1) -> " + b1.equals(i1)); //true - автоупаковка
            System.out.println("a1.equals(b1) -> " + a1.equals(b1)); //true - equals сравнивает значения
            int i2 = 127; //значение в базовом диапазоне [-128, 127], храниться в pool'e
            Integer a2 = i2; //автоупаковка java.lang.Integer.valueOf(int)
            Integer b2 = i2;
            System.out.println("a2==i2 " + (a2 == i2)); //true - автораспаковка
            System.out.println("b2==i2 " + (b2 == i2)); //true - автораспаковка
            System.out.println("a2==b2 " + (a2 == b2)); // значения достаются из pool'а
            System.out.println("a2.equals(i2) -> " + a2.equals(i2)); //true - автоупаковка, equals сравнивает значения
            System.out.println("b2.equals(i2) -> " + b2.equals(i2)); //true - автоупаковка
            System.out.println("a2.equals(b2) -> " + a2.equals(b2)); //true - equals сравнивает значения

//        IntegerCache в Java используется для оптимизации работы с объектами класса Integer,
//        для уменьшения затрат на создание новых объектов.

        }
    }
}
