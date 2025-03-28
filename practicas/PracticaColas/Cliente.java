package PracticaColas;

import java.util.Scanner;

public class Cliente {
	String nombre,carnet,transaccion,genero;
	int edad;
	float importe;
	void leer()
	{
		Scanner lee=new Scanner(System.in);
		System.out.println("Ingrese genero MASCULINO 'm' FEMENINO 'f' :");
		genero=lee.next();
		System.out.println("Ingrese nombre:");
		nombre=lee.next();
		System.out.println("Ingrese carnet:");
		carnet=lee.next();
		System.out.println("Ingrese la edad:");
		edad=lee.nextInt();
		System.out.println("¿Que transaccion realizara?");
		System.out.println("¿Deposito? digite 'd' ¿Retiro? digite 'r'");
		transaccion=lee.next();
		System.out.println("Ingrese importe:");
		importe=lee.nextFloat();
	}
	void mostrar()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Genero: "+genero);
		System.out.println("Carnet: "+carnet);
		System.out.println("Edad: "+edad);
		System.out.println("Transaccion: "+transaccion);
		System.out.println("Importe: "+importe);
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}


