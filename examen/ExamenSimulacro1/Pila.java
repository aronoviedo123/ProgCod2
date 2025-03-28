package ExamenSimulacro1;

public class Pila {
	private int tope, max;
	private Object v[]=new Object[100];
	Pila(int cp)
	{
		tope=0;
		max=cp;
	}
	boolean esVacia()
	{
		if(tope==0) {
			return true;
		}
		else return false;
	}
	boolean esLlena()
	{
		if(tope==max)
		{
			return true;
		}
		else return false;
	}
	void adicionar(Object da)
	{
		if(!esLlena())
		{
			tope=tope+1;
			v[tope]=da;
		}
		else System.out.println("Pila Llena");	
	}
	Object eliminar()
	{
		Object ele=null;
		if(!esVacia())
		{
			ele=v[tope];
			tope=tope-1;
		}
		else System.out.println("Pila vacia");
		return ele;
	}
	int nElem()
	{
		return tope;
	}
	void mostrar()
	{
		Object ele;
		Pila aux=new Pila(max);
		while(!esVacia())
		{
			aux.adicionar(eliminar());
		}
		while(!aux.esVacia())
		{
			ele=aux.eliminar();
			System.out.println(ele);
			adicionar(ele);
		}
	}
	
	
}
