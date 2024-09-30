//Write a java program use methods to find the smallest number among three numbers.
package methods_java;
import java.util.Scanner;
public class Program1 {
    public static void findLargest(int a, int b, int c) {
        if(a>b && a>c)
        {
            System.out.println(a +" Largest Among All");
        }
        else if(b>a && b>c) {
            System.out.println(b +" Largest Among All");
        }
        else if (c>a && c>b) {
            System.out.println(c +" Largest Among All");
        }
        else {
            System.out.println("Invalid Input and Output");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a java program use methods to find the smallest number among three numbers.");

        System.out.println("Enter Number : 1");
        int num1=sc.nextInt();
        System.out.println("Enter Number : 2");
        int num2=sc.nextInt();
        System.out.println("Enter Number : 3");
        int num3=sc.nextInt();

//        Calling parameterized Method
        findLargest(num1, num2, num3);
    }
}
