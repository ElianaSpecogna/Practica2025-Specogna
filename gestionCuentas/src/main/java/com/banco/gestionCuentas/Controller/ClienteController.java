package com.banco.gestionCuentas.Controller;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.banco.gestionCuentas.Entity.Cliente;
import com.banco.gestionCuentas.Service.ClienteInterface;

@Controller
public class ClienteController {

	@Autowired
	private ClienteInterface cliservice;

	@PostMapping("/altaCliente")
	public String guardarCliente(Cliente cliente, Model model) {
		cliservice.crearCliente(cliente);
		model.addAttribute("cliente", cliente);
		return "redirect:/lista";
	}

	@GetMapping("/buscar")
	public String buscarClientePorDni(@RequestParam("dniParam") int dni, Model model) {
	    Cliente clie = cliservice.buscarClienteDni(dni);
	    if (clie != null) {
	    	List<Cliente> lista = new ArrayList<>();
	        lista.add(clie);
	        model.addAttribute("listaC", lista);
	        
	    } else {
	        model.addAttribute("mensaje", "Cliente no encontrado con DNI: " + dni);
	        model.addAttribute("listaC", new ArrayList<>());
	        System.out.println("Cliente no encontrado");
	    }
	    
	    return "cliente/listaCliente";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminarCliente(@PathVariable int id) {
		cliservice.eliminarCliente(id);
		return "redirect:/lista";
	}

	@GetMapping("/modificar/{id}")
	public String modificarCliente(@PathVariable int id, Model model) {
		Cliente clie = cliservice.buscarClienteId(id);
		if (clie != null) {
			model.addAttribute("cliente", clie);
			return "cliente/modifCliente";
		} else {
			model.addAttribute("mensaje", "cliente no encontrado con id: " + id);
		}
		return "redirect:/lista";
	}

	@PostMapping("/actualizar")
	public String actualizarCliente(Cliente clienteActualizado) {
		cliservice.actualizarCliente(clienteActualizado);
		return "redirect:/lista";
	}

}
