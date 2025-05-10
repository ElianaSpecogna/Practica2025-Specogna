package com.banco.gestionCuentas.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.banco.gestionCuentas.Entity.Cliente;
import com.banco.gestionCuentas.Service.ClienteInterfaz;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteInterfaz cliservice;
	
	@PostMapping("/altaCliente")
	public String guardarCliente(Cliente cliente, Model model) {
	
		cliservice.crearCliente(cliente);
		
		model.addAttribute("cliente", cliente);
		
		return "cliente/altaCliente";
		
	}
	
	@GetMapping("/buscarPorDni")
	public String buscarClienteDni(@RequestParam("dni") int dni, Model model ) {
		Cliente clie= cliservice.buscarClienteDni(dni);
		if(clie != null) {
			model.addAttribute("cliente", clie);
			return "cliente/listaCliente";
		}else {
			model.addAttribute("mensaje", "cliente no encontrado con dni: " + dni);
			return "cliente/listaCliente";
		}
		
	}
	
	
	@PostMapping("/eliminar/{id}")
	public String eliminarCliente (@PathVariable int id){
		cliservice.eliminarCliente(id);
	
		return "redirect:/clientes";
	}
		
	
	@GetMapping("/modificar/{id}")
	public String actualizarCliente (@PathVariable int id, Model model){
		Cliente clie = cliservice.buscarClienteId(id);
		if(clie != null) {
			model.addAttribute("cliente",clie);
			return "cliente/listaCliente";
		}else {
			model.addAttribute("mensaje", "cliente no encontrado con id: " + id);
		}
		return null;
		
	
	}
	
	 @PostMapping("/actualizar")
	    public String actualizarCliente(Cliente clienteActualizado) {
	        cliservice.actualizarCliente(clienteActualizado);
	        return "redirect:/clientes";
	    }
	
}


