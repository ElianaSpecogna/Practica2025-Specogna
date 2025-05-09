package com.banco.gestionCuentas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.banco.gestionCuentas.Entity.Cliente;
import com.banco.gestionCuentas.Service.ClienteInterfaz;

@Controller
public class HomeController {

	@Autowired
	private ClienteInterfaz cliservice;
	
 @GetMapping("/")
 public String home () {
	 
	return "cliente/home";
	 
 }
	
 @GetMapping("/alta")
	public String FormularioAltaCliente (Model model) {
		Cliente clie = new Cliente();
		model.addAttribute("cliente", clie);
		return "cliente/altaCliente";	
	}
 
 @GetMapping("/lista")
	public String ListadoCliente(Model model) {
		model.addAttribute("listaC", cliservice.listadoCliente());
		return "cliente/listaCliente";
	}
 
 
 
 
 
 
 
 
 
 
	
}
