package com.producto.api.modeloBase;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class ModeloBaseEntidades <Id extends Serializable>{

	    protected Id id;
	    protected String estado;
	    protected String observacion;
	    protected Date fechaResgistro;
	    protected Date fechaActualizacion;


	    @Column(name = "FECHA_REGISTRO")
	    @Temporal(TemporalType.TIMESTAMP)
	    public Date getFechaResgistro() {
	        return fechaResgistro;
	    }

	    public void setFechaResgistro(Date fechaResgistro) {
	        this.fechaResgistro = fechaResgistro;
	    }


	    @Column(name = "ESTADO", length = 1)
	    public String getEstado() {
	        return estado;
	    }

	    public void setEstado(String estado) {
	        this.estado = estado;
	    }

	    @Column(name = "OBSERVACION")
	    public String getObservacion() {
	        return observacion;
	    }

	    public void setObservacion(String observacion) {
	        this.observacion = observacion;
	    }

	    @Column(name = "FECHA_ACTUALIZACION")
	    @Temporal(TemporalType.TIMESTAMP)
	    public Date getFechaActualizacion() {
	        return fechaActualizacion;
	    }

	    public void setFechaActualizacion(Date fechaActualizacion) {
	        this.fechaActualizacion = fechaActualizacion;
	    }
	}
