package polymorphismAndInheritance.inheritance;

// this ссылается на текущий объект класса
// super ссылается на непосредственный суперкласс

class Parent {
    int x;
    Parent(int x) {
        this.x = x;
    }
    void print() {
        System.out.println("Parent x: " + x);
    }
}
class Child extends Parent {
    int y;
    Child(int x, int y) {
        super(x); // Вызов конструктора родительского класса
        this.y = y; // Инициализация поля текущего класса
    }
    @Override
    void print() {
        super.print(); // Вызов метода родительского класса
        System.out.println("Child y: " + y);
    }
    void testSuper() {
        System.out.println("Super x: " + super.x); // Доступ к полю родительского класса
    }
}
public class Main {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.print(); // Вызов переопределенного метода
        child.testSuper(); // Доступ к полю родительского класса
    }
}


class A {
    //Поле a1 и метод method1() (без модификатора — package-private):
    //Доступны в классе B, если класс B находится в том же пакете.
    //Если класс B находится в другом пакете, доступ запрещен.
    int a1;
    //Поле a2 и метод method2() (с модификатором public):
    //Доступны в классе B без ограничений (в любом пакете).
    public int a2;
    //Поле a3 и метод method3() (с модификатором protected):
    //Доступны в классе B, поскольку он является наследником A.
    //Если класс B находится в другом пакете, доступ остается,
    // но только через наследование.
    protected int a3;
    //Поле a4 и метод method4() (с модификатором private):
    //Не доступны в классе B, так как private ограничивает доступ только телом класса A.
    private int a4;

    void method1() {
    //...
    }

    public void method2() {
    //...
    }

    protected void method3() {
    //...
    }

    private void method4() {
    //...
    }

}

class B extends A {
  //...
}

class C extends B {
  //аналогично для В
    //a1, method1() Доступны в том же пакете.
    //a2, method2() Доступны везде.
    //a3, method3()	Доступны через наследование.
    //a4, method4()	Не доступны.
}

