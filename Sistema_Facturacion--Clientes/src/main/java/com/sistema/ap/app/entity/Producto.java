package com.sistema.ap.app.entity;

import java.math.BigDecimal;
import jakarta.persistence.*;


@Entity
@Table(name = "productos")

public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;  // ID generado automáticamente

    
    @Column(nullable = false, length = 100)
    private String nombre;

    
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    
    @Column(nullable = false)
    private Integer stock;
    
    
    


	public Producto(Integer id, String nombre, BigDecimal precio, Integer stock) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}


	public Producto() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}
    
    
}


