package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Initial_sum_avg_max_reversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        int sum=0,j=n-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            arr1[j--]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of Array Elements: "+sum);
        System.out.println("Average of Array Elements: "+sum/n);
        Arrays.sort(arr);
        System.out.println("Max Element: " +arr[n-1]);
        System.out.println("Min Element: " +arr[0]);
        System.out.println(Arrays.toString(arr1));
    }
}
