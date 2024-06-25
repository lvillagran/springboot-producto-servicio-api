package com.producto.api.model;

import jakarta.persistence.Entity;
import java.io.Serializable;
import  com.producto.api.modeloBase.ModeloBaseEntidades;
import jakarta.persistence.*;

@Entity
@Table(name = "TAB_PRODUCTO" , schema = "laboratorio ")
public class TabProducto extends ModeloBaseEntidades<Long> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String descripcion;
	private Double precio;

	@GeneratedValue(generator = "secTabProducto", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "secTabProducto", allocationSize = 1, initialValue = 1, sequenceName = "SEC_TAB_PRODUCTO")
    @Id
    @Column(name = "ID")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

	/**
	 * @return the nombreProducto
	 */
    @Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the descripcion
	 */
	 @Column(name = "DESCRIPCION")
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
	@Column(name = "PRECIO")
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}