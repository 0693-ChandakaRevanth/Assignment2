package Logical;

import java.util.Scanner;
public class Divisibility_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0&&n%7==0)
            System.out.println("Divisible by 5 and 7");
        else
            System.out.println("Not Divisible by 5 and 7");
    }
}
