package Bicola;

import java.util.Scanner;

public class Estudiante {
	String nombre,sexo;
	int edad;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el nombre:");
		nombre=lee.next();
		System.out.println("Ingrese la edad:");
		edad=lee.nextInt();
		System.out.println("Ingrese el sexo:");
		sexo=lee.next();
	}
	void mostrar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Sexo: "+sexo);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
