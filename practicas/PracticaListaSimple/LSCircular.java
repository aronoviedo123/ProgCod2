package PracticaListaSimple;

public class LSCircular extends LSimple{
	LSCircular()
	{
		super();
	}
	boolean esVacia()
	{
		return (super.esVacia());	
	}
	void adiPrimero(Object e)
	{	NodoS w,u;
		w=new NodoS();
		w.setDato(e);
		if(esVacia()) w.setSig(w);
		else
		{
			u=p;
			while(u.getSig()!=p)
			{
				u=u.getSig();
			}
			u.setSig(w);
			w.setSig(p);
		}
		p=w;
	}
	void adiFin(Object e)
	{	NodoS w,x;
		w=new NodoS();
		w.setDato(e);
		if(esVacia())
		{
			w.setSig(w);
			p=w;
		}
		else
		{
			x=p;
			while(x.getSig()!=p)
			{
				x=x.getSig();
			}
			x.setSig(w);
			w.setSig(p);
		}
	}
	Object eliFin()
	{	NodoS x,ax=null; Object dato=null;
		if(esVacia()) System.out.println("Lista Vacia");
		else
		{	
			x=p;
			while(x.getSig()!=p)
			{
				ax=x;
				x=x.getSig();
			}
			dato=x.getDato();
			if(x==p) p=null;
			else
			{
				ax.setSig(p);
			}
		}
		return dato;
	}
	Object eliPrimero()
	{	NodoS y,x,ax=null; Object da=null;
		if(esVacia())System.out.println("Lista Vacia");
		else
		{
			da=p.getDato();
			y=p;
			while(y.getSig()!=p)
			{
				y=y.getSig();
			}
			if(p!=y)
			{
				y.setSig(p.getSig());
				p=p.getSig();
			}
			else p=null;
		}
		return da;	
	}
	void mostrar()
	{	int n,i; Object da;
		if(esVacia())System.out.println("Lista Vacia");
		else
		{
			n=nElem();
			for(i=1;i<=n;i++)
			{
				da=eliPrimero();
				System.out.print("\t"+da);
				adiFin(da);
			}
		}
	}
	int nElem()
	{	NodoS x; int c=0;
		if(!esVacia())
		{
			x=p;
			c=1;
			while(x.getSig()!=p)
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
