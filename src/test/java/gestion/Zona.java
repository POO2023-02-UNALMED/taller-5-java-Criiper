package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private  Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	} 

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	public ArrayList<Animal> getAnimales(){
		return this.animales;
	} 
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;		
	}
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return this.animales.size();
	}
}

