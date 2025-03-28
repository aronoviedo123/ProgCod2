package Colas;

import java.util.Scanner;

public class EliDatMinEle {

	public static void main(String[] args) {
		CSCircular a=new CSCircular(100);
		CSCircular ax=new CSCircular(100);
		int n,i; Object da;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingresar nro de elementos");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Ingrese el elemento nro: "+i);
			da=(Object)lee.nextInt();
			a.adicionar(da);
		}
		a.mostrar();
		int dat,min=999,sw=0,data = 0;
		System.out.println("\nELIMINANDO LOS DATOS QUE RODEAN AL MENOR ELEMENTO:");
		for(i=1;i<=n;i++)
		{
			dat=(int)a.eliminar();
			if(dat<min)
			{
				min=dat;
			}
			a.adicionar((Object)dat);
		}
		for(i=1;i<=n-1;i++)
		{
			dat=(int)a.eliminar();
			if(dat==min)
			{
				sw=1;
				a.adicionar((Object)dat);
				a.eliminar();
			}
			else
			{
				a.adicionar((Object)dat);
				if(sw==0)
				{
					ax.adicionar((Object)dat);
				}	
			}
		}
		//encontrando el dato anterior al minimo
		while(!ax.esVacia())
		{
			data=(int)ax.eliminar();
		}
		//eliminando el dato anterior al minimo
		for(i=1;i<=n-1;i++)
		{
			dat=(int)a.eliminar();
			if(dat==data)
			{
				
			}
			else a.adicionar((Object)dat);
		}
		a.mostrar();
	}

}
