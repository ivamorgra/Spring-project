package combytecode.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Le indico a spring boot que esta clase es un controlador
@Controller 
@RequestMapping("/hola")  //Actúa de endpoint
public class ControllerBasic {
	//le digo que este es un método GET de mapeo
	
	@GetMapping(path = {"/saludar","/holamundo"})
	public String saludar() {
		return "index"; //devuelve el nombre de la vista (de index.html)
	}
	
	@GetMapping(path = {"/lion","/lionKing"})
	public String descriptionLion() {
		return "Lion";
	}
}
