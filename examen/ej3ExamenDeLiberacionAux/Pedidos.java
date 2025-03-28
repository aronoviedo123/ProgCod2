package ej3ExamenDeLiberacionAux;

import java.util.Scanner;

public class Pedidos {
	private String mes;
	private CSCircular cpe;
	
	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public CSCircular getCpe() {
		return cpe;
	}

	public void setCpe(CSCircular cpe) {
		this.cpe = cpe;
	}

	void leer()
	{	Pedido pe; int i,nv,maxp;
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el mes:");
		mes=lee.next();
		System.out.println("Maximo de pedidos:");
		maxp=lee.nextInt();
		cpe=new CSCircular(maxp);
		System.out.println("Ingrese la cantidad de Pedidos:");
		nv=lee.nextInt();
		for(i=1;i<=nv;i++)
		{
			pe=new Pedido();
			pe.leer();
			cpe.adicionar((Object)pe);
		}
	}
	/*void mostrar()
	{
		
	}*/
}
