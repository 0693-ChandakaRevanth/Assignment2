package Arrays;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int neg=0,pos=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0)
                neg++;
            else
                pos++;
        }
        System.out.println("Positive Numbers Count: "+pos);
        System.out.println("Negative Numbers Count: "+neg);
    }
}