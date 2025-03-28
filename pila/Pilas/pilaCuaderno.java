package Pilas;

import java.util.Scanner;

public class pilaCuaderno {

	public static void main(String[] args) {
		int nc,i,cc,z;
		Cuaderno c;
		float max,p,tp;
		Pila q=new Pila(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de cuadernos");
		nc=lee.nextInt();
		for(i=1;i<=nc;i++)
		{
			Cuaderno cua=new Cuaderno();
			cua.leer();
			q.adicionar(cua);
		}
		q.mostrarCua();
		max=0; Pila qx=new Pila(100);tp=0;
		for(i=1;i<=nc;i++)
		{
			c=(Cuaderno)q.eliminar();
			p=c.getPre();tp=tp+p;
			if(p>max)max=p;
			qx.adicionar((Object)c);
		}
		//c)
		System.out.println("Precio promedio"+tp/nc);
		//a)
		System.out.println("\nMarca de los mas caros");
		while(!qx.esVacia())
		{
			c=(Cuaderno)qx.eliminar();
			if(c.getPre()==max)
			{
				System.out.println("Marca: "+c.getMar());
				q.adicionar((Object)c);
			}
		}
		//b
		System.out.println("Ingrese nro de hojas a procesar..");
		z=lee.nextInt();
		cc=0;
		while(!q.esVacia())
		{
			c=(Cuaderno)q.eliminar();
			qx.adicionar((Object)c);
			if(z==c.getNh()) {cc++;c.mostrar();}
		}
		while(!qx.esVacia())
		{
			q.adicionar(qx.eliminar());
		}
	}

}
