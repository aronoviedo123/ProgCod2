package PracticaListaSimple;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		int na,nb,i,da;
		LSCircular a=new LSCircular();
		LSCircular b=new LSCircular();
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elementos de la cola A:");
		na=lee.nextInt();
		for(i=1;i<=na;i++)
		{
			System.out.println("Ingrese el elemento nro "+i+":");
			da=lee.nextInt();
			a.adiFin((Object)da);
		}
		System.out.println("\nCola A:");
		a.mostrar();
		/*System.out.println("Ingrese la cantidad de elementos de la cola B:");
		nb=lee.nextInt();
		for(i=1;i<=nb;i++)
		{
			System.out.println("Ingrese el elemento nro "+i+":");
			da=lee.nextInt();
			b.adiFin((Object)da);
		}
		System.out.println("\nCola B:");
		b.mostrar();*/
		
		//ordenando 
	}

}
