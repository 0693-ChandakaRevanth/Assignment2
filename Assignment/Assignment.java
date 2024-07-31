package Assignment_Unary_Operators;

public class Assignment {
    public static void main(String[] args) {
        int n=10,m=2,sum=0,sub=Integer.MAX_VALUE,mul=1,div=10,mod=10;
        sum+=n;
        sub-=m;
        mul*=n;
        div/=m;
        mod%=m;
        System.out.println("Sum: "+sum);
        System.out.println("Sub: "+sub);System.out.println("Mul: "+mul);
        System.out.println("Div: "+div);
        System.out.println("Mod: "+mod);

    }
}
