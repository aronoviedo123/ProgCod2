package PilaMulZoologico;

public class Zoologico {
	int nani,max;
	Pila aux=new Pila(100);
	Cuidador cui[]=new Cuidador[10];
	Zoologico(int ma)
	{
		max=ma;
		nani=0;
	}
	void CreaCuidador(int i)
	{
		cui[i]=new Cuidador();
		cui[i].leer();
		nani=nani+1;
	}
	void mostrar()
	{	int i;
		for(i=1;i<=nani;i++)
		{
			mostrar(i);
		}
	}
	void mostrar(int i)
	{	Pila ca; int p,n; animal an;
		System.out.print("\nNombre del cuidador: "+cui[i].getNombre());
		System.out.print("\nTipo de animal al que cuida: "+cui[i].getTipoan());
		ca=cui[i].getPc();
		n=ca.nElem();
		for(p=1;p<=n;p++)
		{
			an=(animal)ca.eliminar();
			System.out.println("\n");
			an.mostrar();
			aux.adicionar((Object)an);
		}
		for(p=1;p<=n;p++)
		{
			an=(animal)aux.eliminar();
			ca.adicionar((Object)an);
		}
	}
	
	void cantAnimales()
	{
		int i,nan,max=0; Pila ca; animal a;
		for(i=1;i<=nani;i++)
		{
			ca=cui[i].getPc();
			nan=ca.nElem();
			if(nan>max)
			{
				max=nan;
			}
		}
		for(i=1;i<=nani;i++)
		{
			ca=cui[i].getPc();
			nan=ca.nElem();
			if(nan==max)
			{
				System.out.println("\na)Los animales que hay en mas cantidad son: "+cui[i].getTipoan());
			}
		}
	}
	
	void numeroAnimalesCargo(String nomb)
	{
		int i,nan; Pila ca; animal a;
		for(i=1;i<=nani;i++)
		{
			ca=cui[i].getPc();
			nan=ca.nElem();
			if((nomb).compareTo(cui[i].getNombre())==0)
			{
				System.out.println("\nb)El cuidador "+nomb+" tiene al cuidado "+nan+" animales de tipo "+cui[i].getTipoan());
			}
			
		}
		
	}
	void promedioAnim(String t)
	{
		int i,p,nan,s=0,can=0; Pila ca; animal a;
		for(i=1;i<=nani;i++)
		{
			ca=cui[i].getPc();
			nan=ca.nElem();
			if((t).compareTo(cui[i].getTipoan())==0)
			{
				can=nan;
				for(p=1;p<=nan;p++)
				{
					a=(animal)ca.eliminar();
					s=s+a.getEdad();
					aux.adicionar((Object)a);
				}
				for(p=1;p<=nan;p++)
				{
					a=(animal)aux.eliminar();
					ca.adicionar((Object)a);
				}
			}
		}
		System.out.println("\nc)La edad promedio de los animales "+t+" es: "+(s/can));
	}
	void muestraMasPesado()
	{
		int i,p,nan,max=0; Pila ca; animal a;
		for(i=1;i<=nani;i++)
		{
			ca=cui[i].getPc();
			nan=ca.nElem();
			for(p=1;p<=nan;p++)
			{
				a=(animal)ca.eliminar();
				if(a.getPeso()>max)
				{
					max=a.getPeso();
				}
				aux.adicionar((Object)a);
			}
			for(p=1;p<=nan;p++)
			{
				a=(animal)aux.eliminar();
				ca.adicionar((Object)a);
			}
			for(p=1;p<=nan;p++)
			{
				a=(animal)ca.eliminar();
				if(a.getPeso()==max)
				{
					System.out.println("\nd)Los Animales mas pesados son:");
					a.mostrar();
				}
				aux.adicionar((Object)a);
			}
			for(p=1;p<=nan;p++)
			{
				a=(animal)aux.eliminar();
				ca.adicionar((Object)a);
			}
		}
		
	}

}
