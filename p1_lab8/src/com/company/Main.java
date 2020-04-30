package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n= ");
        int n= scanner.nextInt();
        int [] v= new int[20];
        System.out.println("Partitiile lui "+n+ " sunt: ");
        partitii(1,0,v,n);

    }
    public static void partitii(int i, int sp,int v[],int n)
    {
        if(sp==n)
            afisare(i-1,v,n);
        else
            for (int j = 1; j <= n- sp ; j++) {
                if(j>=v[i-1])
                {
                    v[i]=j;
                    partitii(i+1, sp+j,v,n);
                }

            }
    }
    public static void afisare(int k,int v[],int n)
    {
        System.out.print(n+ " = ");
        for (int i = 1; i <k ; i++) {
            System.out.print(v[i]+" + ");
        }
        System.out.print(v[k]);
        System.out.println();
    }
}
