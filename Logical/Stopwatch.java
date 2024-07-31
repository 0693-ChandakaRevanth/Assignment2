package Logical;

import java.util.Scanner;
public class Stopwatch {
    static long starttime;
    static long stoptime;
    static void getStarttime(){
        starttime= System.currentTimeMillis();
    }
    static void getStoptime(){
        stoptime=System.currentTimeMillis();
    }
    static long elapsedtime(){
        return stoptime-starttime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter to Start StopWatch");
        sc.nextLine();
        getStarttime();
        System.out.println("Please Enter to Stop StopWatch");
        sc.nextLine();
        getStoptime();
        System.out.println(elapsedtime());
    }
}