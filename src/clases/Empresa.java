package clases;

public class Empresa {
	
	private String id;
	private String nombre;
	private float ganancia_p;
	
	public Empresa(String id,String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public void setGanancia_p() {
		this.ganancia_p = (float) (Math.random()*(30));
	}
	public float getGanancia() {
		return this.ganancia_p;
	}
	public String getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	
}
