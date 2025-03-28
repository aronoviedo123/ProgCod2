package ej3ExamenDeLiberacionAux;

import java.util.Scanner;

public class Ingrediente {
	String nombre,estado;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el nombre del ingrediente: ");
		nombre=lee.next();
		System.out.println("Ingrese el estado del ingrediente:");
		estado=lee.next();
	}
	void mostrar()
	{
		System.out.println("NOMBRE: "+nombre);
		System.out.println("ESTADO: "+estado);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
