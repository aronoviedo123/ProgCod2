package PracticaPilas;

import java.util.Scanner;

public class PilaCamisas {

	public static void main(String[] args) {
		int n,i; Camisa ca;
		Pila a=new Pila(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de elementos");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			ca=new Camisa();
			ca.leer();
			a.adicionar((Object)ca);
		}
		//mostrando las camisas
		for(i=1;i<=n;i++)
		{
			ca=(Camisa)a.eliminar();
			System.out.println("\n++++++++++++++++++++");
			ca.mostrar();
			a.adicionar((Object)ca);
		}
		
		System.out.println("\n------------------------------------------------------------------");
		//a)
		String k,q;
		System.out.println("\nIngrese el color que desea buscar:");
		k=lee.next();
		System.out.println("\nIngrese la marca que desea buscar:");
		q=lee.next();
		for(i=1;i<=n;i++)
		{
			ca=(Camisa)a.eliminar();
			if((k.compareTo(ca.getColor())==0)&&(q.compareTo(ca.getMarca())==0))
			{
				System.out.println("\na) La camisa con el color "+k+" y la marca "+q+" es:");
				ca.mostrar();
			}
			a.adicionar((Object)ca);
		}
		
		System.out.println("\n------------------------------------------------------------------");
		//b)
		Pila aux=new Pila(100);
		String z;
		System.out.println("Ingrese el color de la camisa que desea comprar:");
		z=lee.next();
		for(i=1;i<=n;i++)
		{
			ca=(Camisa)a.eliminar();
			if((z.compareTo(ca.getColor())==0))
			{
				System.out.println("\nb) La camisa con el color "+z+" se ha vendido");
			}
			else aux.adicionar((Object)ca);
			a.adicionar((Object)ca);
		}
		System.out.println("\nCamisas que sobraron:");
		for(i=1;i<=n;i++)
		{
			ca=(Camisa)aux.eliminar();
			System.out.println("\n++++++++++++++++++++");
			ca.mostrar();
		}
		
		System.out.println("\n------------------------------------------------------------------");
		//c)
		float s=0;
		System.out.println("Ingrese el color de las camisas que desea ver el monto de inversion");
		k=lee.next();
		for(i=1;i<=n;i++)
		{
			ca=(Camisa)a.eliminar();
			if(k.compareTo(ca.getColor())==0)
			{
				s=s+ca.getPrecio();
			}
			a.adicionar((Object)ca);
		}
		System.out.println("\nc) Monto de inversion: "+s);
		
		System.out.println("\n------------------------------------------------------------------");
		//d)
		System.out.println("\nc)");
		float max=0,con=0;
		for(i=1;i<=n;i++)
		{
			ca=(Camisa)a.eliminar();
			if(ca.getPrecio()>max)
			{
				max=ca.getPrecio();
			}
			a.adicionar((Object)ca);
		}
		for(i=1;i<=n;i++)
		{
			ca=(Camisa)a.eliminar();
			if(ca.getPrecio()==max)
			{
				con++;
				System.out.println("\nIndustria: "+ca.getIndustria());
				System.out.println("\nTamaño: "+ca.getTamaño());
			}
			a.adicionar((Object)ca);
		}
		System.out.println("\nel numero de camisas mas caras con la industria y tamaño anteriores son: "+con);
	}

}
