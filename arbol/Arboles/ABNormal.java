package Arboles;

import java.util.Scanner;

public class ABNormal extends ABinario{
	ABNormal()
	{
		super();
	}
	boolean esVacia()
	{
		return(super.esVacia());
	}
	void m_Nivel()
	{
		super.m_Nivel();
	}
	void m_enordenRe(NodoAr y)
	{
		super.m_enordenRe(y);
	}
	void m_preordenRe(NodoAr y)
	{
		super.m_preordenRe(y);
	}
	void m_posordenRe(NodoAr y)
	{
		super.m_posordenRe(y);
	}
	void leer() //por nivel
	{
		NodoAr x,xi,xd;
		Object ele;
		int re;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		r=new NodoAr();
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese dato:");
		ele=(Object)lee.nextInt();
		r.setDato((Object)ele);
		ni.adicionar(r);
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				System.out.println("Decendiente izq? para: "+x.getDato()+"? (si=1)");
				re=lee.nextInt();
				if(re==1)
				{
					xi=new NodoAr();
					System.out.println("Ingrese dato:");
					ele=(Object)lee.nextInt();
					xi.setDato(ele);
					su.adicionar((Object)xi);
					x.setSi(xi);
					
				}
				System.out.println("Descendiente der? para: "+x.getDato()+"? (si=1)");
				re=lee.nextInt();
				if(re==1)
				{
					xd=new NodoAr();
					System.out.println("Ingrese dato:");
					ele=(Object)lee.nextInt();
					xd.setDato(ele);
					su.adicionar((Object)xd);
					x.setSd(xd);
					
				}
			}
			ni.vaciar(su);
		}
	}
	NodoAr getRaiz()
	{
		return r;
	}
}
