package sem_1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }


    private static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name, please: ");
        String name = in.nextLine();
        System.out.println("Hello" + ' ' + name);
        in.close();
    }

    private static void task2() {
        int[] myArray = new int[30];
        int counter = 0;
        int maxLength = 0;
        Random random = new Random();
        double randomFromMath = Math.random();
        System.out.println(randomFromMath);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(2);
        }

        System.out.println(Arrays.toString(myArray));
        for (int num : myArray) {
            if (num == 1) {
                counter++;
            } else {
//                if (counter > maxLength) {
//                    maxLength = counter;
//                    counter = 0;
//                }
//                (условие) ? true : false;
//                maxLength = (counter > maxLength) ? counter : maxLength;
                maxLength = Math.max(counter, maxLength);
                counter = 0;
            }
        }
        System.out.println("Max length: " + Math.max(counter, maxLength));

    }


}
