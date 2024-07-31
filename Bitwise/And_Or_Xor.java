package Day2.Day2.src.Bitwise;
import java.util.Scanner;

public class And_Or_Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Integers: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("XOR of 2 integers: "+(n^m));
        System.out.println("AND of 2 integers: "+(n&m));
        System.out.println("OR of 2 integers: "+(n|m));
    }
}
