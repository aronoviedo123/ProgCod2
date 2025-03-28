package ListaDobleNormal;

import java.util.Scanner;

public class eliMax {

	public static void main(String[] args) {
		int n,i,da;
		LDNormal a=new LDNormal();
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el nro de elementos:");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Ingrese el elemento "+i+":");
			da=lee.nextInt();
			a.adiFin((Object)da);
		}
		a.mostrar();
		//eliminando el maximo
		Object max,ele;
		max=a.eliPrimero();
		a.adiFin(max);
		for(i=1;i<=n;i++)
		{
			ele=a.eliPrimero();
			if((int)ele>(int)max)
			{
				max=ele;
			}
			a.adiFin(ele);
		}
		System.out.println("\nMaximo: "+max);
		int sw=0,j=1;
		while(sw==0)
		{
			ele=a.eliPrimero();
			j++;
			if(!ele.equals(max)) 
			{
				a.adiFin(ele);
			}
			else sw=1;
		}
		while(j<n)
		{
			a.adiFin(a.eliPrimero());
			j++;
		}
		System.out.println("\nMAXIMO ELIMINADO: ");
		a.mostrar();
	}

}
