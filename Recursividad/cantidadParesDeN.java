package Recursividad;

import java.util.Scanner;

public class cantidadParesDeN {

	static int cantiPares(int n)
	{
		if(n==0) return 0;
		else
		{
			if((n%10)%2==0) return(1+cantiPares(n/10));
			else
			{
				return(0+cantiPares(n/10));
			}
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el numero:");
		n=lee.nextInt();
		System.out.println("contando pares de un numero: "+cantiPares(n));
	}

}
