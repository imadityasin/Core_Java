// Create the method which is accepting the number from calling method and returning the product of the digit.

package return_keyword;
import java.util.Scanner;
public class Program3 {
    public static int product(int x) {
        for(int i=1;i<=10;i++) {
            System.out.println(x + " * " + i + " = " + x*i);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Getting data from user.
        System.out.println("Enter a Num to get the product of that number");
        int a=sc.nextInt();

        // Calling the Method.
        product(a);
    }
}
