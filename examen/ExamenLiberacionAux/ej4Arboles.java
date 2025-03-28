package ExamenLiberacionAux;

import java.util.Scanner;

public class ej4Arboles {

	public static void main(String[] args) {
		ABNormal a=new ABNormal();
		Scanner lee=new Scanner(System.in);
		a.leer();
		a.m_Nivel();
		NodoAr x,xi,xd;
		int z;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		x=a.getRaiz();
		ni.adicionar(x);
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				xi=x.getSi();
				xd=x.getSd();
				x.setSi(xd);
				x.setSd(xi);
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);
				
			}
			ni.vaciar(su);
		}
		a.m_Nivel();
	}

}
