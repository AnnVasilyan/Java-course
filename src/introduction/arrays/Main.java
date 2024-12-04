package introduction.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        a1 = a2; //a1 и ф2 будут равны {6, 7, 8, 9, 10}.


        int[] array = {3, 1, 4, 5, 2};
        System.out.println(Arrays.toString(array)); // Array as string: [3, 1, 4, 5, 2]
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); //Sorted array: [1, 2, 3, 4, 5]
        int index = Arrays.binarySearch(array, 4);
        System.out.println(index); //Index of element 4: 3
        int[] array2 = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(array, array2);
        System.out.println(areEqual); //Arrays are equal: true
    }
}
