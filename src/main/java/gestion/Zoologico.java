package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public Zoologico() {
	}
	
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getUbicacion(){
		return this.ubicacion;
	} 
	
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	public ArrayList<Zona> getZonas(){
		return this.zonas;
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
	
	public int cantidadTotalAnimales(Animal animal) {
		return animal.getTotalAnimales();		
	}
	
}
