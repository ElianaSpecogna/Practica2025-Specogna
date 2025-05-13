package com.banco.gestionCuentas.Entity;

import java.util.Date;

public class Movimiento {
	
	private int id;
	private String tipOperacion;
	private double importe;
	private Date fechaOp;
	private Cuenta cuenta;
	
	public Movimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movimiento(int id, String tipOperacion, double importe, Date fechaOp, Cuenta cuenta) {
		super();
		this.id = id;
		this.tipOperacion = tipOperacion;
		this.importe = importe;
		this.fechaOp = fechaOp;
		this.cuenta = cuenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipOperacion() {
		return tipOperacion;
	}

	public void setTipOperacion(String tipOperacion) {
		this.tipOperacion = tipOperacion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Date getFechaOp() {
		return fechaOp;
	}

	public void setFechaOp(Date fechaOp) {
		this.fechaOp = fechaOp;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
	

}
