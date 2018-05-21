package controllers;

import org.cats.application.CatDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatsController{
	
	@Autowired
	CatDAO dao;
	
	@RequestMapping("/lista")
	public String listaKotow(Model model) {
		model.addAttribute("koty", dao.getCatsList());
		return "lista";
	}
	
	@RequestMapping("/dodaj")
	public String dodajKota(Model model) {
		return "dodaj";
	}
	
	@RequestMapping("/kot-{id}")
	public String szczegolyKota(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("kot", dao.getCatById(id));
		return "szczegoly";
	}
}