package ClassesAndMethods.parameterizedClasses;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        if (stringList instanceof List) {
            System.out.println("stringList является экземпляром List.");
        }
        if (integerList instanceof ArrayList) {
            System.out.println("integerList является экземпляром ArrayList.");
        }

        Object obj = new ArrayList<String>();
        if (obj instanceof List) {
            System.out.println("obj — это List.");
        }
        if (obj instanceof ArrayList) {
            System.out.println("obj — это ArrayList.");
        }


//        Ключевые слова <? extends T> и <? super T> используются для ограничения типа
//        в обобщениях (generics). Они позволяют задавать гибкие и безопасные ограничения
//        при работе с параметризованными типами.

        {
            List<Dog> dogs = new ArrayList<>();
            dogs.add(new Dog());

            // List<? extends Animal> может содержать Dog, Cat или любой подтип Animal
            List<? extends Animal> animals = dogs;

            // Чтение из коллекции безопасно
            for (Animal animal : animals) {
                animal.eat(); // Доступны методы Animal
            }

            // Нельзя добавлять элементы в коллекцию (кроме null)
            // animals.add(new Dog()); // Ошибка компиляции
        }

        {
            List<Animal> animals = new ArrayList<>();

            // List<? super Dog> может содержать Dog, Animal или Object
            List<? super Dog> dogs = animals;


            dogs.add(new Dog()); // Запись в коллекцию безопасна
            // dogs.add(new Animal()); // Ошибка компиляции

            // Чтение из коллекции ограничено типом Object
            Object obj2 = dogs.get(0);
            System.out.println(obj2.getClass().getSimpleName()); // Вывод: Dog
        }
    }
}
