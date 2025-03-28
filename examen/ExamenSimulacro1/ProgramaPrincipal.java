package ExamenSimulacro1;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		int cp,i;
		EServicio x=new EServicio(8);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de productos");
		cp=lee.nextInt();
		for(i=1;i<=cp;i++)
		{
			x.CreaDispensador(i);
		}
		x.mostrar();
		
		//a)
		System.out.println("\n----------------------------------------------------------------------");
		x.TotalVendido();
		
		//b
		System.out.println("\n----------------------------------------------------------------------");
		String placa;
		System.out.println("\nIngrese la placa que desea buscar:");
		placa=lee.next();
		x.proPla(placa);
		
		//i)
		String prod;
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("\n¿Que producto desea buscar?:");
		prod=lee.next();
		x.VehiCargoMas(prod);
		
		//ii)
		System.out.println("\n----------------------------------------------------------------------");
		x.atendioMasVehi();
	}
}
