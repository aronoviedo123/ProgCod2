package Colas;

import java.util.Scanner;

public class cliente {
	String nombre,carnet,transaccion;
	float importe;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese nombre:");
		nombre=lee.next();
		System.out.println("Ingrese carnet:");
		carnet=lee.next();
		System.out.println("¿Que transaccion realizara?");
		System.out.println("¿Deposito? digite 'd' ¿Retiro? digite 'r' ¿Consulta? digite 'c'");
		transaccion=lee.next();
		System.out.println("Ingrese importe:");
		importe=lee.nextFloat();
	}
	void mostrar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Carnet: "+carnet);
		System.out.println("Transaccion: "+transaccion);
		System.out.println("Importe: "+importe);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public String getTransaccion() {
		return transaccion;
	}
	public void setTransaccion(String transaccion) {
		this.transaccion = transaccion;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	
}
