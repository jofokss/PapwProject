package papw.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import papw.project.model.DolarParaReal;

@Controller

public class PapwController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String random() {
		return "redirect:/formD";
	}
	
	@RequestMapping(value = "/formD", method = RequestMethod.GET)
	public ModelAndView formD(Model model) {
		model.addAttribute("dolarParaReal", new DolarParaReal(0));
		return new ModelAndView("formD");
	}
	
	@RequestMapping(value = "/formD", method = RequestMethod.POST)
	public ModelAndView ShowConv(@ModelAttribute DolarParaReal dolarParaReal) {
		ModelAndView view = new ModelAndView("formD");
		
		view.addObject("mensagem","Valor em Reais: R$ "+ dolarParaReal.getr());
		
		return view;
	}	

}
