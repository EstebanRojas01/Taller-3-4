package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private Boolean usado;
	private Cliente cliente;
	private Vuelo vuelo;
	
	
	
	public Tiquete(String codigo,  Vuelo vuelo, Cliente clienteComprador,int tarifa) {
		super();
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.cliente = clienteComprador;
		this.vuelo = vuelo;
	}

	public Cliente getCliente() {
		return null;
	}
	
	public Vuelo getVuelo() {
		return null;
	}
	
	public String getCodigo() {
		return null;
	}
	
	public int getTarifa() {
		return 0;
	}
	
	public void marcarComoUsado() {
		
	}
	
	public boolean esUsado() {
		return usado;
	}
}
