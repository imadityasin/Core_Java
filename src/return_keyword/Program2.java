//Create a method which is accepting the number from the calling method and printing the sum of digit.

package return_keyword;
import java.util.Scanner;
public class Program2 {
//    sum Method.
    public static void sum(int x, int y) {
        int c=x+y;
        System.out.println("Sum of value "+c);
        return;
    }

    public static void main(String[] args) {
//        Creating the Scanner Object.
        Scanner sc=new Scanner(System.in);

//        Taking Input from the user.
        System.out.println("Enter Number 1: ");
        int a=sc.nextInt();
        System.out.println("Enter Number 2: ");
        int b=sc.nextInt();

//        Calling the Method and passing value.
        sum(a, b);
    }
}
