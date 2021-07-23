import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int n1, n2, i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1st number : ");
            n1 = sc.nextInt();
            System.out.println("Enter 2nd number : ");
            n2 = sc.nextInt();
            System.out.println("Sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
            System.out.println("Enter 1 to start over or Enter any other number to exit.");
            i = sc.nextInt();
        }
        while (i == 1);
    }
}
