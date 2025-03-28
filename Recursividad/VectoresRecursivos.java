package Recursividad;

import java.util.Scanner;

public class VectoresRecursivos {
	static void llenar(int v[],int n)
	{
		Scanner lee=new Scanner(System.in);
		if(n>0)
		{
			v[n]=lee.nextInt();
			llenar(v,n-1);
		}
	}
	static void mostrar(int v[], int n)
	{
		if(n==0);
		else
		{
			System.out.print("\t"+v[n]);
			mostrar(v,n-1);
		}
	}
	static int sumaEve(int v[],int n)
	{
		if(n==0) return 0;
		else
		{
			return(v[n]+sumaEve(v,n-1));
		}
	}
	static int maxVec(int v[],int n, int max)
	{
		if(n==0) return 0;
		else
		{
			System.out.println("maximo: "+max);
			if(v[n]<max)
			{
				max=v[n];
			}
			maxVec(v,n-1,max);
		}
		return max;
	}
	static int encontrarMayor(int v[], int n) {
        if (n==0) 
        {
            return 0;
        }
        int max;
        max = encontrarMayor(v, n-1);
        if (v[n]>max) 
        {
            return v[n];
        } 
        else 
        {
            return max;
        }
    }
	static int encontrarMenor(int v[], int n) {
        if (n==0) 
        {
            return 0;
        }
        int min;
        min = encontrarMenor(v, n-1);
        if (v[n]<min) 
        {
            return v[n];
        } 
        else 
        {
            return min;
        }
    }
	public static void main(String[] args) {
		int n;
		Scanner lee=new Scanner(System.in);
		int[] v=new int[100];
		System.out.println("Ingrese la cantidad de elementos del vector");
		n=lee.nextInt();
		llenar(v,n);
		mostrar(v,n);
		System.out.println("\nSumando los elementos del vector:"+sumaEve(v,n));
		System.out.println("\nEl maximo elemento es: "+encontrarMayor(v,n));
		System.out.println("\nEl minimo elemento es: "+maxVec(v,n,99));
	}
}
