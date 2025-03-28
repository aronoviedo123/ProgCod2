package Bicola;

public class Bicola {
	int ini1,fin1,ini2,fin2,max;
	Estudiante e[]=new Estudiante[200];
	Bicola(int ca)
	{
		max=ca;
		ini1=0;
		fin1=0;
		ini2=max+1;
		fin2=max+1;
	}
	boolean esVacia(int i)
	{
		switch(i)
		{
		case 1:
			if((ini1==0)&&(fin1==0)) return true;
			else return false;
		case 2:
			if((ini2==max+1)&&(fin2==max+1)) return true;
			else return false;
		}
		return false;	
	}
	boolean esLlena()
	{
		if((fin1+1)==fin2) return true;
		else return false;
	}
	void adicionar(int i, Estudiante es)
	{
		if(!esLlena())
		{
			switch(i)
			{
			case 1:
				if(esVacia(1))
				{
					ini1=1;
					fin1=fin1+1;
					e[fin1]=es;
				}
			case 2:
				if(esVacia(2))
				{
					ini2=max;
					fin2=fin2-1;
					e[fin2]=es;
				}
			}
		}
		else System.out.println("Bicola Llena");
	}
	Object eliminar(int i)
	{
		Estudiante es=null;
		if(esVacia(i)) System.out.println("Cola Vacia");
		else
			switch(i)
			{
			case 1:
				es=e[ini1];
				ini1=ini1+1;
				if(ini1>fin1)
				{
					ini1=0;
					fin1=0;
				}
			case 2:
				es=e[ini2];
				ini2=ini2-1;
				if(ini2<fin2)
				{
					ini2=max+1;
					fin2=max+1;
				}
			}
		return es;
	}
	void mostrar(int i)
	{	Estudiante es;
		Bicola aux=new Bicola(100);
		if(esVacia(i)) System.out.println("Cola Vacia");
		else
		{
			while(!esVacia(i))
			{
				es=(Estudiante) eliminar(i);
				es.mostrar();
				aux.adicionar(i, es);
			}
			while(!aux.esVacia(i))
			{
				adicionar(i,(Estudiante) aux.eliminar(i));
			}
		}
	}
	void mostrar()
	{
		mostrar(1);
		mostrar(2);
	}
	int nElem(int i)
	{
		if(esVacia(i)) return 0;
		else
		{
			if (i==1) return(fin1-ini1+1);
			else return(ini2-fin2+1);
		}
	}
	int nElem()
	{
		return((nElem(1)+ nElem(2)));
	}
}
