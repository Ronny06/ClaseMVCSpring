package idat.edu.pe.daa2.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personas")

public class PersonaController {
	@GetMapping("/inicio")
	public String greeting(Model model) {
		model.addAttribute("nombre modulo", "REGISTRO DE ALUMNOS");
		return "resultado";
	}

}
