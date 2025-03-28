package ConjuntoColas;

import java.util.Scanner;

public class CajasBanco {

	public static void main(String[] args) {
		int ncli,cap,nca,i,k; Object ec;
		CCCircular y=new CCCircular(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de cajas");
		nca=lee.nextInt();
		for(i=2;i<=nca;i++)
		{
			System.out.println("Capacidad cola "+i);
			cap=lee.nextInt();
			y.crearCSCircular(i, cap);
			System.out.println("¿Nro de clientes?:");
			ncli=lee.nextInt();
			for(k=1;k<=ncli;k++)
			{
				ec=new Integer(lee.nextInt());
				y.adicionar(i, ec);
			}
		}
		y.crearCSCircular(1, 100);
		//y.mostrar();
		//a)trasladar a los mayores a la caja 1
		int nei,z,ei; Object e;
		for(i=2;i<=nca;i++)
		{
			nei=y.nElem(i);
			for(z=1;z<=nei;z++)
			{
				e=y.eliminar(i);
				ei=e.hashCode();
				if(ei>=60)
				{
					y.adicionar(1, e);
				}
				else
				{
					y.adicionar(i, e);
				}
			}
		}
		y.mostrar();
		
		//b) nro de clientes que atendio la cola i-esima
		
		do {
			System.out.println("\nIngrese cola a procesar");
			i=lee.nextInt();
		}while((i<1)||(i>nca));
		System.out.println("\nla caja "+i+" atendio "+y.nElem(i)+" cliente(s)");
		
		//c) caja que atendio mas clientes
		int max=0,nc,ncaja = 0;
		for(i=1;i<=nca;i++)
		{
			nc=y.nElem(i);
			if(nc>max)
			{
				max=nc;
				ncaja=i;
			}
		}
		System.out.print("\nCaja que atendio a mas clientes "+ncaja);
		
		//d) promedio de las edades de los clientes
		int se=0;
		for(i=1;i<=nca;i++)
		{
			nc=y.nElem(i);
			for(k=1;k<=nc;k++)
			{
				e=y.eliminar(i);
				ei=e.hashCode();
				se=se+ei;
				y.adicionar(i, e);
			}
		}
		System.out.println("\nTotal de elementos: "+y.nElem());
		System.out.println("\nPromedio de edades "+se/y.nElem());
	}

}
