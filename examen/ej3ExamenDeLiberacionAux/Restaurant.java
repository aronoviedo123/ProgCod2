package ej3ExamenDeLiberacionAux;


public class Restaurant {
	int npro,max;
	Pedidos dis[]=new Pedidos[10];
	Restaurant(int mp)
	{
		max=mp;
		npro=0;
	}
	void CreaPedido(int i)
	{
		dis[i]=new Pedidos();
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
	{	CSCircular cv; int p,n; Pedido ve;
		System.out.print("\nMES :"+dis[i].getMes());
		cv=dis[i].getCpe();
		n=cv.nElem();
		for(p=1;p<=n;p++)
		{
			ve=(Pedido)cv.eliminar();
			System.out.println("\n");
			ve.mostrar();
			cv.adicionar((Object)ve);
		}
	}
	void promedio()
	{
		float s=0; int i,p,nve; CSCircular cpe; Pedido pe;
		for(i=1;i<=3;i++)
		{
			cpe=dis[i].getCpe();
			nve=cpe.nElem();
			for(p=1;p<=nve;p++)
			{
				pe=(Pedido)cpe.eliminar();
				s=s+pe.getTotal();
				cpe.adicionar((Object)pe);
			}
		}
		System.out.println("\nB) Promedio de venta de los 3 primeros meses: "+s/3);
	}
	/*public int platilloMasVnedido( String m) 
	{
		float s=0; int i,j,nve,max=0; CSCircular cpe; Pedido pe;
		for(i=1;i<=npro;i++)
		{
			if(m==dis[i].getMes())
			{
				cpe=dis[i].getCpe();
				nve=cpe.nElem();
				for(j=1;j<=nve;j++)
				{
					
					pe=(Pedido)cpe.eliminar();
					if(pe.getCantidad()>max)
					{
						max=pe.getCantidad();
					}
					cpe.adicionar((Object)pe);
				}
			}
			
		}
		for(i=1;i<=npro;i++)
		{
			if(m==dis[i].getMes())
			{
				cpe=dis[i].getCpe();
				nve=cpe.nElem();
				for(j=1;j<=nve;j++)
				{
					
					pe=(Pedido)cpe.eliminar();
					if(pe.getCantidad()==max)
					{
						return pe.getCantidad();
					}
					cpe.adicionar((Object)pe);
				}
			}
			else return 0;
			
		}
		
	}*/
}
