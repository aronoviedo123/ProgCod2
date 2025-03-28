package PracticaListaSimple;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		int n,i; fruta f;
		LSCircular a=new LSCircular();
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elementos:");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			f=new fruta();
			f.leer();
			a.adiFin((Object)f);
		}
		for(i=1;i<=n;i++)
		{
			f=(fruta)a.eliPrimero();
			f.mostrar();
			a.adiFin((Object)f);
		}
		
		//a) 
		System.out.println("\na) Mostrando las frutas mas caras");
		float max=0;
		for(i=1;i<=n;i++)
		{
			f=(fruta)a.eliPrimero();
			if(f.getPrecio()>max)
			{
				max=f.getPrecio();
			}
			a.adiFin((Object)f);
		}
		for(i=1;i<=n;i++)
		{
			f=(fruta)a.eliPrimero();
			if(f.getPrecio()==max)
			{
				f.mostrar();
			}
			a.adiFin((Object)f);
		}
		
		//b)
		System.out.println("\n--------------------------------------------------------");
		System.out.println("\nb) EJECUTANDO LA VENTA DE LAS FRUTAS DE MENOR PRECIO:");
		float min= Integer.MAX_VALUE;
		int cant;
		for(i=1;i<=n;i++)
		{
			f=(fruta)a.eliPrimero();
			if(f.getPrecio()<min)
			{
				min=f.getPrecio();
			}
			a.adiFin((Object)f);
		}
		for(i=1;i<=n;i++)
		{
			f=(fruta)a.eliPrimero();
			if(f.getPrecio()==min)
			{
				System.out.println("Cuanto(a) "+f.getNombre()+" desea comprar");
				cant=lee.nextInt();
				f.setCantidad((f.getCantidad())-cant);
				System.out.println("\nSe Actualizo la cantidad de "+f.getNombre());
				f.mostrar();
			}
			a.adiFin((Object)f);
		}
	}

}
