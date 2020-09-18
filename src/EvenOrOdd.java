import java.util.Scanner;
public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = sc.nextInt();
        if ((a % 2) != 0)
            System.out.println("Weird");
        else if ((a % 2) == 0)
        {
            if ( (a >= 2) && (a <= 5) )
            {
                System.out.println("Not Weird");
            }
            if ( (a >= 6) && (a <= 20) )
            {
                System.out.println("Weird");
            }
            if (a > 20)
            {
                System.out.println("Not Weird");
            }
        }

    }
}