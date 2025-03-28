package ArbolBinarioDeBusqueda;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		//Dado un árbol binario de búsqueda hallar el máximo y el mínimo elemento del nivel k
		ABB a=new ABB();
		Scanner lee=new Scanner(System.in);
		a.leer();
		a.m_Nivel();
		NodoAr x,xi,xd;
		int i=1,k, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		System.out.println("\nIngrese el valor de k:");
		k=lee.nextInt();
		x=a.getRaiz();
		ni.adicionar((Object)x);
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				xi=x.getSi();
				xd=x.getSd();
				if(i==k)
				{
					if((int)x.getDato()>max)
					{
						max=(int)x.getDato();
					}
					if((int)x.getDato()<min)
					{
						min=(int)x.getDato();
					}
				}
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);	
			}
			i++;
			ni.vaciar(su);
		}
		System.out.println("\nel maximo del nivel "+k+" es: "+max);
		System.out.println("\nel minimo del nivel "+k+" es: "+min);

	}

}
