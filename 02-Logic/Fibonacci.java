import java.util.Scanner;

class CalculateFibonacci
{
    CalculateFibonacci(int n)
    {
        int t0 = 0, t1 = 1, t2;

        for ( int i = 0; i < n; i++)
        {
            System.out.print(t0 + "\t");
            t2 = t1 + t0;
            t0 = t1;
            t1 = t2;
            
        }    
    }
}


class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series upto " + n + "th term : ");

        CalculateFibonacci Fibo = new CalculateFibonacci(n);

        sc.close();
        System.out.println();
    }
}