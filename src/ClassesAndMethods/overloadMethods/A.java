package ClassesAndMethods.overloadMethods;

public class A {
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n) {
        System.out.println("Number=" + n);
    }
    public static void main(String[] args) {
        A a = new A();
        Number[] num = new Number[]{ new Integer(1), 11, 1.11f, 11.11};
        // цикл for (1)
        for (Number n : num) {
            a.printNum(n); // n переменная типа Number -> вызывается printNum(Number i)
        }
        // (2)
        a.printNum(new Integer(1)); // printNum(Integer i)
        a.printNum(11); // вызывается printNum(int i)
        a.printNum(1.11f); // автоупаковка до Float
        a.printNum(11.11); // автоупаковка Number
    }
}
