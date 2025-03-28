package PracticaListaSimple;

import java.util.Scanner;

public class fruta {
	String nombre;
	int cantidad,codigo;
	float precio;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el codigo:");
		codigo=lee.nextInt();
		System.out.println("Ingrese el nombre:");
		nombre=lee.next();
		System.out.println("Ingrese la cantidad:");
		cantidad=lee.nextInt();
		System.out.println("Ingrese el precio:");
		precio=lee.nextFloat();
	}
	void mostrar()
	{
		System.out.println("Codigo: "+codigo);
		System.out.println("Nombre: "+nombre);
		System.out.println("Cantidad: "+cantidad);
		System.out.println("Precio: "+precio);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
