package com.producto.api.dto;

import java.util.Date;

public class ProductoRequestDTO {

	private Long id;
    private String nombre;
	private String descripcion;
	private Double precio;
	private String estado;
	private String observacion;
	private Date fechaResgistro;
	private Date fechaActualizacion;
	
	
	public ProductoRequestDTO()
	{}
	
	
	
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param estado
	 * @param observacion
	 * @param fechaResgistro
	 * @param fechaActualizacion
	 */
	public ProductoRequestDTO(Long id, String nombre, String descripcion, Double precio, String estado,
			String observacion, Date fechaResgistro, Date fechaActualizacion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.estado = estado;
		this.observacion = observacion;
		this.fechaResgistro = fechaResgistro;
		this.fechaActualizacion = fechaActualizacion;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}
	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	/**
	 * @return the fechaResgistro
	 */
	public Date getFechaResgistro() {
		return fechaResgistro;
	}
	/**
	 * @param fechaResgistro the fechaResgistro to set
	 */
	public void setFechaResgistro(Date fechaResgistro) {
		this.fechaResgistro = fechaResgistro;
	}
	/**
	 * @return the fechaActualizacion
	 */
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	/**
	 * @param fechaActualizacion the fechaActualizacion to set
	 */
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	

}
