package PilaMultiple;

import java.util.Scanner;

public class PilasEnteros {

	public static void main(String[] args) {
		int n,nei,i,ci,k; Object dato;
		PilaMul z=new PilaMul(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de pilas");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Ingrese capacidad pila "+i);
			ci=lee.nextInt();
			z.creaPila(i, ci);
			System.out.println("Ingrese nro elementos pila"+i);
			nei=lee.nextInt();
			for(k=1;k<=nei;k++)
			{
				dato=(Object)lee.nextInt();
				//dato=new Integer(lee.nextInt());
				z.adicionar(i, dato);
			}
		}
		z.mostrar();
		System.out.println("\n--------------EJERCICIOS:--------------");
		int x,sw=0,j=1;
		System.out.println("ingrese el valor de x:");
		x=lee.nextInt();
		int da;
		while((j<=n)&&(sw==0))
		{
			Pila aux=new Pila(z.getMax(j));
			while((sw==0)&&(!z.esVacia(j)))
			{
				da=(int)z.eliminar(j);
				if(da==x) sw=1;
				aux.adicionar((Object)da);
			}
			while(!aux.esVacia())
			{
				z.adicionar(j, aux.eliminar());
			}
			if(sw==1)
			{
				z.mostrar(j);
			}
			j=j+1;
			sw=0;
		}
	}
}
