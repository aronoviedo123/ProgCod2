package PracticaArboles;

public abstract class ABinario {
	protected NodoAr r;
	ABinario()
	{
		r=null;
	}
	boolean esVacia()
	{
		if(r==null) return true;
		else return false;
	}
	abstract void leer();
	void m_Nivel()
	{	NodoAr x,xi,xd;
		int i=1;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		ni.adicionar(r);
		while(!ni.esVacia()) 
		{
			System.out.println("\nnivel "+i+":");
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				System.out.print("\t"+x.getDato());
				xi=x.getSi();
				xd=x.getSd();
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);
			}
			i++;
			ni.vaciar(su);
			//System.out.println();
		};
	}
	void m_enordenRe(NodoAr q) //IRD
	{
		if(q!=null)
		{
			m_enordenRe(q.getSi());
			System.out.print("\t"+q.getDato());
			m_enordenRe(q.getSd());
		}
	}
	void m_preordenRe(NodoAr q) //RID
	{
		if(q!=null)
		{
			System.out.print("\t"+q.getDato());
			m_enordenRe(q.getSi());
			m_enordenRe(q.getSd());
		}
	}
	void m_posordenRe(NodoAr q) //IDR
	{
		if(q!=null)
		{
			m_enordenRe(q.getSi());
			m_enordenRe(q.getSd());
			System.out.print("\t"+q.getDato());
		}
	}
	
}
