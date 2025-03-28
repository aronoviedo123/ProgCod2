package ConjuntoColas;

public class CSCircular extends CSimple{
	CSCircular(int m)
	{
		super(m);
	}
	boolean esVacia()
	{
		if(nElem()==0) return true;
		else return false;
	}
	boolean esLlena()
	{
		if(nElem()==max-1) return true;
		else return false;
	}
	void adicionar(Object x)
	{
		if(!esLlena())
		{
			fin=(fin+1)%max;
			v[fin]=x;
		}
		else System.out.println("Cola Llena");
	}
	Object eliminar()
	{	Object ele=null;
		if(esVacia()) System.out.println("Cola Vacia");
		else
		{
			ini=(ini+1)%max;
			ele=v[ini];
		}
		return ele;
	}
	void mostrar()
	{	Object ele=null; int n,i;
		if(esVacia()) System.out.println("Cola Vacia");
		else
		{
			n=nElem();
			for(i=1;i<=n;i++)
			{
				ele=eliminar();
				System.out.print("\t"+ele);
				adicionar(ele);
			}
		}
	}
	int nElem()
	{
		return((fin-ini+max)%max);
	}
	void vaciar(CSCircular q)
	{
		while(!q.esVacia())
			adicionar(q.eliminar());
	}
}
