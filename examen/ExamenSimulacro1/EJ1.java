package ExamenSimulacro1;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		int n1,n2,i,da;
		CSCircular a=new CSCircular(100);
		CSCircular b=new CSCircular(100);
		Pila k=new Pila(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elementos de la cola A:");
		n1=lee.nextInt();
		for(i=1;i<=n1;i++)
		{
			System.out.println("Ingrese el elemento nro "+i+" de la cola A:");
			da=lee.nextInt();
			a.adicionar((Object)da);
		}
		System.out.println("Ingrese la cantidad de elementos de la cola B");
		n2=lee.nextInt();
		for(i=1;i<=n2;i++)
		{
			System.out.println("Ingrese el elemento nro "+i+" de la cola B:");
			da=lee.nextInt();
			b.adicionar((Object)da);
		}
		System.out.println("\nCOLA A:");
		a.mostrar();
		System.out.println("\nCOLA B:");
		b.mostrar();
		
		//desarrollo del ejercicio
		Object pa=null,pb=null;
		//while((!a.esVacia())||(!b.esVacia()))
		for(i=1;i<=(n1+n2/2);i++)
		{
			if(i%2==0)
			{
				if(!b.esVacia())
				{
					pa=b.eliminar();
					pb=b.eliminar();
					k.adicionar(pa);
					k.adicionar(pb);
				}
			}
			else
			{
				if(!a.esVacia())
				{
					pa=a.eliminar();
					pb=a.eliminar();
					k.adicionar(pa);
					k.adicionar(pb);
				}
			}
		}
		System.out.println("\nRESULTADO:");
		k.mostrar();
	}

}
