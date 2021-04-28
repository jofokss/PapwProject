package papw.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import papw.project.dao.YenAndEuroDAO;
import papw.project.model.YenAndEuro;

@Controller

public class PapwController {
	
	@Autowired
	private YenAndEuroDAO dao;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String random() {
		return "redirect:/formD";
	}
	
	@RequestMapping(value = "/formD", method = RequestMethod.GET)
	public ModelAndView formD(Model model) {
		model.addAttribute("yenAndEuro", new YenAndEuro(0));
		return new ModelAndView("formD");
	}
	

	@PostMapping(value = "/conversao")
	public ModelAndView conversaoYE(@ModelAttribute YenAndEuro yenAndEuro) {
		
		dao = new YenAndEuroDAO();
		dao.save(yenAndEuro);
		
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
