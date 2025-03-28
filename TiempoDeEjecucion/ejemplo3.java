package TiempoDeEjecucion;

import java.util.Scanner;

public class ejemplo3 {

	public static void main(String[] args) {
		int[][] a=new int[100][100];
		long ti,tf;
		int j,i,n,s=0;
		ti=System.nanoTime();
		Scanner lee=new Scanner(System.in);
		n=lee.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				a[i][j]=lee.nextInt();
				s=s+a[i][j];
			}
		}
		System.out.println("suma: "+s);
		tf=System.nanoTime();
		System.out.println("");
	}

}
