package Recursividad;

import java.util.Scanner;

public class SumaPrimos {
	static int sumaPrimo(int n)
	{
		int num=2,c=0,s=0;
		if(n==0) return 0;
		else
		{
			if(c<n)
			{
				if(esPrimo(num))
				{
					s=s+num;
					c++;
				}
			}
			num++;
			sumaPrimo(n-1);
		}
		return s;
	}
	static boolean esPrimo(int num) {
		int c=0;
		if(c>2) return false;
		else
		{
			if((num-1)%2==0)
			{
				c++;
			}
			return(esPrimo(num-1));
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de primos que desea sumar:");
		n=lee.nextInt();
		if(esPrimo(n))
		{
			System.out.println("si es");
		}
		else
		{
			System.out.println("no es");
		}
		//System.out.println("la suma de "+n+" primos es: "+sumaPrimo(n));
	}

}
