package com.producto.api.dto;

import java.util.Date;

public class ProductoDTO {
	
	    private Long id;
		private String nombre;
		private String descripcion;
		private Double precio;
	    private String estado;
	    private Date  fechaRegistro;
	    
	    public ProductoDTO (){}
	    
	    
	    
	    
		/**
		 * @param id
		 * @param nombre
		 * @param descripcion
		 * @param precio
		 * @param estado
		 * @param fechaRegistro
		 */
		public ProductoDTO(Long id, String nombre, String descripcion, Double precio, String estado,
				Date fechaRegistro) {
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.precio = precio;
			this.estado = estado;
			this.fechaRegistro = fechaRegistro;
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
		 * @return the fechaRegistro
		 */
		public Date getFechaRegistro() {
			return fechaRegistro;
		}
		/**
		 * @param fechaRegistro the fechaRegistro to set
		 */
		public void setFechaRegistro(Date fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
		}
	    
	    
}
