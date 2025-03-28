package PracticaPilas;
import java.util.Scanner;
public class DuplicaPar {

	public static void main(String[] args) {
		int n,i,da;
		Pila z=new Pila(100);
		Pila aux=new Pila(100);
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la cantidad elementos de la Pila");
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Ingrese el elemento nro "+i+":");
			da=lee.nextInt();
			z.adicionar((Object)da);
			aux.adicionar((Object)da);
		}
		z.mostrar();
		
		//ejercicio 1:
		
		Pila zx=new Pila(100);
		Pila aux2=new Pila(100);
		int j,dat,dat2,c=0,n2;
		n2=n;
		for(i=1;i<=n;i++)
		{
			dat=(int)z.eliminar();
			zx.adicionar((int)dat);
			if(dat%2==1)
			{
				for(j=1;j<=n2;j++)
				{
					dat2=(int)aux.eliminar();
					if(dat==dat2)
					{
						c++;
					}
					else aux2.adicionar((Object)dat2);
					if(c>1)
					{
						zx.adicionar((Object)dat);
						n2=n2-c;
					}
					
				}
				aux.vaciar(aux2);
				c=0;
			}
		}
		System.out.println("\nDUPLICANDO LOS DATOS IMPARES QUE SE REPITEN:");
		zx.mostrar();
	}

}
