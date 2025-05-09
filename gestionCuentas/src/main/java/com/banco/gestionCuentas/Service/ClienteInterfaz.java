package com.banco.gestionCuentas.Service;

import java.util.List;

import com.banco.gestionCuentas.Entity.Cliente;

public interface ClienteInterfaz {
	
	public void  crearCliente (Cliente cliente);
	
	public void eliminarCliente (int id);
	public void actualizarCliente(Cliente cliente);
	public List <Cliente> listadoCliente ();
	public Cliente buscarClienteDni (int dni);
	public Cliente buscarClienteId (int id);
	
	

}
