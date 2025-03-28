package introjava;

public class pila {
	int tope,max;
	Object v[]=new Object[100];
	pila(int ca)
	{
		tope=0;
		max=ca;
	}
	boolean esVacia() {
		if (tope==0) return true;
		else return false;
	}
	boolean esLlena() {
		if(tope==max)return true;
		else return false;
	}
	void adicionar(Object ele)
	{
		if(!esLlena()) {
			tope=tope+1;
			v[tope]=ele;
		}
		else System.out.println("Pila llena");
	}
	Object eliminar() {
		Object ele=null;
		if(!esVacia()) {
			ele=v[tope];
			tope=tope-1;
		}
		else System.out.println("Pila Vacia");
		return ele;
	}
	void vaciar(pila Q) 
	{
		while(!Q.esVacia())
		adicionar(Q.eliminar());
	}
	void mostrar() 
	{	Object ele;
		pila aux=new pila(max);
		if(!esVacia()) 
		{
			while(!esVacia()) 
			{
				ele=eliminar();
				System.out.println(ele);
				aux.adicionar(ele);
			}
			vaciar(aux);
		}
		else System.out.println("Pila vacia");
	}
	int nEle() 
	{ return tope; }
	/*void totalPre()
	{
		pila aux=new pila(max);
		Cuaderno c; float s=0;
		while(!esVacia())
		{
			c=(Cuaderno)eliminar();
			s=s+c.getPre();
			aux.adicionar(c);
		}
		vaciar(aux);
		System.out.println("Total precios del cuaderno "+s);
	}*/
	
}
