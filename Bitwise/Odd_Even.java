package Day2.Day2.src.Bitwise;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        if((n&2)==0)
            System.out.println("ODD Number");
        else
            System.out.println("EVEN Number");
    }
}
