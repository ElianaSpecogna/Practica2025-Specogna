package com.banco.gestionCuentas.Service;

import java.util.List;


import com.banco.gestionCuentas.Entity.Cuenta;
import com.banco.gestionCuentas.Entity.Movimiento;

public interface CuentaInterface {
	
    public void  crearCuenta (Cuenta cuenta);
	public void eliminarCuenta (int id);
	public void actualizarCuenta(Cuenta cuenta);
	public List <Cuenta> listadoCuentas ();
	public Cuenta buscarCuentaPorCliente (int dni);
	public List <Movimiento> historialMovimientos();
	

}
