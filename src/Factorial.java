import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial of " +n+ " is: " + fact);
    }
}