package Pilas;

import java.util.Scanner;

public class PraticaNro2 {

	public static void main(String[] args) {
		int n,i,dat,min=99,min2=99;
		Pila a=new Pila(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elementos de la pila");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Ingrese el elemento "+i);
			dat=lee.nextInt();
			a.adicionar(dat);
		}
		System.out.println("\n---------------------------");
		a.mostrar();
		//eliminando los dos elementos mas pequeños
		int da;
		Pila aux=new Pila(100);
		for(i=1;i<=n;i++)
		{
			da=(int)a.eliminar();
			if(da<min)
			{
				min=da;
			}
			else aux.adicionar(da);
		}
		/*for(i=1;i<=n-1;i++)
		{
			da=(int)a.eliminar();
			if(da<min2)
			{
				min=da;
			}
			else aux.adicionar(da);
		}*/
		aux.mostrar();
	}

}
