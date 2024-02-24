package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.modelo.Avion;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import java.util.Collection;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;



public class Vuelo {
	private String fecha;
	
	private Ruta ruta;

	private Avion avion;

	public Vuelo(String fecha, Ruta ruta, Avion avion) {
		super();
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}
	
	public Ruta getRuta() {
		return null;
	}
	public String getFecha() {
		return fecha;
	}
	
	public Avion getAvion() {
		return null;
	}
	public Collection<Tiquete> getTiquetes(){
		return null;
	}
	int venderTiquetes​(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		return 0;}

	public boolean equals​(Object obj) {
		return false;
		
	}



}
