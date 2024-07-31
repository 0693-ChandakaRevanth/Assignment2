import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int[] a=new int[str1.length()];
        int[] b=new int[str2.length()];
        for(int i=0;i<str1.length();i++){
            a[i]=str1.charAt(i);
            b[i]=str2.charAt(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b));
    }
}