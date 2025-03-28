package Bicola;

import java.util.Scanner;

public class Pruebabiola {

	public static void main(String[] args) {
		int n,i,nc; Estudiante est;
		Bicola a=new Bicola(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de elementos:");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			est=new Estudiante();
			System.out.println("ingrese el elemento "+i+":");
			est.leer();
			System.out.println("\n¿A que cola desea adicionar 1 o 2?: ");
			nc=lee.nextInt();
			a.adicionar(nc, est);
		}
		a.mostrar();
	}
}
