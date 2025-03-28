package PracticaPilas;

import java.util.Scanner;

public class Camisa {
	int codigo;
	String marca,tamaño,color,industria;
	float precio;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese Codigo:");
		codigo=lee.nextInt();
		System.out.println("Ingrese Marca:");
		marca=lee.next();
		System.out.println("Ingrese Tamaño:");
		tamaño=lee.next();
		System.out.println("Ingrese Color:");
		color=lee.next();
		System.out.println("Ingrese Industria:");
		industria=lee.next();
		System.out.println("Ingrese Precio");
		precio=lee.nextFloat();
	}
	void mostrar()
	{
		System.out.println("Codigo: "+codigo);
		System.out.println("Marca: "+marca);
		System.out.println("Tamaño: "+tamaño);
		System.out.println("Color: "+color);
		System.out.println("Industria: "+industria);
		System.out.println("Precio: "+precio);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getIndustria() {
		return industria;
	}
	public void setIndustria(String industria) {
		this.industria = industria;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
