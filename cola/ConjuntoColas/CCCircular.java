package ConjuntoColas;

public class CCCircular {
	private int ncc,max;
	private CSCircular ccc[]=new CSCircular[100];
	CCCircular(int mc)
	{
		max=mc;
		ncc=0;
	}
	boolean esVacia(int i)
	{
		return ccc[i].esVacia();
	}
	boolean esLlena(int i)
	{
		return ccc[i].esLlena();
	}
	void adicionar(int i, Object da)
	{
		ccc[i].adicionar(da);
	}
	Object eliminar(int i)
	{
		return ccc[i].eliminar();
	}
	void mostrar(int i)
	{
		ccc[i].mostrar();
	}
	void mostrar()
	{	int i;
		for(i=1;i<=ncc;i++)
		{
			System.out.println("\nCola "+i+":");
			mostrar(i);
		}
	}
	int nElem(int i)
	{
		return ccc[i].nElem();
	}
	int nElem()
	{	int i,s=0;
		for(i=1;i<=ncc;i++)
		{
			s=s+nElem(i);
		}
		return s;
	}
	void crearCSCircular(int i,int ca)
	{
		ccc[i]=new CSCircular(ca);
		ncc++;
	}
}
