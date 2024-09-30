//Write a java method to display the middle character of a string.
//note:   a) if the length is odd there will be two middle characters.
//        b) if the length of the string is even there will be one middle character.
package methods_java;
import java.util.Scanner;
public class Program3 {
    public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 2;
        }
        else{
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();

        System.out.println("The middle character in the string: "+ middle(str)+"\n");
    }
}
