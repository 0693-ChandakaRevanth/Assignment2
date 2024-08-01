import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Character_Frequency {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = input.nextLine();
        int count=1;
        Map<Character,Integer> arr=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(arr.containsKey(str.charAt(i))){
                arr.put(str.charAt(i),arr.get(str.charAt(i))+1);
            }
            else
                arr.put(str.charAt(i),count);
        }
        System.out.println("Frequency of each character is: ");
        for(Map.Entry<Character,Integer> a: arr.entrySet()){
            System.out.print(a.getKey()+" "+a.getValue()+"    ");
        }
    }
}