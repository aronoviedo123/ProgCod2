package Colas;

import java.util.Scanner;

public class CambiarMaxMin {
	public static void main(String[] args) {
		int na,nb,i,maxa=0,minb=999,da;
		CSCircular a=new CSCircular(100);
		CSCircular b=new CSCircular(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("INGRESE LA CANTIDAD DE ELEMENTOS DE LA COLA a");
		na=lee.nextInt();
		for(i=1;i<=na;i++)
		{
			System.out.println("Ingrese el elemento "+i+" de a");
			da=lee.nextInt();
			a.adicionar((Object)da);
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("INGRESE LA CANTIDAD DE ELEMENTOS DE LA COLA b");
		nb=lee.nextInt();
		for(i=1;i<=nb;i++)
		{
			System.out.println("Ingrese el elemento "+i+" de b");
			da=lee.nextInt();
			b.adicionar((Object)da);
		}
		System.out.println("\ncola a:");
		a.mostrar();
		System.out.println("\ncola b:");
		b.mostrar();
		for(i=1;i<=na;i++)
		{
			da=(int)a.eliminar();
			if(da>maxa)
			{
				maxa=da;
			}
			a.adicionar((Object)da);
		}
		for(i=1;i<=nb;i++)
		{
			da=(int)b.eliminar();
			if(da<minb)
			{
				minb=da;
			}
			b.adicionar((Object)da);
		}
		
		System.out.println("\nmaximo de a: "+maxa);
		System.out.println("\nminimo de b: "+minb);
		for(i=1;i<=na;i++)
		{
			da=(int)a.eliminar();
			if(da==maxa)
			{
				b.adicionar((Object)da);
			}
			else a.adicionar((Object)da);
		}
		for(i=1;i<=nb;i++)
		{
			da=(int)b.eliminar();
			if(da==minb)
			{
				a.adicionar((Object)da);
			}
			else b.adicionar((Object)da);
		}
		System.out.println("\nINTERCAMBIANDO EL MINIMO Y EL MAXIMO:");
		System.out.println("\ncola a:");
		a.mostrar();
		System.out.println("\ncola b:");
		b.mostrar();
	}
}
