package ArbolBinarioNormal;
import java.util.Scanner;
public class ej4 {

	public static void main(String[] args) {
		//Dado un ABNormal mostrar los niveles donde "z" existe ("z" ingresa por teclado)
		ABNormal a=new ABNormal();
		Scanner lee=new Scanner(System.in);
		a.leer();
		a.m_Nivel();
		NodoAr x,xi,xd;
		int z,i=1;
		Pila ni=new Pila(100);
		Pila su=new Pila(100);
		Pila sux=new Pila(100);
		System.out.println("\nIngrese el valor de z:");
		z=lee.nextInt();
		x=a.getRaiz();
		ni.adicionar((Object)x);
		while(!ni.esVacia()) 
		{
			while(!ni.esVacia())
			{
				x=(NodoAr) ni.eliminar();
				if(z==(int)x.getDato())
				{
					System.out.println("el numero "+z+" se encuentra en el nivel "+i+": ");
				}
				xi=x.getSi();
				xd=x.getSd();
				if(xi!=null) su.adicionar((Object)xi);
				if(xd!=null) su.adicionar((Object)xd);	
			}
			i++;
			ni.vaciar(su);
		}


	}

}
