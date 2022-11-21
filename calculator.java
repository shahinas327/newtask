import java.util.*;
public class calculator
{
    public static void main(String args[])
    {

        int num1 = 2, num2 = 5, option;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice");
        System.out.println("1. Addition\n 2. Subtraction\n 3. Multiplicationgit  4. Division");
        option = sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
