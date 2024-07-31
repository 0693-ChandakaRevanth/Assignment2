package Arrays;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<n;i++){
            if(a.containsKey(arr[i])){
                a.put(arr[i],a.get(arr[i])+1);
            }
            else {
                a.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> b:a.entrySet()){
            System.out.println(b.getKey()+": "+b.getValue());
        }
    }
}