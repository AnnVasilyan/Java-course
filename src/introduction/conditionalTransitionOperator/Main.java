package introduction.conditionalTransitionOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int a = Integer.parseInt(scanner.nextLine());
        i = (a == 1 ? 1 : (a == 2) ? 2 : 3);
        System.out.println(i);
    }
}
