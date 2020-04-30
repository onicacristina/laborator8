package com.company;

public class Regine {
    int [] d = new int[100];
    // int n=8;
    public int nrSol=0;
    public  void scrieSol()
    {
        nrSol++;
        System.out.println("\n");
        System.out.println("Solutia " + nrSol+ " : ");
        for (int i = 1; i <=8 ; i++) {
            System.out.println();
            for (int j = 1; j <=8 ; j++) {
                if( d[j]==i)
                    System.out.print(" X ");
                else
                    System.out.print(" O ");
            }
        }
    }
    public  int potcont(int k)
    {
        for (int i = 1; i <=k-1 ; i++) {
            if(d[i]==d[k] ||  k-i==Math.abs(d[k]-d[i]))
                return 0;
        }
        return 1;
    }
    public void back(int k)
    {
        for (int i = 1; i <=8 ; i++) {
            d[k]=i;
            if( potcont(k)!=0)
                if(k==8)
                    scrieSol();
                else
                    back(k+1);
        }
    }

    public void solutii()
    {
        back(1);
        System.out.println("\n\nNumarul de solutii este: "+ nrSol);
    }
}
