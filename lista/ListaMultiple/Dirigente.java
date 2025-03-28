package ListaMultiple;

import java.util.Scanner; 

public class Dirigente { 
	private String nom,cargo; 
	public String getNom() { 
		return nom; 
	}
	public void setNom(String nom) { 
		this.nom = nom; 
	} 
	public String getCargo() { 
		return cargo; 
	} 
	public void setCargo(String cargo) { 
		this.cargo = cargo; 
	} 
	void leer() 
	{ 
		Scanner lee=new Scanner(System.in); 
		System.out.println("Nombre: ");nom=(lee.next()).toUpperCase(); 
		System.out.println("Cargo: ");cargo=(lee.next()).toUpperCase(); 
	} 
	void lee2() 
	{ 
		Scanner lee=new Scanner(System.in); 
		System.out.println("Cargo: ");cargo=(lee.next()).toUpperCase(); 
	} 
	void mostrar() 
	{ 
		System.out.println(nom+" "+ cargo); 
	} 
} 
