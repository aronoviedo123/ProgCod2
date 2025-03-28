package PracticaColas;

import java.util.Scanner;

public class ProductoPolinomio {

	public static void main(String[] args) {
		int n,i,co,ex,c=0,e=0;
		CSCircular a=new CSCircular(100);
		CSCircular b=new CSCircular(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de elementos:");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Ingrese el valor del coeficiente "+i+":");
			co=lee.nextInt();
			a.adicionar((Object)co);
			System.out.println("Ingrese el valor del exponente "+i+":");
			ex=lee.nextInt();
			b.adicionar((Object)ex);
		}
		System.out.println("\nEL PRODUCTO DE LOS POLINOMIOS ES:");
		//mostrando el polinomio:
		for(i=1;i<=n;i++)
		{
			c=(int)a.eliminar();
			e=(int)b.eliminar();
			if(i!=n)
			{
				System.out.print(c+"^"+e+" * ");
			}
			a.adicionar((Object)c);
			b.adicionar((Object)e);
		}
		System.out.print(c+"^"+e+" = ");
		//realizando el producto
		int p=1;
		for(i=1;i<=n;i++)
		{
			c=(int)a.eliminar();
			e=(int)b.eliminar();
			p=(int) (p*Math.pow(c, e));
			a.adicionar((Object)c);
			b.adicionar((Object)e);
		}
		System.out.println(p);
	}

}
