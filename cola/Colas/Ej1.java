package Colas;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		CSNormal x=new CSNormal(100);
		int i,n,z; Object da;
		Scanner lee=new Scanner(System.in);
		System.out.println("INGRESE NRO DE ELEMENTOS");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("ingrese el elemento: "+i);
			da=lee.nextInt();
			x.adicionar(da);
			
		}
		x.mostrar();
		System.out.println("\nINGRESE EL VALOR DE Z");
		z=lee.nextInt();
		CSNormal ax=new CSNormal(100);
		int dat;
		while(!x.esVacia())
		{
			dat=(int)x.eliminar();
			if(dat==z)
			{
				ax.adicionar(dat);
				//ax.adicionar(z);
			}
			
			ax.adicionar(dat);
		}
		System.out.println("\nDatos iguales a z duplicados: ");
		ax.mostrar();
	}

}
