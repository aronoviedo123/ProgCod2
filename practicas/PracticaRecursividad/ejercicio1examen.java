package PracticaRecursividad;

import java.util.Scanner;

public class ejercicio1examen {

	static int sumaImpa(int n)
	{	int dig=n%10;
		if(n!=0)
		{
			if(dig%2==1)
			{
				return(dig+(sumaImpa(n/10)));
			}
			else
			{
				return sumaImpa(n/10);
			}
			
		}
		else return 0;
	}
	static int contarImp(int n)
	{
		int dig=n%10;
		if(n!=0)
		{
			if(dig%2==1)
			{
				//dig=1;
				return(1+contarImp(n/10));
			}
			else
			{
				return contarImp(n/10);
			}
		}
		else return 0;
	}
	static int promedioImp(int n, int p, int c)
	{
		int dig=n%10;
		if(n!=0)
		{
			if(dig%2==1)
			{
				return(promedioImp(n/10,p+dig,c+1));
			}
			else
			{
				return(promedioImp(n/10,p,c));
			}
		}
		else return p/c;
	}
	public static void main(String[] args) {
		int n;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el numero:");
		n=lee.nextInt();
		System.out.println("Suma de impares: "+sumaImpa(n));
		System.out.println("Conteo de impares: "+contarImp(n));
		System.out.println("Promedio de la suma de digitos impares es: "+(sumaImpa(n)/contarImp(n)));
		System.out.println("\nPROMEDIO SACADO CON UN SOLO METODO: "+promedioImp(n,0,0));
	}

}
