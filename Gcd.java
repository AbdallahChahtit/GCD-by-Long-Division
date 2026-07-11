import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > 0 && num2 > 0) {
            System.out.println("The gcd of " + num1 + " and " + num2 + " is "
                    + gcd(num1, num2));
        } else {
            System.out.println("wrong numbers!");
        }
    }

public static void swap(int n1, int n2)
    {
        int temp = n1;
            n1 = n2;
            n2 = temp;
    }
    public static int gcd(int num1, int num2) {
        if (num1 < num2) {
            swap(num1, num2);
        }
        
        while (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println("remainder: " + remainder);
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
   
}

