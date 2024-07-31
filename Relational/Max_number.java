package Relational;

import java.util.Scanner;
public class Max_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        System.out.println(n>a?Math.max(n,m):Math.max(a,m));
    }
}
