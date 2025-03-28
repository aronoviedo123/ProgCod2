package ListaMultiple;
import java.util.Scanner;
public class Jugador {
	private String ci,nom; 
	private int edad; 
	public String getCi() { 
		return ci; 
	} 
	public void setCi(String ci) { 
		this.ci = ci; 
	} 
	public String getNom() { 
		return nom; 
	} 
	public void setNom(String nom) { 
		this.nom = nom; 
	} 
	public int getEdad() { 
		return edad; 
	} 
	public void setEdad(int edad) { 
		this.edad = edad; 
	} 
	void leer() 
	{ 
		Scanner lee=new Scanner(System.in); 
		System.out.println("C.I: ");ci=lee.next(); 
		System.out.println("Nombre: "); nom=(lee.next()).toUpperCase(); 
		System.out.println("Edad:");edad=lee.nextInt(); 
	} 
	void lee2() 
	{ 
		Scanner lee=new Scanner(System.in); 
		System.out.println("Nombre: ");nom=(lee.next()).toUpperCase(); 
		System.out.println("Edad:");edad=lee.nextInt(); 
	} 
	void mostrar() 
	{ System.out.println(ci+" "+nom+" "+edad);} 
		
}
