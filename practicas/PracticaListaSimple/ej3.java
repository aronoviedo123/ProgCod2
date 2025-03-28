package PracticaListaSimple;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		int na,nb,i,da;
		LSNormal a=new LSNormal();
		LSNormal b=new LSNormal();
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elementos de la cola A:");
		na=lee.nextInt();
		for(i=1;i<=na;i++)
		{
			System.out.println("Ingrese el elemento nro "+i+":");
			da=lee.nextInt();
			a.adiFin((Object)da);
		}
		System.out.println("\nIngrese la cantidad de elementos de la cola B:");
		nb=lee.nextInt();
		for(i=1;i<=nb;i++)
		{
			System.out.println("Ingrese el elemento nro "+i+":");
			da=lee.nextInt();
			b.adiFin((Object)da);
		}
		System.out.println("\nCola A:");
		a.mostrar();
		System.out.println("\nCola B:");
		b.mostrar();
		
		//proceso del ejercicio
		System.out.println("\nInciso a) LIBRE:");
		for(i=1;i<=na;i++)
		{
			da=(int)a.eliFin();
			if(da%2==0)
			{
				b.adiPrimero((Object)da);
			}
			else
			{
				a.adiPrimero((Object)da);
			}
		}
		for(i=1;i<=nb;i++)
		{
			da=(int)b.eliFin();
			if(da%2==1)
			{
				a.adiPrimero((Object)da);
			}
			else
			{
				b.adiPrimero((Object)da);
			}
		}
		System.out.println("\nLista de pares:");
		b.mostrar();
		System.out.println("\nLista de impares:");
		a.mostrar();

	}

}
