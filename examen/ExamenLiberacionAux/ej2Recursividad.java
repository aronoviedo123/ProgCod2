package ExamenLiberacionAux;

import java.util.Scanner;

public class ej2Recursividad {

	static int sumaPar(int n)
	{	int dig=n%10;
		if(n!=0)
		{
			if(dig%2==0)
			{
				return(dig+(sumaPar(n/10)));
			}
			else
			{
				return sumaPar(n/10);
			}
			
		}
		else return 0;
	}
	static int contarPar(int n)
	{
		int dig=n%10;
		if(n!=0)
		{
			if(dig%2==0)
			{
				//dig=1;
				return(1+contarPar(n/10));
			}
			else
			{
				return contarPar(n/10);
			}
		}
		else return 0;
	}
	static int promedioPar(int n, int p, int c)
	{
		int dig=n%10;
		if(n!=0)
		{
			if(dig%2==0)
			{
				return(promedioPar(n/10,p+dig,c+1));
			}
			else
			{
				return(promedioPar(n/10,p,c));
			}
		}
		else return p/c;
	}
	public static void main(String[] args) {
		int n;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el numero:");
		n=lee.nextInt();
		System.out.println("Suma de pares: "+sumaPar(n));
		System.out.println("Conteo de pares: "+contarPar(n));
		System.out.println("Promedio de la suma de digitos pares es: "+(sumaPar(n)/contarPar(n)));
		System.out.println("\nPROMEDIO SACADO CON UN SOLO METODO: "+promedioPar(n,0,0));
	}

}
