package ej3ExamenDeLiberacionAux;

import java.util.Scanner;

public class Platillo {
	int idplatillo,canti,precio;
	Ingrediente ing;
	String nombre;
	Pila ingredientes=new Pila(100);
	Pila aux=new Pila(100);
	void leer()
	{	int i;
		Object dato;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el id Platillo:");
		idplatillo=lee.nextInt();
		System.out.println("Ingrese el nombre del platillo:");
		nombre=lee.next();
		System.out.println("Ingrese la cantidad de ingredientes:");
		canti=lee.nextInt();
		for(i=1;i<=canti;i++)
		{
			System.out.println("Ingrese el ingrediente nro "+i+":");
			ing=new Ingrediente();
			ing.leer();
			ingredientes.adicionar((Object)ing);
		}
		System.out.println("Ingrese el precio:");
		precio=lee.nextInt();
	}
	void mostrar()
	{	int i;
		System.out.println("ID PLATILLO: "+idplatillo);
		System.out.println("NOMBRE DEL PLATILLO: "+nombre);
		System.out.println("INGREDIENTES: ");
		
		for(i=1;i<=canti;i++)
		{
			ing=(Ingrediente)ingredientes.eliminar();
			System.out.println("Ingrediente nro "+i+":");
			ing.mostrar();
			aux.adicionar((Object)ing);
		}
		aux.vaciar(ingredientes);
		System.out.println("PRECIO: "+precio);
	}
	public int getIdplatillo() {
		return idplatillo;
	}
	public void setIdplatillo(int idplatillo) {
		this.idplatillo = idplatillo;
	}
	public int getCanti() {
		return canti;
	}
	public void setCanti(int canti) {
		this.canti = canti;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Ingrediente getIng() {
		return ing;
	}
	public void setIng(Ingrediente ing) {
		this.ing = ing;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pila getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(Pila ingredientes) {
		this.ingredientes = ingredientes;
	}
	public Pila getAux() {
		return aux;
	}
	public void setAux(Pila aux) {
		this.aux = aux;
	}
	
}
