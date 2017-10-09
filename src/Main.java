import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Code from Intro to Java Programming, page 271.

        double[] myList = new double[10];

        System.out.println("1. Initializing arrays with input values.");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }

        System.out.println("2. Initializing arrays with random values.");

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }

        System.out.println("3. Displaying arrays.");

        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.print(city);

        System.out.println("4. Summing all elements.");

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }

        System.out.println("5. Finding the largest element.");

        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }

    }
}
