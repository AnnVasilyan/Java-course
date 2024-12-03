package introduction.javaDoc;

/**
 * Класс для представления пользователя.
 * @author Anna Vasikieva
 * @version 1.0
 */
public class User {
    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Конструктор для создания объекта User.
     * @param name имя пользователя
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Получить имя пользователя.
     * @return имя пользователя
     */
    public String getName() {
        return name;
    }
}
