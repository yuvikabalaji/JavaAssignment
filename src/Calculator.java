import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter an operation (+,=,*,/):");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' -> {
                System.out.print("The sum of " + a + " and " + b + " = ");
                System.out.print(a + b);
            }
            case '-' -> {
                System.out.print("The subtraction of " + a + " and " + b + " = ");
                System.out.print(a - b);
            }
            case '*' -> {
                System.out.print("The multiplication of " + a + " and " + b + " = ");
                System.out.print(a * b);
            }
            case '/' -> {
                System.out.print("The division of " + a + " and " + b + " = ");
                System.out.print(a / b);
            }
        }
        }
    }