package PilaMulZoologico;

import java.util.Scanner;

public class PrincipalZoo {

	public static void main(String[] args) {
		int ca,i;
		Zoologico z=new Zoologico(10);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de animales");
		ca=lee.nextInt();
		for(i=1;i<=ca;i++)
		{
			z.CreaCuidador(i);
		}
		z.mostrar();
		
		//a)
		System.out.println("\n-------------------------------------------------");
		z.muestraMasPesado();
		//b)
		String tip;
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nIngrese el tipo de animal que quiere saber el promedio de edad:");
		tip=lee.next();
		z.promedioAnim(tip);
		//c)
		String nom;
		System.out.println("\n-------------------------------------------------");
		System.out.println("\nIngrese el nombre del cuidador que desea buscar:");
		nom=lee.next();
		z.numeroAnimalesCargo(nom);
		//d)
		System.out.println("\n-------------------------------------------------");
		z.cantAnimales();
		
		
		
	}

}
