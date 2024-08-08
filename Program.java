import java.util.Scanner;

public class Program{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b:");
        int b = scanner.nextInt();
        int c = sum(a,b);
        System.out.println("Sum of " + a + "and " + b + " is " + c);
    }
    
    private static int sum(int a, int b) {
        return a + b;
    }
}