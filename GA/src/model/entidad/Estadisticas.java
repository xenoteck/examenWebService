package model.entidad;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * POJO de estadisticas
 * @author HIBAN
 *
 */
@XmlRootElement
public class Estadisticas {
	private String distrito, tipo;
	private Integer cantidad;
	//constructores
	public Estadisticas(String distrito, String tipo, Integer cantidad) {
		super();
		this.distrito = distrito;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	public Estadisticas() {
		super();
	}
	
	//getters y setters
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
