package papw.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import papw.project.model.YenAndEuro;

@Controller

public class PapwController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String random() {
		return "redirect:/formD";
	}
	
	@RequestMapping(value = "/formD", method = RequestMethod.GET)
	public ModelAndView formD(Model model) {
		model.addAttribute("yenAndEuro", new YenAndEuro(0));
		return new ModelAndView("formD");
	}
	
	@RequestMapping(value = "/formD", method = RequestMethod.POST)
	public ModelAndView ShowConv(@ModelAttribute YenAndEuro yenAndEuro) {
		ModelAndView view = new ModelAndView("formD");
		if(yenAndEuro.getya() > 0) {
			view.addObject("mensagem","Valor em Yens: ¥ "+ yenAndEuro.gety());
		}else if(yenAndEuro.getea() > 0){
			view.addObject("mensagem","Valor em Euros: € "+ yenAndEuro.gete());
		}else {
			view.addObject("mensagem");
		}
		
		
		
		return view;
	}	

}
