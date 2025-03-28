package ej3ExamenDeLiberacionAux;

import java.util.Scanner;

public class Pedido {
	int idplatillo,idcliente,cantidad,monto,total;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese el id Platillo:");
		idplatillo=lee.nextInt();
		System.out.println("Ingrese el id Cliente");
		idcliente=lee.nextInt();
		System.out.println("Ingrese la cantidad:");
		cantidad=lee.nextInt();
		System.out.println("Ingrese el monto:");
		monto=lee.nextInt();
		System.out.println("Ingrese el total:");
		total=lee.nextInt();
		
	}
	void mostrar()
	{
		System.out.println("ID PLATILLO: "+idplatillo);
		System.out.println("ID CLIENTE: "+idcliente);
		System.out.println("CANTIDAD: "+cantidad);
		System.out.println("MONTO: "+monto);
		System.out.println("TOTAL: "+total);
	}
	public int getIdplatillo() {
		return idplatillo;
	}
	public void setIdplatillo(int idplatillo) {
		this.idplatillo = idplatillo;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
