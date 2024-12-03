package introduction.cycles;

public class Main {
    public static void main(String[] args){
//        ПРИМЕРЫ БЕСКОНЕЧНЫХ ЦИКЛОВ
//        while (true) {
//            System.out.println("This is an infinite while loop");
//        }

//        do {
//            System.out.println("This is an infinite  do-while loop.");
//        } while (true);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // прервется когда i = 5
            }
            System.out.println("i: " + i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // пропустит итерацию i = 5
            }
            System.out.println("i: " + i);
        }
    }
}
