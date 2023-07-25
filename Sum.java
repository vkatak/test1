import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Enter a number!");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Enter another number!");

        int b = sc.nextInt();

        System.out.println("Sum of two numbers is "+(a+b));

    }
}