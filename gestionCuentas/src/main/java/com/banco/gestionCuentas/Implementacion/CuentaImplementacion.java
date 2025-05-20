package com.banco.gestionCuentas.Implementacion;

import java.util.ArrayList;
import java.util.List;

import com.banco.gestionCuentas.Entity.Cuenta;
import com.banco.gestionCuentas.Entity.Movimiento;
import com.banco.gestionCuentas.Service.CuentaInterface;

public class CuentaImplementacion implements CuentaInterface{
	
	
	private List <Cuenta> listaCuenta = new ArrayList<>();
	private List <Movimiento> historialMovimientos = new ArrayList<>();
	private int contadorId = 100;

	@Override
	public void crearCuenta(Cuenta cuenta) {
		cuenta.setNumeroCta(contadorId);
		listaCuenta.add(cuenta);
		
	}

	@Override
	public void eliminarCuenta(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cuenta> listadoCuentas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cuenta buscarCuentaPorCliente(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movimiento> historialMovimientos() {
		// TODO Auto-generated method stub
		return null;
	}

}
