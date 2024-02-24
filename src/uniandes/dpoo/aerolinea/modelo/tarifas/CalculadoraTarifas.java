package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.cliente.*;
import uniandes.dpoo.aerolinea.modelo.*;


public abstract class CalculadoraTarifas {
	public CalculadoraTarifas() {}

	public static final double IMPUESTO = 0.28;
	
	protected abstract int calcularCostoBase​(Vuelo vuelo,Cliente cliente);
	
	
	protected abstract double calcularPorcentajeDescuento​(Cliente cliente);
	
	public int calcularTarifa​(Vuelo vuelo,Cliente cliente) {
		return 0;}
	
	protected int calcularDistanciaVuelo​(Ruta ruta) {
		return 0;}
	
	protected int calcularValorImpuestos​(int costoBase) {
		return costoBase;}
	
}