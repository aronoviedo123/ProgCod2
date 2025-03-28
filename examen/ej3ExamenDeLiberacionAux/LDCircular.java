package ej3ExamenDeLiberacionAux;

public class LDCircular extends LDoble{
	LDCircular()
	{
		super();
	}
	boolean esVacia()
	{
		return(super.esVacia());
	}
	void adiFin(Object da)
	{	NodoD w,u;
		w=new NodoD();
		w.setDato(da);
		if(esVacia())
		{
			w.setAnt(w);
			w.setSig(w);
			p=w;
		}
		else
		{
			u=p.getAnt();
			u.setSig(w);
			w.setAnt(u);
			w.setSig(p);
			p.setAnt(w);
		}
	}
	void adiPrimero(Object da)
	{	NodoD y=new NodoD();
		y.setDato(da);
		if(esVacia())
		{
			y.setSig(y);
			y.setAnt(y);
		}
		else
		{
			NodoD u=p.getAnt();
			u.setSig(y);
			y.setAnt(u);
			y.setSig(p);
			p.setAnt(y);
		}
		p=y;
	}
	Object eliPrimero()
	{	Object ele=null;
		if(esVacia()) System.out.println("Lista Vacia");
		else
		{
			ele=p.getDato();
			if(p.getAnt()==p) p=null;
			else
			{
				(p.getAnt()).setSig(p.getSig());
				(p.getSig()).setAnt(p.getAnt());
				p=p.getSig();
			}
		}
		
		return ele;
	}
	Object eliFin()
	{	 Object ele=null; NodoD u;
		if(esVacia())System.out.println("Lista Vacia");
		else
		{
			u=p.getAnt();
			ele=u.getDato();
			if(p.getAnt()==p) p=null;
			else
			{
				(u.getAnt()).setSig(p);
				p.setAnt(u.getAnt());
			}
		}
		return ele;
	}
	void mostrar()
	{	NodoD x; int n,i; Object ele;
		n=nElem();
		for(i=1;i<=n;i++)
		{
			ele=eliPrimero();
			System.out.print(ele+"\t");
			adiFin(ele);
		}
	}
	int nElem()
	{	NodoD x; int c=0;
		if(!esVacia())
		{
			x=p;
			c=1;
			while(x.getSig()!=p)
			{
				c++;
				x=x.getSig();
			}
		}
		return c;
	}
	void setCabecera(NodoD q)
	{
		p=q;
	}
	NodoD getCabecera()
	{
		return p;
	}
}
