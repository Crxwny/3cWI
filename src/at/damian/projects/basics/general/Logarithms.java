package at.damian.projects.basics.general;

import java.util.Scanner;

public class Logarithms {

//    You are given a base, N, and a solution, Y. You must find the exponent needed to get from the base to the solution (such that N ^ X = Y) and print it.
//    Input
//    Line 1: An integer, N, for the base
//    Line 2: An integer, Y, for the solution
//    Output
//    Line 1: An integer for the exponent needed to get from N to Y
//            Constraints
//    N > 0
//    Y > 0
//    Example
//            Input
//2
//        4
//    Output
//2

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Base N Input:");
        int N = in.nextInt();
        System.out.println("Solution Y Input:");
        int Y = in.nextInt();
        double result = Math.log(Y) / Math.log(N);
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println((int) (result));
    }


}
