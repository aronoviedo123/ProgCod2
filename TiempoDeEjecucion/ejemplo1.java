package TiempoDeEjecucion;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		//tiempo de ejecucion en nanosegundos
		int s,i,da,n; long ti,tf;
		Scanner lee=new Scanner(System.in);
		ti=System.nanoTime();
		System.out.println("Ingrese la cantidad de datos:");
		n=lee.nextInt();
		s=0;
		for(i=1;i<=n;i++)
		{  da=lee.nextInt();
		   s=s+da;
		}
		System.out.println("\nSuma: "+s);
		tf=System.nanoTime();
		System.out.println("\nTiempo de ejecucion: "+(tf-ti));
	}

}
