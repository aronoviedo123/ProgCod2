package ExamenSimulacro1;

public class EServicio {
	int npro,max;
	Dispensador dis[]=new Dispensador[10];
	EServicio(int mp)
	{
		max=mp;
		npro=0;
	}
	void CreaDispensador(int i)
	{
		dis[i]=new Dispensador();
		dis[i].leer();
		npro=npro+1;
	}
	void mostrar()
	{	int i;
		for(i=1;i<=npro;i++)
		{
			mostrar(i);
		}
	}
	void mostrar(int i)
	{	CSCircular cv; int p,n; Vehiculo ve;
		System.out.print("\nProducto:"+dis[i].getProducto());
		cv=dis[i].getCve();
		n=cv.nElem();
		for(p=1;p<=n;p++)
		{
			ve=(Vehiculo)cv.eliminar();
			System.out.println("\n");
			ve.mostrar();
			cv.adicionar((Object)ve);
		}
	}
	void TotalVendido()
	{
		float s=0; int i,p,nve; CSCircular cv; Vehiculo vehi;
		for(i=1;i<=npro;i++)
		{
			cv=dis[i].getCve();
			nve=cv.nElem();
			for(p=1;p<=nve;p++)
			{
				vehi=(Vehiculo)cv.eliminar();
				s=s+vehi.getImporte();
				cv.adicionar((Object)vehi);
			}
		}
		System.out.println("\nTotal Vendido: "+s);
	}
	void proPla(String z)
	{
		CSCircular cv; Vehiculo vehi; int ban=0,i=1,p,nv;
		while((ban==0)&&(i<=npro))
		{
			cv=dis[i].getCve();
			nv=cv.nElem();
			p=1;
			while((ban==0)&&(p<=nv))
			{
				vehi=(Vehiculo)cv.eliminar();
				if((vehi.getPlaca()).compareTo(z)==0)
				{
					ban=1;
					System.out.println(z+" cargo "+dis[i].getProducto());
				}
				p=p+1;
				cv.adicionar((Object)vehi);
			}
			i=i+1;
		}
		if(ban==0) System.out.println(z+" no cargo ni un producto");
	}
	void VehiCargoMas(String q)
	{
		float max=0; int i,p,nve; CSCircular cv; Vehiculo vehi;
		
		for(i=1;i<=npro;i++)
		{
			if((dis[i].getProducto()).compareTo(q)==0)
			{
				cv=dis[i].getCve();
				nve=cv.nElem();
				for(p=1;p<=nve;p++)
				{
					vehi=(Vehiculo)cv.eliminar();
					if(vehi.getImporte()>max)
					{
						max=vehi.getImporte();
					}
					cv.adicionar((Object)vehi);
				}
				for(p=1;p<=nve;p++)
				{
					vehi=(Vehiculo)cv.eliminar();
					if(vehi.getImporte()==max)
					{
						System.out.println("\nVechiculo(s) que cargo mas del producto "+q);
						vehi.mostrar();
					}
					cv.adicionar((Object)vehi);
				}
			}
			
		}
	}
	void atendioMasVehi()
	{
		int i,nve,max=0; CSCircular cv; Vehiculo vehi;
		for(i=1;i<=npro;i++)
		{
			cv=dis[i].getCve();
			nve=cv.nElem();
			if(nve>max)
			{
				max=nve;
			}
		}
		for(i=1;i<=npro;i++)
		{
			cv=dis[i].getCve();
			nve=cv.nElem();
			if(nve==max)
			{
				System.out.println("El dispensador que atendio a mas clientes fue: "+dis[i].getProducto());
				
			}
		}
	}
	
}
