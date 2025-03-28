package ej3ExamenDeLiberacionAux;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		int cp,i;
		Platillo pla;
		LDCircular p=new LDCircular();
		Restaurant x=new Restaurant(8);
		Scanner lee=new Scanner(System.in);
		System.out.println("Cantidad de meses");
		cp=lee.nextInt();
		for(i=1;i<=cp;i++)
		{
			x.CreaPedido(i);
		}
		x.mostrar();
		System.out.println("Ingrese la cantidad de platillos: ");
		cp=lee.nextInt();
		for(i=1;i<=cp;i++)
		{
			pla=new Platillo();
			pla.leer();
			p.adiPrimero((Object)pla);
		}
		String m;
		System.out.println("\n---------------------------------------------------");
		/*System.out.println("\nINGRESE EL MES QUE DESEA BUSCAR: ");
		m=lee.next();*/
		//A)
		//x.platilloMasVnedido(m);
		
		System.out.println("\n---------------------------------------------------");
		//B)
		x.promedio();
		
		
		
		
		
		
		
		
	/*	System.out.println("Mostrando los platillos: ");
		for(i=1;i<=cp;i++)
		{

			pla=(Platillo) p.eliFin();
			pla.mostrar();
			p.adiPrimero((Object)pla);
		}*/
	}
}
