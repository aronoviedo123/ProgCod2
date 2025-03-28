package Colas;

import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		int n,i,num=2,c=0;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el numero de elementos");
		n= lee.nextInt();
		while(n>0)
		{
			for(i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					c=c+1;
				}
			}
			//System.out.println(c);
			if(c==2)
			{
				System.out.print(num+", ");
				n=n-1;
			}
			c=0;
			num=num+1;
		}

	}

}
