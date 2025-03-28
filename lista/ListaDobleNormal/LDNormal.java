package ListaDobleNormal;

public class LDNormal extends LDoble{
	LDNormal()
	{
		super();
	}
	boolean esVacia()
	{
		return(super.esVacia());
	}
	void adiFin(Object da)
	{	NodoD w,x;
		w=new NodoD();
		w.setDato(da);
		if(esVacia()) p=w;
		else
		{
			x=p;
			while(x.getSig()!=null)
			{
				x=x.getSig();
			}
			w.setAnt(x);
			x.setSig(w);
		}
	}
	void adiPrimero(Object da)
	{	NodoD w;
		w=new NodoD();
		w.setDato(da);
		if(!esVacia())
		{
			w.setSig(p);
			p.setAnt(w);
		}
		p=w;
	}
	Object eliPrimero()
	{
		Object dato=null;
		if(esVacia())System.out.println("Lista Vacia");
		else
		{
			dato=p.getDato();
			if(p.getSig()==null) p=null;
			else
			{
				p=p.getSig();
				p.setAnt(null);
			}
		}
		return dato;
	}
	Object eliFin()
	{	NodoD u,au; Object dato=null;
		if(esVacia()) System.out.println("Lista Vacia");
		else
		{
			u=p;
			while(u.getSig()!=null)
			{
				u=u.getSig();
			}
			dato=u.getDato();
			if(p==u) p=null;
			else
			{
				au=u.getAnt();
				au.setSig(null);
				//(u.getAnt()).setAnt(null);
			}
		}
		return dato;
	}
	void mostrar()
	{	int n,i; Object da;
		n=nElem();
		for(i=1;i<=n;i++)
		{
			da=eliPrimero();
			System.out.print("\t"+da);
			adiFin(da);
		}
	}
	int nElem()
	{	int c=0; NodoD x;
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
	void setCabecera(NodoD q)
	{
		p=q;
	}
	NodoD getCabecera()
	{
		return p;
	}
}