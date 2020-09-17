import java.util.Scanner;
public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        int  a = 0, b = 1, c;
        System.out.println("The Fibonacci sequence is as follows: ");
        int i=0;
        while(i<n)
        {
            if(i<=1)
                c = i;
            else
            {
                c = a+b;
                a = b;
                b = c;
            }
            System.out.println(c);
            i++;
        }
    }
}

