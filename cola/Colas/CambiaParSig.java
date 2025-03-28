package Colas;

import java.util.Scanner;

public class CambiaParSig {

	public static void main(String[] args) {
		CSCircular a=new CSCircular(100);
		int sp,n,i; Object da;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingresar nro de elementos");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			da=(Object)lee.nextInt();
			a.adicionar(da);
		}
		a.mostrar();
		for(i=1;i<=n;i++)
		{
			da=a.eliminar();
			if((int)da%2==0)
			{
				sp=(int)da+2;
				a.adicionar((Object)sp);
			}
			else a.adicionar(da);
		}
		System.out.println("\nPares Incrementados");
		a.mostrar();

	}

}
