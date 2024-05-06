import java.util.Scanner;

public class HomeWorkJavaCoreSeminar2 {

    public int[] newArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите число на какое количество элементов вы хотите создать целочисленный массив: ");
        int n = 0;
        boolean input = true;
        while (input) {
            try {
                n = Integer.parseInt(scan.next());
                input = false;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число! Попробуйте еще раз!");
            }

        }
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите элемент массива (целое число): ");
            input = true;
            while (input) {
                try {
                    array[i] = Integer.parseInt(scan.next());
                    input = false;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не целое число! Попробуйте еще раз!");
                }
            }
        }
        scan.close();
        return array;
    }

    // Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
    // countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

    public int countEvens(int [] array){
        int countEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 ==0) countEvens++;
        }
        return countEvens;
    }

    //Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
    //переданного не пустого массива.

    public int diffBetweenLargeAndSmallArrayElement(int [] array){
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxElement) maxElement = array[i];
            if(array[i] < minElement) minElement = array[i];

        }
        System.out.print("maxElement " + maxElement + " - " + "minElement " + minElement +" = ");
        return maxElement - minElement;

    }
    // Написать функцию, возвращающую истину, если в переданном массиве
    // есть два соседних элемента, с нулевым значением.

    public boolean checkAdjacentElementsAreZero(int [] array){
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i+1] && array[i] == 0) return true;
        }
        return false;
    }
}
