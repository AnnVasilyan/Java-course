package polymorphismAndInheritance.usingThisAndSuper;

//Что случится при вызове метода method() объекта класса C,
// если переменная a и метод method() не будут определены в классе B,
// а будут определены только в классе A?

class A {
    int a;
    void method() {
    //...
    }

}

class B extends A {
  //...
}

class C extends B {
  //...
    void method() {
    //...
        int a = super.a;
        super.method();
    }
  //...
}

//Внутри метода method() класса C:
//1. локальная переменная a инициализируется значением поля a из класса A через super.a.
//2. Вызывается метод method() суперкласса A через super.method().
//Метод method() из класса A выполняется
