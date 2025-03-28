package Colas;

import java.util.Scanner;

public class PruebaCSNormal {

	public static void main(String[] args) {
		// DADA UNA COLA SIMPLE NORMAL QUE CONTIEN ENTEROS CAMBIAR EL MAXIMO POR SU SIGUIENTE VALOR INMEDIATO
		CSNormal x=new CSNormal(100);
		int i,n; Object da;
		Scanner lee=new Scanner(System.in);
		System.out.println("ingrese nro de elementos");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			da=new Integer(lee.nextInt());
			x.adicionar(da);
			
		}
		x.mostrar();Object max; int maxi,dai;
		CSNormal ax=new CSNormal(100);
		max=x.eliminar();maxi=max.hashCode();
		ax.adicionar(max);
		while(!x.esVacia())
		{
			da=x.eliminar();
			ax.adicionar(da);
			dai=da.hashCode();
			if(dai>maxi) 
			{
				maxi=dai;max=da;
			}
		}
		while(!ax.esVacia())
		{
			da=ax.eliminar();
			dai=da.hashCode();
			if(da.equals(max))
			{
				dai=dai+1;
				da=new Integer(dai);
				x.adicionar(da);
			}
			else x.adicionar(da);
		}
		System.out.println("\nincrementando los mayores");
		x.mostrar();
	}

}
