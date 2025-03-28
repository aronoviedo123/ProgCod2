package PilaMulZoologico;

import java.util.Scanner;

public class animal {
	int codigo,edad,peso;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el codigo:");
		codigo=lee.nextInt();
		System.out.println("Ingrese la edad:");
		edad=lee.nextInt();
		System.out.println("Ingrese el peso:");
		peso=lee.nextInt();
	}
	void mostrar()
	{
		System.out.println("Codigo: "+codigo);
		System.out.println("Edad: "+edad);
		System.out.println("Peso: "+peso);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
