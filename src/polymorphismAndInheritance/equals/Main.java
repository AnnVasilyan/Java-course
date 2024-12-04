package polymorphismAndInheritance.equals;
//Соглашения, которых должна придерживаться реализация equals()
//Рефлексивность: Для любого объекта x, вызов x.equals(x) должен возвращать true.
//Симметричность: Для любых объектов x и y, если x.equals(y), то и y.equals(x).
//Транзитивность: Для любых объектов x, y и z, если x.equals(y) и y.equals(z), то x.equals(z)
//Непротиворечивость: Повторные вызовы должны возвращать одно и то же значение, пока сравниваемые объекты неизменны
//Сравнение с null: всегда должен возвращать false
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Сравнение на идентичность
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Проверка на null и совпадение классов
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name); // Сравнение по содержимому
    }

}

public class Main {

}
