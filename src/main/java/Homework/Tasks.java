package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        getMinMax();
        checkLeapYear();
        moveElements();

    }

    private static void getMinMax() {
        int [] newArray = new int[5];
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(newArray));
        int minValue = newArray[0];
        int maxValue = newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] > maxValue) {
                maxValue = newArray[i];
            } else if (newArray[i] < minValue) {
                minValue = newArray[i];
            }
        }

        System.out.println("minimum = " + minValue + ", " + "maximum = " + maxValue);
    }

    private static void checkLeapYear() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        String year = in.nextLine();
        int yearNum = Integer.parseInt(year);
        boolean result = (yearNum % 4 == 0 || yearNum % 400 == 0) && yearNum % 100 != 0;

        System.out.println(result);
        in.close();
    }

    private static void moveElements() {
        int [] newArray = new int[12];
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(newArray));
        int value = 3;
        int left = 0;
        int right = newArray.length-1;
        int temp;
        while (left < right){
            if (newArray[left] == value & newArray[left] != newArray[right]) {
                temp = newArray[left];
                newArray[left] = newArray[right];
                newArray[right] = temp;
                left++;
                right--;
            } else if (newArray[left] == value & newArray[left] == newArray[right]){
                right--;
            }else {
                left++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
