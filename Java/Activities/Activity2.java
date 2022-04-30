package activities;
import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args) {
        int[] array = {10, 77, 10, 54, -11, 10};
        String a = Arrays.toString(array);
        int number = 10;
        int sum = 30;
        System.out.println("Array is " + a);
        System.out.println("Result " + result(array, number, sum));
    }

    public static boolean result(int[] array1, int number, int sum) {
        int tempSum = 0;
        for (int tempnum : array1) {
            if (tempnum == number) tempSum += number;
            if (tempSum > sum) break;
        }
        return tempSum == sum;
    }
}