package ArbolBinarioDeBusqueda;

import java.util.Scanner;

public class ej1b {

	public static void main(String[] args) {
		//Dado un ABB
		//a) mostrar la profundidad del arbol
		//b) mostrar el subarbol que se desprende a partir del dato z (z se ingresa por teclado)
		ABB a=new ABB();
		Scanner lee=new Scanner(System.in);
		a.leer();
		a.m_Nivel();
		NodoAr x,xi,xd;
		int z,i=0,sw=0;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		Pila sux=new Pila(100);
		System.out.println("\nIngrese el valor de z:");
		z=lee.nextInt();
		x=a.getRaiz();
		ni.adicionar((Object)x);
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				xi=x.getSi();
				xd=x.getSd();
				if((int)x.getDato()==z)
				{
					a.setRaiz(x);
				}
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);	
			}
			i++;
			ni.vaciar(su);
		}
		System.out.println("\na)La Profundidad del arbol es: "+i);
		System.out.println("\nb) el sub arbol que se desprende del dato "+z+" es:");
		a.m_Nivel();

	}

}
