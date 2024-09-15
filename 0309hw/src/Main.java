import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean isEdekaOpen = true;
        Boolean isReweOpen = false;
        boolean isOpen = canBuy(isReweOpen, isEdekaOpen);
        System.out.println("Я могу купить еду это: " + isOpen);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to see if it's high:");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("It's a high year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("It's a high year");
        } else if (year % 4 == 0 && year % 100 == 0) {
            System.out.println("This year is NOT a high year.");
        } else {
            System.out.println("This year is NOT a high year.");
        }
        System.out.println("Введи 3 числа: ");

        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введи число " + (i+1) + ":");
            numbers[i] = sc.nextInt();
        }
        int min = whatIsMin(numbers);
        System.out.println("min number is: " + min);
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isReweOpen || isEdekaOpen;
    }

    public static int whatIsMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}


