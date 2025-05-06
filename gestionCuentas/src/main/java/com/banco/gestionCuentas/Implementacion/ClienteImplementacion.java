package com.banco.gestionCuentas.Implementacion;

import java.util.ArrayList;
import java.util.List;

import com.banco.gestionCuentas.Entity.Cliente;
import com.banco.gestionCuentas.Service.ClienteInterfaz;

public class ClienteImplementacion implements ClienteInterfaz {
	
	
	public List <Cliente> lista = new ArrayList<>();

	@Override
	public Cliente crearCliente(Cliente cliente) {
		
		lista.add(cliente);
		
		return cliente;
	}

	@Override
	public List<Cliente> listadoCliente() {
		
		return lista;
	}

	@Override
	public Cliente buscarClienteDni(int dni) {
		
		for(Cliente cliente : lista) {
			if(cliente.getDni() == dni) {
				
			}
			return cliente;
		}
		return null;
	
	}

	@Override
	public Cliente eliminarCliente(int id) {
		
		int index = -1;
		 for(int i = 0; i < lista.size(); i++) {
			 if(lista.get(i).getId()== id) {
				 index = i;
				 break;
			 }
		 }
		 if(index!= -1) {
			 Cliente eliminado = lista.get(index);
			 lista.remove(index);
			 return eliminado;
		 }
		
		
		return null;
	}

	@Override
	public Cliente buscarClienteId(int id) {
		for(Cliente cliente : lista) {
			if(cliente.getId()==id) {
				
			}
			return cliente;
		}
		return null;
	}

}
