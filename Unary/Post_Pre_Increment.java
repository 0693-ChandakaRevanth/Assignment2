package Assignment_Unary_Operators;

import java.util.Scanner;

public class Post_Pre_Increment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Post Increment: "+n++);
        System.out.println("Post Increment: "+ ++n);
    }
}
