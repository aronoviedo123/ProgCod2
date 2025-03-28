package PracticaArboles;

import java.util.Scanner;

public class ABB extends ABinario{
	ABB()
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
	void leer()
	{
		int sw,i,n,dato;
		NodoAr y,w;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el nro de elementos:");
		n=lee.nextInt();
		System.out.println("\nIngrese la raiz:");
		dato=lee.nextInt();
		r=new NodoAr();
		r.setDato((Object)dato);
		for(i=2;i<=n;i++)
		{
			System.out.println("Ingrese un dato");
			dato=lee.nextInt();
			w=new NodoAr();
			w.setDato((Object)dato);
			y=r;
			sw=0;
			while(sw==0)
			{
				if(dato>(int)y.getDato())
				{
					if(y.getSd()!=null)
					{
						y=y.getSd();
					}
					else
					{
						y.setSd(w);
						sw=1;
					}
				}
				else
				{
					if(y.getSi()!=null)
					{
						y=y.getSi();
					}
					else
					{
						y.setSi(w);
						sw=1;
					}
				}
			}
		}
	}
	NodoAr getRaiz()
	{
		return r;
	}
	void setRaiz(NodoAr y)
	{
		r=y;
	}
	
}
