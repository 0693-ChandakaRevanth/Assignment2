package Logical;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Positive number: ");
        int n=sc.nextInt();
        int count;
        for(int i=2;i<=n;i++) {
            count=2;
            for (int j = 2; j <= i/ 2; j++) {
                if (i % j == 0){
                    count++;}
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}