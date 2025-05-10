package com.banco.gestionCuentas.Implementacion;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.banco.gestionCuentas.Entity.Cliente;
import com.banco.gestionCuentas.Service.ClienteInterfaz;

@Service
public class ClienteImplementacion implements ClienteInterfaz {
	
	
	private List <Cliente> listaCliente = new ArrayList<>();
	private int contadorId = 1;

	@Override
	public void crearCliente(Cliente cliente) {
		cliente.setId(generarId());
		listaCliente.add(cliente);
	}

	@Override
	public List<Cliente> listadoCliente() {
		
		return listaCliente;
	}

	@Override
	public Cliente buscarClienteDni(int dni) {
		for(Cliente c: listaCliente) {
			if(c.getDni() == dni) {
		    return c;	
			}
		}
		return null;
	
	}

	@Override
	public void eliminarCliente(int id) {
	Cliente clienteE = new Cliente();
		 for (Cliente cliente : listaCliente) {
			if (id == cliente.getId()) {
				clienteE= cliente;
				
			}
		}
		 if (clienteE != null) {
			 listaCliente.remove(clienteE);
			
		}
	
	}

	@Override
	public Cliente buscarClienteId(int id) {
		for(Cliente c : listaCliente) {
			if(c.getId()==id) {
			return c;
			}
			
		}
		return null;
	}

	@Override
	public void actualizarCliente(Cliente clienteActualizado) {
		for(int i = 0; i <listaCliente.size(); i++) {
			if(listaCliente.get(i).getDni()== clienteActualizado.getDni()) {
				listaCliente.set(i, clienteActualizado);
				break;
			}
		}
		
	}
	
	  private int generarId() {
	        return contadorId++;
	    }



}
