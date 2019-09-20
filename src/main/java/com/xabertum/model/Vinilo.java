package com.xabertum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Vinilo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String numCatalogo;
	private String tituloVinilo;
	private String fechaEdicion;
	private String sello;
	private String lugarCompra;
	private String precio;
	private String fechaCompra;

	public Vinilo() {
		// TODO Auto-generated constructor stub
	}

	public Vinilo(String numCatalogo, String tituloVinilo, String fechaEdicion, String sello, String lugarCompra, String precio, String fechaCompra) {
		this.numCatalogo = numCatalogo;
		this.tituloVinilo = tituloVinilo;
		this.fechaEdicion = fechaEdicion;
		this.sello = sello;
		this.lugarCompra = lugarCompra;
		this.precio = precio;
		this.fechaCompra = fechaCompra;
	}

	public String getNumCatalogo() {
		return numCatalogo;
	}

	public String getTituloVinilo() {
		return tituloVinilo;
	}

	public String getFechaEdicion() {
		return fechaEdicion;
	}

	public String getSello() {
		return sello;
	}

	public String getLugarCompra() {
		return lugarCompra;
	}

	public String getPrecio() {
		return precio;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

}
