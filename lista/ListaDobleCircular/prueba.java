package ListaDobleCircular;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		int n,i,da;
		LDCircular a=new LDCircular();
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de elementos:");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Ingrese el dato nro "+i+":");
			da=lee.nextInt();
			a.adiFin((Object)da);
		}
		a.mostrar();
		System.out.println("\nAdicionando al principio y al final");
		a.adiFin(45);
		a.adiPrimero(88);
		a.mostrar();
		System.out.println("\nnro de elementos: "+a.nElem());
		System.out.println("\nEliminando el ultimo elemento");
		a.eliFin();
		a.mostrar();
		System.out.println("\nEliminando el primer elemento");
		a.eliPrimero();
		a.mostrar();
	}

}
