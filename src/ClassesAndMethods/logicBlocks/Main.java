package ClassesAndMethods.logicBlocks;

class A {
    //Блоки инициализации экземпляра выполняются перед конструктором
    {
        System.out.println("logic (1) id= " + this.id);
    }

    //Статический блок выполняется первым при первой загрузке класса
    static {
        System.out.println("static logic");
    }

    private int id = 1;

    //Ctor выполняется последним и может перезаписать значения полей, заданных в блоках инициализации
    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    //Блоки инициализации экземпляра выполняются перед конструктором
    {
        System.out.println("logic (2) id= " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        new A(100);
        //static logic
        //logic (1) id= 0
        //logic (2) id= 1
        //ctor id= 100
    }
}
