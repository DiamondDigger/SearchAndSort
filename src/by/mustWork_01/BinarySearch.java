package by.mustWork_01;

import java.util.Scanner;

/**
 * We take entered sorted array -sortedArray[10]- and find the current number -number- with binary search and print the index
 * -index- of it if we find out one, and the message if we don't.
 * @param : array - sorted array in which we search the current number
 * @param : number - current number we need to find
 * Variables in method are
 *  : l - left border
 *  : r - right border
 *  : m - medium
 *  : index - index of current number
 *  : find - flag for finding out current number
 * @author Alex An
 */

public class BinarySearch {

    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] sortedArray = new int[10];

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.printf("%s[%d]=%d    ", "A", i, sortedArray[i]);
        }
        System.out.println();
        System.out.println("---------------------------------------");
        binarySearch(sortedArray, number);


    }

    private static void binarySearch(int[] array, int number) {
        int l = 0;
        int r = array.length;
        int m;
        int index = 0;
        boolean find = false;
        while (l != r) {
            m = (l + r) / 2;
            if (number < array[m]) {
                r = m;
            } else if (number > array[m]) {
                l = m + 1;
            } else {
                find = true;
                index = m;
                System.out.println("Got it! Index of element is " + index);
                break;
            }
        }
        if (!find)
        System.out.println("We haven't such an element!");
    }
}
