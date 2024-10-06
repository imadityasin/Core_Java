// Create a Method which is going to accept 2 number from the calling method and returning
// the product value.

package return_keyword;
import java.util.Scanner;
public class Program1 {
    public static int product(int x, int y) {
        int z=0;
        z=x*y;
        System.out.println(z);
        return z;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2=sc.nextInt();

        product(num1, num2);
    }
}
