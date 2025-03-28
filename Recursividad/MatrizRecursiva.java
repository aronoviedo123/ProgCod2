package Recursividad;

import java.util.Scanner;

public class MatrizRecursiva {
	static int sumaEma(int a[][],int n,int m,int ne,int c,int f)
	{
		if(ne<=n*m)
		{
			if(c==0)
			{
				f=f-1;
				c=m;
			}
			return (a[f][c]+sumaEma(a,n,m,ne+1,c-1,f));
		}
		else return 0;
	}
	static void llenar(int a[][],int n,int m,int ne,int c,int f)
	{
		Scanner lee=new Scanner(System.in);
		if(ne<=n*m)
		{
			if(c==0)
			{
				f=f-1;
				c=m;
			}
			a[f][c]=lee.nextInt();
			llenar(a,n,m,ne+1,c-1,f);
		}
	}
	static void mostrar(int a[][],int n,int m,int ne,int c,int f)
	{
		if(ne<=n*m)
		{
			if(c==0)
			{
				f=f-1;
				c=m;
				System.out.println();
			}
			System.out.print("\t"+a[f][c]);
			mostrar(a,n,m,ne+1,c-1,f);
		}
	}
	public static void main(String[] args) {
		int n,m;
		int[][] a=new int[100][100];
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el  valor de las filas");
		n=lee.nextInt();
		System.out.println("Ingrese el valor de las columnas");
		m=lee.nextInt();
		llenar(a,n,m,1,m,n);
		System.out.println("\nMostrando a matriz:");
		mostrar(a,n,m,1,m,n);
		System.out.println("\nSumando cada elemento de la mariz: "+sumaEma(a,n,m,1,m,n));
		
	}

}
