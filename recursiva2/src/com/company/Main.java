package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n=scanner.nextInt();
        int A[] = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            System.out.print("A["+i+"]=");
            A[i]=scanner.nextInt();
        }
        System.out.println("Rezultatul este: "+diferenta(A,n));

    }
    public static int diferenta(int A[], int n)
    {
        if(n>=1)
        {
            if(n%2==0)
                return diferenta(A,n-1)+A[n];
            else
                return diferenta(A,n-1)-A[n];
        }
        return 0;
    }
}
