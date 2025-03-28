package Recursividad;

import java.util.Scanner;

public class SumaImpares {
	//modo licenciada
	
	static int sumai(int n) {
		if(n==0) return 0;
		else
		{
			return(sumai(n-1)+(2*n-1));
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el numero de impares que desea sumar");
		n=lee.nextInt();
		System.out.println("suma de impares: "+sumai(n));
	}
	

}
