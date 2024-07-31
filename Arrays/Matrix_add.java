package Arrays;

import java.util.Arrays;

public class Matrix_add {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{1,2,3},{4,5,6},{7,8,9}};
        int[][] c=new int[a.length][a[0].length];
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[j][i];
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(c[i]));
        }
    }
}
