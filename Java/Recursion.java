import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        {
            System.out.print("Enter number to perform factorial function: ");
            int num = sc.nextInt();
            System.out.println("the factorial result of (" + num + ") is: " + factorial(num));
        }
        System.out.println();
        {
            System.out.println("Enter numbers to perform power function: ");
            System.out.print("Enter the base: ");
            int base = sc.nextInt();
            System.out.print("Enter exponent: ");
            int exponent = sc.nextInt();
            System.out.println("the power result of(" + base + "," + exponent + ") is: " + power(base, exponent));
        }
        sc.close();
    }

    private static int factorial(int num) {
        if (num < 1) { // base case
            return 1;
        } 
        return num * factorial(num - 1); // recursive case
    }

    private static int power(int base, int exponent) {
        if (exponent < 1)
            return 1; // base case
        return base * power(base, exponent - 1); // recursive case
    }
}