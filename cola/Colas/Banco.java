package Colas;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		int nc,i; cliente c;
		CSCircular b=new CSCircular(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de clientes:");
		nc=lee.nextInt();
		//llenando los clientes
		for(i=1;i<=nc;i++)
		{
			c=new cliente();
			c.leer();
			b.adicionar((Object)c);
		}
		//mostrando los clientes
		for(i=1;i<=nc;i++)
		{
			c=(cliente)b.eliminar();
			c.mostrar();
			b.adicionar((Object)c);
		}
		
		System.out.println("\n--------------------------------------------------------");
		//a)
		float max=0;
		for(i=1;i<=nc;i++)
		{
			c=(cliente)b.eliminar();
			if((c.getTransaccion()).compareTo("r")==0)
			{
				if(c.getImporte()>max)
				{
					max=c.getImporte();
				}
			}
			b.adicionar((Object)c);
		}
		for(i=1;i<=nc;i++)
		{
			c=(cliente)b.eliminar();
			if((c.getTransaccion()).compareTo("r")==0)
			{
				if(c.getImporte()==max)
				{
					System.out.println("a) CLIENTE(S) QUE HA(N) RETIRADO MAS DINERO: ");
					c.mostrar();
				}
			}
			b.adicionar((Object)c);
		}
		
		System.out.println("\n--------------------------------------------------------");
		//b)
		System.out.println("\nb) ¿CUANTOS CLIENTES ATENDIO EL CAJERO? ");
		System.out.println("\nEl cajero atendio "+nc+" clientes");
		
		System.out.println("\n--------------------------------------------------------");
		//c)
		String car; int con=0;
		System.out.println("\nIngrese el carnet del cliente que desea buscar:");
		car=lee.next();
		for(i=1;i<=nc;i++)
		{
			c=(cliente)b.eliminar();
			if((c.getCarnet()).compareTo(car)==0)
			{
				con++;
			}
			b.adicionar((Object)c);
		}
		System.out.println("\nc) EL CLIENTE CON CARNET "+car+" FUE ATENDIDO "+con+" VECES.");
		
		System.out.println("\n--------------------------------------------------------");
		//d)
		float impr=0,impd=0;
		for(i=1;i<=nc;i++)
		{
			c=(cliente)b.eliminar();
			if((c.getTransaccion()).compareTo("d")==0)
			{
				impd=impd+c.getImporte();
			}
			if((c.getTransaccion()).compareTo("r")==0)
			{
				impr=impr+c.getImporte();
			}
			b.adicionar((Object)c);
		}
		System.out.println("\nd)");
		System.out.println("\nIMPORTE TOTAL DE DEPOSITOS: "+impd);
		System.out.println("\nIMPORTE TOTAL DE RETIROS: "+impr);
		
		System.out.println("\n--------------------------------------------------------");
		//e)
		con=0;
		for(i=1;i<=nc;i++)
		{
			c=(cliente)b.eliminar();
			if((c.getTransaccion()).compareTo("c")==0)
			{
				con++;
			}
			b.adicionar((Object)c);
		}
		System.out.println("e) SOLO "+con+" CLIENTES REALIZARON CONSULTA");
	}

}
