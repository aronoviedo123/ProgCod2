package PracticaListaSimple;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		int n,i,da;
		LSNormal z=new LSNormal();
		LSNormal za=new LSNormal();
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elmentos de la lista:");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Ingrese dato nro "+i+":");
			da=lee.nextInt();
			z.adiFin((Object)da);
			za.adiFin((Object)da);
		}
		za.mostrar();
		
		//procedimiento
		System.out.println("\ninciso a) LIBRE:");
		int daz,nz,j,c=0;
		for(i=1;i<=n;i++)
		{
			da=(int)z.eliPrimero();
			nz=za.nElem();
			for(j=1;j<=nz;j++)
			{
				daz=(int)za.eliPrimero();
				if((daz==da))
				{
					c++;
					if(c>1)
					{
						
					}
					else za.adiFin((Object)daz);
				}
				else za.adiFin((Object)daz);
			}
			c=0;
			z.adiFin((Object)da);
		}
		System.out.println("\nDATOS REPETIDOS ELIMINADOS");
		za.mostrar();
		
		System.out.println("\ninciso b) SIN CREAR NUEVOS NODOS");
		NodoS a,b,d; Object ele,elez;
		a=z.getCabecera();
		b=z.getCabecera();
		d=z.getCabecera();
		nz=z.nElem();
		for(i=1;i<=nz;i++)
		{
			ele=a.getDato();
			nz=z.nElem();
			b=b.getSig();
			for(j=1;j<=nz;j++)
			{	
				elez=b.getDato();
				System.out.println("dd"+elez);
				if((elez.equals(ele)))
				{
					c++;
					if(c>1)
					{
						d.setSig(b.getSig());
					}
					else 
					{
						b=b.getSig();
						d=d.getSig();
					}
				}
				else
				{
					b=b.getSig();
					d=d.getSig();
				}
			}
			b=z.getCabecera();
			d=z.getCabecera();
			c=0;
			a=a.getSig();
		}
		System.out.println("\nDatos eliminados sin crear nuevos nodos:");
		z.mostrar();
	}

}
