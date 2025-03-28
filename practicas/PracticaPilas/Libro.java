package PracticaPilas;

import java.util.Scanner;

public class Libro {
	String codigo,titulo,autor;
	float precio;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el codigo:");
		codigo=lee.next();
		System.out.println("Ingrese el titulo");
		titulo=lee.next();
		System.out.println("Ingrese el autor");
		autor=lee.next();
		System.out.println("Ingrese el precio");
		precio=lee.nextFloat();
	}
	void mostrar()
	{
		System.out.println("Codigo: "+codigo);
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Precio: "+precio);
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
