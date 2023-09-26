package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico() {
	}
	
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getUbicacion(){
		return this.ubicacion;
	} 
	
	public void setZona(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int cantanimal = 0;
		for (int i = 0;i < zonas.size(); i++ ) {
			cantanimal += zonas.get(i).cantidadAnimales();
		}
		return cantanimal;
	}
	
}
