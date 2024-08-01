import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String 1: ");
            String str1 = sc.next();
            System.out.print("Enter String 2: ");
            String str2 = sc.next();
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();
            char[] arr1;
            arr1=str1.toCharArray();
            char[] arr2;
            Arrays.sort(arr1);
            arr2=str2.toCharArray();
            Arrays.sort(arr2);
            boolean a= Arrays.equals(arr1,arr2);
            if(a)
                System.out.println("Given Strings are Anagram Strings");
            else
                System.out.println("Not Anagram Strings");
        }
    }
