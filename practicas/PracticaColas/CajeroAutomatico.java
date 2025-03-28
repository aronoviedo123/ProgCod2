package PracticaColas;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		int n,i; Cliente cl;
		CSCircular c=new CSCircular(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de clientes:");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			cl=new Cliente();
			System.out.println("Ingrese el cliente nro "+i+":");
			cl.leer();
			c.adicionar((Object)cl);
		}
		for(i=1;i<=n;i++)
		{
			cl=(Cliente)c.eliminar();
			System.out.println("\n-------------------------------------------");
			cl.mostrar();
			c.adicionar((Object)cl);
		}
		//a)
		int cr=0;
		float ret=0;
		for(i=1;i<=n;i++)
		{
			cl=(Cliente)c.eliminar();
			if((cl.getTransaccion()).compareTo("r")==0)
			{
				cr++;
				ret=ret+cl.getImporte();
			}
			c.adicionar((Object)cl);
		}
		System.out.println("\na) "+cr+" CLIENTES REALIZARON DEPOSITO");
		System.out.println("\n EL IMPORTE DE RETIROS ASCIENDE A: "+ret);
		
		//b)
		float may=0;
		for(i=1;i<=n;i++)
		{
			cl=(Cliente)c.eliminar();
			if((cl.getTransaccion()).compareTo("d")==0)
			{
				if(cl.getImporte()>may) 
				{
					may=cl.getImporte();
				}
			}
			
			c.adicionar((Object)cl);
		}
		for(i=1;i<=n;i++)
		{
			cl=(Cliente)c.eliminar();
			if((cl.getTransaccion()).compareTo("d")==0)
			{
				if(cl.getImporte()==may) 
				{
					System.out.println("\nb) EL CLIENTE QUE DEPOSITO MAS DINERO ES");
					cl.mostrar();
				}
			}
			c.adicionar((Object)cl);
		}
		
		//c)
		int cf=0;
		for(i=1;i<=n;i++)
		{
			cl=(Cliente)c.eliminar();
			if((cl.getGenero()).compareTo("f")==0)
			{
				cf++;
			}
			c.adicionar((Object)cl);
		}
		System.out.println("\nc) EL CAJERO ATENDIO A "+cf+" MUJERES");
		
		//d)
		String ci;
		System.out.println("\nIngrese el carnet del cliente que desea buscar:");
		ci=lee.next();
		for(i=1;i<=n;i++)
		{
			cl=(Cliente)c.eliminar();
			if((cl.getCarnet()).compareTo(ci)==0)
			{
				System.out.println("\nd) El cliente ha realizado las siguientes operaciones:");
				if((cl.getTransaccion()).compareTo("d")==0)
				{
					System.out.println("\nEL CLIENTE "+cl.getNombre()+" HA REALIZADO UN DEPOSITO DE:"+cl.getImporte());
				}
				else
				{
					System.out.println("\nEL CLIENTE "+cl.getNombre()+" HA REALIZADO UN RETIRO DE:"+cl.getImporte());
				}
			}
			c.adicionar((Object)cl);
		}
		//e)
		int se=0, cv=0;
		for(i=1;i<=n;i++)
		{
			cl=(Cliente)c.eliminar();
			if((cl.getGenero()).compareTo("f")==0)
			{
				cv++;
				se=se+cl.getEdad();
			}
			c.adicionar((Object)cl);
		}
		System.out.println("\nf) LA EDAD PROMEDIO DE LOS VARONES ES: "+(se/cv));
		
		
	}

}
