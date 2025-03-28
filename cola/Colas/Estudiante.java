package Colas;

import java.util.Scanner;

public class Estudiante {
	String ci,nom;
	int nota;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el CI");
		ci=lee.next();
		System.out.println("Ingrese el nombre:");
		nom=lee.next();
		System.out.println("Ingrese la nota");
		nota=lee.nextInt();
	}
	void mostrar()
	{
		System.out.println("C.I. "+ci);
		System.out.println("Nombre: "+nom);
		System.out.println("Nota: "+nota);
	}
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
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
