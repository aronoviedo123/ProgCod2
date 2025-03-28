package PracticaColas;

public class CSNormal extends CSimple {
	CSNormal(int vc)
	{
		super(vc);
	}
	boolean esLlena()
	{
		if(fin==max) return true;
		else return false;
	}
	boolean esVacia()
	{
		if((ini==0)&&(fin==0))return true;
		else return false;
	}
	void adicionar(Object ele)
	{
		if(!esLlena())
		{
			if (esVacia()) ini=1;
			fin=fin+1;
			v[fin]=ele;
		}
		else System.out.println("Cola llena");	
	}
	Object eliminar()
	{	Object ele=null;
		if(!esVacia())
		{
			ele=v[ini];
			ini=ini+1;
			if(ini>fin)
			{
				ini=0;
				fin=0;
			}
			
		}
		else System.out.println("Cola vacia");
		return ele;
	}
	void mostrar()
	{	Object ele;
		CSNormal aux=new CSNormal(max);
		while(!esVacia())
		{
			ele=eliminar();
			System.out.print("\t"+ele);
			aux.adicionar(ele);
		}
		while(!aux.esVacia())
		{
			adicionar(aux.eliminar());
		}
		
	}
	int nElem()
	{
		if(!esVacia()) return(fin-ini+1);
		else return 0;
	}
}
