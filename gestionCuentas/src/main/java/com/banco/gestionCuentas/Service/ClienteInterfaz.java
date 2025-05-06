package com.banco.gestionCuentas.Service;

import java.util.List;

import com.banco.gestionCuentas.Entity.Cliente;

public interface ClienteInterfaz {
	
	public Cliente crearCliente (Cliente cliente);
	
	public List <Cliente> listadoCliente ();
	
	public Cliente buscarClienteDni (int dni);
	
	public Cliente eliminarCliente (int id);
	
	public Cliente buscarClienteId (int id);
	
	

}
