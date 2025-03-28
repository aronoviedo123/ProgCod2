package PilaMulZoologico;

public class PilaMul {
	private int np,max;
	Pila pm[]=new Pila[100];
	PilaMul(int cc)
	{
		np=0;max=cc;
		
	}
	boolean esVacia(int i)
	{
		return(pm[i].esVacia());
	}
	boolean esLlena(int i)
	{
		return(pm[i].esLlena());
	}
	void adicionar(int i,Object da)
	{
		pm[i].adicionar(da);
	}
	Object eliminar(int i)
	{
		return(pm[i]);
	}
	void mostrar(int i)
	{
		pm[i].mostrar();
	}
	int nElem(int i)
	{
		return(pm[i].nElem());
	}
	void mostrar()
	{	int i;
		for(i=1;i<=np;i++)
		{
			System.out.println("\nPila "+i+":");
			mostrar(i);
		}
	}
	int nElem()
	{
		int a=0,i;
		for(i=1;i<=np;i++)
		{
			a=a+nElem(i);
		}
		return a;
	}
	void creaPila(int i, int cp)
	{
		pm[i]=new Pila(cp);
		np=np+1;
		
	}
	int getMax(int i)
	{
		return(pm[i].getMax());
	}
	void setMax(int i,int cm)
	{
		pm[i].setMax(cm);
	}
}
