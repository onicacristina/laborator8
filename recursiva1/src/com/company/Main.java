package com.company;

import java.util.Scanner;

public class Main {

    static int vi=1;
    static int vp=1;

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        //int n=4536597;
        int i=0,p=0;
        cifre(n,p,i);

    }
    private static void cifre(int n, int p, int i)
    {
        if(n>0)
        {
            if(n%2==0)
            {
                p= p + n % 10 * vp;
                vp = vp * 10;
            }
            else
            {
                i = i + n % 10 * vi;
                vi = vi * 10;
            }
            n = n / 10;
            cifre(n,p,i);
        }
        else
        {
            System.out.println("Cifre pare: " + p);
            System.out.println("Cifre impare: " + i);
        }
    }
}

