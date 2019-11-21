package idat.edu.pe.daa2.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/principal")

public class PrincipalController {
	@RequestMapping(value= "inicio" ,method = RequestMethod.GET)
	public ModelAndView Login() {
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("principal");
	return modelAndView;
	}
}
