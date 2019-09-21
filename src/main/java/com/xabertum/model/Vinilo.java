package com.xabertum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Vinilo {

	@Id
	@Column (name = "id")
	private int ID;
	@Column(name = "Num_catalogo")
	private String numCatalogo;
	@Column(name = "Titulo")
	private String tituloVinilo;
	@Column(name="Fecha_edicion")
	private String fechaEdicion;
	@Column(name = "Sello")
	private String sello;
	@Column(name = "Lugar_compra")
	private String lugarCompra;
	@Column(name = "Precio")
	private String precio;
	@Column(name = "Fecha_compra")
	private String fechaCompra;

	public Vinilo() {
		// TODO Auto-generated constructor stub
	}

	public Vinilo(int ID, String numCatalogo, String tituloVinilo, String fechaEdicion,
			String sello, String lugarCompra, String precio, String fechaCompra) {
		this.numCatalogo = numCatalogo;
		this.tituloVinilo = tituloVinilo;
		this.fechaEdicion = fechaEdicion;
		this.sello = sello;
		this.lugarCompra = lugarCompra;
		this.precio = precio;
		this.fechaCompra = fechaCompra;
		this.ID = ID;
	}

	public int getID() {
		return ID;
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
