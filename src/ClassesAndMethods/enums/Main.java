package ClassesAndMethods.enums;

class Colors {
    // Перечисление с дополнительным методом
    public enum Color {
        RED(255, 0, 0),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255);

        private final int red;
        private final int green;
        private final int blue;

        Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public String getRgb() {
            return "RGB(" + red + ", " + green + ", " + blue + ")";
        }

    }
}

enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private final String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class Main {
    public static void main(String[] args) {
        for (Colors.Color color : Colors.Color.values()) {
            System.out.println(color + ": " + color.getRgb());
        }

        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}
