package Colas;

import java.util.Scanner;

public class Polixy {

	public static void main(String[] args) {
		int n,i,c,ex,ey;
		CSCircular a=new CSCircular(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("ingrese nro de elementos");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("ingrese coeficiente");
			c=lee.nextInt();
			a.adicionar((Object)c);
			System.out.println("ingrese exponente en x");
			ex=lee.nextInt();
			a.adicionar((Object)ex);
			System.out.println("ingrese exponenete en y");
			ey=lee.nextInt();
			a.adicionar((Object)ey);
		}
		for(i=1;i<=n;i++)
		{
			c=(int)a.eliminar();
			ex=(int)a.eliminar();
			ey=(int)a.eliminar();
			
			if(ex==ey)
			{
				System.out.print("\n"+c+"x^"+ex+"y^"+ey);
			}
			a.adicionar((Object)c);
			a.adicionar((Object)ex);
			a.adicionar((Object)ey);
		}
		//a)
		int q;
		System.out.print("ingrese el valor del coeficiente");
		q=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			c=(int)a.eliminar();
			ex=(int)a.eliminar();
			ey=(int)a.eliminar();
			
			if(q==c)
			{
				System.out.print("\n"+c+"x^"+ex+"y^"+ey);
			}
			a.adicionar((Object)c);
			a.adicionar((Object)ex);
			a.adicionar((Object)ey);
		}
		
		//c)
		int x,y,con=0;
		System.out.println("ingrese el valor de X");
		x=lee.nextInt();
		System.out.println("ingrese el valor de Y");
		y=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			c=(int)a.eliminar();
			ex=(int)a.eliminar();
			ey=(int)a.eliminar();
			con=(int) (con+c*Math.pow(x, ex)*Math.pow(y, ey));
			System.out.print("\n"+c+"*"+x+"^"+ex+"*"+y+"^"+ey);
			System.out.println("= "+con);
			a.adicionar((Object)c);
			a.adicionar((Object)ex);
			a.adicionar((Object)ey);
		}
		
	}

}
