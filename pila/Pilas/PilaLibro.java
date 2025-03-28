package Pilas;

import java.util.Scanner;

public class PilaLibro {

	public static void main(String[] args) {
		int nl,i;
		String a;
		Pila z=new Pila(100);
		Pila zx=new Pila(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nro de libros");
		nl=lee.nextInt();
		for(i=1;i<=nl;i++)
		{
			Libro li=new Libro();
			li.leer();
			z.adicionar(li);
		}
		//b)
		int vt=0;	Libro li;
		while(!z.esVacia())
		{
			li=(Libro)z.eliminar();
			vt=(int) (vt+li.getPrecio());
			zx.adicionar(li);
		}
		System.out.println("Valor total de libros: "+vt);
		//a)
		System.out.println("");
		a=lee.next();
		int c=0;
		while(!zx.esVacia())
		{
			li=(Libro)zx.eliminar();
			if(li.getAutor().compareTo(a)==0)
			{
				c=c+1;
				li.mostrar();
			}
			z.adicionar(li);
		}
		z.mostrarLi();

	}

}
