package Pilas;

import java.util.Scanner;

//import java.util.Stack;
public class PilaLibroStack {

	public static void main(String[] args) {
		//ojo no se pudo usar stack
		//Stack<Libro> z=new Stack<Libro>();
		int n,i; Libro li;
		Pila z=new Pila(100);
		Pila zx=new Pila(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de libros");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			li=new Libro();
			li.leer();
			z.adicionar((Object)li);
		}
		z.mostrarLi();
		
		//valor de libros
		float vt=0;
		while(!z.esVacia())
		{
			li=(Libro)z.eliminar();
			vt=vt+li.getPrecio();
			zx.adicionar((Object)li);
		}
		System.out.println("Valor total de libros: "+vt);
		
		//contar libros de autores
		String a;
		System.out.println("\nIngrese autor: ");
		a=lee.next();
		//a="a";
		int c=0;
		while(!zx.esVacia())
		{
			li=(Libro)zx.eliminar();
			if(a.equals(li.getAutor()))
			{
				c=c+1;
				li.mostrar();
			}
			z.adicionar((Object)li);
		}
		if(c==1) System.out.println("El autor: "+a+" tiene "+c+" libro");
		else System.out.println("El autor: "+a+" tiene "+c+" libros");
		
		
		System.out.println("--------------------------------------------------");
		//mostrar los libros mas caros
		
		float maxpre=0;
		while(!z.esVacia())
		{
			li=(Libro)z.eliminar();
			if(li.getPrecio()>maxpre)
			{
				maxpre=li.getPrecio();
			}
			zx.adicionar((Object)li);
		}
		while(!zx.esVacia())
		{
			li=(Libro)zx.eliminar();
			if(li.getPrecio()==maxpre)
			{
				System.out.println("\nEL LIBRO MAS CARO ES: ");
				li.mostrar();
			}
			z.adicionar((Object)li);
		}
		
		//eliminar el libro mas barato
		float minpre=99999999;
		
		System.out.println("\nIngrese autor que desea eliminar: ");
		a=lee.next();
		
		while(!z.esVacia())
		{
			li=(Libro)z.eliminar();
			if((li.getPrecio()<minpre)&&(a.equals(li.getAutor())))
			{
				minpre=li.getPrecio();
			}
			zx.adicionar((Object)li);
		}
		while(!zx.esVacia())
		{
			li=(Libro)zx.eliminar();
			if((li.getPrecio()==minpre)&&(a.equals(li.getAutor())))
			{
				
			}
			else z.adicionar((Object)li);
		}
		System.out.println("\nELIMINANDO EL LIBRO MAS BARATO DEL AUTOR: "+a);
		z.mostrarLi();
	}
	

}
