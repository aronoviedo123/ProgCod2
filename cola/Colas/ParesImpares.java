package Colas;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		CSCircular H=new CSCircular(100);
		CSCircular HX=new CSCircular(100);
		int sp,n,i; Object da;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingresar nro de elementos");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			da=(Object)lee.nextInt();
			H.adicionar(da);
		}
		H.mostrar();
		for(i=1;i<=n;i++)
		{
			da=H.eliminar();
			if((int)da%2==0) H.adicionar(da);
			else HX.adicionar(da);
		}
		H.vaciar(HX);
		System.out.println("\nPrimero pares luego impares");
		H.mostrar();
	}

}
