package ExamenSimulacro1;

import java.util.Scanner;

public class Dispensador {
	private String producto;
	private CSCircular cve;
	public String getProducto() {
		return producto;
	}
	public CSCircular getCve() {
		return cve;
	}
	void leer()
	{	Vehiculo ve; int i,nv,maxv;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el producto:");
		producto=lee.next();
		System.out.println("Maximo de vehiculos:");
		maxv=lee.nextInt();
		cve=new CSCircular(maxv);
		System.out.println("Ingrese la cantidad de vehiculos:");
		nv=lee.nextInt();
		for(i=1;i<=nv;i++)
		{
			ve=new Vehiculo();
			ve.leer();
			cve.adicionar((Object)ve);
		}
	}
	/*void mostrar()
	{
		
	}*/
}
