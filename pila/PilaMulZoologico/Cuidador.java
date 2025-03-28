package PilaMulZoologico;

import java.util.Scanner;

public class Cuidador {
	private String nombre,tipoan;
	private Pila pc;

	void leer()
	{
		animal a; int maxa,na,i; 
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el nombre de cuidador:");
		nombre=lee.next();
		System.out.println("Ingrese el tipo de animal que cuida:");
		tipoan=lee.next();
		System.out.println("Maximo de animales:");
		maxa=lee.nextInt();
		pc=new Pila(maxa);
		System.out.println("Ingrese la cantidad de "+tipoan+":");
		na=lee.nextInt();
		for(i=1;i<=na;i++)
		{
			a=new animal();
			a.leer();
			pc.adicionar((Object)a);
		}
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public Pila getPc() {
		return pc;
	}
	public String getTipoan() {
		return tipoan;
	}

	
}
