package idat.edu.pe.daa2.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cursos")

public class CursoController {
	@GetMapping("/inicio")
	public String greeting(Model model) {
		model.addAttribute("nombre modulo", "CONSULTA DE CURSOS");
		return "resultado";
	}

}
