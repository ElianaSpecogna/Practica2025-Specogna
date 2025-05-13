package com.banco.gestionCuentas.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cuenta {
	private int id;
	private int numeroCta;
	private Date fechaIngreso;
	private double saldoActual;
	private boolean estado;
	private double limiteExtraccion;
	private Cliente cliente;
	private List<Movimiento> movimientos = new ArrayList<>();
	
	public Cuenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuenta(int id, int numeroCta, Date fechaIngreso, double saldoActual, boolean estado,
			double limiteExtraccion, Cliente cliente, List<Movimiento> movimientos) {
		super();
		this.id = id;
		this.numeroCta = numeroCta;
		this.fechaIngreso = fechaIngreso;
		this.saldoActual = saldoActual;
		this.estado = estado;
		this.limiteExtraccion = limiteExtraccion;
		this.cliente = cliente;
		this.movimientos = movimientos;
	}
	

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroCta() {
		return numeroCta;
	}

	public void setNumeroCta(int numeroCta) {
		this.numeroCta = numeroCta;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getLimiteExtraccion() {
		return limiteExtraccion;
	}

	public void setLimiteExtraccion(double limiteExtraccion) {
		this.limiteExtraccion = limiteExtraccion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
