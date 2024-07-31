import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mul=n<<1;
        int div=n>>1;
        System.out.println("Multiplication by 2 with left shift: "+mul);
        System.out.println("Multiplication by 2 with left shift: "+div);
    }
}
