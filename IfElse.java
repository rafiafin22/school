import java.util.*;
import java.lang.Math;

public class IfElse {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int str;
        
        str = input.nextInt();
        if (str == 1) {
            System.out.println("One");
        } else {
            if (str == 2) {
                System.out.println("Two");
            } else {
                if (str == 3) {
                    System.out.println("Three");
                } else {
                    System.out.println("No match");
                }
            }
        }
    }
}
