import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s= "";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        if(s.equals(str)){
            System.out.println("Given String is a Palindrome String");
        }
        else{
            System.out.println("Not a Palindrome String");
        }
    }
}