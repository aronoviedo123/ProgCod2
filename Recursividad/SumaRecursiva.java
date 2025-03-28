package Recursividad;

import java.util.Scanner;

public class SumaRecursiva {

	public static void main(String[] args) {
		int n;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el valor que quiere que se efectue la suma");
		n=lee.nextInt();
		System.out.println("La suma de los primeros numeros naturales hasta "+n+" es: "+suma(n));
		
	}
	private static int suma(int n)
	{
		if(n==0) return 0;
		else
		{
			return(suma(n-1)+n);
		}
	}
}
