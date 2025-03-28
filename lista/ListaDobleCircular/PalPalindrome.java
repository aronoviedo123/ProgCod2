package ListaDobleCircular;

import java.util.Scanner;

public class PalPalindrome {

	public static void main(String[] args) {
		String pal; int i; char l; Object la,lb = null;
		LDCircular k=new LDCircular();
		LDCircular a=new LDCircular();
		LDCircular b=new LDCircular();
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese la palabra:");
		pal=lee.next();
		for (i=0;i<pal.length();i++) 
        {
            l = pal.charAt(i);
            a.adiFin((Object)l);
            b.adiFin((Object)l);
            k.adiFin((Object)l);
        }
		a.mostrar();
		
		System.out.println("\ninciso a) LIBRE");
		int sw=0;
		while((sw==0)&&(!a.esVacia()))
		{
			la=a.eliFin();
			lb=b.eliPrimero();
			if(!la.equals(lb))
			{
				System.out.println("\nNO ES PALINDROME");
				sw=1;
			}
		}
		if(sw==0)
		{
			System.out.println("\nSI ES PALINDROME");
		}
		
		// volviendo a adicionar la palabra en la lista a y b con la ayuda de la lista k
		for (i=0;i<pal.length();i++)
		{
			la=k.eliPrimero();
			a.adiPrimero(la);
			b.adiPrimero(la);
		}
		
		System.out.println("\ninciso b) SIN CREAR NUEVOS NODOS");

		NodoD an,bn; int sw2=0;
		an=a.getCabecera();
		bn=a.getCabecera();
		bn=bn.getAnt();
		for (i=0;i<pal.length();i++)
		{
			la=(Object)an.getDato();
			lb=(Object)bn.getDato();
			if(!la.equals(lb))
			{
				System.out.println("\nNO ES PALINDROME");
				sw2=1;
				break;
			}
			la=(Object)an.getSig();
			lb=(Object)bn.getAnt();
		}
		if(sw2==0)
		{
			System.out.println("\nSI ES PALINDROME");
		}
	}

}
