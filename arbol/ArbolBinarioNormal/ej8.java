package ArbolBinarioNormal;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		//dado un ABNormal mostrar el maximo y minimo elemento del subarbol
		//que se desprende del dato z (si existe)
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
		System.out.println("\nIngrese el valor de z:");
		z=lee.nextInt();
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
			ni.vaciar(su);
		}
		
		//trabajando con el subarbol de z
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		x=a.getRaiz();
		ni.adicionar(x);
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				xi=x.getSi();
				xd=x.getSd();
				if((int)x.getDato()>max)
				{
					max=(int)x.getDato();
				}
				if((int)x.getDato()<min)
				{
					min=(int)x.getDato();
				}
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);
				
			}
			ni.vaciar(su);
		}
		a.m_Nivel();
		
		System.out.println("\nEl mayor elemento del sub arbol de "+z+" es: "+max);
		System.out.println("\nEl menor elemento del sub arbol de "+z+" es: "+min);
	}

}
