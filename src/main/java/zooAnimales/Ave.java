package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado;
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);

	}
	
	public Ave() {}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	public static ArrayList<Ave> getListado(){
		return Ave.listado;
	}
	

	public void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	public int getHalcones(){
		return Ave.halcones;
	}
	

	public void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	public int getAguilas(){
		return Ave.aguilas;
	}
	

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public String getColorPlumas(){
		return this.colorPlumas;
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave (nombre, edad, "montanas", genero, "cafe glorioso");
		halcones ++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas ++;
		return aguila;
	}
	
	

}
