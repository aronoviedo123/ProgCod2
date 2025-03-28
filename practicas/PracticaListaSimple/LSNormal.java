package PracticaListaSimple;


public class LSNormal extends LSimple {
	LSNormal()
	{
		super();
	}
	boolean esVacia()
	{
		return(super.esVacia());
	}
	void adiPrimero(Object da)
	{	NodoS w;
		w=new NodoS();
		w.setDato(da);
		w.setSig(p);
		p=w;
	}
	void mostrar()
	{	NodoS x;
		if(esVacia())System.out.println("Lista Vacia");
		else
		{	
			x=p;
			while(x!=null)
			{
				System.out.print("\t"+x.getDato());
				x=x.getSig();
			}
		}
	}
	void adiFin(Object da)
	{	NodoS w,u;
		w=new NodoS();
		w.setDato(da);
		if(esVacia()) p=w;
		else 
		{
			u=p;
			while(u.getSig()!=null)
			{
				u=u.getSig();
			}
			u.setSig(w);
		}
	}
	//garbageCollector
	Object eliFin()
	{	NodoS x,ax=null; Object dato=null;
		if(esVacia())System.out.println("Lisa vacia");
		else
		{
			x=p;
			while(x.getSig()!=null)
			{
				ax=x;
				x=x.getSig();
			}
			dato=x.getDato();
			if(p==x) p=null;
			else ax.setSig(null);
				
		}
		return dato;
	}
	Object eliPrimero()
	{	Object dato=null;
		if(esVacia())System.out.println("Lisa vacia");
		else
		{
			dato=p.getDato();
			p=p.getSig();	
		}
		return dato;
	}
	int nElem()
	{	NodoS x; int c=0;
		if(!esVacia())
		{
			x=p;
			c=1;
			while(x.getSig()!=null)
			{
				x=x.getSig();
				c++;
			}
		}
		return c;
	}
	NodoS getCabecera()
	{
		return p;
	}
	void setCabecera(NodoS q)
	{
		p=q;
	}
}
